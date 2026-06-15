package b9;

import j8.e0;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: StringsJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class o extends n {
    public static final boolean j(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(suffix, "suffix");
        if (!z10) {
            return str.endsWith(suffix);
        }
        return n(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j(str, str2, z10);
    }

    public static boolean l(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static boolean m(CharSequence charSequence) {
        boolean z10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            y8.c C = p.C(charSequence);
            if (!(C instanceof Collection) || !((Collection) C).isEmpty()) {
                Iterator<Integer> it = C.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((e0) it).a()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        if (!z10) {
            return str.regionMatches(i10, other, i11, i12);
        }
        return str.regionMatches(z10, i10, other, i11, i12);
    }

    public static final String o(String str, String oldValue, String newValue, boolean z10) {
        int a10;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(oldValue, "oldValue");
        kotlin.jvm.internal.n.f(newValue, "newValue");
        int i10 = 0;
        int F = p.F(str, oldValue, 0, z10);
        if (F < 0) {
            return str;
        }
        int length = oldValue.length();
        a10 = y8.i.a(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i10, F);
                sb.append(newValue);
                i10 = F + length;
                if (F >= str.length()) {
                    break;
                }
                F = p.F(str, oldValue, F + a10, z10);
            } while (F > 0);
            sb.append((CharSequence) str, i10, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.n.e(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String p(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return o(str, str2, str3, z10);
    }

    public static final boolean q(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix);
        }
        return n(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean r(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q(str, str2, z10);
    }
}
