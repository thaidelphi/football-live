package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.a0;
import d5.j;
import d5.k;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    private ValueAnimator f14692a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14693b;

    /* renamed from: c  reason: collision with root package name */
    private float f14694c;

    /* renamed from: d  reason: collision with root package name */
    private float f14695d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14696e;

    /* renamed from: f  reason: collision with root package name */
    private int f14697f;

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f14698g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14699h;

    /* renamed from: i  reason: collision with root package name */
    private final float f14700i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f14701j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f14702k;

    /* renamed from: l  reason: collision with root package name */
    private final int f14703l;

    /* renamed from: m  reason: collision with root package name */
    private float f14704m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14705n;

    /* renamed from: o  reason: collision with root package name */
    private c f14706o;

    /* renamed from: p  reason: collision with root package name */
    private double f14707p;

    /* renamed from: q  reason: collision with root package name */
    private int f14708q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface c {
        void a(float f10, boolean z10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface d {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.f23990t);
    }

    private void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f10 = height;
        this.f14701j.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f14708q * ((float) Math.cos(this.f14707p))) + width2, (this.f14708q * ((float) Math.sin(this.f14707p))) + f10, this.f14699h, this.f14701j);
        double sin = Math.sin(this.f14707p);
        double cos = Math.cos(this.f14707p);
        this.f14701j.setStrokeWidth(this.f14703l);
        canvas.drawLine(width2, f10, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f14701j);
        canvas.drawCircle(width2, f10, this.f14700i, this.f14701j);
    }

    private int e(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f11), Float.valueOf(f10));
    }

    private boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float e8 = e(f10, f11);
        boolean z13 = false;
        boolean z14 = f() != e8;
        if (z11 && z14) {
            return true;
        }
        if (z14 || z10) {
            if (z12 && this.f14693b) {
                z13 = true;
            }
            l(e8, z13);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f14704m = f11;
        this.f14707p = Math.toRadians(f11 - 90.0f);
        float width = (getWidth() / 2) + (this.f14708q * ((float) Math.cos(this.f14707p)));
        float height = (getHeight() / 2) + (this.f14708q * ((float) Math.sin(this.f14707p)));
        RectF rectF = this.f14702k;
        int i10 = this.f14699h;
        rectF.set(width - i10, height - i10, width + i10, height + i10);
        for (d dVar : this.f14698g) {
            dVar.a(f11, z10);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f14698g.add(dVar);
    }

    public RectF d() {
        return this.f14702k;
    }

    public float f() {
        return this.f14704m;
    }

    public int g() {
        return this.f14699h;
    }

    public void j(int i10) {
        this.f14708q = i10;
        invalidate();
    }

    public void k(float f10) {
        l(f10, false);
    }

    public void l(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f14692a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m(f10, false);
            return;
        }
        Pair<Float, Float> h10 = h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h10.first).floatValue(), ((Float) h10.second).floatValue());
        this.f14692a = ofFloat;
        ofFloat.setDuration(200L);
        this.f14692a.addUpdateListener(new a());
        this.f14692a.addListener(new b());
        this.f14692a.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f14694c = x10;
            this.f14695d = y10;
            this.f14696e = true;
            this.f14705n = false;
            z10 = false;
            z11 = false;
            z12 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f14694c);
            int i11 = (int) (y10 - this.f14695d);
            this.f14696e = (i10 * i10) + (i11 * i11) > this.f14697f;
            boolean z13 = this.f14705n;
            z10 = actionMasked == 1;
            z12 = false;
            z11 = z13;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
        }
        boolean i12 = i(x10, y10, z11, z12, z10) | this.f14705n;
        this.f14705n = i12;
        if (i12 && z10 && (cVar = this.f14706o) != null) {
            cVar.a(e(x10, y10), this.f14696e);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14698g = new ArrayList();
        Paint paint = new Paint();
        this.f14701j = paint;
        this.f14702k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Z0, i10, j.f24117s);
        this.f14708q = obtainStyledAttributes.getDimensionPixelSize(k.f24129b1, 0);
        this.f14699h = obtainStyledAttributes.getDimensionPixelSize(k.f24137c1, 0);
        Resources resources = getResources();
        this.f14703l = resources.getDimensionPixelSize(d5.d.f24013k);
        this.f14700i = resources.getDimensionPixelSize(d5.d.f24011i);
        int color = obtainStyledAttributes.getColor(k.f24121a1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f14697f = ViewConfiguration.get(context).getScaledTouchSlop();
        a0.A0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
