package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.ironsource.b9;
import java.util.EnumMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzai {

    /* renamed from: b  reason: collision with root package name */
    public static final zzai f13293b = new zzai(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f13294a;

    public zzai(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f13294a = enumMap;
        enumMap.put((EnumMap) zzah.AD_STORAGE, (zzah) bool);
        enumMap.put((EnumMap) zzah.ANALYTICS_STORAGE, (zzah) bool2);
    }

    public static zzai a(Bundle bundle) {
        zzah[] values;
        if (bundle == null) {
            return f13293b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            enumMap.put((EnumMap) zzahVar, (zzah) n(bundle.getString(zzahVar.f13292a)));
        }
        return new zzai(enumMap);
    }

    public static zzai b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.f13290d;
                int length = zzahVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char charAt = str.charAt(i11);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzahVar, (zzah) bool);
                }
                i10++;
            }
        }
        return new zzai(enumMap);
    }

    public static String g(Bundle bundle) {
        zzah[] values;
        String string;
        for (zzah zzahVar : zzah.values()) {
            if (bundle.containsKey(zzahVar.f13292a) && (string = bundle.getString(zzahVar.f13292a)) != null && n(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean j(int i10, int i11) {
        return i10 <= i11;
    }

    static final int m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final zzai c(zzai zzaiVar) {
        zzah[] values;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f13294a.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.f13294a.get(zzahVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public final zzai d(zzai zzaiVar) {
        zzah[] values;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f13294a.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) zzaiVar.f13294a.get(zzahVar);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public final Boolean e() {
        return (Boolean) this.f13294a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        zzah[] values;
        if (obj instanceof zzai) {
            zzai zzaiVar = (zzai) obj;
            for (zzah zzahVar : zzah.values()) {
                if (m((Boolean) this.f13294a.get(zzahVar)) != m((Boolean) zzaiVar.f13294a.get(zzahVar))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final Boolean f() {
        return (Boolean) this.f13294a.get(zzah.ANALYTICS_STORAGE);
    }

    public final String h() {
        char c10;
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.f13290d;
        int length = zzahVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f13294a.get(zzahVarArr[i10]);
            if (bool == null) {
                c10 = '-';
            } else {
                c10 = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c10);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i10 = 17;
        for (Boolean bool : this.f13294a.values()) {
            i10 = (i10 * 31) + m(bool);
        }
        return i10;
    }

    public final boolean i(zzah zzahVar) {
        Boolean bool = (Boolean) this.f13294a.get(zzahVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean k(zzai zzaiVar) {
        return l(zzaiVar, (zzah[]) this.f13294a.keySet().toArray(new zzah[0]));
    }

    public final boolean l(zzai zzaiVar, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.f13294a.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.f13294a.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            zzah zzahVar = values[i10];
            if (i10 != 0) {
                sb.append(", ");
            }
            sb.append(zzahVar.name());
            sb.append(b9.i.f16692b);
            Boolean bool = (Boolean) this.f13294a.get(zzahVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public zzai(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f13294a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
