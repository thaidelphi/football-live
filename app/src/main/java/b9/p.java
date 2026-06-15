package b9;

import i8.s;
import j8.e0;
import j8.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: Strings.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class p extends o {

    /* compiled from: Strings.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.p<CharSequence, Integer, i8.n<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f5303a;

        /* renamed from: b */
        final /* synthetic */ boolean f5304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z10) {
            super(2);
            this.f5303a = list;
            this.f5304b = z10;
        }

        public final i8.n<Integer, Integer> a(CharSequence $receiver, int i10) {
            kotlin.jvm.internal.n.f($receiver, "$this$$receiver");
            i8.n B = p.B($receiver, this.f5303a, i10, this.f5304b, false);
            if (B != null) {
                return s.a(B.c(), Integer.valueOf(((String) B.d()).length()));
            }
            return null;
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ i8.n<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements t8.l<y8.c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f5305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f5305a = charSequence;
        }

        @Override // t8.l
        /* renamed from: a */
        public final String invoke(y8.c it) {
            kotlin.jvm.internal.n.f(it, "it");
            return p.h0(this.f5305a, it);
        }
    }

    public static /* synthetic */ boolean A(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y(charSequence, charSequence2, z10);
    }

    public static final i8.n<Integer, String> B(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        int c10;
        y8.a g10;
        Object obj;
        Object obj2;
        int a10;
        Object G;
        if (!z10 && collection.size() == 1) {
            G = y.G(collection);
            String str = (String) G;
            int J = !z11 ? J(charSequence, str, i10, false, 4, null) : O(charSequence, str, i10, false, 4, null);
            if (J < 0) {
                return null;
            }
            return s.a(Integer.valueOf(J), str);
        }
        if (z11) {
            c10 = y8.i.c(i10, D(charSequence));
            g10 = y8.i.g(c10, 0);
        } else {
            a10 = y8.i.a(i10, 0);
            g10 = new y8.c(a10, charSequence.length());
        }
        if (charSequence instanceof String) {
            int a11 = g10.a();
            int b10 = g10.b();
            int c11 = g10.c();
            if ((c11 > 0 && a11 <= b10) || (c11 < 0 && b10 <= a11)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (o.n(str2, 0, (String) charSequence, a11, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (a11 == b10) {
                            break;
                        }
                        a11 += c11;
                    } else {
                        return s.a(Integer.valueOf(a11), str3);
                    }
                }
            }
        } else {
            int a12 = g10.a();
            int b11 = g10.b();
            int c12 = g10.c();
            if ((c12 > 0 && a12 <= b11) || (c12 < 0 && b11 <= a12)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (W(str4, 0, charSequence, a12, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (a12 == b11) {
                            break;
                        }
                        a12 += c12;
                    } else {
                        return s.a(Integer.valueOf(a12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final y8.c C(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return new y8.c(0, charSequence.length() - 1);
    }

    public static final int D(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int E(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return K(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int F(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        return H(charSequence, string, i10, charSequence.length(), z10, false, 16, null);
    }

    private static final int G(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int c10;
        int a10;
        y8.a g10;
        int a11;
        int c11;
        if (!z11) {
            a11 = y8.i.a(i10, 0);
            c11 = y8.i.c(i11, charSequence.length());
            g10 = new y8.c(a11, c11);
        } else {
            c10 = y8.i.c(i10, D(charSequence));
            a10 = y8.i.a(i11, 0);
            g10 = y8.i.g(c10, a10);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int a12 = g10.a();
            int b10 = g10.b();
            int c12 = g10.c();
            if ((c12 <= 0 || a12 > b10) && (c12 >= 0 || b10 > a12)) {
                return -1;
            }
            while (!o.n((String) charSequence2, 0, (String) charSequence, a12, charSequence2.length(), z10)) {
                if (a12 == b10) {
                    return -1;
                }
                a12 += c12;
            }
            return a12;
        }
        int a13 = g10.a();
        int b11 = g10.b();
        int c13 = g10.c();
        if ((c13 <= 0 || a13 > b11) && (c13 >= 0 || b11 > a13)) {
            return -1;
        }
        while (!W(charSequence2, 0, charSequence, a13, charSequence2.length(), z10)) {
            if (a13 == b11) {
                return -1;
            }
            a13 += c13;
        }
        return a13;
    }

    static /* synthetic */ int H(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return G(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int I(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return E(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return F(charSequence, str, i10, z10);
    }

    public static final int K(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int a10;
        boolean z11;
        char r10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            r10 = j8.m.r(chars);
            return ((String) charSequence).indexOf(r10, i10);
        }
        a10 = y8.i.a(i10, 0);
        e0 it = new y8.c(a10, D(charSequence)).iterator();
        while (it.hasNext()) {
            int a11 = it.a();
            char charAt = charSequence.charAt(a11);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    continue;
                    break;
                } else if (b9.b.d(chars[i11], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return a11;
            }
        }
        return -1;
    }

    public static final int L(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return P(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int M(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i10);
        }
        return G(charSequence, string, i10, 0, z10, true);
    }

    public static /* synthetic */ int N(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = D(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return L(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int O(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = D(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return M(charSequence, str, i10, z10);
    }

    public static final int P(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int c10;
        char r10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            r10 = j8.m.r(chars);
            return ((String) charSequence).lastIndexOf(r10, i10);
        }
        for (c10 = y8.i.c(i10, D(charSequence)); -1 < c10; c10--) {
            char charAt = charSequence.charAt(c10);
            int length = chars.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (b9.b.d(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return c10;
            }
        }
        return -1;
    }

    public static a9.f<String> Q(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return e0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> R(CharSequence charSequence) {
        a9.f Q;
        List<String> r10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        Q = Q(charSequence);
        r10 = a9.n.r(Q);
        return r10;
    }

    public static final CharSequence S(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (i10 >= 0) {
            if (i10 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i10);
            e0 it = new y8.c(1, i10 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.a();
                sb.append(c10);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
    }

    public static String T(String str, int i10, char c10) {
        kotlin.jvm.internal.n.f(str, "<this>");
        return S(str, i10, c10).toString();
    }

    private static final a9.f<y8.c> U(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List b10;
        Z(i11);
        b10 = j8.l.b(strArr);
        return new d(charSequence, i10, i11, new a(b10, z10));
    }

    static /* synthetic */ a9.f V(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return U(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean W(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b9.b.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String X(String str, CharSequence prefix) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        if (g0(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.n.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static String Y(String str, CharSequence suffix) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(suffix, "suffix");
        if (A(str, suffix, false, 2, null)) {
            String substring = str.substring(0, str.length() - suffix.length());
            kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final void Z(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> a0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Iterable<y8.c> g10;
        int k10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return b0(charSequence, str, z10, i10);
            }
        }
        g10 = a9.n.g(V(charSequence, delimiters, 0, z10, i10, 2, null));
        k10 = j8.r.k(g10, 10);
        ArrayList arrayList = new ArrayList(k10);
        for (y8.c cVar : g10) {
            arrayList.add(h0(charSequence, cVar));
        }
        return arrayList;
    }

    private static final List<String> b0(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> b10;
        Z(i10);
        int i11 = 0;
        int F = F(charSequence, str, 0, z10);
        if (F != -1 && i10 != 1) {
            boolean z11 = i10 > 0;
            ArrayList arrayList = new ArrayList(z11 ? y8.i.c(i10, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i11, F).toString());
                i11 = str.length() + F;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                F = F(charSequence, str, i11, z10);
            } while (F != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        b10 = j8.p.b(charSequence.toString());
        return b10;
    }

    public static /* synthetic */ List c0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return a0(charSequence, strArr, z10, i10);
    }

    public static final a9.f<String> d0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        a9.f<String> l10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(delimiters, "delimiters");
        l10 = a9.n.l(V(charSequence, delimiters, 0, z10, i10, 2, null), new b(charSequence));
        return l10;
    }

    public static /* synthetic */ a9.f e0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return d0(charSequence, strArr, z10, i10);
    }

    public static final boolean f0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        boolean r10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        if (!z10 && (charSequence instanceof String) && (prefix instanceof String)) {
            r10 = o.r((String) charSequence, (String) prefix, false, 2, null);
            return r10;
        }
        return W(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean g0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return f0(charSequence, charSequence2, z10);
    }

    public static final String h0(CharSequence charSequence, y8.c range) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(range, "range");
        return charSequence.subSequence(range.h().intValue(), range.g().intValue() + 1).toString();
    }

    public static final String i0(String str, char c10, String missingDelimiterValue) {
        int I;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        I = I(str, c10, 0, false, 6, null);
        if (I == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(I + 1, str.length());
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String j0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(delimiter, "delimiter");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int J = J(str, delimiter, 0, false, 6, null);
        if (J == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(J + delimiter.length(), str.length());
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String k0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return i0(str, c10, str2);
    }

    public static /* synthetic */ String l0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return j0(str, str2, str3);
    }

    public static final String m0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int N = N(str, c10, 0, false, 6, null);
        if (N == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(N + 1, str.length());
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String n0(String str, String delimiter, String missingDelimiterValue) {
        int O;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(delimiter, "delimiter");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        O = O(str, delimiter, 0, false, 6, null);
        if (O == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(O + delimiter.length(), str.length());
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String o0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m0(str, c10, str2);
    }

    public static /* synthetic */ String p0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return n0(str, str2, str3);
    }

    public static final String q0(String str, char c10, String missingDelimiterValue) {
        int I;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        I = I(str, c10, 0, false, 6, null);
        if (I == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, I);
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String r0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(delimiter, "delimiter");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int J = J(str, delimiter, 0, false, 6, null);
        if (J == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, J);
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String s0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return q0(str, c10, str2);
    }

    public static final boolean t(CharSequence charSequence, char c10, boolean z10) {
        int I;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        I = I(charSequence, c10, 0, z10, 2, null);
        return I >= 0;
    }

    public static /* synthetic */ String t0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return r0(str, str2, str3);
    }

    public static final boolean u(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        if (other instanceof String) {
            if (J(charSequence, (String) other, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (H(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String u0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        int N = N(str, c10, 0, false, 6, null);
        if (N == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, N);
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean v(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t(charSequence, c10, z10);
    }

    public static final String v0(String str, String delimiter, String missingDelimiterValue) {
        int O;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(delimiter, "delimiter");
        kotlin.jvm.internal.n.f(missingDelimiterValue, "missingDelimiterValue");
        O = O(str, delimiter, 0, false, 6, null);
        if (O == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, O);
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean w(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return u(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String w0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return u0(str, c10, str2);
    }

    public static final boolean x(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        return charSequence.length() > 0 && b9.b.d(charSequence.charAt(D(charSequence)), c10, z10);
    }

    public static /* synthetic */ String x0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return v0(str, str2, str3);
    }

    public static final boolean y(CharSequence charSequence, CharSequence suffix, boolean z10) {
        boolean k10;
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        kotlin.jvm.internal.n.f(suffix, "suffix");
        if (!z10 && (charSequence instanceof String) && (suffix instanceof String)) {
            k10 = o.k((String) charSequence, (String) suffix, false, 2, null);
            return k10;
        }
        return W(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static CharSequence y0(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = b9.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!c10) {
                    break;
                }
                length--;
            } else if (c10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ boolean z(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return x(charSequence, c10, z10);
    }

    public static String z0(String str, char... chars) {
        boolean i10;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(chars, "chars");
        int length = str.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            i10 = j8.m.i(chars, str.charAt(!z10 ? i11 : length));
            if (z10) {
                if (!i10) {
                    break;
                }
                length--;
            } else if (i10) {
                i11++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }
}
