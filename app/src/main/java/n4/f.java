package n4;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import y5.q;
/* compiled from: ExoplayerCuesDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final c f28636a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final l f28637b = new l();

    /* renamed from: c  reason: collision with root package name */
    private final Deque<m> f28638c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f28639d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28640e;

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends m {
        a() {
        }

        @Override // q3.h
        public void p() {
            f.this.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private final long f28642a;

        /* renamed from: b  reason: collision with root package name */
        private final q<n4.b> f28643b;

        public b(long j10, q<n4.b> qVar) {
            this.f28642a = j10;
            this.f28643b = qVar;
        }

        @Override // n4.h
        public int a(long j10) {
            return this.f28642a > j10 ? 0 : -1;
        }

        @Override // n4.h
        public List<n4.b> b(long j10) {
            return j10 >= this.f28642a ? this.f28643b : q.p();
        }

        @Override // n4.h
        public long c(int i10) {
            a5.a.a(i10 == 0);
            return this.f28642a;
        }

        @Override // n4.h
        public int d() {
            return 1;
        }
    }

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f28638c.addFirst(new a());
        }
        this.f28639d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(m mVar) {
        a5.a.f(this.f28638c.size() < 2);
        a5.a.a(!this.f28638c.contains(mVar));
        mVar.g();
        this.f28638c.addFirst(mVar);
    }

    @Override // n4.i
    public void a(long j10) {
    }

    @Override // q3.d
    /* renamed from: f */
    public l d() throws j {
        a5.a.f(!this.f28640e);
        if (this.f28639d != 0) {
            return null;
        }
        this.f28639d = 1;
        return this.f28637b;
    }

    @Override // q3.d
    public void flush() {
        a5.a.f(!this.f28640e);
        this.f28637b.g();
        this.f28639d = 0;
    }

    @Override // q3.d
    /* renamed from: g */
    public m b() throws j {
        a5.a.f(!this.f28640e);
        if (this.f28639d != 2 || this.f28638c.isEmpty()) {
            return null;
        }
        m removeFirst = this.f28638c.removeFirst();
        if (this.f28637b.l()) {
            removeFirst.f(4);
        } else {
            l lVar = this.f28637b;
            removeFirst.q(this.f28637b.f30093e, new b(lVar.f30093e, this.f28636a.a(((ByteBuffer) a5.a.e(lVar.f30091c)).array())), 0L);
        }
        this.f28637b.g();
        this.f28639d = 0;
        return removeFirst;
    }

    @Override // q3.d
    /* renamed from: h */
    public void c(l lVar) throws j {
        a5.a.f(!this.f28640e);
        a5.a.f(this.f28639d == 1);
        a5.a.a(this.f28637b == lVar);
        this.f28639d = 2;
    }

    @Override // q3.d
    public void release() {
        this.f28640e = true;
    }
}
