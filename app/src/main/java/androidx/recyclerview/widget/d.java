package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends RecyclerView.o implements RecyclerView.t {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.OnScrollListener C;

    /* renamed from: a  reason: collision with root package name */
    private final int f4049a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4050b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f4051c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f4052d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4053e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4054f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f4055g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f4056h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4057i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4058j;

    /* renamed from: k  reason: collision with root package name */
    int f4059k;

    /* renamed from: l  reason: collision with root package name */
    int f4060l;

    /* renamed from: m  reason: collision with root package name */
    float f4061m;

    /* renamed from: n  reason: collision with root package name */
    int f4062n;

    /* renamed from: o  reason: collision with root package name */
    int f4063o;

    /* renamed from: p  reason: collision with root package name */
    float f4064p;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f4067s;

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f4074z;

    /* renamed from: q  reason: collision with root package name */
    private int f4065q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f4066r = 0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4068t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4069u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f4070v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f4071w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f4072x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f4073y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f4077a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4077a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4077a) {
                this.f4077a = false;
            } else if (((Float) d.this.f4074z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class C0072d implements ValueAnimator.AnimatorUpdateListener {
        C0072d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4051c.setAlpha(floatValue);
            d.this.f4052d.setAlpha(floatValue);
            d.this.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4074z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f4051c = stateListDrawable;
        this.f4052d = drawable;
        this.f4055g = stateListDrawable2;
        this.f4056h = drawable2;
        this.f4053e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4054f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4057i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4058j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4049a = i11;
        this.f4050b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0072d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] p10 = p();
        float max = Math.max(p10[0], Math.min(p10[1], f10));
        if (Math.abs(this.f4060l - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f4061m, max, p10, this.f4067s.computeVerticalScrollRange(), this.f4067s.computeVerticalScrollOffset(), this.f4066r);
        if (x10 != 0) {
            this.f4067s.scrollBy(0, x10);
        }
        this.f4061m = max;
    }

    private void k() {
        this.f4067s.removeCallbacks(this.B);
    }

    private void l() {
        this.f4067s.removeItemDecoration(this);
        this.f4067s.removeOnItemTouchListener(this);
        this.f4067s.removeOnScrollListener(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f4066r;
        int i11 = this.f4057i;
        int i12 = i10 - i11;
        int i13 = this.f4063o;
        int i14 = this.f4062n;
        int i15 = i13 - (i14 / 2);
        this.f4055g.setBounds(0, 0, i14, i11);
        this.f4056h.setBounds(0, 0, this.f4065q, this.f4058j);
        canvas.translate(0.0f, i12);
        this.f4056h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f4055g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void n(Canvas canvas) {
        int i10 = this.f4065q;
        int i11 = this.f4053e;
        int i12 = i10 - i11;
        int i13 = this.f4060l;
        int i14 = this.f4059k;
        int i15 = i13 - (i14 / 2);
        this.f4051c.setBounds(0, 0, i11, i14);
        this.f4052d.setBounds(0, 0, this.f4054f, this.f4066r);
        if (s()) {
            this.f4052d.draw(canvas);
            canvas.translate(this.f4053e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4051c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f4053e, -i15);
            return;
        }
        canvas.translate(i12, 0.0f);
        this.f4052d.draw(canvas);
        canvas.translate(0.0f, i15);
        this.f4051c.draw(canvas);
        canvas.translate(-i12, -i15);
    }

    private int[] o() {
        int[] iArr = this.f4073y;
        int i10 = this.f4050b;
        iArr[0] = i10;
        iArr[1] = this.f4065q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f4072x;
        int i10 = this.f4050b;
        iArr[0] = i10;
        iArr[1] = this.f4066r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] o10 = o();
        float max = Math.max(o10[0], Math.min(o10[1], f10));
        if (Math.abs(this.f4063o - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f4064p, max, o10, this.f4067s.computeHorizontalScrollRange(), this.f4067s.computeHorizontalScrollOffset(), this.f4065q);
        if (x10 != 0) {
            this.f4067s.scrollBy(x10, 0);
        }
        this.f4064p = max;
    }

    private boolean s() {
        return a0.E(this.f4067s) == 1;
    }

    private void w(int i10) {
        k();
        this.f4067s.postDelayed(this.B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f4067s.addItemDecoration(this);
        this.f4067s.addOnItemTouchListener(this);
        this.f4067s.addOnScrollListener(this.C);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            this.f4074z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f4074z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4074z.setDuration(500L);
        this.f4074z.setStartDelay(0L);
        this.f4074z.start();
    }

    void B(int i10, int i11) {
        int computeVerticalScrollRange = this.f4067s.computeVerticalScrollRange();
        int i12 = this.f4066r;
        this.f4068t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f4049a;
        int computeHorizontalScrollRange = this.f4067s.computeHorizontalScrollRange();
        int i13 = this.f4065q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f4049a;
        this.f4069u = z10;
        boolean z11 = this.f4068t;
        if (!z11 && !z10) {
            if (this.f4070v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f4060l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f4059k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f4069u) {
            float f11 = i13;
            this.f4063o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f4062n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f4070v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4070v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (u10 || t10) {
                if (t10) {
                    this.f4071w = 1;
                    this.f4064p = (int) motionEvent.getX();
                } else if (u10) {
                    this.f4071w = 2;
                    this.f4061m = (int) motionEvent.getY();
                }
                y(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f4070v == 2) {
            this.f4061m = 0.0f;
            this.f4064p = 0.0f;
            y(1);
            this.f4071w = 0;
        } else if (motionEvent.getAction() == 2 && this.f4070v == 2) {
            A();
            if (this.f4071w == 1) {
                r(motionEvent.getX());
            }
            if (this.f4071w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4070v;
        if (i10 == 1) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u10 && !t10) {
                return false;
            }
            if (t10) {
                this.f4071w = 1;
                this.f4064p = (int) motionEvent.getX();
            } else if (u10) {
                this.f4071w = 2;
                this.f4061m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f4065q == this.f4067s.getWidth() && this.f4066r == this.f4067s.getHeight()) {
            if (this.A != 0) {
                if (this.f4068t) {
                    n(canvas);
                }
                if (this.f4069u) {
                    m(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f4065q = this.f4067s.getWidth();
        this.f4066r = this.f4067s.getHeight();
        y(0);
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4067s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f4067s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f4074z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f4074z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4074z.setDuration(i10);
        this.f4074z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 >= this.f4066r - this.f4057i) {
            int i10 = this.f4063o;
            int i11 = this.f4062n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f10, float f11) {
        if (!s() ? f10 >= this.f4065q - this.f4053e : f10 <= this.f4053e) {
            int i10 = this.f4060l;
            int i11 = this.f4059k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f4067s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f4070v != 2) {
            this.f4051c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f4070v == 2 && i10 != 2) {
            this.f4051c.setState(E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f4070v = i10;
    }
}
