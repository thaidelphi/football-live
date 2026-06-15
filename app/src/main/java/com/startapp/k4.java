package com.startapp;

import com.startapp.common.parser.JSONStreamException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f22171a;

    static {
        HashMap hashMap = new HashMap();
        f22171a = hashMap;
        hashMap.put("int[]", Integer.class);
        hashMap.put("long[]", Long.class);
        hashMap.put("double[]", Double.class);
        hashMap.put("float[]", Float.class);
        hashMap.put("bool[]", Boolean.class);
        hashMap.put("char[]", Character.class);
        hashMap.put("byte[]", Byte.class);
        hashMap.put("void[]", Void.class);
        hashMap.put("short[]", Short.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134 A[Catch: all -> 0x029d, Exception -> 0x02a6, TryCatch #4 {Exception -> 0x02a6, blocks: (B:43:0x00de, B:45:0x00e4, B:47:0x00ee, B:49:0x0100, B:51:0x0128, B:53:0x0134, B:55:0x0175, B:57:0x018e, B:59:0x01a1, B:61:0x01a9, B:63:0x01b1, B:65:0x01b9, B:66:0x01ca, B:68:0x01d2, B:69:0x01df, B:71:0x01e7, B:72:0x01f1, B:74:0x01f7, B:76:0x01fd, B:78:0x020c, B:77:0x0205, B:79:0x020f, B:80:0x0214, B:82:0x021c, B:83:0x0226, B:85:0x022c, B:86:0x023a, B:87:0x023e, B:89:0x0248, B:90:0x0256, B:92:0x0260, B:93:0x0270, B:95:0x027a, B:96:0x0282), top: B:117:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.Class<T> r19, org.json.JSONObject r20) throws com.startapp.common.parser.JSONStreamException {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.k4.a(java.lang.Class, org.json.JSONObject):java.lang.Object");
    }

    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) throws JSONStreamException, JSONException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, IllegalArgumentException, NoSuchFieldException {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(n4.a(field));
            int length = jSONArray.length();
            Object newInstance = Array.newInstance((Class<?>) cls, length);
            for (int i10 = 0; i10 < length; i10++) {
                Array.set(newInstance, i10, a((Class<Object>) cls, jSONArray.getJSONObject(i10)));
            }
            return (Object[]) newInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(n4.a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f22171a.get(field.getType().getSimpleName());
        Object newInstance2 = Array.newInstance((Class) cls2.getField("TYPE").get(null), length2);
        for (int i11 = 0; i11 < length2; i11++) {
            String string = jSONArray2.getString(i11);
            Class<String> cls3 = String.class;
            if (cls2.equals(Character.class)) {
                cls3 = Character.TYPE;
            }
            Constructor<T> constructor = cls2.getConstructor(cls3);
            Array.set(newInstance2, i11, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return newInstance2;
    }

    public static HashMap a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) throws JSONException, JSONStreamException {
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object cast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                cast = Enum.valueOf(cls, cast.toString());
            }
            String str = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray == null) {
                    if (cls2.isEnum()) {
                        hashMap.put(cast, Enum.valueOf(cls2, (String) jSONObject.get(str)));
                    } else {
                        hashMap.put(cast, jSONObject.get(str));
                    }
                } else {
                    HashSet hashSet = new HashSet();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                        if (optJSONObject2 == null) {
                            hashSet.add(optJSONArray.get(i10));
                        } else {
                            hashSet.add(a((Class<Object>) cls3, optJSONObject2));
                        }
                    }
                    hashMap.put(cast, hashSet);
                }
            } else {
                hashMap.put(cast, a((Class<Object>) cls2, optJSONObject));
            }
        }
        return hashMap;
    }

    public static ArrayList a(Class cls, JSONArray jSONArray) throws JSONException, JSONStreamException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                arrayList.add(jSONArray.get(i10));
            } else {
                arrayList.add(a((Class<Object>) cls, optJSONObject));
            }
        }
        return arrayList;
    }

    public static Object a(Class cls, Object obj) {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (!cls.equals(Integer.class)) {
            return (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
        } else if (obj.getClass().equals(Double.class)) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            return obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj;
        }
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) throws JSONException {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (obj.getClass().equals(String.class)) {
            return cls.equals(Integer.TYPE) ? Integer.valueOf(jSONObject.getInt(n4.a(field))) : obj;
        } else if (cls.equals(Integer.TYPE)) {
            return Integer.valueOf(((Number) obj).intValue());
        } else {
            if (cls.equals(Float.TYPE)) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (cls.equals(Long.TYPE)) {
                return Long.valueOf(((Number) obj).longValue());
            }
            return cls.equals(Double.TYPE) ? Double.valueOf(((Number) obj).doubleValue()) : obj;
        }
    }
}
