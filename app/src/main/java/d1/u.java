package d1;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: WebkitToCompatConverter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f23934a;

    public u(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f23934a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f23934a.convertSafeBrowsingResponse(invocationHandler);
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f23934a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public WebMessagePort c(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f23934a.convertWebMessagePort(invocationHandler);
    }

    public WebResourceError d(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f23934a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler e(WebResourceError webResourceError) {
        return this.f23934a.convertWebResourceError(webResourceError);
    }
}
