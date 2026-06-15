package d1;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
/* compiled from: JavaScriptReplyProxyImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends c1.a {

    /* renamed from: a  reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f23884a;

    /* compiled from: JavaScriptReplyProxyImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f23885a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f23885a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new i(this.f23885a);
        }
    }

    public i(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f23884a = jsReplyProxyBoundaryInterface;
    }

    public static i a(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) z9.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (i) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }
}
