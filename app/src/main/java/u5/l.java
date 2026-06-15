package u5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f31531a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f31532b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f31533c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f31534d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f31535e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f31536f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f31537g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f31538h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f31539i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f31540j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f31541k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f31542l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f31543a = new l();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f31544a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f31545b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f31546c;

        /* renamed from: d  reason: collision with root package name */
        public final b f31547d;

        /* renamed from: e  reason: collision with root package name */
        public final float f31548e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f31547d = bVar;
            this.f31544a = kVar;
            this.f31548e = f10;
            this.f31546c = rectF;
            this.f31545b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f31531a[i10] = new m();
            this.f31532b[i10] = new Matrix();
            this.f31533c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (i10 + 1) * 90;
    }

    private void b(c cVar, int i10) {
        this.f31538h[0] = this.f31531a[i10].k();
        this.f31538h[1] = this.f31531a[i10].l();
        this.f31532b[i10].mapPoints(this.f31538h);
        if (i10 == 0) {
            Path path = cVar.f31545b;
            float[] fArr = this.f31538h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f31545b;
            float[] fArr2 = this.f31538h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f31531a[i10].d(this.f31532b[i10], cVar.f31545b);
        b bVar = cVar.f31547d;
        if (bVar != null) {
            bVar.a(this.f31531a[i10], this.f31532b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f31538h[0] = this.f31531a[i10].i();
        this.f31538h[1] = this.f31531a[i10].j();
        this.f31532b[i10].mapPoints(this.f31538h);
        this.f31539i[0] = this.f31531a[i11].k();
        this.f31539i[1] = this.f31531a[i11].l();
        this.f31532b[i11].mapPoints(this.f31539i);
        float[] fArr = this.f31538h;
        float f10 = fArr[0];
        float[] fArr2 = this.f31539i;
        float max = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i12 = i(cVar.f31546c, i10);
        this.f31537g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f31544a);
        j10.d(max, i12, cVar.f31548e, this.f31537g);
        this.f31540j.reset();
        this.f31537g.d(this.f31533c[i10], this.f31540j);
        if (this.f31542l && Build.VERSION.SDK_INT >= 19 && (j10.c() || l(this.f31540j, i10) || l(this.f31540j, i11))) {
            Path path = this.f31540j;
            path.op(path, this.f31536f, Path.Op.DIFFERENCE);
            this.f31538h[0] = this.f31537g.k();
            this.f31538h[1] = this.f31537g.l();
            this.f31533c[i10].mapPoints(this.f31538h);
            Path path2 = this.f31535e;
            float[] fArr3 = this.f31538h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f31537g.d(this.f31533c[i10], this.f31535e);
        } else {
            this.f31537g.d(this.f31533c[i10], cVar.f31545b);
        }
        b bVar = cVar.f31547d;
        if (bVar != null) {
            bVar.b(this.f31537g, this.f31533c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private u5.c g(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.t();
                }
                return kVar.r();
            }
            return kVar.j();
        }
        return kVar.l();
    }

    private d h(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.s();
                }
                return kVar.q();
            }
            return kVar.i();
        }
        return kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f31538h;
        m[] mVarArr = this.f31531a;
        fArr[0] = mVarArr[i10].f31551c;
        fArr[1] = mVarArr[i10].f31552d;
        this.f31532b[i10].mapPoints(fArr);
        if (i10 != 1 && i10 != 3) {
            return Math.abs(rectF.centerY() - this.f31538h[1]);
        }
        return Math.abs(rectF.centerX() - this.f31538h[0]);
    }

    private f j(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.o();
                }
                return kVar.p();
            }
            return kVar.n();
        }
        return kVar.h();
    }

    public static l k() {
        return a.f31543a;
    }

    private boolean l(Path path, int i10) {
        this.f31541k.reset();
        this.f31531a[i10].d(this.f31532b[i10], this.f31541k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f31541k.computeBounds(rectF, true);
        path.op(this.f31541k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f31544a).b(this.f31531a[i10], 90.0f, cVar.f31548e, cVar.f31546c, g(i10, cVar.f31544a));
        float a10 = a(i10);
        this.f31532b[i10].reset();
        f(i10, cVar.f31546c, this.f31534d);
        Matrix matrix = this.f31532b[i10];
        PointF pointF = this.f31534d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f31532b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f31538h[0] = this.f31531a[i10].i();
        this.f31538h[1] = this.f31531a[i10].j();
        this.f31532b[i10].mapPoints(this.f31538h);
        float a10 = a(i10);
        this.f31533c[i10].reset();
        Matrix matrix = this.f31533c[i10];
        float[] fArr = this.f31538h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f31533c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f31535e.rewind();
        this.f31536f.rewind();
        this.f31536f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f31535e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f31535e.isEmpty()) {
            return;
        }
        path.op(this.f31535e, Path.Op.UNION);
    }
}
