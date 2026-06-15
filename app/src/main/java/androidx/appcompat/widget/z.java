package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class z extends u {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1800d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1801e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1802f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1803g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1804h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1805i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(SeekBar seekBar) {
        super(seekBar);
        this.f1802f = null;
        this.f1803g = null;
        this.f1804h = false;
        this.f1805i = false;
        this.f1800d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1801e;
        if (drawable != null) {
            if (this.f1804h || this.f1805i) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1801e = r10;
                if (this.f1804h) {
                    androidx.core.graphics.drawable.a.o(r10, this.f1802f);
                }
                if (this.f1805i) {
                    androidx.core.graphics.drawable.a.p(this.f1801e, this.f1803g);
                }
                if (this.f1801e.isStateful()) {
                    this.f1801e.setState(this.f1800d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.u
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1800d.getContext();
        int[] iArr = e.j.T;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1800d;
        androidx.core.view.a0.o0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(e.j.U);
        if (h10 != null) {
            this.f1800d.setThumb(h10);
        }
        j(v10.g(e.j.V));
        int i11 = e.j.X;
        if (v10.s(i11)) {
            this.f1803g = h0.d(v10.k(i11, -1), this.f1803g);
            this.f1805i = true;
        }
        int i12 = e.j.W;
        if (v10.s(i12)) {
            this.f1802f = v10.c(i12);
            this.f1804h = true;
        }
        v10.w();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1801e != null) {
            int max = this.f1800d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1801e.getIntrinsicWidth();
                int intrinsicHeight = this.f1801e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1801e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1800d.getWidth() - this.f1800d.getPaddingLeft()) - this.f1800d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1800d.getPaddingLeft(), this.f1800d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1801e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1801e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1800d.getDrawableState())) {
            this.f1800d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1801e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1801e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1801e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1800d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.a0.E(this.f1800d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1800d.getDrawableState());
            }
            f();
        }
        this.f1800d.invalidate();
    }
}
