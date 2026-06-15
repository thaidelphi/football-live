package j2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import j2.g;
import java.nio.ByteBuffer;
import java.util.List;
import w1.l;
/* compiled from: GifDrawable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final a f26798a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26799b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26800c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26801d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26802e;

    /* renamed from: f  reason: collision with root package name */
    private int f26803f;

    /* renamed from: g  reason: collision with root package name */
    private int f26804g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26805h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f26806i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f26807j;

    /* renamed from: k  reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f26808k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final g f26809a;

        a(g gVar) {
            this.f26809a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, v1.a aVar, l<Bitmap> lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, lVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f26807j == null) {
            this.f26807j = new Rect();
        }
        return this.f26807j;
    }

    private Paint h() {
        if (this.f26806i == null) {
            this.f26806i = new Paint(2);
        }
        return this.f26806i;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f26808k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f26808k.get(i10).a(this);
            }
        }
    }

    private void l() {
        this.f26803f = 0;
    }

    private void n() {
        s2.j.a(!this.f26801d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f26798a.f26809a.f() == 1) {
            invalidateSelf();
        } else if (this.f26799b) {
        } else {
            this.f26799b = true;
            this.f26798a.f26809a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f26799b = false;
        this.f26798a.f26809a.s(this);
    }

    @Override // j2.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f26803f++;
        }
        int i10 = this.f26804g;
        if (i10 == -1 || this.f26803f < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f26798a.f26809a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f26801d) {
            return;
        }
        if (this.f26805h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f26805h = false;
        }
        canvas.drawBitmap(this.f26798a.f26809a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f26798a.f26809a.e();
    }

    public int f() {
        return this.f26798a.f26809a.f();
    }

    public int g() {
        return this.f26798a.f26809a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26798a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26798a.f26809a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26798a.f26809a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f26798a.f26809a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f26799b;
    }

    public void k() {
        this.f26801d = true;
        this.f26798a.f26809a.a();
    }

    public void m(l<Bitmap> lVar, Bitmap bitmap) {
        this.f26798a.f26809a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26805h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        s2.j.a(!this.f26801d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f26802e = z10;
        if (!z10) {
            o();
        } else if (this.f26800c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f26800c = true;
        l();
        if (this.f26802e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f26800c = false;
        o();
    }

    c(a aVar) {
        this.f26802e = true;
        this.f26804g = -1;
        this.f26798a = (a) s2.j.d(aVar);
    }
}
