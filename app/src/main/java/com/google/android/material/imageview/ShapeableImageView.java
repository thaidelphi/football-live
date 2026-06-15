package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.r;
import d5.j;
import u5.g;
import u5.k;
import u5.l;
import u5.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ShapeableImageView extends r implements n {

    /* renamed from: v  reason: collision with root package name */
    private static final int f14325v = j.f24116r;

    /* renamed from: d  reason: collision with root package name */
    private final l f14326d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f14327e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f14328f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f14329g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f14330h;

    /* renamed from: i  reason: collision with root package name */
    private final Path f14331i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f14332j;

    /* renamed from: k  reason: collision with root package name */
    private g f14333k;

    /* renamed from: l  reason: collision with root package name */
    private k f14334l;

    /* renamed from: m  reason: collision with root package name */
    private float f14335m;

    /* renamed from: n  reason: collision with root package name */
    private Path f14336n;

    /* renamed from: o  reason: collision with root package name */
    private int f14337o;

    /* renamed from: p  reason: collision with root package name */
    private int f14338p;

    /* renamed from: q  reason: collision with root package name */
    private int f14339q;

    /* renamed from: r  reason: collision with root package name */
    private int f14340r;

    /* renamed from: s  reason: collision with root package name */
    private int f14341s;

    /* renamed from: t  reason: collision with root package name */
    private int f14342t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f14343u;

    @TargetApi(21)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f14344a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f14334l == null) {
                return;
            }
            if (ShapeableImageView.this.f14333k == null) {
                ShapeableImageView.this.f14333k = new g(ShapeableImageView.this.f14334l);
            }
            ShapeableImageView.this.f14327e.round(this.f14344a);
            ShapeableImageView.this.f14333k.setBounds(this.f14344a);
            ShapeableImageView.this.f14333k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void g(Canvas canvas) {
        if (this.f14332j == null) {
            return;
        }
        this.f14329g.setStrokeWidth(this.f14335m);
        int colorForState = this.f14332j.getColorForState(getDrawableState(), this.f14332j.getDefaultColor());
        if (this.f14335m <= 0.0f || colorForState == 0) {
            return;
        }
        this.f14329g.setColor(colorForState);
        canvas.drawPath(this.f14331i, this.f14329g);
    }

    private boolean h() {
        return (this.f14341s == Integer.MIN_VALUE && this.f14342t == Integer.MIN_VALUE) ? false : true;
    }

    private boolean i() {
        return Build.VERSION.SDK_INT >= 17 && getLayoutDirection() == 1;
    }

    private void j(int i10, int i11) {
        this.f14327e.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f14326d.d(this.f14334l, 1.0f, this.f14327e, this.f14331i);
        this.f14336n.rewind();
        this.f14336n.addPath(this.f14331i);
        this.f14328f.set(0.0f, 0.0f, i10, i11);
        this.f14336n.addRect(this.f14328f, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f14340r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f14342t;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f14337o : this.f14339q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f14342t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f14341s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f14337o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f14341s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f14342t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f14339q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f14341s;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f14339q : this.f14337o;
    }

    public int getContentPaddingTop() {
        return this.f14338p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public k getShapeAppearanceModel() {
        return this.f14334l;
    }

    public ColorStateList getStrokeColor() {
        return this.f14332j;
    }

    public float getStrokeWidth() {
        return this.f14335m;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f14336n, this.f14330h);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f14343u) {
            return;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 <= 19 || isLayoutDirectionResolved()) {
            this.f14343u = true;
            if (i12 >= 21 && (isPaddingRelative() || h())) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // u5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f14334l = kVar;
        g gVar = this.f14333k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f14332j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(f.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f14335m != f10) {
            this.f14335m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.f14325v
            android.content.Context r7 = v5.a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            u5.l r7 = u5.l.k()
            r6.f14326d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f14331i = r7
            r7 = 0
            r6.f14343u = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f14330h = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f14327e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f14328f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f14336n = r2
            int[] r2 = d5.k.f24180h4
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = d5.k.f24244p4
            android.content.res.ColorStateList r4 = r5.c.a(r1, r2, r4)
            r6.f14332j = r4
            int r4 = d5.k.f24252q4
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f14335m = r4
            int r4 = d5.k.f24188i4
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f14337o = r7
            r6.f14338p = r7
            r6.f14339q = r7
            r6.f14340r = r7
            int r4 = d5.k.f24212l4
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f14337o = r4
            int r4 = d5.k.f24236o4
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f14338p = r4
            int r4 = d5.k.f24220m4
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f14339q = r4
            int r4 = d5.k.f24196j4
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f14340r = r7
            int r7 = d5.k.f24228n4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f14341s = r7
            int r7 = d5.k.f24204k4
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f14342t = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f14329g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            u5.k$b r7 = u5.k.e(r1, r8, r9, r0)
            u5.k r7 = r7.m()
            r6.f14334l = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto Lcc
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
