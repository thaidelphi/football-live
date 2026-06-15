package n9;

import com.ironsource.in;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n9.a0;
import n9.r;
import n9.y;
import p9.d;
/* compiled from: Cache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    final p9.f f28716a;

    /* renamed from: b  reason: collision with root package name */
    final p9.d f28717b;

    /* renamed from: c  reason: collision with root package name */
    int f28718c;

    /* renamed from: d  reason: collision with root package name */
    int f28719d;

    /* renamed from: e  reason: collision with root package name */
    private int f28720e;

    /* renamed from: f  reason: collision with root package name */
    private int f28721f;

    /* renamed from: g  reason: collision with root package name */
    private int f28722g;

    /* compiled from: Cache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements p9.f {
        a() {
        }

        @Override // p9.f
        public a0 a(y yVar) throws IOException {
            return c.this.b(yVar);
        }

        @Override // p9.f
        public void b() {
            c.this.w();
        }

        @Override // p9.f
        public void c(p9.c cVar) {
            c.this.z(cVar);
        }

        @Override // p9.f
        public p9.b d(a0 a0Var) throws IOException {
            return c.this.j(a0Var);
        }

        @Override // p9.f
        public void e(y yVar) throws IOException {
            c.this.t(yVar);
        }

        @Override // p9.f
        public void f(a0 a0Var, a0 a0Var2) {
            c.this.E(a0Var, a0Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class b implements p9.b {

        /* renamed from: a  reason: collision with root package name */
        private final d.c f28724a;

        /* renamed from: b  reason: collision with root package name */
        private y9.r f28725b;

        /* renamed from: c  reason: collision with root package name */
        private y9.r f28726c;

        /* renamed from: d  reason: collision with root package name */
        boolean f28727d;

        /* compiled from: Cache.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class a extends y9.g {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f28729b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d.c f28730c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y9.r rVar, c cVar, d.c cVar2) {
                super(rVar);
                this.f28729b = cVar;
                this.f28730c = cVar2;
            }

            @Override // y9.g, y9.r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (c.this) {
                    b bVar = b.this;
                    if (bVar.f28727d) {
                        return;
                    }
                    bVar.f28727d = true;
                    c.this.f28718c++;
                    super.close();
                    this.f28730c.b();
                }
            }
        }

        b(d.c cVar) {
            this.f28724a = cVar;
            y9.r d10 = cVar.d(1);
            this.f28725b = d10;
            this.f28726c = new a(d10, c.this, cVar);
        }

        @Override // p9.b
        public void a() {
            synchronized (c.this) {
                if (this.f28727d) {
                    return;
                }
                this.f28727d = true;
                c.this.f28719d++;
                o9.c.g(this.f28725b);
                try {
                    this.f28724a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // p9.b
        public y9.r b() {
            return this.f28726c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.java */
    /* renamed from: n9.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class C0323c extends b0 {

        /* renamed from: a  reason: collision with root package name */
        final d.e f28732a;

        /* renamed from: b  reason: collision with root package name */
        private final y9.e f28733b;

        /* renamed from: c  reason: collision with root package name */
        private final String f28734c;

        /* renamed from: d  reason: collision with root package name */
        private final String f28735d;

        /* compiled from: Cache.java */
        /* renamed from: n9.c$c$a */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class a extends y9.h {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d.e f28736b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y9.s sVar, d.e eVar) {
                super(sVar);
                this.f28736b = eVar;
            }

            @Override // y9.h, y9.s, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f28736b.close();
                super.close();
            }
        }

        C0323c(d.e eVar, String str, String str2) {
            this.f28732a = eVar;
            this.f28734c = str;
            this.f28735d = str2;
            this.f28733b = y9.l.d(new a(eVar.b(1), eVar));
        }

        @Override // n9.b0
        public long b() {
            try {
                String str = this.f28735d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // n9.b0
        public u f() {
            String str = this.f28734c;
            if (str != null) {
                return u.d(str);
            }
            return null;
        }

        @Override // n9.b0
        public y9.e t() {
            return this.f28733b;
        }
    }

    public c(File file, long j10) {
        this(file, j10, u9.a.f31618a);
    }

    private void a(d.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public static String f(s sVar) {
        return y9.f.i(sVar.toString()).l().k();
    }

    static int k(y9.e eVar) throws IOException {
        try {
            long l02 = eVar.l0();
            String I = eVar.I();
            if (l02 < 0 || l02 > 2147483647L || !I.isEmpty()) {
                throw new IOException("expected an int but was \"" + l02 + I + "\"");
            }
            return (int) l02;
        } catch (NumberFormatException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    void E(a0 a0Var, a0 a0Var2) {
        d.c cVar;
        d dVar = new d(a0Var2);
        try {
            cVar = ((C0323c) a0Var.a()).f28732a.a();
            if (cVar != null) {
                try {
                    dVar.f(cVar);
                    cVar.b();
                } catch (IOException unused) {
                    a(cVar);
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        }
    }

    a0 b(y yVar) {
        try {
            d.e w10 = this.f28717b.w(f(yVar.i()));
            if (w10 == null) {
                return null;
            }
            try {
                d dVar = new d(w10.b(0));
                a0 d10 = dVar.d(w10);
                if (dVar.b(yVar, d10)) {
                    return d10;
                }
                o9.c.g(d10.a());
                return null;
            } catch (IOException unused) {
                o9.c.g(w10);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f28717b.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f28717b.flush();
    }

    p9.b j(a0 a0Var) {
        d.c cVar;
        String g10 = a0Var.R().g();
        if (r9.f.a(a0Var.R().g())) {
            try {
                t(a0Var.R());
            } catch (IOException unused) {
            }
            return null;
        } else if (!g10.equals(in.f17848a) || r9.e.e(a0Var)) {
            return null;
        } else {
            d dVar = new d(a0Var);
            try {
                cVar = this.f28717b.k(f(a0Var.R().i()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.f(cVar);
                    return new b(cVar);
                } catch (IOException unused2) {
                    a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
            }
        }
    }

    void t(y yVar) throws IOException {
        this.f28717b.P(f(yVar.i()));
    }

    synchronized void w() {
        this.f28721f++;
    }

    synchronized void z(p9.c cVar) {
        this.f28722g++;
        if (cVar.f29912a != null) {
            this.f28720e++;
        } else if (cVar.f29913b != null) {
            this.f28721f++;
        }
    }

    c(File file, long j10, u9.a aVar) {
        this.f28716a = new a();
        this.f28717b = p9.d.f(aVar, file, 201105, 2, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class d {

        /* renamed from: k  reason: collision with root package name */
        private static final String f28738k = v9.g.l().m() + "-Sent-Millis";

        /* renamed from: l  reason: collision with root package name */
        private static final String f28739l = v9.g.l().m() + "-Received-Millis";

        /* renamed from: a  reason: collision with root package name */
        private final String f28740a;

        /* renamed from: b  reason: collision with root package name */
        private final r f28741b;

        /* renamed from: c  reason: collision with root package name */
        private final String f28742c;

        /* renamed from: d  reason: collision with root package name */
        private final w f28743d;

        /* renamed from: e  reason: collision with root package name */
        private final int f28744e;

        /* renamed from: f  reason: collision with root package name */
        private final String f28745f;

        /* renamed from: g  reason: collision with root package name */
        private final r f28746g;

        /* renamed from: h  reason: collision with root package name */
        private final q f28747h;

        /* renamed from: i  reason: collision with root package name */
        private final long f28748i;

        /* renamed from: j  reason: collision with root package name */
        private final long f28749j;

        d(y9.s sVar) throws IOException {
            d0 d0Var;
            try {
                y9.e d10 = y9.l.d(sVar);
                this.f28740a = d10.I();
                this.f28742c = d10.I();
                r.a aVar = new r.a();
                int k10 = c.k(d10);
                for (int i10 = 0; i10 < k10; i10++) {
                    aVar.b(d10.I());
                }
                this.f28741b = aVar.d();
                r9.k a10 = r9.k.a(d10.I());
                this.f28743d = a10.f30482a;
                this.f28744e = a10.f30483b;
                this.f28745f = a10.f30484c;
                r.a aVar2 = new r.a();
                int k11 = c.k(d10);
                for (int i11 = 0; i11 < k11; i11++) {
                    aVar2.b(d10.I());
                }
                String str = f28738k;
                String e8 = aVar2.e(str);
                String str2 = f28739l;
                String e10 = aVar2.e(str2);
                aVar2.f(str);
                aVar2.f(str2);
                this.f28748i = e8 != null ? Long.parseLong(e8) : 0L;
                this.f28749j = e10 != null ? Long.parseLong(e10) : 0L;
                this.f28746g = aVar2.d();
                if (a()) {
                    String I = d10.I();
                    if (I.length() <= 0) {
                        h a11 = h.a(d10.I());
                        List<Certificate> c10 = c(d10);
                        List<Certificate> c11 = c(d10);
                        if (!d10.i0()) {
                            d0Var = d0.a(d10.I());
                        } else {
                            d0Var = d0.SSL_3_0;
                        }
                        this.f28747h = q.c(d0Var, a11, c10, c11);
                    } else {
                        throw new IOException("expected \"\" but was \"" + I + "\"");
                    }
                } else {
                    this.f28747h = null;
                }
            } finally {
                sVar.close();
            }
        }

        private boolean a() {
            return this.f28740a.startsWith("https://");
        }

        private List<Certificate> c(y9.e eVar) throws IOException {
            int k10 = c.k(eVar);
            if (k10 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(k10);
                for (int i10 = 0; i10 < k10; i10++) {
                    String I = eVar.I();
                    y9.c cVar = new y9.c();
                    cVar.y0(y9.f.d(I));
                    arrayList.add(certificateFactory.generateCertificate(cVar.F0()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        private void e(y9.d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.Z(list.size()).j0(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    dVar.B(y9.f.m(list.get(i10).getEncoded()).a()).j0(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public boolean b(y yVar, a0 a0Var) {
            return this.f28740a.equals(yVar.i().toString()) && this.f28742c.equals(yVar.g()) && r9.e.o(a0Var, this.f28741b, yVar);
        }

        public a0 d(d.e eVar) {
            String c10 = this.f28746g.c("Content-Type");
            String c11 = this.f28746g.c("Content-Length");
            return new a0.a().p(new y.a().h(this.f28740a).f(this.f28742c, null).e(this.f28741b).b()).n(this.f28743d).g(this.f28744e).k(this.f28745f).j(this.f28746g).b(new C0323c(eVar, c10, c11)).h(this.f28747h).q(this.f28748i).o(this.f28749j).c();
        }

        public void f(d.c cVar) throws IOException {
            y9.d c10 = y9.l.c(cVar.d(0));
            c10.B(this.f28740a).j0(10);
            c10.B(this.f28742c).j0(10);
            c10.Z(this.f28741b.g()).j0(10);
            int g10 = this.f28741b.g();
            for (int i10 = 0; i10 < g10; i10++) {
                c10.B(this.f28741b.e(i10)).B(": ").B(this.f28741b.i(i10)).j0(10);
            }
            c10.B(new r9.k(this.f28743d, this.f28744e, this.f28745f).toString()).j0(10);
            c10.Z(this.f28746g.g() + 2).j0(10);
            int g11 = this.f28746g.g();
            for (int i11 = 0; i11 < g11; i11++) {
                c10.B(this.f28746g.e(i11)).B(": ").B(this.f28746g.i(i11)).j0(10);
            }
            c10.B(f28738k).B(": ").Z(this.f28748i).j0(10);
            c10.B(f28739l).B(": ").Z(this.f28749j).j0(10);
            if (a()) {
                c10.j0(10);
                c10.B(this.f28747h.a().d()).j0(10);
                e(c10, this.f28747h.e());
                e(c10, this.f28747h.d());
                c10.B(this.f28747h.f().c()).j0(10);
            }
            c10.close();
        }

        d(a0 a0Var) {
            this.f28740a = a0Var.R().i().toString();
            this.f28741b = r9.e.n(a0Var);
            this.f28742c = a0Var.R().g();
            this.f28743d = a0Var.L();
            this.f28744e = a0Var.j();
            this.f28745f = a0Var.F();
            this.f28746g = a0Var.z();
            this.f28747h = a0Var.k();
            this.f28748i = a0Var.S();
            this.f28749j = a0Var.P();
        }
    }
}
