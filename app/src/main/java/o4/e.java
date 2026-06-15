package o4;

import a5.p0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import n4.i;
import n4.j;
import n4.l;
import n4.m;
import o4.e;
import q3.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CeaDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f29437a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<m> f29438b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f29439c;

    /* renamed from: d  reason: collision with root package name */
    private b f29440d;

    /* renamed from: e  reason: collision with root package name */
    private long f29441e;

    /* renamed from: f  reason: collision with root package name */
    private long f29442f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CeaDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends l implements Comparable<b> {

        /* renamed from: j  reason: collision with root package name */
        private long f29443j;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: w */
        public int compareTo(b bVar) {
            if (l() != bVar.l()) {
                return l() ? 1 : -1;
            }
            long j10 = this.f30093e - bVar.f30093e;
            if (j10 == 0) {
                j10 = this.f29443j - bVar.f29443j;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CeaDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends m {

        /* renamed from: f  reason: collision with root package name */
        private h.a<c> f29444f;

        public c(h.a<c> aVar) {
            this.f29444f = aVar;
        }

        @Override // q3.h
        public final void p() {
            this.f29444f.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f29437a.add(new b());
        }
        this.f29438b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f29438b.add(new c(new h.a() { // from class: o4.d
                @Override // q3.h.a
                public final void a(h hVar) {
                    e.this.n((e.c) hVar);
                }
            }));
        }
        this.f29439c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.g();
        this.f29437a.add(bVar);
    }

    @Override // n4.i
    public void a(long j10) {
        this.f29441e = j10;
    }

    protected abstract n4.h e();

    protected abstract void f(l lVar);

    @Override // q3.d
    public void flush() {
        this.f29442f = 0L;
        this.f29441e = 0L;
        while (!this.f29439c.isEmpty()) {
            m((b) p0.j(this.f29439c.poll()));
        }
        b bVar = this.f29440d;
        if (bVar != null) {
            m(bVar);
            this.f29440d = null;
        }
    }

    @Override // q3.d
    /* renamed from: g */
    public l d() throws j {
        a5.a.f(this.f29440d == null);
        if (this.f29437a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f29437a.pollFirst();
        this.f29440d = pollFirst;
        return pollFirst;
    }

    @Override // q3.d
    /* renamed from: h */
    public m b() throws j {
        if (this.f29438b.isEmpty()) {
            return null;
        }
        while (!this.f29439c.isEmpty() && ((b) p0.j(this.f29439c.peek())).f30093e <= this.f29441e) {
            b bVar = (b) p0.j(this.f29439c.poll());
            if (bVar.l()) {
                m mVar = (m) p0.j(this.f29438b.pollFirst());
                mVar.f(4);
                m(bVar);
                return mVar;
            }
            f(bVar);
            if (k()) {
                n4.h e8 = e();
                m mVar2 = (m) p0.j(this.f29438b.pollFirst());
                mVar2.q(bVar.f30093e, e8, Long.MAX_VALUE);
                m(bVar);
                return mVar2;
            }
            m(bVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m i() {
        return this.f29438b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long j() {
        return this.f29441e;
    }

    protected abstract boolean k();

    @Override // q3.d
    /* renamed from: l */
    public void c(l lVar) throws j {
        a5.a.a(lVar == this.f29440d);
        b bVar = (b) lVar;
        if (bVar.k()) {
            m(bVar);
        } else {
            long j10 = this.f29442f;
            this.f29442f = 1 + j10;
            bVar.f29443j = j10;
            this.f29439c.add(bVar);
        }
        this.f29440d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(m mVar) {
        mVar.g();
        this.f29438b.add(mVar);
    }

    @Override // q3.d
    public void release() {
    }
}
