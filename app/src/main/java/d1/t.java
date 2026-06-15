package d1;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: WebViewProviderFactoryAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t implements s {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f23933a;

    public t(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f23933a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // d1.s
    public String[] a() {
        return this.f23933a.getSupportedFeatures();
    }

    @Override // d1.s
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) z9.a.a(WebViewProviderBoundaryInterface.class, this.f23933a.createWebView(webView));
    }

    @Override // d1.s
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) z9.a.a(StaticsBoundaryInterface.class, this.f23933a.getStatics());
    }

    @Override // d1.s
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) z9.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f23933a.getWebkitToCompatConverter());
    }
}
