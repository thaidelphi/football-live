package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f25633a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f25634b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f25635c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f25636d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25638f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25640h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f25641i;

    /* renamed from: j  reason: collision with root package name */
    private long f25642j;

    /* renamed from: k  reason: collision with root package name */
    private long f25643k;

    /* renamed from: l  reason: collision with root package name */
    private c f25644l;

    /* renamed from: e  reason: collision with root package name */
    private int f25637e = 255;

    /* renamed from: g  reason: collision with root package name */
    private int f25639g = -1;

    /* compiled from: DrawableContainer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: g.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0278b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f25646a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f25646a;
            this.f25646a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f25646a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f25646a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f25646a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f25647a;

        /* renamed from: b  reason: collision with root package name */
        Resources f25648b;

        /* renamed from: c  reason: collision with root package name */
        int f25649c;

        /* renamed from: d  reason: collision with root package name */
        int f25650d;

        /* renamed from: e  reason: collision with root package name */
        int f25651e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f25652f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f25653g;

        /* renamed from: h  reason: collision with root package name */
        int f25654h;

        /* renamed from: i  reason: collision with root package name */
        boolean f25655i;

        /* renamed from: j  reason: collision with root package name */
        boolean f25656j;

        /* renamed from: k  reason: collision with root package name */
        Rect f25657k;

        /* renamed from: l  reason: collision with root package name */
        boolean f25658l;

        /* renamed from: m  reason: collision with root package name */
        boolean f25659m;

        /* renamed from: n  reason: collision with root package name */
        int f25660n;

        /* renamed from: o  reason: collision with root package name */
        int f25661o;

        /* renamed from: p  reason: collision with root package name */
        int f25662p;

        /* renamed from: q  reason: collision with root package name */
        int f25663q;

        /* renamed from: r  reason: collision with root package name */
        boolean f25664r;

        /* renamed from: s  reason: collision with root package name */
        int f25665s;

        /* renamed from: t  reason: collision with root package name */
        boolean f25666t;

        /* renamed from: u  reason: collision with root package name */
        boolean f25667u;

        /* renamed from: v  reason: collision with root package name */
        boolean f25668v;

        /* renamed from: w  reason: collision with root package name */
        boolean f25669w;

        /* renamed from: x  reason: collision with root package name */
        boolean f25670x;

        /* renamed from: y  reason: collision with root package name */
        boolean f25671y;

        /* renamed from: z  reason: collision with root package name */
        int f25672z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            this.f25655i = false;
            this.f25658l = false;
            this.f25670x = true;
            this.A = 0;
            this.B = 0;
            this.f25647a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f25648b : null;
            }
            this.f25648b = resources2;
            int f10 = b.f(resources, dVar != null ? dVar.f25649c : 0);
            this.f25649c = f10;
            if (dVar != null) {
                this.f25650d = dVar.f25650d;
                this.f25651e = dVar.f25651e;
                this.f25668v = true;
                this.f25669w = true;
                this.f25655i = dVar.f25655i;
                this.f25658l = dVar.f25658l;
                this.f25670x = dVar.f25670x;
                this.f25671y = dVar.f25671y;
                this.f25672z = dVar.f25672z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f25649c == f10) {
                    if (dVar.f25656j) {
                        this.f25657k = dVar.f25657k != null ? new Rect(dVar.f25657k) : null;
                        this.f25656j = true;
                    }
                    if (dVar.f25659m) {
                        this.f25660n = dVar.f25660n;
                        this.f25661o = dVar.f25661o;
                        this.f25662p = dVar.f25662p;
                        this.f25663q = dVar.f25663q;
                        this.f25659m = true;
                    }
                }
                if (dVar.f25664r) {
                    this.f25665s = dVar.f25665s;
                    this.f25664r = true;
                }
                if (dVar.f25666t) {
                    this.f25667u = dVar.f25667u;
                    this.f25666t = true;
                }
                Drawable[] drawableArr = dVar.f25653g;
                this.f25653g = new Drawable[drawableArr.length];
                this.f25654h = dVar.f25654h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f25652f;
                if (sparseArray != null) {
                    this.f25652f = sparseArray.clone();
                } else {
                    this.f25652f = new SparseArray<>(this.f25654h);
                }
                int i10 = this.f25654h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f25652f.put(i11, constantState);
                        } else {
                            this.f25653g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f25653g = new Drawable[10];
            this.f25654h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f25652f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f25653g[this.f25652f.keyAt(i10)] = s(this.f25652f.valueAt(i10).newDrawable(this.f25648b));
                }
                this.f25652f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f25672z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f25647a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f25654h;
            if (i10 >= this.f25653g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f25647a);
            this.f25653g[i10] = drawable;
            this.f25654h++;
            this.f25651e = drawable.getChangingConfigurations() | this.f25651e;
            p();
            this.f25657k = null;
            this.f25656j = false;
            this.f25659m = false;
            this.f25668v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f25654h;
                Drawable[] drawableArr = this.f25653g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f25651e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0278b.c(theme));
            }
        }

        public boolean c() {
            if (this.f25668v) {
                return this.f25669w;
            }
            e();
            this.f25668v = true;
            int i10 = this.f25654h;
            Drawable[] drawableArr = this.f25653g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f25669w = false;
                    return false;
                }
            }
            this.f25669w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f25654h;
            Drawable[] drawableArr = this.f25653g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.a.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f25652f.get(i11);
                    if (constantState != null && C0278b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        protected void d() {
            this.f25659m = true;
            e();
            int i10 = this.f25654h;
            Drawable[] drawableArr = this.f25653g;
            this.f25661o = -1;
            this.f25660n = -1;
            this.f25663q = 0;
            this.f25662p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f25660n) {
                    this.f25660n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f25661o) {
                    this.f25661o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f25662p) {
                    this.f25662p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f25663q) {
                    this.f25663q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f25653g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f25653g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f25652f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f25652f.valueAt(indexOfKey).newDrawable(this.f25648b));
            this.f25653g[i10] = s10;
            this.f25652f.removeAt(indexOfKey);
            if (this.f25652f.size() == 0) {
                this.f25652f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25650d | this.f25651e;
        }

        public final int h() {
            return this.f25654h;
        }

        public final int i() {
            if (!this.f25659m) {
                d();
            }
            return this.f25661o;
        }

        public final int j() {
            if (!this.f25659m) {
                d();
            }
            return this.f25663q;
        }

        public final int k() {
            if (!this.f25659m) {
                d();
            }
            return this.f25662p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f25655i) {
                return null;
            }
            Rect rect2 = this.f25657k;
            if (rect2 != null || this.f25656j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f25654h;
            Drawable[] drawableArr = this.f25653g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f25656j = true;
            this.f25657k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f25659m) {
                d();
            }
            return this.f25660n;
        }

        public final int n() {
            if (this.f25664r) {
                return this.f25665s;
            }
            e();
            int i10 = this.f25654h;
            Drawable[] drawableArr = this.f25653g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f25665s = opacity;
            this.f25664r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f25653g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f25653g = drawableArr;
        }

        void p() {
            this.f25664r = false;
            this.f25666t = false;
        }

        public final boolean q() {
            return this.f25658l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f25658l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f25654h;
            Drawable[] drawableArr = this.f25653g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m7 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z10 = m7;
                    }
                }
            }
            this.f25672z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f25655i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f25648b = resources;
                int f10 = b.f(resources, this.f25649c);
                int i10 = this.f25649c;
                this.f25649c = f10;
                if (i10 != f10) {
                    this.f25659m = false;
                    this.f25656j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f25644l == null) {
            this.f25644l = new c();
        }
        drawable.setCallback(this.f25644l.b(drawable.getCallback()));
        try {
            if (this.f25633a.A <= 0 && this.f25638f) {
                drawable.setAlpha(this.f25637e);
            }
            d dVar = this.f25633a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f25633a;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f25633a.f25670x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            if (i10 >= 19) {
                androidx.core.graphics.drawable.a.j(drawable, this.f25633a.C);
            }
            Rect rect = this.f25634b;
            if (i10 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f25644l.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f25638f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f25635c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f25642j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f25637e
            r3.setAlpha(r9)
            r13.f25642j = r7
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            g.b$d r10 = r13.f25633a
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f25637e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f25642j = r7
        L38:
            r3 = r6
        L39:
            android.graphics.drawable.Drawable r9 = r13.f25636d
            if (r9 == 0) goto L61
            long r10 = r13.f25643k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f25636d = r0
            r13.f25643k = r7
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$d r4 = r13.f25633a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f25637e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f25643k = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f25641i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f25633a.b(theme);
    }

    d b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f25639g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f25633a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f25636d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f25639g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$d r0 = r9.f25633a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f25636d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f25635c
            if (r0 == 0) goto L29
            r9.f25636d = r0
            g.b$d r0 = r9.f25633a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f25643k = r0
            goto L35
        L29:
            r9.f25636d = r4
            r9.f25643k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f25635c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b$d r0 = r9.f25633a
            int r1 = r0.f25654h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f25635c = r0
            r9.f25639g = r10
            if (r0 == 0) goto L5a
            g.b$d r10 = r9.f25633a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f25642j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f25635c = r4
            r10 = -1
            r9.f25639g = r10
        L5a:
            long r0 = r9.f25642j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f25643k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f25641i
            if (r10 != 0) goto L73
            g.b$a r10 = new g.b$a
            r10.<init>()
            r9.f25641i = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f25637e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f25633a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f25633a.c()) {
            this.f25633a.f25650d = getChangingConfigurations();
            return this.f25633a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f25635c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f25634b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f25633a.q()) {
            return this.f25633a.i();
        }
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f25633a.q()) {
            return this.f25633a.m();
        }
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f25633a.q()) {
            return this.f25633a.j();
        }
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f25633a.q()) {
            return this.f25633a.k();
        }
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25635c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f25633a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            C0278b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f25633a.l();
        if (l10 != null) {
            rect.set(l10);
            padding = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f25635c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f25633a = dVar;
        int i10 = this.f25639g;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f25635c = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f25636d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f25633a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f25633a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f25635c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f25633a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f25636d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f25636d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f25635c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f25638f) {
                this.f25635c.setAlpha(this.f25637e);
            }
        }
        if (this.f25643k != 0) {
            this.f25643k = 0L;
            z10 = true;
        }
        if (this.f25642j != 0) {
            this.f25642j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f25640h && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.f25640h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25636d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f25635c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f25633a.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f25636d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f25635c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f25636d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f25635c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f25635c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f25638f && this.f25637e == i10) {
            return;
        }
        this.f25638f = true;
        this.f25637e = i10;
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            if (this.f25642j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f25633a;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f25635c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f25633a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f25635c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f25633a;
        if (dVar.f25670x != z10) {
            dVar.f25670x = z10;
            Drawable drawable = this.f25635c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f25634b;
        if (rect == null) {
            this.f25634b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f25635c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f25633a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f25635c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f25633a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f25635c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f25636d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f25635c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f25635c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
