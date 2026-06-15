package d1;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
/* compiled from: WebMessagePortImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n extends c1.e {

    /* renamed from: a  reason: collision with root package name */
    private WebMessagePort f23893a;

    /* renamed from: b  reason: collision with root package name */
    private WebMessagePortBoundaryInterface f23894b;

    public n(WebMessagePort webMessagePort) {
        this.f23893a = webMessagePort;
    }

    public static WebMessagePort[] b(c1.e[] eVarArr) {
        if (eVarArr == null) {
            return null;
        }
        int length = eVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = eVarArr[i10].a();
        }
        return webMessagePortArr;
    }

    public static c1.d c(WebMessage webMessage) {
        return c.d(webMessage);
    }

    private WebMessagePort d() {
        if (this.f23893a == null) {
            this.f23893a = q.c().c(Proxy.getInvocationHandler(this.f23894b));
        }
        return this.f23893a;
    }

    public static c1.e[] e(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        c1.e[] eVarArr = new c1.e[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            eVarArr[i10] = new n(webMessagePortArr[i10]);
        }
        return eVarArr;
    }

    @Override // c1.e
    public WebMessagePort a() {
        return d();
    }

    public n(InvocationHandler invocationHandler) {
        this.f23894b = (WebMessagePortBoundaryInterface) z9.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
