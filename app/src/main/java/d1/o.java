package d1;

import android.webkit.WebResourceError;
import d1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
/* compiled from: WebResourceErrorImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o extends c1.f {

    /* renamed from: a  reason: collision with root package name */
    private WebResourceError f23895a;

    /* renamed from: b  reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f23896b;

    public o(InvocationHandler invocationHandler) {
        this.f23896b = (WebResourceErrorBoundaryInterface) z9.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f23896b == null) {
            this.f23896b = (WebResourceErrorBoundaryInterface) z9.a.a(WebResourceErrorBoundaryInterface.class, q.c().e(this.f23895a));
        }
        return this.f23896b;
    }

    private WebResourceError d() {
        if (this.f23895a == null) {
            this.f23895a = q.c().d(Proxy.getInvocationHandler(this.f23896b));
        }
        return this.f23895a;
    }

    @Override // c1.f
    public CharSequence a() {
        a.b bVar = p.f23924v;
        if (bVar.b()) {
            return c.e(d());
        }
        if (bVar.c()) {
            return c().getDescription();
        }
        throw p.a();
    }

    @Override // c1.f
    public int b() {
        a.b bVar = p.f23925w;
        if (bVar.b()) {
            return c.f(d());
        }
        if (bVar.c()) {
            return c().getErrorCode();
        }
        throw p.a();
    }

    public o(WebResourceError webResourceError) {
        this.f23895a = webResourceError;
    }
}
