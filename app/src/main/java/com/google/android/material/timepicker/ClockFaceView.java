package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import com.google.android.material.timepicker.ClockHandView;
import d5.d;
import d5.f;
import d5.h;
import d5.j;
import d5.k;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {
    private final ClockHandView A;
    private final Rect B;
    private final RectF C;
    private final SparseArray<TextView> D;
    private final androidx.core.view.a E;
    private final int[] F;
    private final float[] G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private String[] L;
    private float M;
    private final ColorStateList N;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.A.g()) - ClockFaceView.this.H);
                return true;
            }
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            int intValue = ((Integer) view.getTag(f.f24050o)).intValue();
            if (intValue > 0) {
                cVar.u0((View) ClockFaceView.this.D.get(intValue - 1));
            }
            cVar.a0(c.C0048c.a(0, 1, intValue, 1, false, view.isSelected()));
            cVar.Y(true);
            cVar.b(c.a.f2832i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x10 = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
                ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
                return true;
            }
            return super.j(view, i10, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.f23990t);
    }

    private void D() {
        RectF d10 = this.A.d();
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            TextView textView = this.D.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.B);
                offsetDescendantRectToMyCoords(textView, this.B);
                textView.setSelected(d10.contains(this.B.centerX(), this.B.centerY()));
                textView.getPaint().setShader(E(d10, this.B, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient E(RectF rectF, Rect rect, TextView textView) {
        this.C.set(rect);
        this.C.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.C)) {
            return new RadialGradient(rectF.centerX() - this.C.left, rectF.centerY() - this.C.top, rectF.width() * 0.5f, this.F, this.G, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float F(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void H(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.D.size();
        for (int i11 = 0; i11 < Math.max(this.L.length, size); i11++) {
            TextView textView = this.D.get(i11);
            if (i11 >= this.L.length) {
                removeView(textView);
                this.D.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f24068d, (ViewGroup) this, false);
                    this.D.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.L[i11]);
                textView.setTag(f.f24050o, Integer.valueOf(i11));
                a0.q0(textView, this.E);
                textView.setTextColor(this.N);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.L[i11]));
                }
            }
        }
    }

    public void G(String[] strArr, int i10) {
        this.L = strArr;
        H(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f10, boolean z10) {
        if (Math.abs(this.M - f10) > 0.001f) {
            this.M = f10;
            D();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.x0(accessibilityNodeInfo).Z(c.b.a(1, this.L.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int F = (int) (this.K / F(this.I / displayMetrics.heightPixels, this.J / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(F, 1073741824);
        setMeasuredDimension(F, F);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.b
    public void w(int i10) {
        if (i10 != v()) {
            super.w(i10);
            this.A.j(v());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.B = new Rect();
        this.C = new RectF();
        this.D = new SparseArray<>();
        this.G = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.W0, i10, j.f24117s);
        Resources resources = getResources();
        ColorStateList a10 = r5.c.a(context, obtainStyledAttributes, k.Y0);
        this.N = a10;
        LayoutInflater.from(context).inflate(h.f24069e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f24044i);
        this.A = clockHandView;
        this.H = resources.getDimensionPixelSize(d.f24012j);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.F = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = f.a.a(context, d5.c.f23998b).getDefaultColor();
        ColorStateList a11 = r5.c.a(context, obtainStyledAttributes, k.X0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.E = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        G(strArr, 0);
        this.I = resources.getDimensionPixelSize(d.f24025w);
        this.J = resources.getDimensionPixelSize(d.f24026x);
        this.K = resources.getDimensionPixelSize(d.f24014l);
    }
}
