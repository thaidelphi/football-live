package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.a0;
import com.google.android.material.internal.j;
import r5.a;
/* compiled from: CollapsingTextHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f14365t0;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f14366u0;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private r5.a E;
    private r5.a F;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f14367a;

    /* renamed from: a0  reason: collision with root package name */
    private float f14368a0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14369b;

    /* renamed from: b0  reason: collision with root package name */
    private float f14370b0;

    /* renamed from: c  reason: collision with root package name */
    private float f14371c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f14372c0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14373d;

    /* renamed from: d0  reason: collision with root package name */
    private float f14374d0;

    /* renamed from: e  reason: collision with root package name */
    private float f14375e;

    /* renamed from: e0  reason: collision with root package name */
    private float f14376e0;

    /* renamed from: f  reason: collision with root package name */
    private float f14377f;

    /* renamed from: f0  reason: collision with root package name */
    private float f14378f0;

    /* renamed from: g  reason: collision with root package name */
    private int f14379g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f14380g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f14381h;

    /* renamed from: h0  reason: collision with root package name */
    private float f14382h0;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f14383i;

    /* renamed from: i0  reason: collision with root package name */
    private float f14384i0;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f14385j;

    /* renamed from: j0  reason: collision with root package name */
    private float f14386j0;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f14388k0;

    /* renamed from: l0  reason: collision with root package name */
    private float f14390l0;

    /* renamed from: m0  reason: collision with root package name */
    private float f14392m0;

    /* renamed from: n0  reason: collision with root package name */
    private float f14394n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f14395o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f14396o0;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f14397p;

    /* renamed from: q  reason: collision with root package name */
    private int f14399q;

    /* renamed from: r  reason: collision with root package name */
    private float f14401r;

    /* renamed from: s  reason: collision with root package name */
    private float f14403s;

    /* renamed from: t  reason: collision with root package name */
    private float f14405t;

    /* renamed from: u  reason: collision with root package name */
    private float f14406u;

    /* renamed from: v  reason: collision with root package name */
    private float f14407v;

    /* renamed from: w  reason: collision with root package name */
    private float f14408w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f14409x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f14410y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f14411z;

    /* renamed from: k  reason: collision with root package name */
    private int f14387k = 16;

    /* renamed from: l  reason: collision with root package name */
    private int f14389l = 16;

    /* renamed from: m  reason: collision with root package name */
    private float f14391m = 15.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f14393n = 15.0f;
    private boolean J = true;

    /* renamed from: p0  reason: collision with root package name */
    private int f14398p0 = 1;

    /* renamed from: q0  reason: collision with root package name */
    private float f14400q0 = 0.0f;

    /* renamed from: r0  reason: collision with root package name */
    private float f14402r0 = 1.0f;

    /* renamed from: s0  reason: collision with root package name */
    private int f14404s0 = j.f14432n;

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements a.InterfaceC0348a {
        a() {
        }

        @Override // r5.a.InterfaceC0348a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    static {
        f14365t0 = Build.VERSION.SDK_INT < 18;
        f14366u0 = null;
    }

    public b(View view) {
        this.f14367a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f14383i = new Rect();
        this.f14381h = new Rect();
        this.f14385j = new RectF();
        this.f14377f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f14391m);
        textPaint.setTypeface(this.A);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f14384i0);
        }
    }

    private void B(float f10) {
        if (this.f14373d) {
            this.f14385j.set(f10 < this.f14377f ? this.f14381h : this.f14383i);
            return;
        }
        this.f14385j.left = G(this.f14381h.left, this.f14383i.left, f10, this.X);
        this.f14385j.top = G(this.f14401r, this.f14403s, f10, this.X);
        this.f14385j.right = G(this.f14381h.right, this.f14383i.right, f10, this.X);
        this.f14385j.bottom = G(this.f14381h.bottom, this.f14383i.bottom, f10, this.X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return a0.E(this.f14367a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        androidx.core.text.d dVar;
        if (z10) {
            dVar = androidx.core.text.e.f2773d;
        } else {
            dVar = androidx.core.text.e.f2772c;
        }
        return dVar.a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return e5.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean M(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f14392m0 = f10;
        a0.h0(this.f14367a);
    }

    private boolean U(Typeface typeface) {
        r5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f14411z != typeface) {
            this.f14411z = typeface;
            Typeface b10 = r5.g.b(this.f14367a.getContext().getResources().getConfiguration(), typeface);
            this.f14410y = b10;
            if (b10 == null) {
                b10 = this.f14411z;
            }
            this.f14409x = b10;
            return true;
        }
        return false;
    }

    private void Y(float f10) {
        this.f14394n0 = f10;
        a0.h0(this.f14367a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        i(1.0f, z10);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout2 = this.f14388k0) != null) {
            this.f14396o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f14396o0;
        float f10 = 0.0f;
        if (charSequence2 != null) {
            this.f14390l0 = I(this.V, charSequence2);
        } else {
            this.f14390l0 = 0.0f;
        }
        int b10 = androidx.core.view.e.b(this.f14389l, this.I ? 1 : 0);
        int i10 = b10 & 112;
        if (i10 == 48) {
            this.f14403s = this.f14383i.top;
        } else if (i10 != 80) {
            this.f14403s = this.f14383i.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.f14403s = this.f14383i.bottom + this.V.ascent();
        }
        int i11 = b10 & 8388615;
        if (i11 == 1) {
            this.f14406u = this.f14383i.centerX() - (this.f14390l0 / 2.0f);
        } else if (i11 != 5) {
            this.f14406u = this.f14383i.left;
        } else {
            this.f14406u = this.f14383i.right - this.f14390l0;
        }
        i(0.0f, z10);
        float height = this.f14388k0 != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f14388k0;
        if (staticLayout3 != null && this.f14398p0 > 1) {
            f10 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                f10 = I(this.V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f14388k0;
        this.f14399q = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int b11 = androidx.core.view.e.b(this.f14387k, this.I ? 1 : 0);
        int i12 = b11 & 112;
        if (i12 == 48) {
            this.f14401r = this.f14381h.top;
        } else if (i12 != 80) {
            this.f14401r = this.f14381h.centerY() - (height / 2.0f);
        } else {
            this.f14401r = (this.f14381h.bottom - height) + this.V.descent();
        }
        int i13 = b11 & 8388615;
        if (i13 == 1) {
            this.f14405t = this.f14381h.centerX() - (f10 / 2.0f);
        } else if (i13 != 5) {
            this.f14405t = this.f14381h.left;
        } else {
            this.f14405t = this.f14381h.right - f10;
        }
        j();
        e0(this.f14371c);
    }

    private void c() {
        g(this.f14371c);
    }

    private boolean c0(Typeface typeface) {
        r5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C != typeface) {
            this.C = typeface;
            Typeface b10 = r5.g.b(this.f14367a.getContext().getResources().getConfiguration(), typeface);
            this.B = b10;
            if (b10 == null) {
                b10 = this.C;
            }
            this.A = b10;
            return true;
        }
        return false;
    }

    private float d(float f10) {
        float f11 = this.f14377f;
        if (f10 <= f11) {
            return e5.a.b(1.0f, 0.0f, this.f14375e, f11, f10);
        }
        return e5.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f14375e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private void e0(float f10) {
        h(f10);
        boolean z10 = f14365t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        a0.h0(this.f14367a);
    }

    private boolean f(CharSequence charSequence) {
        boolean D = D();
        return this.J ? F(charSequence, D) : D;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (this.f14373d) {
            if (f10 < this.f14377f) {
                this.f14407v = this.f14405t;
                this.f14408w = this.f14401r;
                e0(0.0f);
                f11 = 0.0f;
            } else {
                this.f14407v = this.f14406u;
                this.f14408w = this.f14403s - Math.max(0, this.f14379g);
                e0(1.0f);
                f11 = 1.0f;
            }
        } else {
            this.f14407v = G(this.f14405t, this.f14406u, f10, this.X);
            this.f14408w = G(this.f14401r, this.f14403s, f10, this.X);
            e0(f10);
            f11 = f10;
        }
        TimeInterpolator timeInterpolator = e5.a.f25170b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f14397p != this.f14395o) {
            this.V.setColor(a(v(), t(), f11));
        } else {
            this.V.setColor(t());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f12 = this.f14382h0;
            float f13 = this.f14384i0;
            if (f12 != f13) {
                this.V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
            } else {
                this.V.setLetterSpacing(f12);
            }
        }
        this.P = G(this.f14374d0, this.Z, f10, null);
        this.Q = G(this.f14376e0, this.f14368a0, f10, null);
        this.R = G(this.f14378f0, this.f14370b0, f10, null);
        int a10 = a(u(this.f14380g0), u(this.f14372c0), f10);
        this.S = a10;
        this.V.setShadowLayer(this.P, this.Q, this.R, a10);
        if (this.f14373d) {
            this.V.setAlpha((int) (d(f10) * this.V.getAlpha()));
        }
        a0.h0(this.f14367a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        boolean z12;
        if (this.G == null) {
            return;
        }
        float width = this.f14383i.width();
        float width2 = this.f14381h.width();
        if (C(f10, 1.0f)) {
            f11 = this.f14393n;
            f12 = this.f14382h0;
            this.N = 1.0f;
            Typeface typeface = this.D;
            Typeface typeface2 = this.f14409x;
            if (typeface != typeface2) {
                this.D = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f13 = this.f14391m;
            float f14 = this.f14384i0;
            Typeface typeface3 = this.D;
            Typeface typeface4 = this.A;
            if (typeface3 != typeface4) {
                this.D = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (C(f10, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f14391m, this.f14393n, f10, this.Y) / this.f14391m;
            }
            float f15 = this.f14393n / this.f14391m;
            width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
            f11 = f13;
            f12 = f14;
            z12 = z11;
        }
        if (width > 0.0f) {
            z12 = ((this.O > f11 ? 1 : (this.O == f11 ? 0 : -1)) != 0) || ((this.f14386j0 > f12 ? 1 : (this.f14386j0 == f12 ? 0 : -1)) != 0) || this.U || z12;
            this.O = f11;
            this.f14386j0 = f12;
            this.U = false;
        }
        if (this.H == null || z12) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.D);
            if (Build.VERSION.SDK_INT >= 21) {
                this.V.setLetterSpacing(this.f14386j0);
            }
            this.V.setLinearText(this.N != 1.0f);
            this.I = f(this.G);
            StaticLayout k10 = k(k0() ? this.f14398p0 : 1, width, this.I);
            this.f14388k0 = k10;
            this.H = k10.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        StaticLayout staticLayout;
        try {
            staticLayout = j.c(this.G, this.V, (int) f10).e(TextUtils.TruncateAt.END).h(z10).d(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).g(false).j(i10).i(this.f14400q0, this.f14402r0).f(this.f14404s0).a();
        } catch (j.a e8) {
            Log.e("CollapsingTextHelper", e8.getCause().getMessage(), e8);
            staticLayout = null;
        }
        return (StaticLayout) androidx.core.util.i.f(staticLayout);
    }

    private boolean k0() {
        return this.f14398p0 > 1 && (!this.I || this.f14373d) && !this.K;
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.V.setAlpha((int) (this.f14394n0 * f12));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint = this.V;
            textPaint.setShadowLayer(this.P, this.Q, this.R, j5.a.a(this.S, textPaint.getAlpha()));
        }
        this.f14388k0.draw(canvas);
        this.V.setAlpha((int) (this.f14392m0 * f12));
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, j5.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f14388k0.getLineBaseline(0);
        CharSequence charSequence = this.f14396o0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f14373d) {
            return;
        }
        String trim = this.f14396o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f14388k0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.V);
    }

    private void n() {
        if (this.L != null || this.f14381h.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f14388k0.getWidth();
        int height = this.f14388k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f14388k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    private float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f14390l0 / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? this.f14383i.left : this.f14383i.right - this.f14390l0 : this.I ? this.f14383i.right - this.f14390l0 : this.f14383i.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f14390l0 / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? rectF.left + this.f14390l0 : this.f14383i.right : this.I ? this.f14383i.right : rectF.left + this.f14390l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f14395o);
    }

    private Layout.Alignment y() {
        int b10 = androidx.core.view.e.b(this.f14387k, this.I ? 1 : 0) & 7;
        if (b10 != 1) {
            return b10 != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f14393n);
        textPaint.setTypeface(this.f14409x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f14382h0);
        }
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f14397p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f14395o) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f14411z;
            if (typeface != null) {
                this.f14410y = r5.g.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = r5.g.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f14410y;
            if (typeface3 == null) {
                typeface3 = this.f14411z;
            }
            this.f14409x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            L(true);
        }
    }

    void J() {
        this.f14369b = this.f14383i.width() > 0 && this.f14383i.height() > 0 && this.f14381h.width() > 0 && this.f14381h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z10) {
        if ((this.f14367a.getHeight() <= 0 || this.f14367a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (M(this.f14383i, i10, i11, i12, i13)) {
            return;
        }
        this.f14383i.set(i10, i11, i12, i13);
        this.U = true;
        J();
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        r5.d dVar = new r5.d(this.f14367a.getContext(), i10);
        if (dVar.i() != null) {
            this.f14397p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f14393n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f30391c;
        if (colorStateList != null) {
            this.f14372c0 = colorStateList;
        }
        this.f14368a0 = dVar.f30396h;
        this.f14370b0 = dVar.f30397i;
        this.Z = dVar.f30398j;
        this.f14382h0 = dVar.f30400l;
        r5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new r5.a(new a(), dVar.e());
        dVar.h(this.f14367a.getContext(), this.F);
        K();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f14397p != colorStateList) {
            this.f14397p = colorStateList;
            K();
        }
    }

    public void S(int i10) {
        if (this.f14389l != i10) {
            this.f14389l = i10;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (M(this.f14381h, i10, i11, i12, i13)) {
            return;
        }
        this.f14381h.set(i10, i11, i12, i13);
        this.U = true;
        J();
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f14384i0 != f10) {
            this.f14384i0 = f10;
            K();
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f14395o != colorStateList) {
            this.f14395o = colorStateList;
            K();
        }
    }

    public void a0(int i10) {
        if (this.f14387k != i10) {
            this.f14387k = i10;
            K();
        }
    }

    public void b0(float f10) {
        if (this.f14391m != f10) {
            this.f14391m = f10;
            K();
        }
    }

    public void d0(float f10) {
        float a10 = x.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f14371c) {
            this.f14371c = a10;
            c();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        K();
    }

    public final boolean g0(int[] iArr) {
        this.T = iArr;
        if (E()) {
            K();
            return true;
        }
        return false;
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            K();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        K();
    }

    public void j0(Typeface typeface) {
        boolean U = U(typeface);
        boolean c02 = c0(typeface);
        if (U || c02) {
            K();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.H == null || !this.f14369b) {
            return;
        }
        this.V.setTextSize(this.O);
        float f10 = this.f14407v;
        float f11 = this.f14408w;
        boolean z10 = this.K && this.L != null;
        float f12 = this.N;
        if (f12 != 1.0f && !this.f14373d) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.L, f10, f11, this.M);
            canvas.restoreToCount(save);
            return;
        }
        if (k0() && (!this.f14373d || this.f14371c > this.f14377f)) {
            m(canvas, this.f14407v - this.f14388k0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f14388k0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = r(i10, i11);
        rectF.top = this.f14383i.top;
        rectF.right = s(rectF, i10, i11);
        rectF.bottom = this.f14383i.top + q();
    }

    public ColorStateList p() {
        return this.f14397p;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f14397p);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f14371c;
    }
}
