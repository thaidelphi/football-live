package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.p0;
/* compiled from: AppCompatDrawableManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f1616b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static k f1617c;

    /* renamed from: a  reason: collision with root package name */
    private p0 f1618a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements p0.f {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1619a = {e.e.R, e.e.P, e.e.f24590a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1620b = {e.e.f24604o, e.e.B, e.e.f24609t, e.e.f24605p, e.e.f24606q, e.e.f24608s, e.e.f24607r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1621c = {e.e.O, e.e.Q, e.e.f24600k, e.e.K, e.e.L, e.e.M, e.e.N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1622d = {e.e.f24612w, e.e.f24598i, e.e.f24611v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1623e = {e.e.J, e.e.S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1624f = {e.e.f24592c, e.e.f24596g, e.e.f24593d, e.e.f24597h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = u0.c(context, e.a.f24562w);
            return new ColorStateList(new int[][]{u0.f1776b, u0.f1779e, u0.f1777c, u0.f1783i}, new int[]{u0.b(context, e.a.f24560u), androidx.core.graphics.a.f(c10, i10), androidx.core.graphics.a.f(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, u0.c(context, e.a.f24559t));
        }

        private ColorStateList j(Context context) {
            return h(context, u0.c(context, e.a.f24560u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = e.a.f24564y;
            ColorStateList e8 = u0.e(context, i10);
            if (e8 != null && e8.isStateful()) {
                iArr[0] = u0.f1776b;
                iArr2[0] = e8.getColorForState(iArr[0], 0);
                iArr[1] = u0.f1780f;
                iArr2[1] = u0.c(context, e.a.f24561v);
                iArr[2] = u0.f1783i;
                iArr2[2] = e8.getDefaultColor();
            } else {
                iArr[0] = u0.f1776b;
                iArr2[0] = u0.b(context, i10);
                iArr[1] = u0.f1780f;
                iArr2[1] = u0.c(context, e.a.f24561v);
                iArr[2] = u0.f1783i;
                iArr2[2] = u0.c(context, i10);
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(p0 p0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = p0Var.j(context, e.e.F);
            Drawable j11 = p0Var.j(context, e.e.G);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f1616b;
            }
            drawable.setColorFilter(k.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.p0.f
        public Drawable a(p0 p0Var, Context context, int i10) {
            if (i10 == e.e.f24599j) {
                return new LayerDrawable(new Drawable[]{p0Var.j(context, e.e.f24598i), p0Var.j(context, e.e.f24600k)});
            }
            if (i10 == e.e.f24614y) {
                return l(p0Var, context, e.d.f24583i);
            }
            if (i10 == e.e.f24613x) {
                return l(p0Var, context, e.d.f24584j);
            }
            if (i10 == e.e.f24615z) {
                return l(p0Var, context, e.d.f24585k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0.f
        public ColorStateList b(Context context, int i10) {
            if (i10 == e.e.f24602m) {
                return f.a.a(context, e.c.f24571e);
            }
            if (i10 == e.e.I) {
                return f.a.a(context, e.c.f24574h);
            }
            if (i10 == e.e.H) {
                return k(context);
            }
            if (i10 == e.e.f24595f) {
                return j(context);
            }
            if (i10 == e.e.f24591b) {
                return g(context);
            }
            if (i10 == e.e.f24594e) {
                return i(context);
            }
            if (i10 != e.e.D && i10 != e.e.E) {
                if (f(this.f1620b, i10)) {
                    return u0.e(context, e.a.f24563x);
                }
                if (f(this.f1623e, i10)) {
                    return f.a.a(context, e.c.f24570d);
                }
                if (f(this.f1624f, i10)) {
                    return f.a.a(context, e.c.f24569c);
                }
                if (i10 == e.e.A) {
                    return f.a.a(context, e.c.f24572f);
                }
                return null;
            }
            return f.a.a(context, e.c.f24573g);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.p0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f1619a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = e.a.f24563x
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1621c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = e.a.f24561v
                goto L14
            L22:
                int[] r1 = r6.f1622d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = e.e.f24610u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = e.e.f24601l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.h0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.u0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.p0.f
        public PorterDuff.Mode d(int i10) {
            if (i10 == e.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == e.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = e.a.f24563x;
                m(findDrawableByLayerId, u0.c(context, i11), k.f1616b);
                m(layerDrawable.findDrawableByLayerId(16908303), u0.c(context, i11), k.f1616b);
                m(layerDrawable.findDrawableByLayerId(16908301), u0.c(context, e.a.f24561v), k.f1616b);
                return true;
            } else if (i10 == e.e.f24614y || i10 == e.e.f24613x || i10 == e.e.f24615z) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), u0.b(context, e.a.f24563x), k.f1616b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = e.a.f24561v;
                m(findDrawableByLayerId2, u0.c(context, i12), k.f1616b);
                m(layerDrawable2.findDrawableByLayerId(16908301), u0.c(context, i12), k.f1616b);
                return true;
            } else {
                return false;
            }
        }
    }

    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            if (f1617c == null) {
                h();
            }
            kVar = f1617c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (k.class) {
            l10 = p0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (k.class) {
            if (f1617c == null) {
                k kVar = new k();
                f1617c = kVar;
                kVar.f1618a = p0.h();
                f1617c.f1618a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, x0 x0Var, int[] iArr) {
        p0.w(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1618a.j(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1618a.k(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1618a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1618a.s(context);
    }
}
