package d1;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c1.e;
import c1.h;
/* compiled from: ApiHelperForM.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* compiled from: ApiHelperForM.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends WebMessagePort.WebMessageCallback {
        a(e.a aVar) {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new n(webMessagePort);
            n.c(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends WebMessagePort.WebMessageCallback {
        b(e.a aVar) {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new n(webMessagePort);
            n.c(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM.java */
    /* renamed from: d1.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0260c extends WebView.VisualStateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.a f23882a;

        C0260c(h.a aVar) {
            this.f23882a = aVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            this.f23882a.onComplete(j10);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(c1.d dVar) {
        return new WebMessage(dVar.b(), n.b(dVar.c()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static c1.d d(WebMessage webMessage) {
        return new c1.d(webMessage.getData(), n.e(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, h.a aVar) {
        webView.postVisualStateCallback(j10, new C0260c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, e.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, e.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
