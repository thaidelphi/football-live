package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.a0;
import com.google.android.material.internal.o;
import d5.b;
import r5.c;
import u5.g;
import u5.k;
import u5.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    private static final boolean f14038t;

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f14039u;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f14040a;

    /* renamed from: b  reason: collision with root package name */
    private k f14041b;

    /* renamed from: c  reason: collision with root package name */
    private int f14042c;

    /* renamed from: d  reason: collision with root package name */
    private int f14043d;

    /* renamed from: e  reason: collision with root package name */
    private int f14044e;

    /* renamed from: f  reason: collision with root package name */
    private int f14045f;

    /* renamed from: g  reason: collision with root package name */
    private int f14046g;

    /* renamed from: h  reason: collision with root package name */
    private int f14047h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f14048i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f14049j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f14050k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f14051l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f14052m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14053n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14054o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f14055p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f14056q;

    /* renamed from: r  reason: collision with root package name */
    private LayerDrawable f14057r;

    /* renamed from: s  reason: collision with root package name */
    private int f14058s;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f14038t = i10 >= 21;
        if (i10 < 21 || i10 > 22) {
            z10 = false;
        }
        f14039u = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f14040a = materialButton;
        this.f14041b = kVar;
    }

    private void E(int i10, int i11) {
        int J = a0.J(this.f14040a);
        int paddingTop = this.f14040a.getPaddingTop();
        int I = a0.I(this.f14040a);
        int paddingBottom = this.f14040a.getPaddingBottom();
        int i12 = this.f14044e;
        int i13 = this.f14045f;
        this.f14045f = i11;
        this.f14044e = i10;
        if (!this.f14054o) {
            F();
        }
        a0.D0(this.f14040a, J, (paddingTop + i10) - i12, I, (paddingBottom + i11) - i13);
    }

    private void F() {
        this.f14040a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.W(this.f14058s);
        }
    }

    private void G(k kVar) {
        if (f14039u && !this.f14054o) {
            int J = a0.J(this.f14040a);
            int paddingTop = this.f14040a.getPaddingTop();
            int I = a0.I(this.f14040a);
            int paddingBottom = this.f14040a.getPaddingBottom();
            F();
            a0.D0(this.f14040a, J, paddingTop, I, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void I() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.d0(this.f14047h, this.f14050k);
            if (n10 != null) {
                n10.c0(this.f14047h, this.f14053n ? j5.a.d(this.f14040a, b.f23981k) : 0);
            }
        }
    }

    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f14042c, this.f14044e, this.f14043d, this.f14045f);
    }

    private Drawable a() {
        g gVar = new g(this.f14041b);
        gVar.N(this.f14040a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f14049j);
        PorterDuff.Mode mode = this.f14048i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.d0(this.f14047h, this.f14050k);
        g gVar2 = new g(this.f14041b);
        gVar2.setTint(0);
        gVar2.c0(this.f14047h, this.f14053n ? j5.a.d(this.f14040a, b.f23981k) : 0);
        if (f14038t) {
            g gVar3 = new g(this.f14041b);
            this.f14052m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(s5.b.a(this.f14051l), J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f14052m);
            this.f14057r = rippleDrawable;
            return rippleDrawable;
        }
        s5.a aVar = new s5.a(this.f14041b);
        this.f14052m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, s5.b.a(this.f14051l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f14052m});
        this.f14057r = layerDrawable;
        return J(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f14057r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f14038t) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f14057r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return (g) this.f14057r.getDrawable(!z10 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(ColorStateList colorStateList) {
        if (this.f14050k != colorStateList) {
            this.f14050k = colorStateList;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i10) {
        if (this.f14047h != i10) {
            this.f14047h = i10;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(ColorStateList colorStateList) {
        if (this.f14049j != colorStateList) {
            this.f14049j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f14049j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(PorterDuff.Mode mode) {
        if (this.f14048i != mode) {
            this.f14048i = mode;
            if (f() == null || this.f14048i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.f14048i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i10, int i11) {
        Drawable drawable = this.f14052m;
        if (drawable != null) {
            drawable.setBounds(this.f14042c, this.f14044e, i11 - this.f14043d, i10 - this.f14045f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f14046g;
    }

    public int c() {
        return this.f14045f;
    }

    public int d() {
        return this.f14044e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f14057r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f14057r.getNumberOfLayers() > 2) {
            return (n) this.f14057r.getDrawable(2);
        }
        return (n) this.f14057r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f14051l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return this.f14041b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f14050k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f14047h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f14049j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f14048i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f14054o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f14056q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(TypedArray typedArray) {
        this.f14042c = typedArray.getDimensionPixelOffset(d5.k.f24154e2, 0);
        this.f14043d = typedArray.getDimensionPixelOffset(d5.k.f24162f2, 0);
        this.f14044e = typedArray.getDimensionPixelOffset(d5.k.f24170g2, 0);
        this.f14045f = typedArray.getDimensionPixelOffset(d5.k.f24178h2, 0);
        int i10 = d5.k.f24210l2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f14046g = dimensionPixelSize;
            y(this.f14041b.w(dimensionPixelSize));
            this.f14055p = true;
        }
        this.f14047h = typedArray.getDimensionPixelSize(d5.k.f24290v2, 0);
        this.f14048i = o.f(typedArray.getInt(d5.k.f24202k2, -1), PorterDuff.Mode.SRC_IN);
        this.f14049j = c.a(this.f14040a.getContext(), typedArray, d5.k.f24194j2);
        this.f14050k = c.a(this.f14040a.getContext(), typedArray, d5.k.f24282u2);
        this.f14051l = c.a(this.f14040a.getContext(), typedArray, d5.k.f24274t2);
        this.f14056q = typedArray.getBoolean(d5.k.f24186i2, false);
        this.f14058s = typedArray.getDimensionPixelSize(d5.k.f24218m2, 0);
        int J = a0.J(this.f14040a);
        int paddingTop = this.f14040a.getPaddingTop();
        int I = a0.I(this.f14040a);
        int paddingBottom = this.f14040a.getPaddingBottom();
        if (typedArray.hasValue(d5.k.f24146d2)) {
            s();
        } else {
            F();
        }
        a0.D0(this.f14040a, J + this.f14042c, paddingTop + this.f14044e, I + this.f14043d, paddingBottom + this.f14045f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        this.f14054o = true;
        this.f14040a.setSupportBackgroundTintList(this.f14049j);
        this.f14040a.setSupportBackgroundTintMode(this.f14048i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(boolean z10) {
        this.f14056q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        if (this.f14055p && this.f14046g == i10) {
            return;
        }
        this.f14046g = i10;
        this.f14055p = true;
        y(this.f14041b.w(i10));
    }

    public void v(int i10) {
        E(this.f14044e, i10);
    }

    public void w(int i10) {
        E(i10, this.f14045f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f14051l != colorStateList) {
            this.f14051l = colorStateList;
            boolean z10 = f14038t;
            if (z10 && (this.f14040a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f14040a.getBackground()).setColor(s5.b.a(colorStateList));
            } else if (z10 || !(this.f14040a.getBackground() instanceof s5.a)) {
            } else {
                ((s5.a) this.f14040a.getBackground()).setTintList(s5.b.a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(k kVar) {
        this.f14041b = kVar;
        G(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z10) {
        this.f14053n = z10;
        I();
    }
}
