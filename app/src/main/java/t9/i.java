package t9;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import n9.r;
import t9.c;
import y9.s;
import y9.t;
/* compiled from: Http2Stream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    long f31210a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f31211b;

    /* renamed from: c  reason: collision with root package name */
    final int f31212c;

    /* renamed from: d  reason: collision with root package name */
    final g f31213d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<r> f31214e;

    /* renamed from: f  reason: collision with root package name */
    private c.a f31215f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31216g;

    /* renamed from: h  reason: collision with root package name */
    private final b f31217h;

    /* renamed from: i  reason: collision with root package name */
    final a f31218i;

    /* renamed from: j  reason: collision with root package name */
    final c f31219j;

    /* renamed from: k  reason: collision with root package name */
    final c f31220k;

    /* renamed from: l  reason: collision with root package name */
    t9.b f31221l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Stream.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class a implements y9.r {

        /* renamed from: a  reason: collision with root package name */
        private final y9.c f31222a = new y9.c();

        /* renamed from: b  reason: collision with root package name */
        boolean f31223b;

        /* renamed from: c  reason: collision with root package name */
        boolean f31224c;

        a() {
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long min;
            i iVar2;
            synchronized (i.this) {
                i.this.f31220k.k();
                while (true) {
                    iVar = i.this;
                    if (iVar.f31211b > 0 || this.f31224c || this.f31223b || iVar.f31221l != null) {
                        break;
                    }
                    iVar.t();
                }
                iVar.f31220k.u();
                i.this.e();
                min = Math.min(i.this.f31211b, this.f31222a.S());
                iVar2 = i.this;
                iVar2.f31211b -= min;
            }
            iVar2.f31220k.k();
            try {
                i iVar3 = i.this;
                iVar3.f31213d.M0(iVar3.f31212c, z10 && min == this.f31222a.S(), this.f31222a, min);
            } finally {
                i.this.f31220k.u();
            }
        }

        @Override // y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            this.f31222a.A(cVar, j10);
            while (this.f31222a.S() >= 16384) {
                a(false);
            }
        }

        @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i.this) {
                if (this.f31223b) {
                    return;
                }
                if (!i.this.f31218i.f31224c) {
                    if (this.f31222a.S() > 0) {
                        while (this.f31222a.S() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.f31213d.M0(iVar.f31212c, true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f31223b = true;
                }
                i.this.f31213d.flush();
                i.this.d();
            }
        }

        @Override // y9.r
        public t e() {
            return i.this.f31220k;
        }

        @Override // y9.r, java.io.Flushable
        public void flush() throws IOException {
            synchronized (i.this) {
                i.this.e();
            }
            while (this.f31222a.S() > 0) {
                a(false);
                i.this.f31213d.flush();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http2Stream.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        private final y9.c f31226a = new y9.c();

        /* renamed from: b  reason: collision with root package name */
        private final y9.c f31227b = new y9.c();

        /* renamed from: c  reason: collision with root package name */
        private final long f31228c;

        /* renamed from: d  reason: collision with root package name */
        boolean f31229d;

        /* renamed from: e  reason: collision with root package name */
        boolean f31230e;

        b(long j10) {
            this.f31228c = j10;
        }

        private void b(long j10) {
            i.this.f31213d.L0(j10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // y9.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long H(y9.c r17, long r18) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t9.i.b.H(y9.c, long):long");
        }

        void a(y9.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f31230e;
                    z11 = true;
                    z12 = this.f31227b.S() + j10 > this.f31228c;
                }
                if (z12) {
                    eVar.c(j10);
                    i.this.h(t9.b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z10) {
                    eVar.c(j10);
                    return;
                } else {
                    long H = eVar.H(this.f31226a, j10);
                    if (H != -1) {
                        j10 -= H;
                        synchronized (i.this) {
                            if (this.f31229d) {
                                j11 = this.f31226a.S();
                                this.f31226a.f();
                            } else {
                                if (this.f31227b.S() != 0) {
                                    z11 = false;
                                }
                                this.f31227b.D0(this.f31226a);
                                if (z11) {
                                    i.this.notifyAll();
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 > 0) {
                            b(j11);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long S;
            c.a aVar;
            ArrayList<r> arrayList;
            synchronized (i.this) {
                this.f31229d = true;
                S = this.f31227b.S();
                this.f31227b.f();
                aVar = null;
                if (i.this.f31214e.isEmpty() || i.this.f31215f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(i.this.f31214e);
                    i.this.f31214e.clear();
                    aVar = i.this.f31215f;
                    arrayList = arrayList2;
                }
                i.this.notifyAll();
            }
            if (S > 0) {
                b(S);
            }
            i.this.d();
            if (aVar != null) {
                for (r rVar : arrayList) {
                    aVar.a(rVar);
                }
            }
        }

        @Override // y9.s
        public t e() {
            return i.this.f31219j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Stream.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class c extends y9.a {
        c() {
        }

        @Override // y9.a
        protected IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // y9.a
        protected void t() {
            i.this.h(t9.b.CANCEL);
            i.this.f31213d.H0();
        }

        public void u() throws IOException {
            if (n()) {
                throw o(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i10, g gVar, boolean z10, boolean z11, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f31214e = arrayDeque;
        this.f31219j = new c();
        this.f31220k = new c();
        this.f31221l = null;
        Objects.requireNonNull(gVar, "connection == null");
        this.f31212c = i10;
        this.f31213d = gVar;
        this.f31211b = gVar.f31150u.d();
        b bVar = new b(gVar.f31149t.d());
        this.f31217h = bVar;
        a aVar = new a();
        this.f31218i = aVar;
        bVar.f31230e = z11;
        aVar.f31224c = z10;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (l() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!l() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean g(t9.b bVar) {
        synchronized (this) {
            if (this.f31221l != null) {
                return false;
            }
            if (this.f31217h.f31230e && this.f31218i.f31224c) {
                return false;
            }
            this.f31221l = bVar;
            notifyAll();
            this.f31213d.G0(this.f31212c);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10) {
        this.f31211b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    void d() throws IOException {
        boolean z10;
        boolean m7;
        synchronized (this) {
            b bVar = this.f31217h;
            if (!bVar.f31230e && bVar.f31229d) {
                a aVar = this.f31218i;
                if (aVar.f31224c || aVar.f31223b) {
                    z10 = true;
                    m7 = m();
                }
            }
            z10 = false;
            m7 = m();
        }
        if (z10) {
            f(t9.b.CANCEL);
        } else if (m7) {
        } else {
            this.f31213d.G0(this.f31212c);
        }
    }

    void e() throws IOException {
        a aVar = this.f31218i;
        if (!aVar.f31223b) {
            if (!aVar.f31224c) {
                if (this.f31221l != null) {
                    throw new n(this.f31221l);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void f(t9.b bVar) throws IOException {
        if (g(bVar)) {
            this.f31213d.O0(this.f31212c, bVar);
        }
    }

    public void h(t9.b bVar) {
        if (g(bVar)) {
            this.f31213d.P0(this.f31212c, bVar);
        }
    }

    public int i() {
        return this.f31212c;
    }

    public y9.r j() {
        synchronized (this) {
            if (!this.f31216g && !l()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f31218i;
    }

    public s k() {
        return this.f31217h;
    }

    public boolean l() {
        return this.f31213d.f31130a == ((this.f31212c & 1) == 1);
    }

    public synchronized boolean m() {
        if (this.f31221l != null) {
            return false;
        }
        b bVar = this.f31217h;
        if (bVar.f31230e || bVar.f31229d) {
            a aVar = this.f31218i;
            if (aVar.f31224c || aVar.f31223b) {
                if (this.f31216g) {
                    return false;
                }
            }
        }
        return true;
    }

    public t n() {
        return this.f31219j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(y9.e eVar, int i10) throws IOException {
        this.f31217h.a(eVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        boolean m7;
        synchronized (this) {
            this.f31217h.f31230e = true;
            m7 = m();
            notifyAll();
        }
        if (m7) {
            return;
        }
        this.f31213d.G0(this.f31212c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(List<t9.c> list) {
        boolean m7;
        synchronized (this) {
            this.f31216g = true;
            this.f31214e.add(o9.c.H(list));
            m7 = m();
            notifyAll();
        }
        if (m7) {
            return;
        }
        this.f31213d.G0(this.f31212c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r(t9.b bVar) {
        if (this.f31221l == null) {
            this.f31221l = bVar;
            notifyAll();
        }
    }

    public synchronized r s() throws IOException {
        this.f31219j.k();
        while (this.f31214e.isEmpty() && this.f31221l == null) {
            t();
        }
        this.f31219j.u();
        if (!this.f31214e.isEmpty()) {
        } else {
            throw new n(this.f31221l);
        }
        return this.f31214e.removeFirst();
    }

    void t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t u() {
        return this.f31220k;
    }
}
