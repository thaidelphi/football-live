package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import c1.d;
import c1.h;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import i8.g;
import i8.i;
import i8.k;
import j8.n0;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: WebView.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final g sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        n.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10) {
        this(context, z10, null, null, null, 28, null);
        n.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge) {
        this(context, z10, webViewBridge, null, null, 24, null);
        n.f(context, "context");
        n.f(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker) {
        this(context, z10, webViewBridge, callbackInvoker, null, 16, null);
        n.f(context, "context");
        n.f(webViewBridge, "webViewBridge");
        n.f(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i10 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        n.f(this$0, "this$0");
        n.f(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(final String script, final ValueCallback<String> valueCallback) {
        n.f(script, "script");
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.c
            @Override // java.lang.Runnable
            public final void run() {
                WebView.evaluateJavascript$lambda$1(WebView.this, script, valueCallback);
            }
        });
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        n.f(url, "url");
        DeviceLog.debug("Loading url: " + url);
        super.loadUrl(url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker, IExperiments experiments) {
        super(context);
        g a10;
        Set a11;
        Set a12;
        n.f(context, "context");
        n.f(webViewBridge, "webViewBridge");
        n.f(callbackInvoker, "callbackInvoker");
        n.f(experiments, "experiments");
        a10 = i.a(k.NONE, new WebView$special$$inlined$inject$default$1(this, ""));
        this.sdkMetricsSender$delegate = a10;
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z10);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean isWebMessageEnabled = experiments.isWebMessageEnabled();
        if (isWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean a13 = c1.i.a("WEB_MESSAGE_LISTENER");
        if (a13) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (isWebMessageEnabled && a13) {
            a11 = n0.a("*");
            c1.h.a(this, "handleInvocation", a11, new h.b() { // from class: com.unity3d.services.core.webview.b
                @Override // c1.h.b
                public final void onPostMessage(android.webkit.WebView webView, d dVar, Uri uri, boolean z11, c1.a aVar) {
                    WebViewBridgeInterface.this.onHandleInvocation(webView, dVar, uri, z11, aVar);
                }
            });
            a12 = n0.a("*");
            c1.h.a(this, "handleCallback", a12, new h.b() { // from class: com.unity3d.services.core.webview.a
                @Override // c1.h.b
                public final void onPostMessage(android.webkit.WebView webView, d dVar, Uri uri, boolean z11, c1.a aVar) {
                    WebViewBridgeInterface.this.onHandleCallback(webView, dVar, uri, z11, aVar);
                }
            });
            return;
        }
        addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
    }
}
