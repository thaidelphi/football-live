package u4;

import android.text.TextUtils;
import java.util.regex.Pattern;
import y5.s;
/* compiled from: TextEmphasis.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f31378d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    private static final s<String> f31379e = s.p("auto", "none");

    /* renamed from: f  reason: collision with root package name */
    private static final s<String> f31380f = s.q("dot", "sesame", "circle");

    /* renamed from: g  reason: collision with root package name */
    private static final s<String> f31381g = s.p("filled", "open");

    /* renamed from: h  reason: collision with root package name */
    private static final s<String> f31382h = s.q("after", "before", "outside");

    /* renamed from: a  reason: collision with root package name */
    public final int f31383a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31384b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31385c;

    private b(int i10, int i11, int i12) {
        this.f31383a = i10;
        this.f31384b = i11;
        this.f31385c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e8 = x5.a.e(str.trim());
        if (e8.isEmpty()) {
            return null;
        }
        return b(s.k(TextUtils.split(e8, f31378d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static u4.b b(y5.s<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.b(y5.s):u4.b");
    }
}
