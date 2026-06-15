package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
/* compiled from: CertificatePinner.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f28783c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f28784a;

    /* renamed from: b  reason: collision with root package name */
    private final x9.c f28785b;

    /* compiled from: CertificatePinner.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f28786a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.f28786a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CertificatePinner.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f28787a;

        /* renamed from: b  reason: collision with root package name */
        final String f28788b;

        /* renamed from: c  reason: collision with root package name */
        final String f28789c;

        /* renamed from: d  reason: collision with root package name */
        final y9.f f28790d;

        boolean a(String str) {
            if (this.f28787a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == this.f28788b.length()) {
                    String str2 = this.f28788b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        return true;
                    }
                }
                return false;
            }
            return str.equals(this.f28788b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f28787a.equals(bVar.f28787a) && this.f28789c.equals(bVar.f28789c) && this.f28790d.equals(bVar.f28790d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f28787a.hashCode()) * 31) + this.f28789c.hashCode()) * 31) + this.f28790d.hashCode();
        }

        public String toString() {
            return this.f28789c + this.f28790d.a();
        }
    }

    g(Set<b> set, x9.c cVar) {
        this.f28784a = set;
        this.f28785b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + e((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static y9.f d(X509Certificate x509Certificate) {
        return y9.f.m(x509Certificate.getPublicKey().getEncoded()).p();
    }

    static y9.f e(X509Certificate x509Certificate) {
        return y9.f.m(x509Certificate.getPublicKey().getEncoded()).q();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> b10 = b(str);
        if (b10.isEmpty()) {
            return;
        }
        x9.c cVar = this.f28785b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = b10.size();
            y9.f fVar = null;
            y9.f fVar2 = null;
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = b10.get(i11);
                if (bVar.f28789c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = e(x509Certificate);
                    }
                    if (bVar.f28790d.equals(fVar)) {
                        return;
                    }
                } else if (bVar.f28789c.equals("sha1/")) {
                    if (fVar2 == null) {
                        fVar2 = d(x509Certificate);
                    }
                    if (bVar.f28790d.equals(fVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + bVar.f28789c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb.append("\n    ");
            sb.append(c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = b10.size();
        for (int i13 = 0; i13 < size4; i13++) {
            sb.append("\n    ");
            sb.append(b10.get(i13));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f28784a) {
            if (bVar.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (o9.c.q(this.f28785b, gVar.f28785b) && this.f28784a.equals(gVar.f28784a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(x9.c cVar) {
        return o9.c.q(this.f28785b, cVar) ? this : new g(this.f28784a, cVar);
    }

    public int hashCode() {
        x9.c cVar = this.f28785b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f28784a.hashCode();
    }
}
