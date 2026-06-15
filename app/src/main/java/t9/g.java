package t9;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t9.h;
/* compiled from: Http2Connection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g implements Closeable {

    /* renamed from: z  reason: collision with root package name */
    private static final ExecutorService f31129z = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), o9.c.G("OkHttp Http2Connection", true));

    /* renamed from: a  reason: collision with root package name */
    final boolean f31130a;

    /* renamed from: b  reason: collision with root package name */
    final j f31131b;

    /* renamed from: d  reason: collision with root package name */
    final String f31133d;

    /* renamed from: e  reason: collision with root package name */
    int f31134e;

    /* renamed from: f  reason: collision with root package name */
    int f31135f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31136g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f31137h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f31138i;

    /* renamed from: j  reason: collision with root package name */
    final t9.l f31139j;

    /* renamed from: s  reason: collision with root package name */
    long f31148s;

    /* renamed from: u  reason: collision with root package name */
    final m f31150u;

    /* renamed from: v  reason: collision with root package name */
    final Socket f31151v;

    /* renamed from: w  reason: collision with root package name */
    final t9.j f31152w;

    /* renamed from: x  reason: collision with root package name */
    final l f31153x;

    /* renamed from: y  reason: collision with root package name */
    final Set<Integer> f31154y;

    /* renamed from: c  reason: collision with root package name */
    final Map<Integer, t9.i> f31132c = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    private long f31140k = 0;

    /* renamed from: l  reason: collision with root package name */
    private long f31141l = 0;

    /* renamed from: m  reason: collision with root package name */
    private long f31142m = 0;

    /* renamed from: n  reason: collision with root package name */
    private long f31143n = 0;

    /* renamed from: o  reason: collision with root package name */
    private long f31144o = 0;

    /* renamed from: p  reason: collision with root package name */
    private long f31145p = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f31146q = 0;

    /* renamed from: r  reason: collision with root package name */
    long f31147r = 0;

    /* renamed from: t  reason: collision with root package name */
    m f31149t = new m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class a extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t9.b f31156c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i10, t9.b bVar) {
            super(str, objArr);
            this.f31155b = i10;
            this.f31156c = bVar;
        }

        @Override // o9.b
        public void k() {
            try {
                g.this.O0(this.f31155b, this.f31156c);
            } catch (IOException unused) {
                g.this.K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class b extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f31159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f31158b = i10;
            this.f31159c = j10;
        }

        @Override // o9.b
        public void k() {
            try {
                g.this.f31152w.L(this.f31158b, this.f31159c);
            } catch (IOException unused) {
                g.this.K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class c extends o9.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // o9.b
        public void k() {
            g.this.N0(false, 2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class d extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f31163c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f31162b = i10;
            this.f31163c = list;
        }

        @Override // o9.b
        public void k() {
            if (g.this.f31139j.b(this.f31162b, this.f31163c)) {
                try {
                    g.this.f31152w.G(this.f31162b, t9.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f31154y.remove(Integer.valueOf(this.f31162b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class e extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f31166c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f31167d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f31165b = i10;
            this.f31166c = list;
            this.f31167d = z10;
        }

        @Override // o9.b
        public void k() {
            boolean c10 = g.this.f31139j.c(this.f31165b, this.f31166c, this.f31167d);
            if (c10) {
                try {
                    g.this.f31152w.G(this.f31165b, t9.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (c10 || this.f31167d) {
                synchronized (g.this) {
                    g.this.f31154y.remove(Integer.valueOf(this.f31165b));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class f extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31169b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ y9.c f31170c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31171d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f31172e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i10, y9.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f31169b = i10;
            this.f31170c = cVar;
            this.f31171d = i11;
            this.f31172e = z10;
        }

        @Override // o9.b
        public void k() {
            try {
                boolean a10 = g.this.f31139j.a(this.f31169b, this.f31170c, this.f31171d, this.f31172e);
                if (a10) {
                    g.this.f31152w.G(this.f31169b, t9.b.CANCEL);
                }
                if (a10 || this.f31172e) {
                    synchronized (g.this) {
                        g.this.f31154y.remove(Integer.valueOf(this.f31169b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: t9.g$g  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class C0360g extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31174b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t9.b f31175c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0360g(String str, Object[] objArr, int i10, t9.b bVar) {
            super(str, objArr);
            this.f31174b = i10;
            this.f31175c = bVar;
        }

        @Override // o9.b
        public void k() {
            g.this.f31139j.d(this.f31174b, this.f31175c);
            synchronized (g.this) {
                g.this.f31154y.remove(Integer.valueOf(this.f31174b));
            }
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        Socket f31177a;

        /* renamed from: b  reason: collision with root package name */
        String f31178b;

        /* renamed from: c  reason: collision with root package name */
        y9.e f31179c;

        /* renamed from: d  reason: collision with root package name */
        y9.d f31180d;

        /* renamed from: e  reason: collision with root package name */
        j f31181e = j.f31186a;

        /* renamed from: f  reason: collision with root package name */
        t9.l f31182f = t9.l.f31247a;

        /* renamed from: g  reason: collision with root package name */
        boolean f31183g;

        /* renamed from: h  reason: collision with root package name */
        int f31184h;

        public h(boolean z10) {
            this.f31183g = z10;
        }

        public g a() {
            return new g(this);
        }

        public h b(j jVar) {
            this.f31181e = jVar;
            return this;
        }

        public h c(int i10) {
            this.f31184h = i10;
            return this;
        }

        public h d(Socket socket, String str, y9.e eVar, y9.d dVar) {
            this.f31177a = socket;
            this.f31178b = str;
            this.f31179c = eVar;
            this.f31180d = dVar;
            return this;
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    final class i extends o9.b {
        i() {
            super("OkHttp %s ping", g.this.f31133d);
        }

        @Override // o9.b
        public void k() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f31141l < g.this.f31140k) {
                    z10 = true;
                } else {
                    g.k(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.K();
            } else {
                g.this.N0(false, 1, 0);
            }
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public static final j f31186a = new a();

        /* compiled from: Http2Connection.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class a extends j {
            a() {
            }

            @Override // t9.g.j
            public void b(t9.i iVar) throws IOException {
                iVar.f(t9.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void b(t9.i iVar) throws IOException;
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    final class k extends o9.b {

        /* renamed from: b  reason: collision with root package name */
        final boolean f31187b;

        /* renamed from: c  reason: collision with root package name */
        final int f31188c;

        /* renamed from: d  reason: collision with root package name */
        final int f31189d;

        k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f31133d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f31187b = z10;
            this.f31188c = i10;
            this.f31189d = i11;
        }

        @Override // o9.b
        public void k() {
            g.this.N0(this.f31187b, this.f31188c, this.f31189d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class l extends o9.b implements h.b {

        /* renamed from: b  reason: collision with root package name */
        final t9.h f31191b;

        /* compiled from: Http2Connection.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class a extends o9.b {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t9.i f31193b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, t9.i iVar) {
                super(str, objArr);
                this.f31193b = iVar;
            }

            @Override // o9.b
            public void k() {
                try {
                    g.this.f31131b.b(this.f31193b);
                } catch (IOException e8) {
                    v9.g l10 = v9.g.l();
                    l10.t(4, "Http2Connection.Listener failure for " + g.this.f31133d, e8);
                    try {
                        this.f31193b.f(t9.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class b extends o9.b {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f31195b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ m f31196c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f31195b = z10;
                this.f31196c = mVar;
            }

            @Override // o9.b
            public void k() {
                l.this.l(this.f31195b, this.f31196c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Http2Connection.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public class c extends o9.b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // o9.b
            public void k() {
                g gVar = g.this;
                gVar.f31131b.a(gVar);
            }
        }

        l(t9.h hVar) {
            super("OkHttp %s", g.this.f31133d);
            this.f31191b = hVar;
        }

        @Override // t9.h.b
        public void a(boolean z10, int i10, int i11, List<t9.c> list) {
            if (g.this.D0(i10)) {
                g.this.y0(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                t9.i L = g.this.L(i10);
                if (L == null) {
                    if (g.this.f31136g) {
                        return;
                    }
                    g gVar = g.this;
                    if (i10 <= gVar.f31134e) {
                        return;
                    }
                    if (i10 % 2 == gVar.f31135f % 2) {
                        return;
                    }
                    t9.i iVar = new t9.i(i10, g.this, false, z10, o9.c.H(list));
                    g gVar2 = g.this;
                    gVar2.f31134e = i10;
                    gVar2.f31132c.put(Integer.valueOf(i10), iVar);
                    g.f31129z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f31133d, Integer.valueOf(i10)}, iVar));
                    return;
                }
                L.q(list);
                if (z10) {
                    L.p();
                }
            }
        }

        @Override // t9.h.b
        public void b(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f31148s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            t9.i L = g.this.L(i10);
            if (L != null) {
                synchronized (L) {
                    L.c(j10);
                }
            }
        }

        @Override // t9.h.b
        public void c(boolean z10, m mVar) {
            try {
                g.this.f31137h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f31133d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // t9.h.b
        public void d(int i10, t9.b bVar, y9.f fVar) {
            t9.i[] iVarArr;
            fVar.r();
            synchronized (g.this) {
                iVarArr = (t9.i[]) g.this.f31132c.values().toArray(new t9.i[g.this.f31132c.size()]);
                g.this.f31136g = true;
            }
            for (t9.i iVar : iVarArr) {
                if (iVar.i() > i10 && iVar.l()) {
                    iVar.r(t9.b.REFUSED_STREAM);
                    g.this.G0(iVar.i());
                }
            }
        }

        @Override // t9.h.b
        public void e(boolean z10, int i10, y9.e eVar, int i11) throws IOException {
            if (g.this.D0(i10)) {
                g.this.n0(i10, eVar, i11, z10);
                return;
            }
            t9.i L = g.this.L(i10);
            if (L == null) {
                g.this.P0(i10, t9.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.L0(j10);
                eVar.c(j10);
                return;
            }
            L.o(eVar, i11);
            if (z10) {
                L.p();
            }
        }

        @Override // t9.h.b
        public void f(int i10, t9.b bVar) {
            if (g.this.D0(i10)) {
                g.this.C0(i10, bVar);
                return;
            }
            t9.i G0 = g.this.G0(i10);
            if (G0 != null) {
                G0.r(bVar);
            }
        }

        @Override // t9.h.b
        public void g(int i10, int i11, List<t9.c> list) {
            g.this.z0(i11, list);
        }

        @Override // t9.h.b
        public void h() {
        }

        @Override // t9.h.b
        public void i(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (g.this) {
                    try {
                        if (i10 == 1) {
                            g.f(g.this);
                        } else if (i10 == 2) {
                            g.F(g.this);
                        } else if (i10 == 3) {
                            g.G(g.this);
                            g.this.notifyAll();
                        }
                    } finally {
                    }
                }
                return;
            }
            try {
                g.this.f31137h.execute(new k(true, i10, i11));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // t9.h.b
        public void j(int i10, int i11, int i12, boolean z10) {
        }

        @Override // o9.b
        protected void k() {
            t9.b bVar;
            t9.b bVar2 = t9.b.INTERNAL_ERROR;
            try {
                try {
                    this.f31191b.f(this);
                    while (this.f31191b.b(false, this)) {
                    }
                    bVar = t9.b.NO_ERROR;
                    try {
                        try {
                            g.this.J(bVar, t9.b.CANCEL);
                        } catch (IOException unused) {
                            t9.b bVar3 = t9.b.PROTOCOL_ERROR;
                            g.this.J(bVar3, bVar3);
                            o9.c.g(this.f31191b);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            g.this.J(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        o9.c.g(this.f31191b);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                bVar = bVar2;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                g.this.J(bVar, bVar2);
                o9.c.g(this.f31191b);
                throw th;
            }
            o9.c.g(this.f31191b);
        }

        void l(boolean z10, m mVar) {
            t9.i[] iVarArr;
            long j10;
            synchronized (g.this.f31152w) {
                synchronized (g.this) {
                    int d10 = g.this.f31150u.d();
                    if (z10) {
                        g.this.f31150u.a();
                    }
                    g.this.f31150u.h(mVar);
                    int d11 = g.this.f31150u.d();
                    iVarArr = null;
                    if (d11 == -1 || d11 == d10) {
                        j10 = 0;
                    } else {
                        j10 = d11 - d10;
                        if (!g.this.f31132c.isEmpty()) {
                            iVarArr = (t9.i[]) g.this.f31132c.values().toArray(new t9.i[g.this.f31132c.size()]);
                        }
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f31152w.a(gVar.f31150u);
                } catch (IOException unused) {
                    g.this.K();
                }
            }
            if (iVarArr != null) {
                for (t9.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.c(j10);
                    }
                }
            }
            g.f31129z.execute(new c("OkHttp %s settings", g.this.f31133d));
        }
    }

    g(h hVar) {
        m mVar = new m();
        this.f31150u = mVar;
        this.f31154y = new LinkedHashSet();
        this.f31139j = hVar.f31182f;
        boolean z10 = hVar.f31183g;
        this.f31130a = z10;
        this.f31131b = hVar.f31181e;
        int i10 = z10 ? 1 : 2;
        this.f31135f = i10;
        if (z10) {
            this.f31135f = i10 + 2;
        }
        if (z10) {
            this.f31149t.i(7, 16777216);
        }
        String str = hVar.f31178b;
        this.f31133d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, o9.c.G(o9.c.r("OkHttp %s Writer", str), false));
        this.f31137h = scheduledThreadPoolExecutor;
        if (hVar.f31184h != 0) {
            i iVar = new i();
            int i11 = hVar.f31184h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i11, i11, TimeUnit.MILLISECONDS);
        }
        this.f31138i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), o9.c.G(o9.c.r("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.f31148s = mVar.d();
        this.f31151v = hVar.f31177a;
        this.f31152w = new t9.j(hVar.f31180d, z10);
        this.f31153x = new l(new t9.h(hVar.f31179c, z10));
    }

    static /* synthetic */ long F(g gVar) {
        long j10 = gVar.f31143n;
        gVar.f31143n = 1 + j10;
        return j10;
    }

    static /* synthetic */ long G(g gVar) {
        long j10 = gVar.f31145p;
        gVar.f31145p = 1 + j10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        try {
            t9.b bVar = t9.b.PROTOCOL_ERROR;
            J(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x0073, TryCatch #1 {, blocks: (B:4:0x0006, B:24:0x004d, B:28:0x005c, B:25:0x0053, B:27:0x0057, B:32:0x0065, B:33:0x006c, B:5:0x0007, B:7:0x000e, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:14:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x004a, B:34:0x006d, B:35:0x0072), top: B:42:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private t9.i S(int r11, java.util.List<t9.c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            t9.j r7 = r10.f31152w
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L76
            int r0 = r10.f31135f     // Catch: java.lang.Throwable -> L73
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            t9.b r0 = t9.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L73
            r10.I0(r0)     // Catch: java.lang.Throwable -> L73
        L13:
            boolean r0 = r10.f31136g     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6d
            int r8 = r10.f31135f     // Catch: java.lang.Throwable -> L73
            int r0 = r8 + 2
            r10.f31135f = r0     // Catch: java.lang.Throwable -> L73
            t9.i r9 = new t9.i     // Catch: java.lang.Throwable -> L73
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L3a
            long r0 = r10.f31148s     // Catch: java.lang.Throwable -> L73
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3a
            long r0 = r9.f31211b     // Catch: java.lang.Throwable -> L73
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L38
            goto L3a
        L38:
            r13 = 0
            goto L3b
        L3a:
            r13 = 1
        L3b:
            boolean r0 = r9.m()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L4a
            java.util.Map<java.lang.Integer, t9.i> r0 = r10.f31132c     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L73
        L4a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L53
            t9.j r0 = r10.f31152w     // Catch: java.lang.Throwable -> L76
            r0.K(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L76
            goto L5c
        L53:
            boolean r0 = r10.f31130a     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L65
            t9.j r0 = r10.f31152w     // Catch: java.lang.Throwable -> L76
            r0.F(r11, r8, r12)     // Catch: java.lang.Throwable -> L76
        L5c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L64
            t9.j r11 = r10.f31152w
            r11.flush()
        L64:
            return r9
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L76
        L6d:
            t9.a r11 = new t9.a     // Catch: java.lang.Throwable -> L73
            r11.<init>()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L76
        L76:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g.S(int, java.util.List, boolean):t9.i");
    }

    static /* synthetic */ long f(g gVar) {
        long j10 = gVar.f31141l;
        gVar.f31141l = 1 + j10;
        return j10;
    }

    static /* synthetic */ long k(g gVar) {
        long j10 = gVar.f31140k;
        gVar.f31140k = 1 + j10;
        return j10;
    }

    private synchronized void o0(o9.b bVar) {
        if (!this.f31136g) {
            this.f31138i.execute(bVar);
        }
    }

    void C0(int i10, t9.b bVar) {
        o0(new C0360g("OkHttp %s Push Reset[%s]", new Object[]{this.f31133d, Integer.valueOf(i10)}, i10, bVar));
    }

    boolean D0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized t9.i G0(int i10) {
        t9.i remove;
        remove = this.f31132c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0() {
        synchronized (this) {
            long j10 = this.f31143n;
            long j11 = this.f31142m;
            if (j10 < j11) {
                return;
            }
            this.f31142m = j11 + 1;
            this.f31146q = System.nanoTime() + 1000000000;
            try {
                this.f31137h.execute(new c("OkHttp %s ping", this.f31133d));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void I0(t9.b bVar) throws IOException {
        synchronized (this.f31152w) {
            synchronized (this) {
                if (this.f31136g) {
                    return;
                }
                this.f31136g = true;
                this.f31152w.t(this.f31134e, bVar, o9.c.f29472a);
            }
        }
    }

    void J(t9.b bVar, t9.b bVar2) throws IOException {
        t9.i[] iVarArr = null;
        try {
            I0(bVar);
            e = null;
        } catch (IOException e8) {
            e = e8;
        }
        synchronized (this) {
            if (!this.f31132c.isEmpty()) {
                iVarArr = (t9.i[]) this.f31132c.values().toArray(new t9.i[this.f31132c.size()]);
                this.f31132c.clear();
            }
        }
        if (iVarArr != null) {
            for (t9.i iVar : iVarArr) {
                try {
                    iVar.f(bVar2);
                } catch (IOException e10) {
                    if (e != null) {
                        e = e10;
                    }
                }
            }
        }
        try {
            this.f31152w.close();
        } catch (IOException e11) {
            if (e == null) {
                e = e11;
            }
        }
        try {
            this.f31151v.close();
        } catch (IOException e12) {
            e = e12;
        }
        this.f31137h.shutdown();
        this.f31138i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void J0() throws IOException {
        K0(true);
    }

    void K0(boolean z10) throws IOException {
        if (z10) {
            this.f31152w.b();
            this.f31152w.J(this.f31149t);
            int d10 = this.f31149t.d();
            if (d10 != 65535) {
                this.f31152w.L(0, d10 - 65535);
            }
        }
        new Thread(this.f31153x).start();
    }

    synchronized t9.i L(int i10) {
        return this.f31132c.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void L0(long j10) {
        long j11 = this.f31147r + j10;
        this.f31147r = j11;
        if (j11 >= this.f31149t.d() / 2) {
            Q0(0, this.f31147r);
            this.f31147r = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f31152w.z());
        r6 = r2;
        r8.f31148s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(int r9, boolean r10, y9.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            t9.j r12 = r8.f31152w
            r12.f(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f31148s     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, t9.i> r2 = r8.f31132c     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L56
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L56
            t9.j r4 = r8.f31152w     // Catch: java.lang.Throwable -> L56
            int r4 = r4.z()     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f31148s     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f31148s = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            t9.j r4 = r8.f31152w
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.f(r5, r9, r11, r2)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g.M0(int, boolean, y9.c, long):void");
    }

    void N0(boolean z10, int i10, int i11) {
        try {
            this.f31152w.E(z10, i10, i11);
        } catch (IOException unused) {
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(int i10, t9.b bVar) throws IOException {
        this.f31152w.G(i10, bVar);
    }

    public synchronized boolean P(long j10) {
        if (this.f31136g) {
            return false;
        }
        if (this.f31143n < this.f31142m) {
            if (j10 >= this.f31146q) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(int i10, t9.b bVar) {
        try {
            this.f31137h.execute(new a("OkHttp %s stream %d", new Object[]{this.f31133d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(int i10, long j10) {
        try {
            this.f31137h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f31133d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public synchronized int R() {
        return this.f31150u.e(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public t9.i X(List<t9.c> list, boolean z10) throws IOException {
        return S(0, list, z10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        J(t9.b.NO_ERROR, t9.b.CANCEL);
    }

    public void flush() throws IOException {
        this.f31152w.flush();
    }

    void n0(int i10, y9.e eVar, int i11, boolean z10) throws IOException {
        y9.c cVar = new y9.c();
        long j10 = i11;
        eVar.Y(j10);
        eVar.H(cVar, j10);
        if (cVar.S() == j10) {
            o0(new f("OkHttp %s Push Data[%s]", new Object[]{this.f31133d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.S() + " != " + i11);
    }

    void y0(int i10, List<t9.c> list, boolean z10) {
        try {
            o0(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f31133d, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    void z0(int i10, List<t9.c> list) {
        synchronized (this) {
            if (this.f31154y.contains(Integer.valueOf(i10))) {
                P0(i10, t9.b.PROTOCOL_ERROR);
                return;
            }
            this.f31154y.add(Integer.valueOf(i10));
            try {
                o0(new d("OkHttp %s Push Request[%s]", new Object[]{this.f31133d, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
