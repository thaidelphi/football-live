package b9;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class h extends g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5301a = new a();

        a() {
            super(1);
        }

        @Override // t8.l
        /* renamed from: b */
        public final String invoke(String line) {
            kotlin.jvm.internal.n.f(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements t8.l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f5302a = str;
        }

        @Override // t8.l
        /* renamed from: b */
        public final String invoke(String line) {
            kotlin.jvm.internal.n.f(line, "line");
            return this.f5302a + line;
        }
    }

    private static final t8.l<String, String> b(String str) {
        return str.length() == 0 ? a.f5301a : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!b9.a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String newIndent) {
        String invoke;
        kotlin.jvm.internal.n.f(str, "<this>");
        kotlin.jvm.internal.n.f(newIndent, "newIndent");
        List<String> R = p.R(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : R) {
            if (!f.m((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(j8.o.k(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(Integer.valueOf(c(str2)));
        }
        Integer num = (Integer) j8.o.C(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * R.size());
        t8.l<String, String> b10 = b(newIndent);
        int e8 = j8.o.e(R);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : R) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j8.o.j();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == e8) && f.m(str3)) {
                str3 = null;
            } else {
                String A0 = r.A0(str3, intValue);
                if (A0 != null && (invoke = b10.invoke(A0)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb = ((StringBuilder) j8.o.y(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.n.e(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        kotlin.jvm.internal.n.f(str, "<this>");
        return d(str, "");
    }
}
