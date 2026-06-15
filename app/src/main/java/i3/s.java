package i3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c3.g;
import e3.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.b;
/* compiled from: Uploader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26481a;

    /* renamed from: b  reason: collision with root package name */
    private final c3.e f26482b;

    /* renamed from: c  reason: collision with root package name */
    private final j3.d f26483c;

    /* renamed from: d  reason: collision with root package name */
    private final y f26484d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f26485e;

    /* renamed from: f  reason: collision with root package name */
    private final k3.b f26486f;

    /* renamed from: g  reason: collision with root package name */
    private final l3.a f26487g;

    /* renamed from: h  reason: collision with root package name */
    private final l3.a f26488h;

    /* renamed from: i  reason: collision with root package name */
    private final j3.c f26489i;

    public s(Context context, c3.e eVar, j3.d dVar, y yVar, Executor executor, k3.b bVar, l3.a aVar, l3.a aVar2, j3.c cVar) {
        this.f26481a = context;
        this.f26482b = eVar;
        this.f26483c = dVar;
        this.f26484d = yVar;
        this.f26485e = executor;
        this.f26486f = bVar;
        this.f26487g = aVar;
        this.f26488h = aVar2;
        this.f26489i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(b3.o oVar) {
        return Boolean.valueOf(this.f26483c.U(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(b3.o oVar) {
        return this.f26483c.Q(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, b3.o oVar, long j10) {
        this.f26483c.V(iterable);
        this.f26483c.k0(oVar, this.f26487g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f26483c.i(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f26489i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f26489i.b(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(b3.o oVar, long j10) {
        this.f26483c.k0(oVar, this.f26487g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(b3.o oVar, int i10) {
        this.f26484d.a(oVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final b3.o oVar, final int i10, Runnable runnable) {
        try {
            try {
                k3.b bVar = this.f26486f;
                final j3.d dVar = this.f26483c;
                Objects.requireNonNull(dVar);
                bVar.j(new b.a() { // from class: i3.i
                    @Override // k3.b.a
                    public final Object b() {
                        return Integer.valueOf(j3.d.this.h());
                    }
                });
                if (!k()) {
                    this.f26486f.j(new b.a() { // from class: i3.m
                        @Override // k3.b.a
                        public final Object b() {
                            Object s10;
                            s10 = s.this.s(oVar, i10);
                            return s10;
                        }
                    });
                } else {
                    u(oVar, i10);
                }
            } catch (k3.a unused) {
                this.f26484d.a(oVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public b3.i j(c3.m mVar) {
        k3.b bVar = this.f26486f;
        final j3.c cVar = this.f26489i;
        Objects.requireNonNull(cVar);
        return mVar.b(b3.i.a().i(this.f26487g.a()).k(this.f26488h.a()).j("GDT_CLIENT_METRICS").h(new b3.h(z2.b.b("proto"), ((e3.a) bVar.j(new b.a() { // from class: i3.r
            @Override // k3.b.a
            public final Object b() {
                return j3.c.this.f();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f26481a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public c3.g u(final b3.o oVar, int i10) {
        c3.g a10;
        c3.m mVar = this.f26482b.get(oVar.b());
        long j10 = 0;
        c3.g e8 = c3.g.e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f26486f.j(new b.a() { // from class: i3.k
                @Override // k3.b.a
                public final Object b() {
                    Boolean l10;
                    l10 = s.this.l(oVar);
                    return l10;
                }
            })).booleanValue()) {
                final Iterable<j3.k> iterable = (Iterable) this.f26486f.j(new b.a() { // from class: i3.l
                    @Override // k3.b.a
                    public final Object b() {
                        Iterable m7;
                        m7 = s.this.m(oVar);
                        return m7;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e8;
                }
                if (mVar == null) {
                    f3.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    a10 = c3.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (j3.k kVar : iterable) {
                        arrayList.add(kVar.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    a10 = mVar.a(c3.f.a().b(arrayList).c(oVar.c()).a());
                }
                e8 = a10;
                if (e8.c() == g.a.TRANSIENT_ERROR) {
                    this.f26486f.j(new b.a() { // from class: i3.p
                        @Override // k3.b.a
                        public final Object b() {
                            Object n10;
                            n10 = s.this.n(iterable, oVar, j11);
                            return n10;
                        }
                    });
                    this.f26484d.b(oVar, i10 + 1, true);
                    return e8;
                }
                this.f26486f.j(new b.a() { // from class: i3.o
                    @Override // k3.b.a
                    public final Object b() {
                        Object o10;
                        o10 = s.this.o(iterable);
                        return o10;
                    }
                });
                if (e8.c() == g.a.OK) {
                    j10 = Math.max(j11, e8.b());
                    if (oVar.e()) {
                        this.f26486f.j(new b.a() { // from class: i3.j
                            @Override // k3.b.a
                            public final Object b() {
                                Object p10;
                                p10 = s.this.p();
                                return p10;
                            }
                        });
                    }
                } else if (e8.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (j3.k kVar2 : iterable) {
                        String j12 = kVar2.b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f26486f.j(new b.a() { // from class: i3.q
                        @Override // k3.b.a
                        public final Object b() {
                            Object q10;
                            q10 = s.this.q(hashMap);
                            return q10;
                        }
                    });
                }
            }
            this.f26486f.j(new b.a() { // from class: i3.n
                @Override // k3.b.a
                public final Object b() {
                    Object r10;
                    r10 = s.this.r(oVar, j11);
                    return r10;
                }
            });
            return e8;
        }
    }

    public void v(final b3.o oVar, final int i10, final Runnable runnable) {
        this.f26485e.execute(new Runnable() { // from class: i3.h
            @Override // java.lang.Runnable
            public final void run() {
                s.this.t(oVar, i10, runnable);
            }
        });
    }
}
