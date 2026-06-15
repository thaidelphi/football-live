package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.a0;
import com.unity3d.services.UnityAdsConstants;
/* compiled from: AutoScrollHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    private static final int f2986r = ViewConfiguration.getTapTimeout();

    /* renamed from: c  reason: collision with root package name */
    final View f2989c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f2990d;

    /* renamed from: g  reason: collision with root package name */
    private int f2993g;

    /* renamed from: h  reason: collision with root package name */
    private int f2994h;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2998l;

    /* renamed from: m  reason: collision with root package name */
    boolean f2999m;

    /* renamed from: n  reason: collision with root package name */
    boolean f3000n;

    /* renamed from: o  reason: collision with root package name */
    boolean f3001o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3002p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3003q;

    /* renamed from: a  reason: collision with root package name */
    final C0052a f2987a = new C0052a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f2988b = new AccelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    private float[] f2991e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    private float[] f2992f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i  reason: collision with root package name */
    private float[] f2995i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f2996j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f2997k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0052a {

        /* renamed from: a  reason: collision with root package name */
        private int f3004a;

        /* renamed from: b  reason: collision with root package name */
        private int f3005b;

        /* renamed from: c  reason: collision with root package name */
        private float f3006c;

        /* renamed from: d  reason: collision with root package name */
        private float f3007d;

        /* renamed from: j  reason: collision with root package name */
        private float f3013j;

        /* renamed from: k  reason: collision with root package name */
        private int f3014k;

        /* renamed from: e  reason: collision with root package name */
        private long f3008e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f3012i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f3009f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f3010g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f3011h = 0;

        C0052a() {
        }

        private float e(long j10) {
            long j11 = this.f3008e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f3012i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f3013j;
                return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f3014k, 0.0f, 1.0f));
            }
            return a.e(((float) (j10 - j11)) / this.f3004a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f3009f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f3009f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f3009f)) * g10;
                this.f3010g = (int) (this.f3006c * f10);
                this.f3011h = (int) (f10 * this.f3007d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f3010g;
        }

        public int c() {
            return this.f3011h;
        }

        public int d() {
            float f10 = this.f3006c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f3007d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f3012i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3012i + ((long) this.f3014k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3014k = a.f((int) (currentAnimationTimeMillis - this.f3008e), 0, this.f3005b);
            this.f3013j = e(currentAnimationTimeMillis);
            this.f3012i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f3005b = i10;
        }

        public void k(int i10) {
            this.f3004a = i10;
        }

        public void l(float f10, float f11) {
            this.f3006c = f10;
            this.f3007d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3008e = currentAnimationTimeMillis;
            this.f3012i = -1L;
            this.f3009f = currentAnimationTimeMillis;
            this.f3013j = 0.5f;
            this.f3010g = 0;
            this.f3011h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f3001o) {
                if (aVar.f2999m) {
                    aVar.f2999m = false;
                    aVar.f2987a.m();
                }
                C0052a c0052a = a.this.f2987a;
                if (!c0052a.h() && a.this.u()) {
                    a aVar2 = a.this;
                    if (aVar2.f3000n) {
                        aVar2.f3000n = false;
                        aVar2.c();
                    }
                    c0052a.a();
                    a.this.j(c0052a.b(), c0052a.c());
                    a0.i0(a.this.f2989c, this);
                    return;
                }
                a.this.f3001o = false;
            }
        }
    }

    public a(View view) {
        this.f2989c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2986r);
        r(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        q(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f2991e[i10], f11, this.f2992f[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f2995i[i10];
        float f14 = this.f2996j[i10];
        float f15 = this.f2997k[i10];
        float f16 = f13 * f12;
        if (i11 > 0) {
            return e(h10 * f16, f14, f15);
        }
        return -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2993g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f3001o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e8 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e8) - g(f13, e8);
        if (g10 < 0.0f) {
            interpolation = -this.f2988b.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f2988b.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f2999m) {
            this.f3001o = false;
        } else {
            this.f2987a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f2990d == null) {
            this.f2990d = new b();
        }
        this.f3001o = true;
        this.f2999m = true;
        if (!this.f2998l && (i10 = this.f2994h) > 0) {
            a0.j0(this.f2989c, this.f2990d, i10);
        } else {
            this.f2990d.run();
        }
        this.f2998l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2989c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f2994h = i10;
        return this;
    }

    public a l(int i10) {
        this.f2993g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f3002p && !z10) {
            i();
        }
        this.f3002p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f2992f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f2997k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3002p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f3000n = r2
            r5.f2998l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2989c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2989c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2987a
            r7.l(r0, r6)
            boolean r6 = r5.f3001o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f3003q
            if (r6 == 0) goto L61
            boolean r6 = r5.f3001o
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f2996j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f2987a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f2987a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f2991e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f2995i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0052a c0052a = this.f2987a;
        int f10 = c0052a.f();
        int d10 = c0052a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
