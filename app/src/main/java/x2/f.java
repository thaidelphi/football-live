package x2;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* compiled from: Sprite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* renamed from: d  reason: collision with root package name */
    private float f32411d;

    /* renamed from: e  reason: collision with root package name */
    private float f32412e;

    /* renamed from: f  reason: collision with root package name */
    private int f32413f;

    /* renamed from: g  reason: collision with root package name */
    private int f32414g;

    /* renamed from: h  reason: collision with root package name */
    private int f32415h;

    /* renamed from: i  reason: collision with root package name */
    private int f32416i;

    /* renamed from: j  reason: collision with root package name */
    private int f32417j;

    /* renamed from: k  reason: collision with root package name */
    private int f32418k;

    /* renamed from: l  reason: collision with root package name */
    private float f32419l;

    /* renamed from: m  reason: collision with root package name */
    private float f32420m;

    /* renamed from: n  reason: collision with root package name */
    private ValueAnimator f32421n;

    /* renamed from: s  reason: collision with root package name */
    private static final Rect f32400s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public static final Property<f, Integer> f32401t = new c("rotateX");

    /* renamed from: u  reason: collision with root package name */
    public static final Property<f, Integer> f32402u = new d("rotate");

    /* renamed from: v  reason: collision with root package name */
    public static final Property<f, Integer> f32403v = new e("rotateY");

    /* renamed from: w  reason: collision with root package name */
    public static final Property<f, Integer> f32404w = new C0375f("translateX");

    /* renamed from: x  reason: collision with root package name */
    public static final Property<f, Integer> f32405x = new g("translateY");

    /* renamed from: y  reason: collision with root package name */
    public static final Property<f, Float> f32406y = new h("translateXPercentage");

    /* renamed from: z  reason: collision with root package name */
    public static final Property<f, Float> f32407z = new i("translateYPercentage");
    public static final Property<f, Float> A = new j("scaleX");
    public static final Property<f, Float> B = new k("scaleY");
    public static final Property<f, Float> C = new a("scale");
    public static final Property<f, Integer> D = new b("alpha");

    /* renamed from: a  reason: collision with root package name */
    private float f32408a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f32409b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private float f32410c = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private int f32422o = 255;

    /* renamed from: p  reason: collision with root package name */
    protected Rect f32423p = f32400s;

    /* renamed from: q  reason: collision with root package name */
    private Camera f32424q = new Camera();

    /* renamed from: r  reason: collision with root package name */
    private Matrix f32425r = new Matrix();

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a extends v2.b<f> {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(f fVar) {
            return Float.valueOf(fVar.j());
        }

        @Override // v2.b
        /* renamed from: d */
        public void b(f fVar, float f10) {
            fVar.C(f10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b extends v2.c<f> {
        b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.getAlpha());
        }

        @Override // v2.c
        /* renamed from: d */
        public void b(f fVar, int i10) {
            fVar.setAlpha(i10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c extends v2.c<f> {
        c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.h());
        }

        @Override // v2.c
        /* renamed from: d */
        public void b(f fVar, int i10) {
            fVar.A(i10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d extends v2.c<f> {
        d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.g());
        }

        @Override // v2.c
        /* renamed from: d */
        public void b(f fVar, int i10) {
            fVar.z(i10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class e extends v2.c<f> {
        e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.i());
        }

        @Override // v2.c
        /* renamed from: d */
        public void b(f fVar, int i10) {
            fVar.B(i10);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: x2.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0375f extends v2.c<f> {
        C0375f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m());
        }

        @Override // v2.c
        /* renamed from: d */
        public void b(f fVar, int i10) {
            fVar.F(i10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class g extends v2.c<f> {
        g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.o());
        }

        @Override // v2.c
        /* renamed from: d */
        public void b(f fVar, int i10) {
            fVar.H(i10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class h extends v2.b<f> {
        h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(f fVar) {
            return Float.valueOf(fVar.n());
        }

        @Override // v2.b
        /* renamed from: d */
        public void b(f fVar, float f10) {
            fVar.G(f10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class i extends v2.b<f> {
        i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(f fVar) {
            return Float.valueOf(fVar.p());
        }

        @Override // v2.b
        /* renamed from: d */
        public void b(f fVar, float f10) {
            fVar.I(f10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class j extends v2.b<f> {
        j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(f fVar) {
            return Float.valueOf(fVar.k());
        }

        @Override // v2.b
        /* renamed from: d */
        public void b(f fVar, float f10) {
            fVar.D(f10);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class k extends v2.b<f> {
        k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(f fVar) {
            return Float.valueOf(fVar.l());
        }

        @Override // v2.b
        /* renamed from: d */
        public void b(f fVar, float f10) {
            fVar.E(f10);
        }
    }

    public void A(int i10) {
        this.f32414g = i10;
    }

    public void B(int i10) {
        this.f32415h = i10;
    }

    public void C(float f10) {
        this.f32408a = f10;
        D(f10);
        E(f10);
    }

    public void D(float f10) {
        this.f32409b = f10;
    }

    public void E(float f10) {
        this.f32410c = f10;
    }

    public void F(int i10) {
        this.f32416i = i10;
    }

    public void G(float f10) {
        this.f32419l = f10;
    }

    public void H(int i10) {
        this.f32417j = i10;
    }

    public void I(float f10) {
        this.f32420m = f10;
    }

    public Rect a(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i10 = min / 2;
        return new Rect(centerX - i10, centerY - i10, centerX + i10, centerY + i10);
    }

    protected abstract void b(Canvas canvas);

    public abstract int c();

    public Rect d() {
        return this.f32423p;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int m7 = m();
        if (m7 == 0) {
            m7 = (int) (getBounds().width() * n());
        }
        int o10 = o();
        if (o10 == 0) {
            o10 = (int) (getBounds().height() * p());
        }
        canvas.translate(m7, o10);
        canvas.scale(k(), l(), e(), f());
        canvas.rotate(g(), e(), f());
        if (h() != 0 || i() != 0) {
            this.f32424q.save();
            this.f32424q.rotateX(h());
            this.f32424q.rotateY(i());
            this.f32424q.getMatrix(this.f32425r);
            this.f32425r.preTranslate(-e(), -f());
            this.f32425r.postTranslate(e(), f());
            this.f32424q.restore();
            canvas.concat(this.f32425r);
        }
        b(canvas);
    }

    public float e() {
        return this.f32411d;
    }

    public float f() {
        return this.f32412e;
    }

    public int g() {
        return this.f32418k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f32422o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f32414g;
    }

    public int i() {
        return this.f32415h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return v2.a.a(this.f32421n);
    }

    public float j() {
        return this.f32408a;
    }

    public float k() {
        return this.f32409b;
    }

    public float l() {
        return this.f32410c;
    }

    public int m() {
        return this.f32416i;
    }

    public float n() {
        return this.f32419l;
    }

    public int o() {
        return this.f32417j;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        w(rect);
    }

    public float p() {
        return this.f32420m;
    }

    public ValueAnimator q() {
        if (this.f32421n == null) {
            this.f32421n = r();
        }
        ValueAnimator valueAnimator = this.f32421n;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.f32421n.setStartDelay(this.f32413f);
        }
        return this.f32421n;
    }

    public abstract ValueAnimator r();

    public void s() {
        this.f32408a = 1.0f;
        this.f32414g = 0;
        this.f32415h = 0;
        this.f32416i = 0;
        this.f32417j = 0;
        this.f32418k = 0;
        this.f32419l = 0.0f;
        this.f32420m = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f32422o = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (v2.a.c(this.f32421n)) {
            return;
        }
        ValueAnimator q10 = q();
        this.f32421n = q10;
        if (q10 == null) {
            return;
        }
        v2.a.d(q10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (v2.a.c(this.f32421n)) {
            this.f32421n.removeAllUpdateListeners();
            this.f32421n.end();
            s();
        }
    }

    public f t(int i10) {
        this.f32413f = i10;
        return this;
    }

    public abstract void u(int i10);

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public void v(int i10, int i11, int i12, int i13) {
        this.f32423p = new Rect(i10, i11, i12, i13);
        x(d().centerX());
        y(d().centerY());
    }

    public void w(Rect rect) {
        v(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x(float f10) {
        this.f32411d = f10;
    }

    public void y(float f10) {
        this.f32412e = f10;
    }

    public void z(int i10) {
        this.f32418k = i10;
    }
}
