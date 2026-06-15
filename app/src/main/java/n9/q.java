package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: Handshake.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f28907a;

    /* renamed from: b  reason: collision with root package name */
    private final h f28908b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f28909c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f28910d;

    private q(d0 d0Var, h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f28907a = d0Var;
        this.f28908b = hVar;
        this.f28909c = list;
        this.f28910d = list2;
    }

    public static q b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                h a10 = h.a(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        d0 a11 = d0.a(protocol);
                        try {
                            certificateArr = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                            certificateArr = null;
                        }
                        if (certificateArr != null) {
                            emptyList = o9.c.u(certificateArr);
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            emptyList2 = o9.c.u(localCertificates);
                        } else {
                            emptyList2 = Collections.emptyList();
                        }
                        return new q(a11, a10, emptyList, emptyList2);
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public static q c(d0 d0Var, h hVar, List<Certificate> list, List<Certificate> list2) {
        Objects.requireNonNull(d0Var, "tlsVersion == null");
        Objects.requireNonNull(hVar, "cipherSuite == null");
        return new q(d0Var, hVar, o9.c.t(list), o9.c.t(list2));
    }

    public h a() {
        return this.f28908b;
    }

    public List<Certificate> d() {
        return this.f28910d;
    }

    public List<Certificate> e() {
        return this.f28909c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f28907a.equals(qVar.f28907a) && this.f28908b.equals(qVar.f28908b) && this.f28909c.equals(qVar.f28909c) && this.f28910d.equals(qVar.f28910d);
        }
        return false;
    }

    public d0 f() {
        return this.f28907a;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f28907a.hashCode()) * 31) + this.f28908b.hashCode()) * 31) + this.f28909c.hashCode()) * 31) + this.f28910d.hashCode();
    }
}
