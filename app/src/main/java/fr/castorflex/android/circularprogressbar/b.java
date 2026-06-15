package fr.castorflex.android.circularprogressbar;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: CircularProgressDrawable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final RectF f25575a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f25576b;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f25577c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f25578d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f25579e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25580f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f25581g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25582h;

    /* renamed from: i  reason: collision with root package name */
    private int f25583i;

    /* renamed from: j  reason: collision with root package name */
    private int f25584j;

    /* renamed from: k  reason: collision with root package name */
    private float f25585k;

    /* renamed from: l  reason: collision with root package name */
    private float f25586l;

    /* renamed from: m  reason: collision with root package name */
    private float f25587m;

    /* renamed from: n  reason: collision with root package name */
    private float f25588n;

    /* renamed from: o  reason: collision with root package name */
    private Interpolator f25589o;

    /* renamed from: p  reason: collision with root package name */
    private Interpolator f25590p;

    /* renamed from: q  reason: collision with root package name */
    private float f25591q;

    /* renamed from: r  reason: collision with root package name */
    private int[] f25592r;

    /* renamed from: s  reason: collision with root package name */
    private float f25593s;

    /* renamed from: t  reason: collision with root package name */
    private float f25594t;

    /* renamed from: u  reason: collision with root package name */
    private int f25595u;

    /* renamed from: v  reason: collision with root package name */
    private int f25596v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f25597w;

    /* renamed from: x  reason: collision with root package name */
    private static final ArgbEvaluator f25572x = new ArgbEvaluator();

    /* renamed from: y  reason: collision with root package name */
    public static final Interpolator f25573y = new LinearInterpolator();

    /* renamed from: z  reason: collision with root package name */
    private static final Interpolator f25574z = new LinearInterpolator();
    private static final Interpolator A = new DecelerateInterpolator();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.v(fr.castorflex.android.circularprogressbar.a.e(valueAnimator) * 360.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: fr.castorflex.android.circularprogressbar.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class C0276b implements ValueAnimator.AnimatorUpdateListener {
        C0276b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            float e8 = fr.castorflex.android.circularprogressbar.a.e(valueAnimator);
            if (b.this.f25597w) {
                f10 = e8 * b.this.f25596v;
            } else {
                f10 = (e8 * (b.this.f25596v - b.this.f25595u)) + b.this.f25595u;
            }
            b.this.w(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f25600a = false;

        c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25600a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25600a) {
                return;
            }
            b.this.f25597w = false;
            b.this.x();
            b.this.f25577c.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25600a = false;
            b.this.f25580f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float e8 = fr.castorflex.android.circularprogressbar.a.e(valueAnimator);
            b bVar = b.this;
            bVar.w(bVar.f25596v - (e8 * (b.this.f25596v - b.this.f25595u)));
            float currentPlayTime = ((float) valueAnimator.getCurrentPlayTime()) / ((float) valueAnimator.getDuration());
            if (b.this.f25592r.length <= 1 || currentPlayTime <= 0.7f) {
                return;
            }
            b.this.f25581g.setColor(((Integer) b.f25572x.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(b.this.f25583i), Integer.valueOf(b.this.f25592r[(b.this.f25584j + 1) % b.this.f25592r.length]))).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f25603a;

        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25603a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25603a) {
                return;
            }
            b.this.u();
            b bVar = b.this;
            bVar.f25584j = (bVar.f25584j + 1) % b.this.f25592r.length;
            b bVar2 = b.this;
            bVar2.f25583i = bVar2.f25592r[b.this.f25584j];
            b.this.f25581g.setColor(b.this.f25583i);
            b.this.f25576b.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25603a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.y(1.0f - fr.castorflex.android.circularprogressbar.a.e(valueAnimator));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f25606a;

        g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25606a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.y(0.0f);
            if (this.f25606a) {
                return;
            }
            b.this.stop();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25606a = false;
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private int[] f25608a;

        /* renamed from: b  reason: collision with root package name */
        private float f25609b;

        /* renamed from: c  reason: collision with root package name */
        private float f25610c;

        /* renamed from: d  reason: collision with root package name */
        private float f25611d;

        /* renamed from: e  reason: collision with root package name */
        private int f25612e;

        /* renamed from: f  reason: collision with root package name */
        private int f25613f;

        /* renamed from: g  reason: collision with root package name */
        private i f25614g;

        /* renamed from: h  reason: collision with root package name */
        private Interpolator f25615h;

        /* renamed from: i  reason: collision with root package name */
        private Interpolator f25616i;

        public h(Context context) {
            this(context, false);
        }

        private void d(Context context, boolean z10) {
            this.f25611d = context.getResources().getDimension(g8.c.f25828a);
            this.f25609b = 1.0f;
            this.f25610c = 1.0f;
            if (z10) {
                this.f25608a = new int[]{-16776961};
                this.f25612e = 20;
                this.f25613f = 300;
            } else {
                this.f25608a = new int[]{context.getResources().getColor(g8.b.f25827a)};
                this.f25612e = context.getResources().getInteger(g8.d.f25830b);
                this.f25613f = context.getResources().getInteger(g8.d.f25829a);
            }
            this.f25614g = i.ROUNDED;
        }

        public b a() {
            return new b(this.f25608a, this.f25611d, this.f25609b, this.f25610c, this.f25612e, this.f25613f, this.f25614g, this.f25616i, this.f25615h, null);
        }

        public h b(int i10) {
            this.f25608a = new int[]{i10};
            return this;
        }

        public h c(int[] iArr) {
            fr.castorflex.android.circularprogressbar.a.b(iArr);
            this.f25608a = iArr;
            return this;
        }

        public h e(int i10) {
            fr.castorflex.android.circularprogressbar.a.a(i10);
            this.f25613f = i10;
            return this;
        }

        public h f(int i10) {
            fr.castorflex.android.circularprogressbar.a.a(i10);
            this.f25612e = i10;
            return this;
        }

        public h g(float f10) {
            fr.castorflex.android.circularprogressbar.a.d(f10);
            this.f25610c = f10;
            return this;
        }

        public h h(float f10) {
            fr.castorflex.android.circularprogressbar.a.c(f10, "StrokeWidth");
            this.f25611d = f10;
            return this;
        }

        public h i(float f10) {
            fr.castorflex.android.circularprogressbar.a.d(f10);
            this.f25609b = f10;
            return this;
        }

        public h(Context context, boolean z10) {
            this.f25615h = b.A;
            this.f25616i = b.f25574z;
            d(context, z10);
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public enum i {
        NORMAL,
        ROUNDED
    }

    /* synthetic */ b(int[] iArr, float f10, float f11, float f12, int i10, int i11, i iVar, Interpolator interpolator, Interpolator interpolator2, a aVar) {
        this(iArr, f10, f11, f12, i10, i11, iVar, interpolator, interpolator2);
    }

    private void A() {
        this.f25578d.cancel();
        this.f25576b.cancel();
        this.f25577c.cancel();
        this.f25579e.cancel();
    }

    private void t() {
        this.f25597w = true;
        this.f25588n = 1.0f;
        this.f25581g.setColor(this.f25583i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.f25580f = true;
        this.f25586l += this.f25595u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f25580f = false;
        this.f25586l += 360 - this.f25596v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(float f10) {
        this.f25588n = f10;
        invalidateSelf();
    }

    private void z() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f25578d = ofFloat;
        ofFloat.setInterpolator(this.f25589o);
        this.f25578d.setDuration(2000.0f / this.f25594t);
        this.f25578d.addUpdateListener(new a());
        this.f25578d.setRepeatCount(-1);
        this.f25578d.setRepeatMode(1);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f25595u, this.f25596v);
        this.f25576b = ofFloat2;
        ofFloat2.setInterpolator(this.f25590p);
        this.f25576b.setDuration(600.0f / this.f25593s);
        this.f25576b.addUpdateListener(new C0276b());
        this.f25576b.addListener(new c());
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.f25596v, this.f25595u);
        this.f25577c = ofFloat3;
        ofFloat3.setInterpolator(this.f25590p);
        this.f25577c.setDuration(600.0f / this.f25593s);
        this.f25577c.addUpdateListener(new d());
        this.f25577c.addListener(new e());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f25579e = ofFloat4;
        ofFloat4.setInterpolator(f25573y);
        this.f25579e.setDuration(200L);
        this.f25579e.addUpdateListener(new f());
        this.f25579e.addListener(new g());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12 = this.f25587m - this.f25586l;
        float f13 = this.f25585k;
        if (!this.f25580f) {
            f12 += 360.0f - f13;
        }
        float f14 = f12 % 360.0f;
        float f15 = this.f25588n;
        if (f15 < 1.0f) {
            float f16 = f15 * f13;
            f10 = (f14 + (f13 - f16)) % 360.0f;
            f11 = f16;
        } else {
            f10 = f14;
            f11 = f13;
        }
        canvas.drawArc(this.f25575a, f10, f11, false, this.f25581g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f25582h;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f25575a;
        float f10 = this.f25591q;
        rectF.left = rect.left + (f10 / 2.0f) + 0.5f;
        rectF.right = (rect.right - (f10 / 2.0f)) - 0.5f;
        rectF.top = rect.top + (f10 / 2.0f) + 0.5f;
        rectF.bottom = (rect.bottom - (f10 / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f25581g.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25581g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        this.f25582h = true;
        t();
        this.f25578d.start();
        this.f25576b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            this.f25582h = false;
            A();
            invalidateSelf();
        }
    }

    public void v(float f10) {
        this.f25587m = f10;
        invalidateSelf();
    }

    public void w(float f10) {
        this.f25585k = f10;
        invalidateSelf();
    }

    private b(int[] iArr, float f10, float f11, float f12, int i10, int i11, i iVar, Interpolator interpolator, Interpolator interpolator2) {
        this.f25575a = new RectF();
        this.f25586l = 0.0f;
        this.f25587m = 0.0f;
        this.f25588n = 1.0f;
        this.f25590p = interpolator2;
        this.f25589o = interpolator;
        this.f25591q = f10;
        this.f25584j = 0;
        this.f25592r = iArr;
        this.f25583i = iArr[0];
        this.f25593s = f11;
        this.f25594t = f12;
        this.f25595u = i10;
        this.f25596v = i11;
        Paint paint = new Paint();
        this.f25581g = paint;
        paint.setAntiAlias(true);
        this.f25581g.setStyle(Paint.Style.STROKE);
        this.f25581g.setStrokeWidth(f10);
        this.f25581g.setStrokeCap(iVar == i.ROUNDED ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.f25581g.setColor(this.f25592r[0]);
        z();
    }
}
