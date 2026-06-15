package r9;

import com.google.android.gms.common.api.Api;
import com.ironsource.in;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import n9.a0;
import n9.c0;
import n9.p;
import n9.s;
import n9.t;
import n9.v;
import n9.y;
/* compiled from: RetryAndFollowUpInterceptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j implements t {

    /* renamed from: a  reason: collision with root package name */
    private final v f30477a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30478b;

    /* renamed from: c  reason: collision with root package name */
    private volatile q9.g f30479c;

    /* renamed from: d  reason: collision with root package name */
    private Object f30480d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f30481e;

    public j(v vVar, boolean z10) {
        this.f30477a = vVar;
        this.f30478b = z10;
    }

    private n9.a c(s sVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        n9.g gVar;
        if (sVar.m()) {
            SSLSocketFactory E = this.f30477a.E();
            hostnameVerifier = this.f30477a.q();
            sSLSocketFactory = E;
            gVar = this.f30477a.g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new n9.a(sVar.l(), sVar.w(), this.f30477a.m(), this.f30477a.D(), sSLSocketFactory, hostnameVerifier, gVar, this.f30477a.z(), this.f30477a.y(), this.f30477a.x(), this.f30477a.j(), this.f30477a.A());
    }

    private y d(a0 a0Var, c0 c0Var) throws IOException {
        String t10;
        s A;
        if (a0Var != null) {
            int j10 = a0Var.j();
            String g10 = a0Var.R().g();
            if (j10 == 307 || j10 == 308) {
                if (!g10.equals(in.f17848a) && !g10.equals("HEAD")) {
                    return null;
                }
            } else if (j10 != 401) {
                if (j10 == 503) {
                    if ((a0Var.K() == null || a0Var.K().j() != 503) && i(a0Var, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                        return a0Var.R();
                    }
                    return null;
                } else if (j10 == 407) {
                    if (c0Var.b().type() == Proxy.Type.HTTP) {
                        return this.f30477a.z().a(c0Var, a0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (j10 == 408) {
                    if (this.f30477a.C()) {
                        a0Var.R().a();
                        if ((a0Var.K() == null || a0Var.K().j() != 408) && i(a0Var, 0) <= 0) {
                            return a0Var.R();
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (j10) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f30477a.d().a(c0Var, a0Var);
            }
            if (!this.f30477a.o() || (t10 = a0Var.t("Location")) == null || (A = a0Var.R().i().A(t10)) == null) {
                return null;
            }
            if (A.B().equals(a0Var.R().i().B()) || this.f30477a.p()) {
                y.a h10 = a0Var.R().h();
                if (f.b(g10)) {
                    boolean d10 = f.d(g10);
                    if (f.c(g10)) {
                        h10.f(in.f17848a, null);
                    } else {
                        h10.f(g10, d10 ? a0Var.R().a() : null);
                    }
                    if (!d10) {
                        h10.g("Transfer-Encoding");
                        h10.g("Content-Length");
                        h10.g("Content-Type");
                    }
                }
                if (!j(a0Var, A)) {
                    h10.g("Authorization");
                }
                return h10.i(A).b();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    private boolean f(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private boolean g(IOException iOException, q9.g gVar, boolean z10, y yVar) {
        gVar.q(iOException);
        if (this.f30477a.C()) {
            return !(z10 && h(iOException, yVar)) && f(iOException, z10) && gVar.h();
        }
        return false;
    }

    private boolean h(IOException iOException, y yVar) {
        yVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private int i(a0 a0Var, int i10) {
        String t10 = a0Var.t("Retry-After");
        return t10 == null ? i10 : t10.matches("\\d+") ? Integer.valueOf(t10).intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private boolean j(a0 a0Var, s sVar) {
        s i10 = a0Var.R().i();
        return i10.l().equals(sVar.l()) && i10.w() == sVar.w() && i10.B().equals(sVar.B());
    }

    @Override // n9.t
    public a0 a(t.a aVar) throws IOException {
        a0 j10;
        y d10;
        y b10 = aVar.b();
        g gVar = (g) aVar;
        n9.e f10 = gVar.f();
        p h10 = gVar.h();
        q9.g gVar2 = new q9.g(this.f30477a.i(), c(b10.i()), f10, h10, this.f30480d);
        this.f30479c = gVar2;
        int i10 = 0;
        a0 a0Var = null;
        while (!this.f30481e) {
            try {
                try {
                    try {
                        j10 = gVar.j(b10, gVar2, null, null);
                        if (a0Var != null) {
                            j10 = j10.J().m(a0Var.J().b(null).c()).c();
                        }
                        try {
                            d10 = d(j10, gVar2.o());
                        } catch (IOException e8) {
                            gVar2.k();
                            throw e8;
                        }
                    } catch (q9.e e10) {
                        if (!g(e10.c(), gVar2, false, b10)) {
                            throw e10.b();
                        }
                    }
                } catch (IOException e11) {
                    if (!g(e11, gVar2, !(e11 instanceof t9.a), b10)) {
                        throw e11;
                    }
                }
                if (d10 == null) {
                    gVar2.k();
                    return j10;
                }
                o9.c.g(j10.a());
                int i11 = i10 + 1;
                if (i11 <= 20) {
                    d10.a();
                    if (!j(j10, d10.i())) {
                        gVar2.k();
                        gVar2 = new q9.g(this.f30477a.i(), c(d10.i()), f10, h10, this.f30480d);
                        this.f30479c = gVar2;
                    } else if (gVar2.c() != null) {
                        throw new IllegalStateException("Closing the body of " + j10 + " didn't close its backing stream. Bad interceptor?");
                    }
                    a0Var = j10;
                    b10 = d10;
                    i10 = i11;
                } else {
                    gVar2.k();
                    throw new ProtocolException("Too many follow-up requests: " + i11);
                }
            } catch (Throwable th) {
                gVar2.q(null);
                gVar2.k();
                throw th;
            }
        }
        gVar2.k();
        throw new IOException("Canceled");
    }

    public void b() {
        this.f30481e = true;
        q9.g gVar = this.f30479c;
        if (gVar != null) {
            gVar.b();
        }
    }

    public boolean e() {
        return this.f30481e;
    }

    public void k(Object obj) {
        this.f30480d = obj;
    }
}
