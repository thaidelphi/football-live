package com.startapp;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m1 {
    public static l1 a(String str) {
        try {
            try {
                ArrayList a10 = s4.a(new JsonReader(new StringReader(str)));
                String str2 = (String) a10.get(0);
                if (str2 != null) {
                    String str3 = (String) a10.get(1);
                    if (str3 != null) {
                        List list = (List) a10.get(2);
                        if (list != null) {
                            int size = list.size();
                            String[] strArr = new String[size];
                            Class[] clsArr = new Class[size];
                            Object[] objArr = new Object[size];
                            for (int i10 = 0; i10 < size; i10++) {
                                Map map = (Map) list.get(i10);
                                if (map != null) {
                                    if (map.size() == 1) {
                                        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                                        String str4 = (String) entry.getKey();
                                        if (str4 != null) {
                                            try {
                                                Class<?> a11 = o1.a(str4);
                                                Object a12 = o1.a(a11, entry.getValue());
                                                strArr[i10] = str4;
                                                clsArr[i10] = a11;
                                                objArr[i10] = a12;
                                            } catch (ClassCastException e8) {
                                                throw new IllegalArgumentException(str, e8);
                                            } catch (ClassNotFoundException e10) {
                                                throw new IllegalArgumentException(str, e10);
                                            } catch (IllegalAccessException e11) {
                                                throw new IllegalArgumentException(str, e11);
                                            } catch (InstantiationException e12) {
                                                throw new IllegalArgumentException(str, e12);
                                            } catch (NoSuchMethodException e13) {
                                                throw new IllegalArgumentException(str, e13);
                                            } catch (InvocationTargetException e14) {
                                                throw new IllegalArgumentException(str, e14);
                                            }
                                        } else {
                                            throw new IllegalArgumentException(str);
                                        }
                                    } else {
                                        throw new IllegalArgumentException(str);
                                    }
                                } else {
                                    throw new IllegalArgumentException(str);
                                }
                            }
                            List list2 = (List) a10.get(3);
                            if (list2 != null) {
                                String[] strArr2 = new String[list2.size()];
                                int size2 = list2.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    String str5 = (String) list2.get(i11);
                                    if (str5 != null) {
                                        strArr2[i11] = str5;
                                    } else {
                                        throw new IllegalArgumentException(str);
                                    }
                                }
                                return new l1(str2, str3, strArr, clsArr, objArr, strArr2);
                            }
                            throw new IllegalArgumentException(str);
                        }
                        throw new IllegalArgumentException(str);
                    }
                    throw new IllegalArgumentException(str);
                }
                throw new IllegalArgumentException(str);
            } catch (IOException e15) {
                throw new IllegalArgumentException(str, e15);
            }
        } catch (ClassCastException e16) {
            throw new IllegalArgumentException(str, e16);
        }
    }
}
