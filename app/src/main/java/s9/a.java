package s9;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import n9.a0;
import n9.b0;
import n9.r;
import n9.v;
import n9.y;
import r9.h;
import r9.k;
import y9.i;
import y9.l;
import y9.r;
import y9.s;
import y9.t;
/* compiled from: Http1Codec.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a implements r9.c {

    /* renamed from: a  reason: collision with root package name */
    final v f30793a;

    /* renamed from: b  reason: collision with root package name */
    final q9.g f30794b;

    /* renamed from: c  reason: collision with root package name */
    final y9.e f30795c;

    /* renamed from: d  reason: collision with root package name */
    final y9.d f30796d;

    /* renamed from: e  reason: collision with root package name */
    int f30797e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f30798f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public abstract class b implements s {

        /* renamed from: a  reason: collision with root package name */
        protected final i f30799a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f30800b;

        /* renamed from: c  reason: collision with root package name */
        protected long f30801c;

        private b() {
            this.f30799a = new i(a.this.f30795c.e());
            this.f30801c = 0L;
        }

        @Override // y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            try {
                long H = a.this.f30795c.H(cVar, j10);
                if (H > 0) {
                    this.f30801c += H;
                }
                return H;
            } catch (IOException e8) {
                a(false, e8);
                throw e8;
            }
        }

        protected final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f30797e;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                aVar.g(this.f30799a);
                a aVar2 = a.this;
                aVar2.f30797e = 6;
                q9.g gVar = aVar2.f30794b;
                if (gVar != null) {
                    gVar.r(!z10, aVar2, this.f30801c, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + a.this.f30797e);
        }

        @Override // y9.s
        public t e() {
            return this.f30799a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        private final i f30803a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30804b;

        c() {
            this.f30803a = new i(a.this.f30796d.e());
        }

        @Override // y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            if (this.f30804b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f30796d.u0(j10);
            a.this.f30796d.B("\r\n");
            a.this.f30796d.A(cVar, j10);
            a.this.f30796d.B("\r\n");
        }

        @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f30804b) {
                return;
            }
            this.f30804b = true;
            a.this.f30796d.B("0\r\n\r\n");
            a.this.g(this.f30803a);
            a.this.f30797e = 3;
        }

        @Override // y9.r
        public t e() {
            return this.f30803a;
        }

        @Override // y9.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f30804b) {
                return;
            }
            a.this.f30796d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class d extends b {

        /* renamed from: e  reason: collision with root package name */
        private final n9.s f30806e;

        /* renamed from: f  reason: collision with root package name */
        private long f30807f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f30808g;

        d(n9.s sVar) {
            super();
            this.f30807f = -1L;
            this.f30808g = true;
            this.f30806e = sVar;
        }

        private void b() throws IOException {
            if (this.f30807f != -1) {
                a.this.f30795c.I();
            }
            try {
                this.f30807f = a.this.f30795c.E0();
                String trim = a.this.f30795c.I().trim();
                if (this.f30807f >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.f30807f == 0) {
                        this.f30808g = false;
                        r9.e.g(a.this.f30793a.k(), this.f30806e, a.this.n());
                        a(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f30807f + trim + "\"");
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // s9.a.b, y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.f30800b) {
                    if (this.f30808g) {
                        long j11 = this.f30807f;
                        if (j11 == 0 || j11 == -1) {
                            b();
                            if (!this.f30808g) {
                                return -1L;
                            }
                        }
                        long H = super.H(cVar, Math.min(j10, this.f30807f));
                        if (H != -1) {
                            this.f30807f -= H;
                            return H;
                        }
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        a(false, protocolException);
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f30800b) {
                return;
            }
            if (this.f30808g && !o9.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f30800b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class e implements r {

        /* renamed from: a  reason: collision with root package name */
        private final i f30810a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30811b;

        /* renamed from: c  reason: collision with root package name */
        private long f30812c;

        e(long j10) {
            this.f30810a = new i(a.this.f30796d.e());
            this.f30812c = j10;
        }

        @Override // y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            if (!this.f30811b) {
                o9.c.f(cVar.S(), 0L, j10);
                if (j10 <= this.f30812c) {
                    a.this.f30796d.A(cVar, j10);
                    this.f30812c -= j10;
                    return;
                }
                throw new ProtocolException("expected " + this.f30812c + " bytes but received " + j10);
            }
            throw new IllegalStateException("closed");
        }

        @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f30811b) {
                return;
            }
            this.f30811b = true;
            if (this.f30812c <= 0) {
                a.this.g(this.f30810a);
                a.this.f30797e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // y9.r
        public t e() {
            return this.f30810a;
        }

        @Override // y9.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f30811b) {
                return;
            }
            a.this.f30796d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class f extends b {

        /* renamed from: e  reason: collision with root package name */
        private long f30814e;

        f(long j10) throws IOException {
            super();
            this.f30814e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // s9.a.b, y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.f30800b) {
                    long j11 = this.f30814e;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long H = super.H(cVar, Math.min(j11, j10));
                    if (H != -1) {
                        long j12 = this.f30814e - H;
                        this.f30814e = j12;
                        if (j12 == 0) {
                            a(true, null);
                        }
                        return H;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f30800b) {
                return;
            }
            if (this.f30814e != 0 && !o9.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f30800b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class g extends b {

        /* renamed from: e  reason: collision with root package name */
        private boolean f30816e;

        g() {
            super();
        }

        @Override // s9.a.b, y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.f30800b) {
                    if (this.f30816e) {
                        return -1L;
                    }
                    long H = super.H(cVar, j10);
                    if (H == -1) {
                        this.f30816e = true;
                        a(true, null);
                        return -1L;
                    }
                    return H;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f30800b) {
                return;
            }
            if (!this.f30816e) {
                a(false, null);
            }
            this.f30800b = true;
        }
    }

    public a(v vVar, q9.g gVar, y9.e eVar, y9.d dVar) {
        this.f30793a = vVar;
        this.f30794b = gVar;
        this.f30795c = eVar;
        this.f30796d = dVar;
    }

    private String m() throws IOException {
        String u10 = this.f30795c.u(this.f30798f);
        this.f30798f -= u10.length();
        return u10;
    }

    @Override // r9.c
    public b0 a(a0 a0Var) throws IOException {
        q9.g gVar = this.f30794b;
        gVar.f30183f.q(gVar.f30182e);
        String t10 = a0Var.t("Content-Type");
        if (!r9.e.c(a0Var)) {
            return new h(t10, 0L, l.d(k(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.t("Transfer-Encoding"))) {
            return new h(t10, -1L, l.d(i(a0Var.R().i())));
        }
        long b10 = r9.e.b(a0Var);
        if (b10 != -1) {
            return new h(t10, b10, l.d(k(b10)));
        }
        return new h(t10, -1L, l.d(l()));
    }

    @Override // r9.c
    public void b() throws IOException {
        this.f30796d.flush();
    }

    @Override // r9.c
    public void c(y yVar) throws IOException {
        o(yVar.e(), r9.i.a(yVar, this.f30794b.d().p().b().type()));
    }

    @Override // r9.c
    public void cancel() {
        q9.c d10 = this.f30794b.d();
        if (d10 != null) {
            d10.c();
        }
    }

    @Override // r9.c
    public a0.a d(boolean z10) throws IOException {
        int i10 = this.f30797e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f30797e);
        }
        try {
            k a10 = k.a(m());
            a0.a j10 = new a0.a().n(a10.f30482a).g(a10.f30483b).k(a10.f30484c).j(n());
            if (z10 && a10.f30483b == 100) {
                return null;
            }
            if (a10.f30483b == 100) {
                this.f30797e = 3;
                return j10;
            }
            this.f30797e = 4;
            return j10;
        } catch (EOFException e8) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f30794b);
            iOException.initCause(e8);
            throw iOException;
        }
    }

    @Override // r9.c
    public void e() throws IOException {
        this.f30796d.flush();
    }

    @Override // r9.c
    public r f(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.c("Transfer-Encoding"))) {
            return h();
        }
        if (j10 != -1) {
            return j(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    void g(i iVar) {
        t i10 = iVar.i();
        iVar.j(t.f33397d);
        i10.a();
        i10.b();
    }

    public r h() {
        if (this.f30797e == 1) {
            this.f30797e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f30797e);
    }

    public s i(n9.s sVar) throws IOException {
        if (this.f30797e == 4) {
            this.f30797e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f30797e);
    }

    public r j(long j10) {
        if (this.f30797e == 1) {
            this.f30797e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f30797e);
    }

    public s k(long j10) throws IOException {
        if (this.f30797e == 4) {
            this.f30797e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f30797e);
    }

    public s l() throws IOException {
        if (this.f30797e == 4) {
            q9.g gVar = this.f30794b;
            if (gVar != null) {
                this.f30797e = 5;
                gVar.j();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f30797e);
    }

    public n9.r n() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String m7 = m();
            if (m7.length() != 0) {
                o9.a.f29470a.a(aVar, m7);
            } else {
                return aVar.d();
            }
        }
    }

    public void o(n9.r rVar, String str) throws IOException {
        if (this.f30797e == 0) {
            this.f30796d.B(str).B("\r\n");
            int g10 = rVar.g();
            for (int i10 = 0; i10 < g10; i10++) {
                this.f30796d.B(rVar.e(i10)).B(": ").B(rVar.i(i10)).B("\r\n");
            }
            this.f30796d.B("\r\n");
            this.f30797e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f30797e);
    }
}
