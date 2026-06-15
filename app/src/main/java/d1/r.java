package d1;

import android.webkit.WebViewClient;
import c1.h;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
/* compiled from: WebViewProviderAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    WebViewProviderBoundaryInterface f23932a;

    public r(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f23932a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, h.b bVar) {
        this.f23932a.addWebMessageListener(str, strArr, z9.a.c(new m(bVar)));
    }

    public WebViewClient b() {
        return this.f23932a.getWebViewClient();
    }

    public void c(String str) {
        this.f23932a.removeWebMessageListener(str);
    }

    public void d(boolean z10) {
        this.f23932a.setAudioMuted(z10);
    }
}
