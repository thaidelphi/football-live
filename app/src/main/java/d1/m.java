package d1;

import android.net.Uri;
import android.webkit.WebView;
import c1.h;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
/* compiled from: WebMessageListenerAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m implements WebMessageListenerBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private h.b f23892a;

    public m(h.b bVar) {
        this.f23892a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        c1.d b10 = l.b((WebMessageBoundaryInterface) z9.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b10 != null) {
            this.f23892a.onPostMessage(webView, b10, uri, z10, i.a(invocationHandler2));
        }
    }
}
