package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableApi14.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: g  reason: collision with root package name */
    static final PorterDuff.Mode f2635g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    private int f2636a;

    /* renamed from: b  reason: collision with root package name */
    private PorterDuff.Mode f2637b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2638c;

    /* renamed from: d  reason: collision with root package name */
    f f2639d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2640e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f2641f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(f fVar, Resources resources) {
        this.f2639d = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f2639d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f2639d;
        if (fVar == null || (constantState = fVar.f2644b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (c()) {
            f fVar = this.f2639d;
            ColorStateList colorStateList = fVar.f2645c;
            PorterDuff.Mode mode = fVar.f2646d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2638c || colorForState != this.f2636a || mode != this.f2637b) {
                    setColorFilter(colorForState, mode);
                    this.f2636a = colorForState;
                    this.f2637b = mode;
                    this.f2638c = true;
                    return true;
                }
            } else {
                this.f2638c = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.c
    public final Drawable a() {
        return this.f2641f;
    }

    @Override // androidx.core.graphics.drawable.c
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f2641f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2641f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f2639d;
            if (fVar != null) {
                fVar.f2644b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2641f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f2639d;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2641f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f2639d;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f2639d.f2643a = getChangingConfigurations();
        return this.f2639d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2641f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2641f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2641f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f2641f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2641f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2641f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2641f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2641f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2641f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2641f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f2641f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f2639d) == null) ? null : fVar.f2645c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2641f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2641f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2640e && super.mutate() == this) {
            this.f2639d = d();
            Drawable drawable = this.f2641f;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f2639d;
            if (fVar != null) {
                Drawable drawable2 = this.f2641f;
                fVar.f2644b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2640e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2641f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.f2641f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f2641f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f2641f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        a.j(this.f2641f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f2641f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2641f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f2641f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f2641f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2641f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f2639d.f2645c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2639d.f2646d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f2641f.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Drawable drawable) {
        this.f2639d = d();
        b(drawable);
    }
}
