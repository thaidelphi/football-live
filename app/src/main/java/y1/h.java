package y1;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t2.a;
import y1.f;
import y1.i;
/* compiled from: DecodeJob.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private w1.a A;
    private com.bumptech.glide.load.data.d<?> B;
    private volatile y1.f C;
    private volatile boolean D;
    private volatile boolean E;
    private boolean F;

    /* renamed from: d  reason: collision with root package name */
    private final e f32874d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.core.util.f<h<?>> f32875e;

    /* renamed from: h  reason: collision with root package name */
    private com.bumptech.glide.d f32878h;

    /* renamed from: i  reason: collision with root package name */
    private w1.f f32879i;

    /* renamed from: j  reason: collision with root package name */
    private com.bumptech.glide.g f32880j;

    /* renamed from: k  reason: collision with root package name */
    private n f32881k;

    /* renamed from: l  reason: collision with root package name */
    private int f32882l;

    /* renamed from: m  reason: collision with root package name */
    private int f32883m;

    /* renamed from: n  reason: collision with root package name */
    private j f32884n;

    /* renamed from: o  reason: collision with root package name */
    private w1.h f32885o;

    /* renamed from: p  reason: collision with root package name */
    private b<R> f32886p;

    /* renamed from: q  reason: collision with root package name */
    private int f32887q;

    /* renamed from: r  reason: collision with root package name */
    private EnumC0383h f32888r;

    /* renamed from: s  reason: collision with root package name */
    private g f32889s;

    /* renamed from: t  reason: collision with root package name */
    private long f32890t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f32891u;

    /* renamed from: v  reason: collision with root package name */
    private Object f32892v;

    /* renamed from: w  reason: collision with root package name */
    private Thread f32893w;

    /* renamed from: x  reason: collision with root package name */
    private w1.f f32894x;

    /* renamed from: y  reason: collision with root package name */
    private w1.f f32895y;

    /* renamed from: z  reason: collision with root package name */
    private Object f32896z;

    /* renamed from: a  reason: collision with root package name */
    private final y1.g<R> f32871a = new y1.g<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<Throwable> f32872b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final t2.c f32873c = t2.c.a();

    /* renamed from: f  reason: collision with root package name */
    private final d<?> f32876f = new d<>();

    /* renamed from: g  reason: collision with root package name */
    private final f f32877g = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32897a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f32898b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f32899c;

        static {
            int[] iArr = new int[w1.c.values().length];
            f32899c = iArr;
            try {
                iArr[w1.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32899c[w1.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0383h.values().length];
            f32898b = iArr2;
            try {
                iArr2[EnumC0383h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32898b[EnumC0383h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32898b[EnumC0383h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32898b[EnumC0383h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32898b[EnumC0383h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f32897a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32897a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32897a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<R> {
        void a(q qVar);

        void b(h<?> hVar);

        void c(v<R> vVar, w1.a aVar, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        private final w1.a f32900a;

        c(w1.a aVar) {
            this.f32900a = aVar;
        }

        @Override // y1.i.a
        public v<Z> a(v<Z> vVar) {
            return h.this.w(this.f32900a, vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        private w1.f f32902a;

        /* renamed from: b  reason: collision with root package name */
        private w1.k<Z> f32903b;

        /* renamed from: c  reason: collision with root package name */
        private u<Z> f32904c;

        d() {
        }

        void a() {
            this.f32902a = null;
            this.f32903b = null;
            this.f32904c = null;
        }

        void b(e eVar, w1.h hVar) {
            t2.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f32902a, new y1.e(this.f32903b, this.f32904c, hVar));
            } finally {
                this.f32904c.g();
                t2.b.d();
            }
        }

        boolean c() {
            return this.f32904c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(w1.f fVar, w1.k<X> kVar, u<X> uVar) {
            this.f32902a = fVar;
            this.f32903b = kVar;
            this.f32904c = uVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        a2.a a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f32905a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f32906b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32907c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f32907c || z10 || this.f32906b) && this.f32905a;
        }

        synchronized boolean b() {
            this.f32906b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f32907c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f32905a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f32906b = false;
            this.f32905a = false;
            this.f32907c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: y1.h$h  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum EnumC0383h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar, androidx.core.util.f<h<?>> fVar) {
        this.f32874d = eVar;
        this.f32875e = fVar;
    }

    private <Data, ResourceType> v<R> A(Data data, w1.a aVar, t<Data, ResourceType, R> tVar) throws q {
        w1.h m7 = m(aVar);
        com.bumptech.glide.load.data.e<Data> l10 = this.f32878h.i().l(data);
        try {
            return tVar.a(l10, m7, this.f32882l, this.f32883m, new c(aVar));
        } finally {
            l10.b();
        }
    }

    private void B() {
        int i10 = a.f32897a[this.f32889s.ordinal()];
        if (i10 == 1) {
            this.f32888r = l(EnumC0383h.INITIALIZE);
            this.C = k();
            z();
        } else if (i10 == 2) {
            z();
        } else if (i10 == 3) {
            j();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f32889s);
        }
    }

    private void C() {
        Throwable th;
        this.f32873c.c();
        if (this.D) {
            if (this.f32872b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f32872b;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.D = true;
    }

    private <Data> v<R> h(com.bumptech.glide.load.data.d<?> dVar, Data data, w1.a aVar) throws q {
        if (data == null) {
            return null;
        }
        try {
            long b10 = s2.f.b();
            v<R> i10 = i(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                p("Decoded result " + i10, b10);
            }
            return i10;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> i(Data data, w1.a aVar) throws q {
        return A(data, aVar, (t<Data, ?, R>) this.f32871a.h(data.getClass()));
    }

    private void j() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.f32890t;
            q("Retrieved data", j10, "data: " + this.f32896z + ", cache key: " + this.f32894x + ", fetcher: " + this.B);
        }
        v<R> vVar = null;
        try {
            vVar = h(this.B, this.f32896z, this.A);
        } catch (q e8) {
            e8.i(this.f32895y, this.A);
            this.f32872b.add(e8);
        }
        if (vVar != null) {
            s(vVar, this.A, this.F);
        } else {
            z();
        }
    }

    private y1.f k() {
        int i10 = a.f32898b[this.f32888r.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f32888r);
                }
                return new z(this.f32871a, this);
            }
            return new y1.c(this.f32871a, this);
        }
        return new w(this.f32871a, this);
    }

    private EnumC0383h l(EnumC0383h enumC0383h) {
        int i10 = a.f32898b[enumC0383h.ordinal()];
        if (i10 == 1) {
            if (this.f32884n.a()) {
                return EnumC0383h.DATA_CACHE;
            }
            return l(EnumC0383h.DATA_CACHE);
        } else if (i10 == 2) {
            return this.f32891u ? EnumC0383h.FINISHED : EnumC0383h.SOURCE;
        } else if (i10 == 3 || i10 == 4) {
            return EnumC0383h.FINISHED;
        } else {
            if (i10 == 5) {
                if (this.f32884n.b()) {
                    return EnumC0383h.RESOURCE_CACHE;
                }
                return l(EnumC0383h.RESOURCE_CACHE);
            }
            throw new IllegalArgumentException("Unrecognized stage: " + enumC0383h);
        }
    }

    private w1.h m(w1.a aVar) {
        w1.h hVar = this.f32885o;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = aVar == w1.a.RESOURCE_DISK_CACHE || this.f32871a.w();
        w1.g<Boolean> gVar = f2.m.f25339j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool == null || (bool.booleanValue() && !z10)) {
            w1.h hVar2 = new w1.h();
            hVar2.d(this.f32885o);
            hVar2.e(gVar, Boolean.valueOf(z10));
            return hVar2;
        }
        return hVar;
    }

    private int n() {
        return this.f32880j.ordinal();
    }

    private void p(String str, long j10) {
        q(str, j10, null);
    }

    private void q(String str, long j10, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(s2.f.a(j10));
        sb.append(", load key: ");
        sb.append(this.f32881k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void r(v<R> vVar, w1.a aVar, boolean z10) {
        C();
        this.f32886p.c(vVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void s(v<R> vVar, w1.a aVar, boolean z10) {
        if (vVar instanceof r) {
            ((r) vVar).initialize();
        }
        u uVar = 0;
        if (this.f32876f.c()) {
            vVar = u.e(vVar);
            uVar = vVar;
        }
        r(vVar, aVar, z10);
        this.f32888r = EnumC0383h.ENCODE;
        try {
            if (this.f32876f.c()) {
                this.f32876f.b(this.f32874d, this.f32885o);
            }
            u();
        } finally {
            if (uVar != 0) {
                uVar.g();
            }
        }
    }

    private void t() {
        C();
        this.f32886p.a(new q("Failed to load resource", new ArrayList(this.f32872b)));
        v();
    }

    private void u() {
        if (this.f32877g.b()) {
            y();
        }
    }

    private void v() {
        if (this.f32877g.c()) {
            y();
        }
    }

    private void y() {
        this.f32877g.e();
        this.f32876f.a();
        this.f32871a.a();
        this.D = false;
        this.f32878h = null;
        this.f32879i = null;
        this.f32885o = null;
        this.f32880j = null;
        this.f32881k = null;
        this.f32886p = null;
        this.f32888r = null;
        this.C = null;
        this.f32893w = null;
        this.f32894x = null;
        this.f32896z = null;
        this.A = null;
        this.B = null;
        this.f32890t = 0L;
        this.E = false;
        this.f32892v = null;
        this.f32872b.clear();
        this.f32875e.a(this);
    }

    private void z() {
        this.f32893w = Thread.currentThread();
        this.f32890t = s2.f.b();
        boolean z10 = false;
        while (!this.E && this.C != null && !(z10 = this.C.d())) {
            this.f32888r = l(this.f32888r);
            this.C = k();
            if (this.f32888r == EnumC0383h.SOURCE) {
                c();
                return;
            }
        }
        if ((this.f32888r == EnumC0383h.FINISHED || this.E) && !z10) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        EnumC0383h l10 = l(EnumC0383h.INITIALIZE);
        return l10 == EnumC0383h.RESOURCE_CACHE || l10 == EnumC0383h.DATA_CACHE;
    }

    @Override // y1.f.a
    public void a(w1.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, w1.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f32872b.add(qVar);
        if (Thread.currentThread() != this.f32893w) {
            this.f32889s = g.SWITCH_TO_SOURCE_SERVICE;
            this.f32886p.b(this);
            return;
        }
        z();
    }

    @Override // y1.f.a
    public void b(w1.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, w1.a aVar, w1.f fVar2) {
        this.f32894x = fVar;
        this.f32896z = obj;
        this.B = dVar;
        this.A = aVar;
        this.f32895y = fVar2;
        this.F = fVar != this.f32871a.c().get(0);
        if (Thread.currentThread() != this.f32893w) {
            this.f32889s = g.DECODE_DATA;
            this.f32886p.b(this);
            return;
        }
        t2.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            j();
        } finally {
            t2.b.d();
        }
    }

    @Override // y1.f.a
    public void c() {
        this.f32889s = g.SWITCH_TO_SOURCE_SERVICE;
        this.f32886p.b(this);
    }

    @Override // t2.a.f
    public t2.c d() {
        return this.f32873c;
    }

    public void f() {
        this.E = true;
        y1.f fVar = this.C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(h<?> hVar) {
        int n10 = n() - hVar.n();
        return n10 == 0 ? this.f32887q - hVar.f32887q : n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<R> o(com.bumptech.glide.d dVar, Object obj, n nVar, w1.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, w1.l<?>> map, boolean z10, boolean z11, boolean z12, w1.h hVar, b<R> bVar, int i12) {
        this.f32871a.u(dVar, obj, fVar, i10, i11, jVar, cls, cls2, gVar, hVar, map, z10, z11, this.f32874d);
        this.f32878h = dVar;
        this.f32879i = fVar;
        this.f32880j = gVar;
        this.f32881k = nVar;
        this.f32882l = i10;
        this.f32883m = i11;
        this.f32884n = jVar;
        this.f32891u = z12;
        this.f32885o = hVar;
        this.f32886p = bVar;
        this.f32887q = i12;
        this.f32889s = g.INITIALIZE;
        this.f32892v = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        t2.b.b("DecodeJob#run(model=%s)", this.f32892v);
        com.bumptech.glide.load.data.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    t();
                    if (dVar != null) {
                        dVar.b();
                    }
                    t2.b.d();
                    return;
                }
                B();
                if (dVar != null) {
                    dVar.b();
                }
                t2.b.d();
            } catch (y1.b e8) {
                throw e8;
            }
        }
    }

    <Z> v<Z> w(w1.a aVar, v<Z> vVar) {
        v<Z> vVar2;
        w1.l<Z> lVar;
        w1.c cVar;
        w1.f dVar;
        Class<?> cls = vVar.get().getClass();
        w1.k<Z> kVar = null;
        if (aVar != w1.a.RESOURCE_DISK_CACHE) {
            w1.l<Z> r10 = this.f32871a.r(cls);
            lVar = r10;
            vVar2 = r10.a(this.f32878h, vVar, this.f32882l, this.f32883m);
        } else {
            vVar2 = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.a();
        }
        if (this.f32871a.v(vVar2)) {
            kVar = this.f32871a.n(vVar2);
            cVar = kVar.a(this.f32885o);
        } else {
            cVar = w1.c.NONE;
        }
        w1.k kVar2 = kVar;
        if (this.f32884n.d(!this.f32871a.x(this.f32894x), aVar, cVar)) {
            if (kVar2 != null) {
                int i10 = a.f32899c[cVar.ordinal()];
                if (i10 == 1) {
                    dVar = new y1.d(this.f32894x, this.f32879i);
                } else if (i10 == 2) {
                    dVar = new x(this.f32871a.b(), this.f32894x, this.f32879i, this.f32882l, this.f32883m, lVar, cls, this.f32885o);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: " + cVar);
                }
                u e8 = u.e(vVar2);
                this.f32876f.d(dVar, kVar2, e8);
                return e8;
            }
            throw new i.d(vVar2.get().getClass());
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(boolean z10) {
        if (this.f32877g.d(z10)) {
            y();
        }
    }
}
