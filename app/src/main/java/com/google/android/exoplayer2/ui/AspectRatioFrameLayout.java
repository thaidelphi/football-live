package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import y4.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f10867a;

    /* renamed from: b  reason: collision with root package name */
    private b f10868b;

    /* renamed from: c  reason: collision with root package name */
    private float f10869c;

    /* renamed from: d  reason: collision with root package name */
    private int f10870d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f10871a;

        /* renamed from: b  reason: collision with root package name */
        private float f10872b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10873c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10874d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f10871a = f10;
            this.f10872b = f11;
            this.f10873c = z10;
            if (this.f10874d) {
                return;
            }
            this.f10874d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10874d = false;
            if (AspectRatioFrameLayout.this.f10868b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f10868b.a(this.f10871a, this.f10872b, this.f10873c);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10870d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f33128a, 0, 0);
            try {
                this.f10870d = obtainStyledAttributes.getInt(n.f33129b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f10867a = new c();
    }

    public int getResizeMode() {
        return this.f10870d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f10869c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f10869c / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f10867a.a(this.f10869c, f14, false);
            return;
        }
        int i12 = this.f10870d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f10869c;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f10869c;
                    } else {
                        f11 = this.f10869c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f10869c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f10869c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f10869c;
            measuredWidth = (int) (f13 * f10);
        }
        this.f10867a.a(this.f10869c, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f10869c != f10) {
            this.f10869c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f10868b = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f10870d != i10) {
            this.f10870d = i10;
            requestLayout();
        }
    }
}
