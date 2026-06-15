package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import c1.f;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import d9.i;
import d9.w0;
import d9.y;
import g9.g;
import g9.j0;
import g9.l0;
import g9.w;
import j8.q;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AndroidWebViewClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final w<Boolean> _isRenderProcessGone;
    private final d9.w<List<WebViewClientError>> _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetWebViewCacheAssetLoader getWebViewAssetLoader;
    private final j0<Boolean> isRenderProcessGone;
    private final w<List<WebViewClientError>> loadErrors;
    private final w0<List<WebViewClientError>> onLoadFinished;

    /* compiled from: AndroidWebViewClient.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AndroidWebViewClient(GetWebViewCacheAssetLoader getWebViewAssetLoader, GetCachedAsset getCachedAsset, GetLatestWebViewConfiguration getLatestWebViewConfiguration) {
        List d10;
        n.f(getWebViewAssetLoader, "getWebViewAssetLoader");
        n.f(getCachedAsset, "getCachedAsset");
        n.f(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        this.getWebViewAssetLoader = getWebViewAssetLoader;
        this.getCachedAsset = getCachedAsset;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        d10 = q.d();
        this.loadErrors = l0.a(d10);
        d9.w<List<WebViewClientError>> b10 = y.b(null, 1, null);
        this._onLoadFinished = b10;
        this.onLoadFinished = b10;
        w<Boolean> a10 = l0.a(Boolean.FALSE);
        this._isRenderProcessGone = a10;
        this.isRenderProcessGone = g.b(a10);
    }

    private final String getLatestWebviewDomain() {
        return (String) i.f(null, new AndroidWebViewClient$getLatestWebviewDomain$1(this, null), 1, null);
    }

    public final w0<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final j0<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        List<WebViewClientError> value;
        List<WebViewClientError> F;
        n.f(view, "view");
        n.f(url, "url");
        if (n.a(url, BLANK_PAGE)) {
            w<List<WebViewClientError>> wVar = this.loadErrors;
            do {
                value = wVar.getValue();
                F = j8.y.F(value, new WebViewClientError(url, ErrorReason.REASON_WEB_BLANK, null, 4, null));
            } while (!wVar.i(value, F));
            super.onPageFinished(view, url);
            this._onLoadFinished.L(this.loadErrors.getValue());
        }
        super.onPageFinished(view, url);
        this._onLoadFinished.L(this.loadErrors.getValue());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(WebView view, WebResourceRequest request, f error) {
        ErrorReason errorReason;
        List<WebViewClientError> value;
        List<WebViewClientError> F;
        n.f(view, "view");
        n.f(request, "request");
        n.f(error, "error");
        super.onReceivedError(view, request, error);
        if (c1.i.a("WEB_RESOURCE_ERROR_GET_CODE")) {
            errorReason = IntExtensionKt.webResourceToErrorReason(error.b());
        } else {
            errorReason = ErrorReason.REASON_UNKNOWN;
        }
        w<List<WebViewClientError>> wVar = this.loadErrors;
        do {
            value = wVar.getValue();
            F = j8.y.F(value, new WebViewClientError(request.getUrl().toString(), errorReason, null, 4, null));
        } while (!wVar.i(value, F));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        WebViewClientError webViewClientError;
        List<WebViewClientError> value;
        List<WebViewClientError> F;
        n.f(view, "view");
        n.f(request, "request");
        n.f(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        if (Build.VERSION.SDK_INT >= 21) {
            webViewClientError = new WebViewClientError(request.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(errorResponse.getStatusCode()));
        } else {
            webViewClientError = new WebViewClientError(null, ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, null, 5, null);
        }
        w<List<WebViewClientError>> wVar = this.loadErrors;
        do {
            value = wVar.getValue();
            F = j8.y.F(value, webViewClientError);
        } while (!wVar.i(value, F));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        List<WebViewClientError> value;
        List<WebViewClientError> F;
        n.f(view, "view");
        n.f(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (!this._onLoadFinished.b()) {
            w<List<WebViewClientError>> wVar = this.loadErrors;
            do {
                value = wVar.getValue();
                F = j8.y.F(value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null));
            } while (!wVar.i(value, F));
            this._onLoadFinished.L(this.loadErrors.getValue());
            return true;
        }
        this._isRenderProcessGone.setValue(Boolean.TRUE);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        n.f(view, "view");
        n.f(request, "request");
        if (Build.VERSION.SDK_INT >= 21) {
            Uri url = request.getUrl();
            if (url == null) {
                return super.shouldInterceptRequest(view, request);
            }
            if (n.a(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            if (!n.a(url.getScheme(), UnityAdsConstants.Cache.CACHE_SCHEME)) {
                return n.a(url.getHost(), getLatestWebviewDomain()) ? this.getWebViewAssetLoader.invoke().a(url) : super.shouldInterceptRequest(view, request);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            n.e(url2, "request.url");
            return getCachedAsset.invoke(url2);
        }
        return super.shouldInterceptRequest(view, request);
    }
}
