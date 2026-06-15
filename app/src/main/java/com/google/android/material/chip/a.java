package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import com.google.android.material.internal.k;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import e5.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import r5.c;
import r5.d;
import s5.b;
import u5.g;
/* compiled from: ChipDrawable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends g implements Drawable.Callback, k.b {
    private static final int[] S0 = {16842910};
    private static final ShapeDrawable T0 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private int A0;
    private float B;
    private int B0;
    private float C;
    private int C0;
    private ColorStateList D;
    private boolean D0;
    private float E;
    private int E0;
    private ColorStateList F;
    private int F0;
    private CharSequence G;
    private ColorFilter G0;
    private boolean H;
    private PorterDuffColorFilter H0;
    private Drawable I;
    private ColorStateList I0;
    private ColorStateList J;
    private PorterDuff.Mode J0;
    private float K;
    private int[] K0;
    private boolean L;
    private boolean L0;
    private boolean M;
    private ColorStateList M0;
    private Drawable N;
    private WeakReference<InterfaceC0186a> N0;
    private Drawable O;
    private TextUtils.TruncateAt O0;
    private ColorStateList P;
    private boolean P0;
    private float Q;
    private int Q0;
    private CharSequence R;
    private boolean R0;
    private boolean S;
    private boolean T;
    private Drawable U;
    private ColorStateList V;
    private h W;
    private h X;
    private float Y;
    private float Z;

    /* renamed from: a0  reason: collision with root package name */
    private float f14104a0;

    /* renamed from: b0  reason: collision with root package name */
    private float f14105b0;

    /* renamed from: c0  reason: collision with root package name */
    private float f14106c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f14107d0;

    /* renamed from: e0  reason: collision with root package name */
    private float f14108e0;

    /* renamed from: f0  reason: collision with root package name */
    private float f14109f0;

    /* renamed from: g0  reason: collision with root package name */
    private final Context f14110g0;

    /* renamed from: h0  reason: collision with root package name */
    private final Paint f14111h0;

    /* renamed from: i0  reason: collision with root package name */
    private final Paint f14112i0;

    /* renamed from: j0  reason: collision with root package name */
    private final Paint.FontMetrics f14113j0;

    /* renamed from: k0  reason: collision with root package name */
    private final RectF f14114k0;

    /* renamed from: l0  reason: collision with root package name */
    private final PointF f14115l0;

    /* renamed from: m0  reason: collision with root package name */
    private final Path f14116m0;

    /* renamed from: n0  reason: collision with root package name */
    private final k f14117n0;

    /* renamed from: x0  reason: collision with root package name */
    private int f14118x0;

    /* renamed from: y0  reason: collision with root package name */
    private int f14119y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f14120z;

    /* renamed from: z0  reason: collision with root package name */
    private int f14121z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface InterfaceC0186a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.C = -1.0f;
        this.f14111h0 = new Paint(1);
        this.f14113j0 = new Paint.FontMetrics();
        this.f14114k0 = new RectF();
        this.f14115l0 = new PointF();
        this.f14116m0 = new Path();
        this.F0 = 255;
        this.J0 = PorterDuff.Mode.SRC_IN;
        this.N0 = new WeakReference<>(null);
        N(context);
        this.f14110g0 = context;
        k kVar = new k(this);
        this.f14117n0 = kVar;
        this.G = "";
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f14112i0 = null;
        int[] iArr = S0;
        setState(iArr);
        k2(iArr);
        this.P0 = true;
        if (b.f30781a) {
            T0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (N2()) {
            n0(rect, this.f14114k0);
            RectF rectF = this.f14114k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.N.setBounds(0, 0, (int) this.f14114k0.width(), (int) this.f14114k0.height());
            if (b.f30781a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
            } else {
                this.N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        this.f14111h0.setColor(this.B0);
        this.f14111h0.setStyle(Paint.Style.FILL);
        this.f14114k0.set(rect);
        if (!this.R0) {
            canvas.drawRoundRect(this.f14114k0, H0(), H0(), this.f14111h0);
            return;
        }
        h(new RectF(rect), this.f14116m0);
        super.p(canvas, this.f14111h0, this.f14116m0, u());
    }

    private void C0(Canvas canvas, Rect rect) {
        Paint paint = this.f14112i0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.j(-16777216, 127));
            canvas.drawRect(rect, this.f14112i0);
            if (M2() || L2()) {
                k0(rect, this.f14114k0);
                canvas.drawRect(this.f14114k0, this.f14112i0);
            }
            if (this.G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f14112i0);
            }
            if (N2()) {
                n0(rect, this.f14114k0);
                canvas.drawRect(this.f14114k0, this.f14112i0);
            }
            this.f14112i0.setColor(androidx.core.graphics.a.j(-65536, 127));
            m0(rect, this.f14114k0);
            canvas.drawRect(this.f14114k0, this.f14112i0);
            this.f14112i0.setColor(androidx.core.graphics.a.j(-16711936, 127));
            o0(rect, this.f14114k0);
            canvas.drawRect(this.f14114k0, this.f14112i0);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.G != null) {
            Paint.Align s02 = s0(rect, this.f14115l0);
            q0(rect, this.f14114k0);
            if (this.f14117n0.d() != null) {
                this.f14117n0.e().drawableState = getState();
                this.f14117n0.j(this.f14110g0);
            }
            this.f14117n0.e().setTextAlign(s02);
            int i10 = 0;
            boolean z10 = Math.round(this.f14117n0.f(g1().toString())) > Math.round(this.f14114k0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f14114k0);
            }
            CharSequence charSequence = this.G;
            if (z10 && this.O0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f14117n0.e(), this.f14114k0.width(), this.O0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f14115l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f14117n0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean L2() {
        return this.T && this.U != null && this.D0;
    }

    private boolean M2() {
        return this.H && this.I != null;
    }

    private boolean N2() {
        return this.M && this.N != null;
    }

    private void O2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void P2() {
        this.M0 = this.L0 ? b.a(this.F) : null;
    }

    @TargetApi(21)
    private void Q2() {
        this.O = new RippleDrawable(b.a(e1()), this.N, T0);
    }

    private float Y0() {
        Drawable drawable = this.D0 ? this.U : this.I;
        float f10 = this.K;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(o.b(this.f14110g0, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float Z0() {
        Drawable drawable = this.D0 ? this.U : this.I;
        float f10 = this.K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void a2(ColorStateList colorStateList) {
        if (this.f14120z != colorStateList) {
            this.f14120z = colorStateList;
            onStateChange(getState());
        }
    }

    private void j0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(V0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            androidx.core.graphics.drawable.a.o(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2() || L2()) {
            float f10 = this.Y + this.Z;
            float Z0 = Z0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + Z0;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - Z0;
            }
            float Y0 = Y0();
            float exactCenterY = rect.exactCenterY() - (Y0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + Y0;
        }
    }

    private ColorFilter k1() {
        ColorFilter colorFilter = this.G0;
        return colorFilter != null ? colorFilter : this.H0;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (N2()) {
            float f10 = this.f14109f0 + this.f14108e0 + this.Q + this.f14107d0 + this.f14106c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean m1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2()) {
            float f10 = this.f14109f0 + this.f14108e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.Q;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.Q;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2()) {
            float f10 = this.f14109f0 + this.f14108e0 + this.Q + this.f14107d0 + this.f14106c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float l02 = this.Y + l0() + this.f14105b0;
            float p02 = this.f14109f0 + p0() + this.f14106c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + l02;
                rectF.right = rect.right - p02;
            } else {
                rectF.left = rect.left + p02;
                rectF.right = rect.right - l02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float r0() {
        this.f14117n0.e().getFontMetrics(this.f14113j0);
        Paint.FontMetrics fontMetrics = this.f14113j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean s1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean t0() {
        return this.T && this.U != null && this.S;
    }

    private void t1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray h10 = m.h(this.f14110g0, attributeSet, d5.k.X, i10, i11, new int[0]);
        this.R0 = h10.hasValue(d5.k.J0);
        a2(c.a(this.f14110g0, h10, d5.k.f24296w0));
        E1(c.a(this.f14110g0, h10, d5.k.f24192j0));
        S1(h10.getDimension(d5.k.f24256r0, 0.0f));
        int i12 = d5.k.f24200k0;
        if (h10.hasValue(i12)) {
            G1(h10.getDimension(i12, 0.0f));
        }
        W1(c.a(this.f14110g0, h10, d5.k.f24280u0));
        Y1(h10.getDimension(d5.k.f24288v0, 0.0f));
        x2(c.a(this.f14110g0, h10, d5.k.I0));
        C2(h10.getText(d5.k.f24144d0));
        d f10 = c.f(this.f14110g0, h10, d5.k.Y);
        f10.l(h10.getDimension(d5.k.Z, f10.j()));
        if (Build.VERSION.SDK_INT < 23) {
            f10.k(c.a(this.f14110g0, h10, d5.k.f24120a0));
        }
        D2(f10);
        int i13 = h10.getInt(d5.k.f24128b0, 0);
        if (i13 == 1) {
            p2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            p2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            p2(TextUtils.TruncateAt.END);
        }
        R1(h10.getBoolean(d5.k.f24248q0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            R1(h10.getBoolean(d5.k.f24224n0, false));
        }
        K1(c.d(this.f14110g0, h10, d5.k.f24216m0));
        int i14 = d5.k.f24240p0;
        if (h10.hasValue(i14)) {
            O1(c.a(this.f14110g0, h10, i14));
        }
        M1(h10.getDimension(d5.k.f24232o0, -1.0f));
        n2(h10.getBoolean(d5.k.D0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            n2(h10.getBoolean(d5.k.f24312y0, false));
        }
        b2(c.d(this.f14110g0, h10, d5.k.f24304x0));
        l2(c.a(this.f14110g0, h10, d5.k.C0));
        g2(h10.getDimension(d5.k.A0, 0.0f));
        w1(h10.getBoolean(d5.k.f24152e0, false));
        D1(h10.getBoolean(d5.k.f24184i0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            D1(h10.getBoolean(d5.k.f24168g0, false));
        }
        y1(c.d(this.f14110g0, h10, d5.k.f24160f0));
        int i15 = d5.k.f24176h0;
        if (h10.hasValue(i15)) {
            A1(c.a(this.f14110g0, h10, i15));
        }
        A2(h.b(this.f14110g0, h10, d5.k.K0));
        q2(h.b(this.f14110g0, h10, d5.k.F0));
        U1(h10.getDimension(d5.k.f24272t0, 0.0f));
        u2(h10.getDimension(d5.k.H0, 0.0f));
        s2(h10.getDimension(d5.k.G0, 0.0f));
        H2(h10.getDimension(d5.k.M0, 0.0f));
        F2(h10.getDimension(d5.k.L0, 0.0f));
        i2(h10.getDimension(d5.k.B0, 0.0f));
        d2(h10.getDimension(d5.k.f24320z0, 0.0f));
        I1(h10.getDimension(d5.k.f24208l0, 0.0f));
        w2(h10.getDimensionPixelSize(d5.k.f24136c0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        h10.recycle();
    }

    public static a u0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.t1(attributeSet, i10, i11);
        return aVar;
    }

    private void v0(Canvas canvas, Rect rect) {
        if (L2()) {
            k0(rect, this.f14114k0);
            RectF rectF = this.f14114k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.U.setBounds(0, 0, (int) this.f14114k0.width(), (int) this.f14114k0.height());
            this.U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean v1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f14120z;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f14118x0) : 0);
        boolean z11 = true;
        if (this.f14118x0 != l10) {
            this.f14118x0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.A;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f14119y0) : 0);
        if (this.f14119y0 != l11) {
            this.f14119y0 = l11;
            onStateChange = true;
        }
        int g10 = j5.a.g(l10, l11);
        if ((this.f14121z0 != g10) | (x() == null)) {
            this.f14121z0 = g10;
            X(ColorStateList.valueOf(g10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0;
        if (this.A0 != colorForState) {
            this.A0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.M0 == null || !b.b(iArr)) ? 0 : this.M0.getColorForState(iArr, this.B0);
        if (this.B0 != colorForState2) {
            this.B0 = colorForState2;
            if (this.L0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f14117n0.d() == null || this.f14117n0.d().i() == null) ? 0 : this.f14117n0.d().i().getColorForState(iArr, this.C0);
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = m1(getState(), 16842912) && this.S;
        if (this.D0 == z12 || this.U == null) {
            z10 = false;
        } else {
            float l02 = l0();
            this.D0 = z12;
            if (l02 != l0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.I0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.E0) : 0;
        if (this.E0 != colorForState4) {
            this.E0 = colorForState4;
            this.H0 = l5.a.a(this, this.I0, this.J0);
        } else {
            z11 = onStateChange;
        }
        if (r1(this.I)) {
            z11 |= this.I.setState(iArr);
        }
        if (r1(this.U)) {
            z11 |= this.U.setState(iArr);
        }
        if (r1(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.N.setState(iArr3);
        }
        if (b.f30781a && r1(this.O)) {
            z11 |= this.O.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            u1();
        }
        return z11;
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.R0) {
            return;
        }
        this.f14111h0.setColor(this.f14119y0);
        this.f14111h0.setStyle(Paint.Style.FILL);
        this.f14111h0.setColorFilter(k1());
        this.f14114k0.set(rect);
        canvas.drawRoundRect(this.f14114k0, H0(), H0(), this.f14111h0);
    }

    private void x0(Canvas canvas, Rect rect) {
        if (M2()) {
            k0(rect, this.f14114k0);
            RectF rectF = this.f14114k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.I.setBounds(0, 0, (int) this.f14114k0.width(), (int) this.f14114k0.height());
            this.I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.E <= 0.0f || this.R0) {
            return;
        }
        this.f14111h0.setColor(this.A0);
        this.f14111h0.setStyle(Paint.Style.STROKE);
        if (!this.R0) {
            this.f14111h0.setColorFilter(k1());
        }
        RectF rectF = this.f14114k0;
        float f10 = this.E;
        rectF.set(rect.left + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.f14114k0, f11, f11, this.f14111h0);
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.R0) {
            return;
        }
        this.f14111h0.setColor(this.f14118x0);
        this.f14111h0.setStyle(Paint.Style.FILL);
        this.f14114k0.set(rect);
        canvas.drawRoundRect(this.f14114k0, H0(), H0(), this.f14111h0);
    }

    public void A1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (t0()) {
                androidx.core.graphics.drawable.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A2(h hVar) {
        this.W = hVar;
    }

    public void B1(int i10) {
        A1(f.a.a(this.f14110g0, i10));
    }

    public void B2(int i10) {
        A2(h.c(this.f14110g0, i10));
    }

    public void C1(int i10) {
        D1(this.f14110g0.getResources().getBoolean(i10));
    }

    public void C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.f14117n0.i(true);
        invalidateSelf();
        u1();
    }

    public void D1(boolean z10) {
        if (this.T != z10) {
            boolean L2 = L2();
            this.T = z10;
            boolean L22 = L2();
            if (L2 != L22) {
                if (L22) {
                    j0(this.U);
                } else {
                    O2(this.U);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public void D2(d dVar) {
        this.f14117n0.h(dVar, this.f14110g0);
    }

    public Drawable E0() {
        return this.U;
    }

    public void E1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void E2(int i10) {
        D2(new d(this.f14110g0, i10));
    }

    public ColorStateList F0() {
        return this.V;
    }

    public void F1(int i10) {
        E1(f.a.a(this.f14110g0, i10));
    }

    public void F2(float f10) {
        if (this.f14106c0 != f10) {
            this.f14106c0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public ColorStateList G0() {
        return this.A;
    }

    @Deprecated
    public void G1(float f10) {
        if (this.C != f10) {
            this.C = f10;
            setShapeAppearanceModel(D().w(f10));
        }
    }

    public void G2(int i10) {
        F2(this.f14110g0.getResources().getDimension(i10));
    }

    public float H0() {
        return this.R0 ? G() : this.C;
    }

    @Deprecated
    public void H1(int i10) {
        G1(this.f14110g0.getResources().getDimension(i10));
    }

    public void H2(float f10) {
        if (this.f14105b0 != f10) {
            this.f14105b0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public float I0() {
        return this.f14109f0;
    }

    public void I1(float f10) {
        if (this.f14109f0 != f10) {
            this.f14109f0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public void I2(int i10) {
        H2(this.f14110g0.getResources().getDimension(i10));
    }

    public Drawable J0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void J1(int i10) {
        I1(this.f14110g0.getResources().getDimension(i10));
    }

    public void J2(boolean z10) {
        if (this.L0 != z10) {
            this.L0 = z10;
            P2();
            onStateChange(getState());
        }
    }

    public float K0() {
        return this.K;
    }

    public void K1(Drawable drawable) {
        Drawable J0 = J0();
        if (J0 != drawable) {
            float l02 = l0();
            this.I = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float l03 = l0();
            O2(J0);
            if (M2()) {
                j0(this.I);
            }
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K2() {
        return this.P0;
    }

    public ColorStateList L0() {
        return this.J;
    }

    public void L1(int i10) {
        K1(f.a.b(this.f14110g0, i10));
    }

    public float M0() {
        return this.B;
    }

    public void M1(float f10) {
        if (this.K != f10) {
            float l02 = l0();
            this.K = f10;
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public float N0() {
        return this.Y;
    }

    public void N1(int i10) {
        M1(this.f14110g0.getResources().getDimension(i10));
    }

    public ColorStateList O0() {
        return this.D;
    }

    public void O1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (M2()) {
                androidx.core.graphics.drawable.a.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float P0() {
        return this.E;
    }

    public void P1(int i10) {
        O1(f.a.a(this.f14110g0, i10));
    }

    public Drawable Q0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void Q1(int i10) {
        R1(this.f14110g0.getResources().getBoolean(i10));
    }

    public CharSequence R0() {
        return this.R;
    }

    public void R1(boolean z10) {
        if (this.H != z10) {
            boolean M2 = M2();
            this.H = z10;
            boolean M22 = M2();
            if (M2 != M22) {
                if (M22) {
                    j0(this.I);
                } else {
                    O2(this.I);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public float S0() {
        return this.f14108e0;
    }

    public void S1(float f10) {
        if (this.B != f10) {
            this.B = f10;
            invalidateSelf();
            u1();
        }
    }

    public float T0() {
        return this.Q;
    }

    public void T1(int i10) {
        S1(this.f14110g0.getResources().getDimension(i10));
    }

    public float U0() {
        return this.f14107d0;
    }

    public void U1(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            invalidateSelf();
            u1();
        }
    }

    public int[] V0() {
        return this.K0;
    }

    public void V1(int i10) {
        U1(this.f14110g0.getResources().getDimension(i10));
    }

    public ColorStateList W0() {
        return this.P;
    }

    public void W1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.R0) {
                e0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X0(RectF rectF) {
        o0(getBounds(), rectF);
    }

    public void X1(int i10) {
        W1(f.a.a(this.f14110g0, i10));
    }

    public void Y1(float f10) {
        if (this.E != f10) {
            this.E = f10;
            this.f14111h0.setStrokeWidth(f10);
            if (this.R0) {
                super.f0(f10);
            }
            invalidateSelf();
        }
    }

    public void Z1(int i10) {
        Y1(this.f14110g0.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        u1();
        invalidateSelf();
    }

    public TextUtils.TruncateAt a1() {
        return this.O0;
    }

    public h b1() {
        return this.X;
    }

    public void b2(Drawable drawable) {
        Drawable Q0 = Q0();
        if (Q0 != drawable) {
            float p02 = p0();
            this.N = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f30781a) {
                Q2();
            }
            float p03 = p0();
            O2(Q0);
            if (N2()) {
                j0(this.N);
            }
            invalidateSelf();
            if (p02 != p03) {
                u1();
            }
        }
    }

    public float c1() {
        return this.f14104a0;
    }

    public void c2(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float d1() {
        return this.Z;
    }

    public void d2(float f10) {
        if (this.f14108e0 != f10) {
            this.f14108e0 = f10;
            invalidateSelf();
            if (N2()) {
                u1();
            }
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.F0;
        int a10 = i10 < 255 ? f5.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        z0(canvas, bounds);
        w0(canvas, bounds);
        if (this.R0) {
            super.draw(canvas);
        }
        y0(canvas, bounds);
        B0(canvas, bounds);
        x0(canvas, bounds);
        v0(canvas, bounds);
        if (this.P0) {
            D0(canvas, bounds);
        }
        A0(canvas, bounds);
        C0(canvas, bounds);
        if (this.F0 < 255) {
            canvas.restoreToCount(a10);
        }
    }

    public ColorStateList e1() {
        return this.F;
    }

    public void e2(int i10) {
        d2(this.f14110g0.getResources().getDimension(i10));
    }

    public h f1() {
        return this.W;
    }

    public void f2(int i10) {
        b2(f.a.b(this.f14110g0, i10));
    }

    public CharSequence g1() {
        return this.G;
    }

    public void g2(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidateSelf();
            if (N2()) {
                u1();
            }
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + l0() + this.f14105b0 + this.f14117n0.f(g1().toString()) + this.f14106c0 + p0() + this.f14109f0), this.Q0);
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.R0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public d h1() {
        return this.f14117n0.d();
    }

    public void h2(int i10) {
        g2(this.f14110g0.getResources().getDimension(i10));
    }

    public float i1() {
        return this.f14106c0;
    }

    public void i2(float f10) {
        if (this.f14107d0 != f10) {
            this.f14107d0 = f10;
            invalidateSelf();
            if (N2()) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return q1(this.f14120z) || q1(this.A) || q1(this.D) || (this.L0 && q1(this.M0)) || s1(this.f14117n0.d()) || t0() || r1(this.I) || r1(this.U) || q1(this.I0);
    }

    public float j1() {
        return this.f14105b0;
    }

    public void j2(int i10) {
        i2(this.f14110g0.getResources().getDimension(i10));
    }

    public boolean k2(int[] iArr) {
        if (Arrays.equals(this.K0, iArr)) {
            return false;
        }
        this.K0 = iArr;
        if (N2()) {
            return v1(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l0() {
        if (M2() || L2()) {
            return this.Z + Z0() + this.f14104a0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.L0;
    }

    public void l2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (N2()) {
                androidx.core.graphics.drawable.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void m2(int i10) {
        l2(f.a.a(this.f14110g0, i10));
    }

    public boolean n1() {
        return this.S;
    }

    public void n2(boolean z10) {
        if (this.M != z10) {
            boolean N2 = N2();
            this.M = z10;
            boolean N22 = N2();
            if (N2 != N22) {
                if (N22) {
                    j0(this.N);
                } else {
                    O2(this.N);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public boolean o1() {
        return r1(this.N);
    }

    public void o2(InterfaceC0186a interfaceC0186a) {
        this.N0 = new WeakReference<>(interfaceC0186a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (M2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.I, i10);
        }
        if (L2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.U, i10);
        }
        if (N2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.N, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (M2()) {
            onLevelChange |= this.I.setLevel(i10);
        }
        if (L2()) {
            onLevelChange |= this.U.setLevel(i10);
        }
        if (N2()) {
            onLevelChange |= this.N.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // u5.g, android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        if (this.R0) {
            super.onStateChange(iArr);
        }
        return v1(iArr, V0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p0() {
        if (N2()) {
            return this.f14107d0 + this.Q + this.f14108e0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.M;
    }

    public void p2(TextUtils.TruncateAt truncateAt) {
        this.O0 = truncateAt;
    }

    public void q2(h hVar) {
        this.X = hVar;
    }

    public void r2(int i10) {
        q2(h.c(this.f14110g0, i10));
    }

    Paint.Align s0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float l02 = this.Y + l0() + this.f14105b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + l02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - l02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - r0();
        }
        return align;
    }

    public void s2(float f10) {
        if (this.f14104a0 != f10) {
            float l02 = l0();
            this.f14104a0 = f10;
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.F0 != i10) {
            this.F0 = i10;
            invalidateSelf();
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.G0 != colorFilter) {
            this.G0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // u5.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.J0 != mode) {
            this.J0 = mode;
            this.H0 = l5.a.a(this, this.I0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (M2()) {
            visible |= this.I.setVisible(z10, z11);
        }
        if (L2()) {
            visible |= this.U.setVisible(z10, z11);
        }
        if (N2()) {
            visible |= this.N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i10) {
        s2(this.f14110g0.getResources().getDimension(i10));
    }

    protected void u1() {
        InterfaceC0186a interfaceC0186a = this.N0.get();
        if (interfaceC0186a != null) {
            interfaceC0186a.a();
        }
    }

    public void u2(float f10) {
        if (this.Z != f10) {
            float l02 = l0();
            this.Z = f10;
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(int i10) {
        u2(this.f14110g0.getResources().getDimension(i10));
    }

    public void w1(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            float l02 = l0();
            if (!z10 && this.D0) {
                this.D0 = false;
            }
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void w2(int i10) {
        this.Q0 = i10;
    }

    public void x1(int i10) {
        w1(this.f14110g0.getResources().getBoolean(i10));
    }

    public void x2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            P2();
            onStateChange(getState());
        }
    }

    public void y1(Drawable drawable) {
        if (this.U != drawable) {
            float l02 = l0();
            this.U = drawable;
            float l03 = l0();
            O2(this.U);
            j0(this.U);
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void y2(int i10) {
        x2(f.a.a(this.f14110g0, i10));
    }

    public void z1(int i10) {
        y1(f.a.b(this.f14110g0, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z2(boolean z10) {
        this.P0 = z10;
    }
}
