package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgxx {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzgxv zzgxvVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzgxvVar, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i10, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgyy.zza(zzgvc.zzw((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgvc) {
                sb.append(": \"");
                sb.append(zzgyy.zza((zzgvc) obj));
                sb.append('\"');
            } else if (obj instanceof zzgwk) {
                sb.append(" {");
                zzd((zzgwk) obj, sb, i10 + 2);
                sb.append("\n");
                zzc(i10, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i12 = i10 + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                zzb(sb, i12, b9.h.W, entry2.getKey());
                zzb(sb, i12, b9.h.X, entry2.getValue());
                sb.append("\n");
                zzc(i10, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzgxv zzgxvVar, StringBuilder sb, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgxvVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i10, substring.substring(0, substring.length() - 4), zzgwk.zzbP(method2, zzgxvVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i10, substring.substring(0, substring.length() - 3), zzgwk.zzbP(method, zzgxvVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbP = zzgwk.zzbP(method4, zzgxvVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbP instanceof Boolean) {
                            if (!((Boolean) zzbP).booleanValue()) {
                            }
                            zzb(sb, i10, substring, zzbP);
                        } else if (zzbP instanceof Integer) {
                            if (((Integer) zzbP).intValue() == 0) {
                            }
                            zzb(sb, i10, substring, zzbP);
                        } else if (zzbP instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbP).floatValue()) == 0) {
                            }
                            zzb(sb, i10, substring, zzbP);
                        } else if (zzbP instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbP).doubleValue()) == 0) {
                            }
                            zzb(sb, i10, substring, zzbP);
                        } else {
                            if (zzbP instanceof String) {
                                equals = zzbP.equals("");
                            } else if (zzbP instanceof zzgvc) {
                                equals = zzbP.equals(zzgvc.zzb);
                            } else if (zzbP instanceof zzgxv) {
                                if (zzbP == ((zzgxv) zzbP).zzbt()) {
                                }
                                zzb(sb, i10, substring, zzbP);
                            } else {
                                if ((zzbP instanceof Enum) && ((Enum) zzbP).ordinal() == 0) {
                                }
                                zzb(sb, i10, substring, zzbP);
                            }
                            if (equals) {
                            }
                            zzb(sb, i10, substring, zzbP);
                        }
                    } else {
                        if (!((Boolean) zzgwk.zzbP(method5, zzgxvVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i10, substring, zzbP);
                    }
                }
            }
            i11 = 3;
        }
        if (zzgxvVar instanceof zzgwg) {
            Iterator zzf = ((zzgwg) zzgxvVar).zza.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb, i10, b9.i.f16696d + ((zzgwh) entry2.getKey()).zza + b9.i.f16698e, entry2.getValue());
            }
        }
        zzgzb zzgzbVar = ((zzgwk) zzgxvVar).zzt;
        if (zzgzbVar != null) {
            zzgzbVar.zzi(sb, i10);
        }
    }
}
