package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
/* compiled from: Route.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    final a f28750a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f28751b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f28752c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f28750a = aVar;
        this.f28751b = proxy;
        this.f28752c = inetSocketAddress;
    }

    public a a() {
        return this.f28750a;
    }

    public Proxy b() {
        return this.f28751b;
    }

    public boolean c() {
        return this.f28750a.f28684i != null && this.f28751b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f28752c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (c0Var.f28750a.equals(this.f28750a) && c0Var.f28751b.equals(this.f28751b) && c0Var.f28752c.equals(this.f28752c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f28750a.hashCode()) * 31) + this.f28751b.hashCode()) * 31) + this.f28752c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f28752c + "}";
    }
}
