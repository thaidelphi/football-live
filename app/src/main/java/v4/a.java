package v4;

import a5.c0;
import a5.p0;
import a5.t;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import n4.b;
import n4.g;
import n4.h;
import n4.j;
/* compiled from: Tx3gDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final c0 f31880o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f31881p;

    /* renamed from: q  reason: collision with root package name */
    private final int f31882q;

    /* renamed from: r  reason: collision with root package name */
    private final int f31883r;

    /* renamed from: s  reason: collision with root package name */
    private final String f31884s;

    /* renamed from: t  reason: collision with root package name */
    private final float f31885t;

    /* renamed from: u  reason: collision with root package name */
    private final int f31886u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f31880o = new c0();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f31882q = bArr[24];
            this.f31883r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f31884s = "Serif".equals(p0.D(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f31886u = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f31881p = z10;
            if (z10) {
                this.f31885t = p0.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f31885t = 0.85f;
                return;
            }
        }
        this.f31882q = 0;
        this.f31883r = -1;
        this.f31884s = "sans-serif";
        this.f31881p = false;
        this.f31885t = 0.85f;
        this.f31886u = -1;
    }

    private void B(c0 c0Var, SpannableStringBuilder spannableStringBuilder) throws j {
        int i10;
        C(c0Var.a() >= 12);
        int F = c0Var.F();
        int F2 = c0Var.F();
        c0Var.L(2);
        int z10 = c0Var.z();
        c0Var.L(1);
        int n10 = c0Var.n();
        if (F2 > spannableStringBuilder.length()) {
            t.i("Tx3gDecoder", "Truncating styl end (" + F2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i10 = spannableStringBuilder.length();
        } else {
            i10 = F2;
        }
        if (F >= i10) {
            t.i("Tx3gDecoder", "Ignoring styl with start (" + F + ") >= end (" + i10 + ").");
            return;
        }
        int i11 = i10;
        E(spannableStringBuilder, z10, this.f31882q, F, i11, 0);
        D(spannableStringBuilder, n10, this.f31883r, F, i11, 0);
    }

    private static void C(boolean z10) throws j {
        if (!z10) {
            throw new j("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String G(c0 c0Var) throws j {
        char g10;
        C(c0Var.a() >= 2);
        int F = c0Var.F();
        if (F == 0) {
            return "";
        }
        if (c0Var.a() >= 2 && ((g10 = c0Var.g()) == 65279 || g10 == 65534)) {
            return c0Var.x(F, x5.b.f32753f);
        }
        return c0Var.x(F, x5.b.f32750c);
    }

    @Override // n4.g
    protected h z(byte[] bArr, int i10, boolean z10) throws j {
        this.f31880o.I(bArr, i10);
        String G = G(this.f31880o);
        if (G.isEmpty()) {
            return b.f31887b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        E(spannableStringBuilder, this.f31882q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f31883r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f31884s, 0, spannableStringBuilder.length());
        float f10 = this.f31885t;
        while (this.f31880o.a() >= 8) {
            int e8 = this.f31880o.e();
            int n10 = this.f31880o.n();
            int n11 = this.f31880o.n();
            if (n11 == 1937013100) {
                C(this.f31880o.a() >= 2);
                int F = this.f31880o.F();
                for (int i11 = 0; i11 < F; i11++) {
                    B(this.f31880o, spannableStringBuilder);
                }
            } else if (n11 == 1952608120 && this.f31881p) {
                C(this.f31880o.a() >= 2);
                f10 = p0.p(this.f31880o.F() / this.f31886u, 0.0f, 0.95f);
            }
            this.f31880o.K(e8 + n10);
        }
        return new b(new b.C0322b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}
