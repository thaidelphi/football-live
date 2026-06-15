package u5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapePath.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f31549a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f31550b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f31551c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f31552d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f31553e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f31554f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f31555g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f31556h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f31557i;

    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f31559c;

        a(List list, Matrix matrix) {
            this.f31558b = list;
            this.f31559c = matrix;
        }

        @Override // u5.m.g
        public void a(Matrix matrix, t5.a aVar, int i10, Canvas canvas) {
            for (g gVar : this.f31558b) {
                gVar.a(this.f31559c, aVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f31561b;

        public b(d dVar) {
            this.f31561b = dVar;
        }

        @Override // u5.m.g
        public void a(Matrix matrix, t5.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f31561b.k(), this.f31561b.o(), this.f31561b.l(), this.f31561b.j()), i10, this.f31561b.m(), this.f31561b.n());
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f31562b;

        /* renamed from: c  reason: collision with root package name */
        private final float f31563c;

        /* renamed from: d  reason: collision with root package name */
        private final float f31564d;

        public c(e eVar, float f10, float f11) {
            this.f31562b = eVar;
            this.f31563c = f10;
            this.f31564d = f11;
        }

        @Override // u5.m.g
        public void a(Matrix matrix, t5.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f31562b.f31573c - this.f31564d, this.f31562b.f31572b - this.f31563c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f31563c, this.f31564d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f31562b.f31573c - this.f31564d) / (this.f31562b.f31572b - this.f31563c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f31565h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f31566b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f31567c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f31568d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f31569e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f31570f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f31571g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f31569e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f31566b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f31568d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f31570f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f31571g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f31567c;
        }

        private void p(float f10) {
            this.f31569e = f10;
        }

        private void q(float f10) {
            this.f31566b = f10;
        }

        private void r(float f10) {
            this.f31568d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f31570f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f31571g = f10;
        }

        private void u(float f10) {
            this.f31567c = f10;
        }

        @Override // u5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f31574a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f31565h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        private float f31572b;

        /* renamed from: c  reason: collision with root package name */
        private float f31573c;

        @Override // u5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f31574a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f31572b, this.f31573c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f31574a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f31575a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, t5.a aVar, int i10, Canvas canvas);

        public final void b(t5.a aVar, int i10, Canvas canvas) {
            a(f31575a, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f31556h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f31556h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f31553e;
    }

    private float h() {
        return this.f31554f;
    }

    private void p(float f10) {
        this.f31553e = f10;
    }

    private void q(float f10) {
        this.f31554f = f10;
    }

    private void r(float f10) {
        this.f31551c = f10;
    }

    private void s(float f10) {
        this.f31552d = f10;
    }

    private void t(float f10) {
        this.f31549a = f10;
    }

    private void u(float f10) {
        this.f31550b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f31555g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f31555g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31555g.get(i10).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f31557i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f31556h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f31551c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f31552d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.f31549a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f31550b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f31572b = f10;
        eVar.f31573c = f11;
        this.f31555g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f31555g.clear();
        this.f31556h.clear();
        this.f31557i = false;
    }
}
