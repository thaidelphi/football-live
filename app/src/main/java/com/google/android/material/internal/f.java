package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.l0;
/* compiled from: ForegroundLinearLayout.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f extends l0 {

    /* renamed from: p  reason: collision with root package name */
    private Drawable f14419p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f14420q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f14421r;

    /* renamed from: s  reason: collision with root package name */
    private int f14422s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f14423t;

    /* renamed from: u  reason: collision with root package name */
    boolean f14424u;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f14419p;
        if (drawable != null) {
            if (this.f14424u) {
                this.f14424u = false;
                Rect rect = this.f14420q;
                Rect rect2 = this.f14421r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f14423t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f14422s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f14419p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14419p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f14419p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f14419p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f14422s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14419p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f14424u = z10 | this.f14424u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14424u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f14419p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f14419p);
            }
            this.f14419p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f14422s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f14422s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f14422s = i10;
            if (i10 == 119 && this.f14419p != null) {
                this.f14419p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14419p;
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14420q = new Rect();
        this.f14421r = new Rect();
        this.f14422s = 119;
        this.f14423t = true;
        this.f14424u = false;
        TypedArray h10 = m.h(context, attributeSet, d5.k.C1, i10, 0, new int[0]);
        this.f14422s = h10.getInt(d5.k.E1, this.f14422s);
        Drawable drawable = h10.getDrawable(d5.k.D1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f14423t = h10.getBoolean(d5.k.F1, true);
        h10.recycle();
    }
}
