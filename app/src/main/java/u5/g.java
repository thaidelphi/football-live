package u5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import u5.k;
import u5.l;
import u5.m;
/* compiled from: MaterialShapeDrawable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {

    /* renamed from: x  reason: collision with root package name */
    private static final String f31454x = g.class.getSimpleName();

    /* renamed from: y  reason: collision with root package name */
    private static final Paint f31455y;

    /* renamed from: a  reason: collision with root package name */
    private c f31456a;

    /* renamed from: b  reason: collision with root package name */
    private final m.g[] f31457b;

    /* renamed from: c  reason: collision with root package name */
    private final m.g[] f31458c;

    /* renamed from: d  reason: collision with root package name */
    private final BitSet f31459d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31460e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f31461f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f31462g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f31463h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f31464i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f31465j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f31466k;

    /* renamed from: l  reason: collision with root package name */
    private final Region f31467l;

    /* renamed from: m  reason: collision with root package name */
    private k f31468m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f31469n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f31470o;

    /* renamed from: p  reason: collision with root package name */
    private final t5.a f31471p;

    /* renamed from: q  reason: collision with root package name */
    private final l.b f31472q;

    /* renamed from: r  reason: collision with root package name */
    private final l f31473r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuffColorFilter f31474s;

    /* renamed from: t  reason: collision with root package name */
    private PorterDuffColorFilter f31475t;

    /* renamed from: u  reason: collision with root package name */
    private int f31476u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f31477v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f31478w;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements l.b {
        a() {
        }

        @Override // u5.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f31459d.set(i10, mVar.e());
            g.this.f31457b[i10] = mVar.f(matrix);
        }

        @Override // u5.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f31459d.set(i10 + 4, mVar.e());
            g.this.f31458c[i10] = mVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f31480a;

        b(float f10) {
            this.f31480a = f10;
        }

        @Override // u5.k.c
        public u5.c a(u5.c cVar) {
            return cVar instanceof i ? cVar : new u5.b(this.f31480a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f31455y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float E() {
        if (M()) {
            return this.f31470o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean K() {
        c cVar = this.f31456a;
        int i10 = cVar.f31498q;
        return i10 != 1 && cVar.f31499r > 0 && (i10 == 2 || U());
    }

    private boolean L() {
        Paint.Style style = this.f31456a.f31503v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean M() {
        Paint.Style style = this.f31456a.f31503v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f31470o.getStrokeWidth() > 0.0f;
    }

    private void O() {
        super.invalidateSelf();
    }

    private void R(Canvas canvas) {
        if (K()) {
            canvas.save();
            T(canvas);
            if (!this.f31478w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f31477v.width() - getBounds().width());
            int height = (int) (this.f31477v.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f31477v.width()) + (this.f31456a.f31499r * 2) + width, ((int) this.f31477v.height()) + (this.f31456a.f31499r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f10 = (getBounds().left - this.f31456a.f31499r) - width;
                float f11 = (getBounds().top - this.f31456a.f31499r) - height;
                canvas2.translate(-f10, -f11);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    private static int S(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void T(Canvas canvas) {
        int A = A();
        int B = B();
        if (Build.VERSION.SDK_INT < 21 && this.f31478w) {
            Rect clipBounds = canvas.getClipBounds();
            int i10 = this.f31456a.f31499r;
            clipBounds.inset(-i10, -i10);
            clipBounds.offset(A, B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(A, B);
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (z10) {
            int color = paint.getColor();
            int l10 = l(color);
            this.f31476u = l10;
            if (l10 != color) {
                return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f31456a.f31491j != 1.0f) {
            this.f31461f.reset();
            Matrix matrix = this.f31461f;
            float f10 = this.f31456a.f31491j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f31461f);
        }
        path.computeBounds(this.f31477v, true);
    }

    private boolean g0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f31456a.f31485d == null || color2 == (colorForState2 = this.f31456a.f31485d.getColorForState(iArr, (color2 = this.f31469n.getColor())))) {
            z10 = false;
        } else {
            this.f31469n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f31456a.f31486e == null || color == (colorForState = this.f31456a.f31486e.getColorForState(iArr, (color = this.f31470o.getColor())))) {
            return z10;
        }
        this.f31470o.setColor(colorForState);
        return true;
    }

    private boolean h0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f31474s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f31475t;
        c cVar = this.f31456a;
        this.f31474s = k(cVar.f31488g, cVar.f31489h, this.f31469n, true);
        c cVar2 = this.f31456a;
        this.f31475t = k(cVar2.f31487f, cVar2.f31489h, this.f31470o, false);
        c cVar3 = this.f31456a;
        if (cVar3.f31502u) {
            this.f31471p.d(cVar3.f31488g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.d.a(porterDuffColorFilter, this.f31474s) && androidx.core.util.d.a(porterDuffColorFilter2, this.f31475t)) ? false : true;
    }

    private void i() {
        k y10 = D().y(new b(-E()));
        this.f31468m = y10;
        this.f31473r.d(y10, this.f31456a.f31492k, v(), this.f31463h);
    }

    private void i0() {
        float J = J();
        this.f31456a.f31499r = (int) Math.ceil(0.75f * J);
        this.f31456a.f31500s = (int) Math.ceil(J * 0.25f);
        h0();
        O();
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f31476u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z10);
        }
        return f(paint, z10);
    }

    public static g m(Context context, float f10) {
        int c10 = j5.a.c(context, d5.b.f23981k, g.class.getSimpleName());
        g gVar = new g();
        gVar.N(context);
        gVar.X(ColorStateList.valueOf(c10));
        gVar.W(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f31459d.cardinality() > 0) {
            Log.w(f31454x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f31456a.f31500s != 0) {
            canvas.drawPath(this.f31462g, this.f31471p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f31457b[i10].b(this.f31471p, this.f31456a.f31499r, canvas);
            this.f31458c[i10].b(this.f31471p, this.f31456a.f31499r, canvas);
        }
        if (this.f31478w) {
            int A = A();
            int B = B();
            canvas.translate(-A, -B);
            canvas.drawPath(this.f31462g, f31455y);
            canvas.translate(A, B);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f31469n, this.f31462g, this.f31456a.f31482a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF) * this.f31456a.f31492k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF v() {
        this.f31465j.set(u());
        float E = E();
        this.f31465j.inset(E, E);
        return this.f31465j;
    }

    public int A() {
        c cVar = this.f31456a;
        return (int) (cVar.f31500s * Math.sin(Math.toRadians(cVar.f31501t)));
    }

    public int B() {
        c cVar = this.f31456a;
        return (int) (cVar.f31500s * Math.cos(Math.toRadians(cVar.f31501t)));
    }

    public int C() {
        return this.f31456a.f31499r;
    }

    public k D() {
        return this.f31456a.f31482a;
    }

    public ColorStateList F() {
        return this.f31456a.f31488g;
    }

    public float G() {
        return this.f31456a.f31482a.r().a(u());
    }

    public float H() {
        return this.f31456a.f31482a.t().a(u());
    }

    public float I() {
        return this.f31456a.f31497p;
    }

    public float J() {
        return w() + I();
    }

    public void N(Context context) {
        this.f31456a.f31483b = new m5.a(context);
        i0();
    }

    public boolean P() {
        m5.a aVar = this.f31456a.f31483b;
        return aVar != null && aVar.d();
    }

    public boolean Q() {
        return this.f31456a.f31482a.u(u());
    }

    public boolean U() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 21 || !(Q() || this.f31462g.isConvex() || i10 >= 29);
    }

    public void V(u5.c cVar) {
        setShapeAppearanceModel(this.f31456a.f31482a.x(cVar));
    }

    public void W(float f10) {
        c cVar = this.f31456a;
        if (cVar.f31496o != f10) {
            cVar.f31496o = f10;
            i0();
        }
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.f31456a;
        if (cVar.f31485d != colorStateList) {
            cVar.f31485d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f10) {
        c cVar = this.f31456a;
        if (cVar.f31492k != f10) {
            cVar.f31492k = f10;
            this.f31460e = true;
            invalidateSelf();
        }
    }

    public void Z(int i10, int i11, int i12, int i13) {
        c cVar = this.f31456a;
        if (cVar.f31490i == null) {
            cVar.f31490i = new Rect();
        }
        this.f31456a.f31490i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void a0(float f10) {
        c cVar = this.f31456a;
        if (cVar.f31495n != f10) {
            cVar.f31495n = f10;
            i0();
        }
    }

    public void b0(int i10) {
        c cVar = this.f31456a;
        if (cVar.f31501t != i10) {
            cVar.f31501t = i10;
            O();
        }
    }

    public void c0(float f10, int i10) {
        f0(f10);
        e0(ColorStateList.valueOf(i10));
    }

    public void d0(float f10, ColorStateList colorStateList) {
        f0(f10);
        e0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f31469n.setColorFilter(this.f31474s);
        int alpha = this.f31469n.getAlpha();
        this.f31469n.setAlpha(S(alpha, this.f31456a.f31494m));
        this.f31470o.setColorFilter(this.f31475t);
        this.f31470o.setStrokeWidth(this.f31456a.f31493l);
        int alpha2 = this.f31470o.getAlpha();
        this.f31470o.setAlpha(S(alpha2, this.f31456a.f31494m));
        if (this.f31460e) {
            i();
            g(u(), this.f31462g);
            this.f31460e = false;
        }
        R(canvas);
        if (L()) {
            o(canvas);
        }
        if (M()) {
            r(canvas);
        }
        this.f31469n.setAlpha(alpha);
        this.f31470o.setAlpha(alpha2);
    }

    public void e0(ColorStateList colorStateList) {
        c cVar = this.f31456a;
        if (cVar.f31486e != colorStateList) {
            cVar.f31486e = colorStateList;
            onStateChange(getState());
        }
    }

    public void f0(float f10) {
        this.f31456a.f31493l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31456a.f31494m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f31456a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f31456a.f31498q == 2) {
            return;
        }
        if (Q()) {
            outline.setRoundRect(getBounds(), G() * this.f31456a.f31492k);
            return;
        }
        g(u(), this.f31462g);
        if (this.f31462g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f31462g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f31456a.f31490i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f31466k.set(getBounds());
        g(u(), this.f31462g);
        this.f31467l.setPath(this.f31462g, this.f31466k);
        this.f31466k.op(this.f31467l, Region.Op.DIFFERENCE);
        return this.f31466k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.f31473r;
        c cVar = this.f31456a;
        lVar.e(cVar.f31482a, cVar.f31492k, rectF, this.f31472q, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f31460e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f31456a.f31488g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f31456a.f31487f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f31456a.f31486e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f31456a.f31485d) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(int i10) {
        float J = J() + y();
        m5.a aVar = this.f31456a.f31483b;
        return aVar != null ? aVar.c(i10, J) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f31456a = new c(this.f31456a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f31460e = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = g0(iArr) || h0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f31456a.f31482a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(Canvas canvas) {
        q(canvas, this.f31470o, this.f31463h, this.f31468m, v());
    }

    public float s() {
        return this.f31456a.f31482a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f31456a;
        if (cVar.f31494m != i10) {
            cVar.f31494m = i10;
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f31456a.f31484c = colorFilter;
        O();
    }

    @Override // u5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f31456a.f31482a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f31456a.f31488g = colorStateList;
        h0();
        O();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f31456a;
        if (cVar.f31489h != mode) {
            cVar.f31489h = mode;
            h0();
            O();
        }
    }

    public float t() {
        return this.f31456a.f31482a.l().a(u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF u() {
        this.f31464i.set(getBounds());
        return this.f31464i;
    }

    public float w() {
        return this.f31456a.f31496o;
    }

    public ColorStateList x() {
        return this.f31456a.f31485d;
    }

    public float y() {
        return this.f31456a.f31495n;
    }

    public int z() {
        return this.f31476u;
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        l lVar;
        this.f31457b = new m.g[4];
        this.f31458c = new m.g[4];
        this.f31459d = new BitSet(8);
        this.f31461f = new Matrix();
        this.f31462g = new Path();
        this.f31463h = new Path();
        this.f31464i = new RectF();
        this.f31465j = new RectF();
        this.f31466k = new Region();
        this.f31467l = new Region();
        Paint paint = new Paint(1);
        this.f31469n = paint;
        Paint paint2 = new Paint(1);
        this.f31470o = paint2;
        this.f31471p = new t5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f31473r = lVar;
        this.f31477v = new RectF();
        this.f31478w = true;
        this.f31456a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        h0();
        g0(getState());
        this.f31472q = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f31482a;

        /* renamed from: b  reason: collision with root package name */
        public m5.a f31483b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f31484c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f31485d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f31486e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f31487f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f31488g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f31489h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f31490i;

        /* renamed from: j  reason: collision with root package name */
        public float f31491j;

        /* renamed from: k  reason: collision with root package name */
        public float f31492k;

        /* renamed from: l  reason: collision with root package name */
        public float f31493l;

        /* renamed from: m  reason: collision with root package name */
        public int f31494m;

        /* renamed from: n  reason: collision with root package name */
        public float f31495n;

        /* renamed from: o  reason: collision with root package name */
        public float f31496o;

        /* renamed from: p  reason: collision with root package name */
        public float f31497p;

        /* renamed from: q  reason: collision with root package name */
        public int f31498q;

        /* renamed from: r  reason: collision with root package name */
        public int f31499r;

        /* renamed from: s  reason: collision with root package name */
        public int f31500s;

        /* renamed from: t  reason: collision with root package name */
        public int f31501t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f31502u;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f31503v;

        public c(k kVar, m5.a aVar) {
            this.f31485d = null;
            this.f31486e = null;
            this.f31487f = null;
            this.f31488g = null;
            this.f31489h = PorterDuff.Mode.SRC_IN;
            this.f31490i = null;
            this.f31491j = 1.0f;
            this.f31492k = 1.0f;
            this.f31494m = 255;
            this.f31495n = 0.0f;
            this.f31496o = 0.0f;
            this.f31497p = 0.0f;
            this.f31498q = 0;
            this.f31499r = 0;
            this.f31500s = 0;
            this.f31501t = 0;
            this.f31502u = false;
            this.f31503v = Paint.Style.FILL_AND_STROKE;
            this.f31482a = kVar;
            this.f31483b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f31460e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f31485d = null;
            this.f31486e = null;
            this.f31487f = null;
            this.f31488g = null;
            this.f31489h = PorterDuff.Mode.SRC_IN;
            this.f31490i = null;
            this.f31491j = 1.0f;
            this.f31492k = 1.0f;
            this.f31494m = 255;
            this.f31495n = 0.0f;
            this.f31496o = 0.0f;
            this.f31497p = 0.0f;
            this.f31498q = 0;
            this.f31499r = 0;
            this.f31500s = 0;
            this.f31501t = 0;
            this.f31502u = false;
            this.f31503v = Paint.Style.FILL_AND_STROKE;
            this.f31482a = cVar.f31482a;
            this.f31483b = cVar.f31483b;
            this.f31493l = cVar.f31493l;
            this.f31484c = cVar.f31484c;
            this.f31485d = cVar.f31485d;
            this.f31486e = cVar.f31486e;
            this.f31489h = cVar.f31489h;
            this.f31488g = cVar.f31488g;
            this.f31494m = cVar.f31494m;
            this.f31491j = cVar.f31491j;
            this.f31500s = cVar.f31500s;
            this.f31498q = cVar.f31498q;
            this.f31502u = cVar.f31502u;
            this.f31492k = cVar.f31492k;
            this.f31495n = cVar.f31495n;
            this.f31496o = cVar.f31496o;
            this.f31497p = cVar.f31497p;
            this.f31499r = cVar.f31499r;
            this.f31501t = cVar.f31501t;
            this.f31487f = cVar.f31487f;
            this.f31503v = cVar.f31503v;
            if (cVar.f31490i != null) {
                this.f31490i = new Rect(cVar.f31490i);
            }
        }
    }
}
