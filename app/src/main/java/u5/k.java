package u5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* compiled from: ShapeAppearanceModel.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final u5.c f31506m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    d f31507a;

    /* renamed from: b  reason: collision with root package name */
    d f31508b;

    /* renamed from: c  reason: collision with root package name */
    d f31509c;

    /* renamed from: d  reason: collision with root package name */
    d f31510d;

    /* renamed from: e  reason: collision with root package name */
    u5.c f31511e;

    /* renamed from: f  reason: collision with root package name */
    u5.c f31512f;

    /* renamed from: g  reason: collision with root package name */
    u5.c f31513g;

    /* renamed from: h  reason: collision with root package name */
    u5.c f31514h;

    /* renamed from: i  reason: collision with root package name */
    f f31515i;

    /* renamed from: j  reason: collision with root package name */
    f f31516j;

    /* renamed from: k  reason: collision with root package name */
    f f31517k;

    /* renamed from: l  reason: collision with root package name */
    f f31518l;

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface c {
        u5.c a(u5.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new u5.a(i12));
    }

    private static b d(Context context, int i10, int i11, u5.c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, d5.k.W3);
        try {
            int i12 = obtainStyledAttributes.getInt(d5.k.X3, 0);
            int i13 = obtainStyledAttributes.getInt(d5.k.f24124a4, i12);
            int i14 = obtainStyledAttributes.getInt(d5.k.f24132b4, i12);
            int i15 = obtainStyledAttributes.getInt(d5.k.Z3, i12);
            int i16 = obtainStyledAttributes.getInt(d5.k.Y3, i12);
            u5.c m7 = m(obtainStyledAttributes, d5.k.f24140c4, cVar);
            u5.c m10 = m(obtainStyledAttributes, d5.k.f24164f4, m7);
            u5.c m11 = m(obtainStyledAttributes, d5.k.f24172g4, m7);
            u5.c m12 = m(obtainStyledAttributes, d5.k.f24156e4, m7);
            return new b().y(i13, m10).C(i14, m11).u(i15, m12).q(i16, m(obtainStyledAttributes, d5.k.f24148d4, m7));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new u5.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, u5.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d5.k.f24147d3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(d5.k.f24155e3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(d5.k.f24163f3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static u5.c m(TypedArray typedArray, int i10, u5.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new u5.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f31517k;
    }

    public d i() {
        return this.f31510d;
    }

    public u5.c j() {
        return this.f31514h;
    }

    public d k() {
        return this.f31509c;
    }

    public u5.c l() {
        return this.f31513g;
    }

    public f n() {
        return this.f31518l;
    }

    public f o() {
        return this.f31516j;
    }

    public f p() {
        return this.f31515i;
    }

    public d q() {
        return this.f31507a;
    }

    public u5.c r() {
        return this.f31511e;
    }

    public d s() {
        return this.f31508b;
    }

    public u5.c t() {
        return this.f31512f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f31518l.getClass().equals(f.class) && this.f31516j.getClass().equals(f.class) && this.f31515i.getClass().equals(f.class) && this.f31517k.getClass().equals(f.class);
        float a10 = this.f31511e.a(rectF);
        return z10 && ((this.f31512f.a(rectF) > a10 ? 1 : (this.f31512f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f31514h.a(rectF) > a10 ? 1 : (this.f31514h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f31513g.a(rectF) > a10 ? 1 : (this.f31513g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f31508b instanceof j) && (this.f31507a instanceof j) && (this.f31509c instanceof j) && (this.f31510d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(u5.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f31507a = bVar.f31519a;
        this.f31508b = bVar.f31520b;
        this.f31509c = bVar.f31521c;
        this.f31510d = bVar.f31522d;
        this.f31511e = bVar.f31523e;
        this.f31512f = bVar.f31524f;
        this.f31513g = bVar.f31525g;
        this.f31514h = bVar.f31526h;
        this.f31515i = bVar.f31527i;
        this.f31516j = bVar.f31528j;
        this.f31517k = bVar.f31529k;
        this.f31518l = bVar.f31530l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f31519a;

        /* renamed from: b  reason: collision with root package name */
        private d f31520b;

        /* renamed from: c  reason: collision with root package name */
        private d f31521c;

        /* renamed from: d  reason: collision with root package name */
        private d f31522d;

        /* renamed from: e  reason: collision with root package name */
        private u5.c f31523e;

        /* renamed from: f  reason: collision with root package name */
        private u5.c f31524f;

        /* renamed from: g  reason: collision with root package name */
        private u5.c f31525g;

        /* renamed from: h  reason: collision with root package name */
        private u5.c f31526h;

        /* renamed from: i  reason: collision with root package name */
        private f f31527i;

        /* renamed from: j  reason: collision with root package name */
        private f f31528j;

        /* renamed from: k  reason: collision with root package name */
        private f f31529k;

        /* renamed from: l  reason: collision with root package name */
        private f f31530l;

        public b() {
            this.f31519a = h.b();
            this.f31520b = h.b();
            this.f31521c = h.b();
            this.f31522d = h.b();
            this.f31523e = new u5.a(0.0f);
            this.f31524f = new u5.a(0.0f);
            this.f31525g = new u5.a(0.0f);
            this.f31526h = new u5.a(0.0f);
            this.f31527i = h.c();
            this.f31528j = h.c();
            this.f31529k = h.c();
            this.f31530l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f31505a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f31453a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f31523e = new u5.a(f10);
            return this;
        }

        public b B(u5.c cVar) {
            this.f31523e = cVar;
            return this;
        }

        public b C(int i10, u5.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f31520b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        public b E(float f10) {
            this.f31524f = new u5.a(f10);
            return this;
        }

        public b F(u5.c cVar) {
            this.f31524f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(u5.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, u5.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f31522d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f31526h = new u5.a(f10);
            return this;
        }

        public b t(u5.c cVar) {
            this.f31526h = cVar;
            return this;
        }

        public b u(int i10, u5.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f31521c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f31525g = new u5.a(f10);
            return this;
        }

        public b x(u5.c cVar) {
            this.f31525g = cVar;
            return this;
        }

        public b y(int i10, u5.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f31519a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                A(n10);
            }
            return this;
        }

        public b(k kVar) {
            this.f31519a = h.b();
            this.f31520b = h.b();
            this.f31521c = h.b();
            this.f31522d = h.b();
            this.f31523e = new u5.a(0.0f);
            this.f31524f = new u5.a(0.0f);
            this.f31525g = new u5.a(0.0f);
            this.f31526h = new u5.a(0.0f);
            this.f31527i = h.c();
            this.f31528j = h.c();
            this.f31529k = h.c();
            this.f31530l = h.c();
            this.f31519a = kVar.f31507a;
            this.f31520b = kVar.f31508b;
            this.f31521c = kVar.f31509c;
            this.f31522d = kVar.f31510d;
            this.f31523e = kVar.f31511e;
            this.f31524f = kVar.f31512f;
            this.f31525g = kVar.f31513g;
            this.f31526h = kVar.f31514h;
            this.f31527i = kVar.f31515i;
            this.f31528j = kVar.f31516j;
            this.f31529k = kVar.f31517k;
            this.f31530l = kVar.f31518l;
        }
    }

    public k() {
        this.f31507a = h.b();
        this.f31508b = h.b();
        this.f31509c = h.b();
        this.f31510d = h.b();
        this.f31511e = new u5.a(0.0f);
        this.f31512f = new u5.a(0.0f);
        this.f31513g = new u5.a(0.0f);
        this.f31514h = new u5.a(0.0f);
        this.f31515i = h.c();
        this.f31516j = h.c();
        this.f31517k = h.c();
        this.f31518l = h.c();
    }
}
