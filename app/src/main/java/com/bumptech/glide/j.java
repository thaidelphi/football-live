package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: RequestBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j<TranscodeType> extends o2.a<j<TranscodeType>> {
    protected static final o2.f O = new o2.f().g(y1.j.f32926c).U(g.LOW).b0(true);
    private final Context A;
    private final k B;
    private final Class<TranscodeType> C;
    private final b D;
    private final d E;
    private l<?, ? super TranscodeType> F;
    private Object G;
    private List<o2.e<TranscodeType>> H;
    private j<TranscodeType> I;
    private j<TranscodeType> J;
    private Float K;
    private boolean L = true;
    private boolean M;
    private boolean N;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10310a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10311b;

        static {
            int[] iArr = new int[g.values().length];
            f10311b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10311b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10311b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10311b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f10310a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10310a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10310a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10310a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10310a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10310a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10310a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10310a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    public j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.D = bVar;
        this.B = kVar;
        this.C = cls;
        this.A = context;
        this.F = kVar.p(cls);
        this.E = bVar.i();
        o0(kVar.n());
        c(kVar.o());
    }

    private o2.c j0(p2.h<TranscodeType> hVar, o2.e<TranscodeType> eVar, o2.a<?> aVar, Executor executor) {
        return k0(new Object(), hVar, eVar, null, this.F, aVar.u(), aVar.r(), aVar.q(), aVar, executor);
    }

    private o2.c k0(Object obj, p2.h<TranscodeType> hVar, o2.e<TranscodeType> eVar, o2.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, o2.a<?> aVar, Executor executor) {
        o2.b bVar;
        o2.b bVar2;
        if (this.J != null) {
            bVar2 = new o2.b(obj, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        o2.c l02 = l0(obj, hVar, eVar, bVar2, lVar, gVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return l02;
        }
        int r10 = this.J.r();
        int q10 = this.J.q();
        if (s2.k.t(i10, i11) && !this.J.L()) {
            r10 = aVar.r();
            q10 = aVar.q();
        }
        j<TranscodeType> jVar = this.J;
        o2.b bVar3 = bVar;
        bVar3.o(l02, jVar.k0(obj, hVar, eVar, bVar3, jVar.F, jVar.u(), r10, q10, this.J, executor));
        return bVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [o2.a] */
    private o2.c l0(Object obj, p2.h<TranscodeType> hVar, o2.e<TranscodeType> eVar, o2.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, o2.a<?> aVar, Executor executor) {
        g n02;
        j<TranscodeType> jVar = this.I;
        if (jVar != null) {
            if (!this.N) {
                l<?, ? super TranscodeType> lVar2 = jVar.L ? lVar : jVar.F;
                if (jVar.E()) {
                    n02 = this.I.u();
                } else {
                    n02 = n0(gVar);
                }
                g gVar2 = n02;
                int r10 = this.I.r();
                int q10 = this.I.q();
                if (s2.k.t(i10, i11) && !this.I.L()) {
                    r10 = aVar.r();
                    q10 = aVar.q();
                }
                o2.i iVar = new o2.i(obj, dVar);
                o2.c y02 = y0(obj, hVar, eVar, aVar, iVar, lVar, gVar, i10, i11, executor);
                this.N = true;
                j<TranscodeType> jVar2 = this.I;
                o2.c k02 = jVar2.k0(obj, hVar, eVar, iVar, lVar2, gVar2, r10, q10, jVar2, executor);
                this.N = false;
                iVar.n(y02, k02);
                return iVar;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.K != null) {
            o2.i iVar2 = new o2.i(obj, dVar);
            iVar2.n(y0(obj, hVar, eVar, aVar, iVar2, lVar, gVar, i10, i11, executor), y0(obj, hVar, eVar, aVar.clone().a0(this.K.floatValue()), iVar2, lVar, n0(gVar), i10, i11, executor));
            return iVar2;
        } else {
            return y0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i10, i11, executor);
        }
    }

    private g n0(g gVar) {
        int i10 = a.f10311b[gVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalArgumentException("unknown priority: " + u());
                }
                return g.IMMEDIATE;
            }
            return g.HIGH;
        }
        return g.NORMAL;
    }

    @SuppressLint({"CheckResult"})
    private void o0(List<o2.e<Object>> list) {
        for (o2.e<Object> eVar : list) {
            h0(eVar);
        }
    }

    private <Y extends p2.h<TranscodeType>> Y r0(Y y10, o2.e<TranscodeType> eVar, o2.a<?> aVar, Executor executor) {
        s2.j.d(y10);
        if (this.M) {
            o2.c j02 = j0(y10, eVar, aVar, executor);
            o2.c e8 = y10.e();
            if (j02.g(e8) && !t0(aVar, e8)) {
                if (!((o2.c) s2.j.d(e8)).isRunning()) {
                    e8.j();
                }
                return y10;
            }
            this.B.m(y10);
            y10.c(j02);
            this.B.x(y10, j02);
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean t0(o2.a<?> aVar, o2.c cVar) {
        return !aVar.D() && cVar.h();
    }

    private j<TranscodeType> x0(Object obj) {
        if (C()) {
            return e().x0(obj);
        }
        this.G = obj;
        this.M = true;
        return X();
    }

    private o2.c y0(Object obj, p2.h<TranscodeType> hVar, o2.e<TranscodeType> eVar, o2.a<?> aVar, o2.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.A;
        d dVar2 = this.E;
        return o2.h.x(context, dVar2, obj, this.G, this.C, aVar, i10, i11, gVar, hVar, eVar, this.H, dVar, dVar2.f(), lVar.d(), executor);
    }

    public j<TranscodeType> h0(o2.e<TranscodeType> eVar) {
        if (C()) {
            return e().h0(eVar);
        }
        if (eVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(eVar);
        }
        return X();
    }

    @Override // o2.a
    /* renamed from: i0 */
    public j<TranscodeType> c(o2.a<?> aVar) {
        s2.j.d(aVar);
        return (j) super.c(aVar);
    }

    @Override // o2.a
    /* renamed from: m0 */
    public j<TranscodeType> e() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.F = (l<?, ? super TranscodeType>) jVar.F.clone();
        if (jVar.H != null) {
            jVar.H = new ArrayList(jVar.H);
        }
        j<TranscodeType> jVar2 = jVar.I;
        if (jVar2 != null) {
            jVar.I = jVar2.e();
        }
        j<TranscodeType> jVar3 = jVar.J;
        if (jVar3 != null) {
            jVar.J = jVar3.e();
        }
        return jVar;
    }

    public <Y extends p2.h<TranscodeType>> Y p0(Y y10) {
        return (Y) q0(y10, null, s2.e.b());
    }

    <Y extends p2.h<TranscodeType>> Y q0(Y y10, o2.e<TranscodeType> eVar, Executor executor) {
        return (Y) r0(y10, eVar, this, executor);
    }

    public p2.i<ImageView, TranscodeType> s0(ImageView imageView) {
        j<TranscodeType> jVar;
        s2.k.a();
        s2.j.d(imageView);
        if (!K() && I() && imageView.getScaleType() != null) {
            switch (a.f10310a[imageView.getScaleType().ordinal()]) {
                case 1:
                    jVar = clone().N();
                    break;
                case 2:
                    jVar = clone().O();
                    break;
                case 3:
                case 4:
                case 5:
                    jVar = clone().P();
                    break;
                case 6:
                    jVar = clone().O();
                    break;
            }
            return (p2.i) r0(this.E.a(imageView, this.C), null, jVar, s2.e.b());
        }
        jVar = this;
        return (p2.i) r0(this.E.a(imageView, this.C), null, jVar, s2.e.b());
    }

    public j<TranscodeType> u0(Integer num) {
        return x0(num).c(o2.f.j0(r2.a.c(this.A)));
    }

    public j<TranscodeType> v0(Object obj) {
        return x0(obj);
    }

    public j<TranscodeType> w0(String str) {
        return x0(str);
    }
}
