package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import n9.s;
/* compiled from: Address.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final s f28676a;

    /* renamed from: b  reason: collision with root package name */
    final o f28677b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f28678c;

    /* renamed from: d  reason: collision with root package name */
    final b f28679d;

    /* renamed from: e  reason: collision with root package name */
    final List<w> f28680e;

    /* renamed from: f  reason: collision with root package name */
    final List<k> f28681f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f28682g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f28683h;

    /* renamed from: i  reason: collision with root package name */
    final SSLSocketFactory f28684i;

    /* renamed from: j  reason: collision with root package name */
    final HostnameVerifier f28685j;

    /* renamed from: k  reason: collision with root package name */
    final g f28686k;

    public a(String str, int i10, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<w> list, List<k> list2, ProxySelector proxySelector) {
        this.f28676a = new s.a().q(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").e(str).l(i10).a();
        Objects.requireNonNull(oVar, "dns == null");
        this.f28677b = oVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f28678c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f28679d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f28680e = o9.c.t(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f28681f = o9.c.t(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f28682g = proxySelector;
        this.f28683h = proxy;
        this.f28684i = sSLSocketFactory;
        this.f28685j = hostnameVerifier;
        this.f28686k = gVar;
    }

    public g a() {
        return this.f28686k;
    }

    public List<k> b() {
        return this.f28681f;
    }

    public o c() {
        return this.f28677b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(a aVar) {
        return this.f28677b.equals(aVar.f28677b) && this.f28679d.equals(aVar.f28679d) && this.f28680e.equals(aVar.f28680e) && this.f28681f.equals(aVar.f28681f) && this.f28682g.equals(aVar.f28682g) && o9.c.q(this.f28683h, aVar.f28683h) && o9.c.q(this.f28684i, aVar.f28684i) && o9.c.q(this.f28685j, aVar.f28685j) && o9.c.q(this.f28686k, aVar.f28686k) && l().w() == aVar.l().w();
    }

    public HostnameVerifier e() {
        return this.f28685j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f28676a.equals(aVar.f28676a) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public List<w> f() {
        return this.f28680e;
    }

    public Proxy g() {
        return this.f28683h;
    }

    public b h() {
        return this.f28679d;
    }

    public int hashCode() {
        int hashCode = (((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f28676a.hashCode()) * 31) + this.f28677b.hashCode()) * 31) + this.f28679d.hashCode()) * 31) + this.f28680e.hashCode()) * 31) + this.f28681f.hashCode()) * 31) + this.f28682g.hashCode()) * 31;
        Proxy proxy = this.f28683h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f28684i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f28685j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        g gVar = this.f28686k;
        return hashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public ProxySelector i() {
        return this.f28682g;
    }

    public SocketFactory j() {
        return this.f28678c;
    }

    public SSLSocketFactory k() {
        return this.f28684i;
    }

    public s l() {
        return this.f28676a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f28676a.l());
        sb.append(":");
        sb.append(this.f28676a.w());
        if (this.f28683h != null) {
            sb.append(", proxy=");
            sb.append(this.f28683h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f28682g);
        }
        sb.append("}");
        return sb.toString();
    }
}
