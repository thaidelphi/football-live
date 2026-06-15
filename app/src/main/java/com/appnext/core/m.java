package com.appnext.core;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {
    private static int du = 2;

    public static Object a(Class<?> cls, JSONObject jSONObject) {
        Field[] declaredFields;
        try {
            Object newInstance = cls.newInstance();
            if (du == 0) {
                declaredFields = cls.getFields();
            } else {
                declaredFields = cls.getDeclaredFields();
            }
            for (Field field : declaredFields) {
                if (du == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(true);
                }
                try {
                } catch (IllegalAccessException e8) {
                    com.appnext.base.a.a("JSONParser$populateObjectFromJSON", e8);
                } catch (IllegalArgumentException e10) {
                    com.appnext.base.a.a("JSONParser$populateObjectFromJSON", e10);
                } catch (Throwable th) {
                    com.appnext.base.a.a("JSONParser$populateObjectFromJSON", th);
                }
                if (jSONObject.has(field.getName())) {
                    String simpleName = field.getType().getSimpleName();
                    if (!TextUtils.isEmpty(simpleName)) {
                        if (simpleName.equalsIgnoreCase("boolean")) {
                            field.setBoolean(newInstance, jSONObject.getBoolean(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("int")) {
                            field.setInt(newInstance, jSONObject.getInt(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("double")) {
                            field.setDouble(newInstance, jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("float")) {
                            field.setFloat(newInstance, (float) jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("string")) {
                            field.set(newInstance, jSONObject.getString(field.getName()));
                        } else if (field.getType().isArray()) {
                            field.set(newInstance, Array.newInstance(field.getType().getComponentType(), jSONObject.getJSONArray(field.getName()).length()));
                            a(field.get(newInstance), jSONObject.getJSONArray(field.getName()));
                        } else {
                            field.set(newInstance, a(field.getType(), jSONObject.getJSONObject(field.getName())));
                        }
                    }
                }
                if (du == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(false);
                }
            }
            return newInstance;
        } catch (IllegalAccessException e11) {
            com.appnext.base.a.a("JSONParser$populateObjectFromJSON", e11);
            return null;
        } catch (InstantiationException e12) {
            com.appnext.base.a.a("JSONParser$populateObjectFromJSON", e12);
            return null;
        }
    }

    public static void a(Object obj, JSONArray jSONArray) throws IllegalArgumentException, NegativeArraySizeException, IllegalAccessException, JSONException {
        Class<?> cls = obj.getClass();
        String simpleName = cls.getComponentType().getSimpleName();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (cls.getComponentType().isArray()) {
                Array.set(obj, i10, Array.newInstance(cls.getComponentType().getComponentType(), jSONArray.getJSONArray(i10).length()));
                a(Array.get(obj, i10), jSONArray.getJSONArray(i10));
            } else if (!cls.getComponentType().isPrimitive() && !simpleName.equalsIgnoreCase("string")) {
                Array.set(obj, i10, a(cls.getComponentType(), jSONArray.getJSONObject(i10)));
            } else {
                Array.set(obj, i10, jSONArray.get(i10));
            }
        }
    }
}
