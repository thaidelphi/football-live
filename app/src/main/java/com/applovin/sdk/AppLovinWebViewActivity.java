package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.d7;
import com.applovin.impl.k4;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f9979a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private String f9980b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f9981c;

    /* renamed from: d  reason: collision with root package name */
    private EventListener f9982d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends k4 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f9983a;

        a(j jVar) {
            this.f9983a = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(j jVar) {
            if (((Boolean) jVar.a(o4.f8256x5)).booleanValue() && AppLovinWebViewActivity.this.f9979a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.a(jVar);
                if (StringUtils.isValidString(AppLovinWebViewActivity.this.f9980b)) {
                    AppLovinWebViewActivity.this.f9981c.loadUrl(AppLovinWebViewActivity.this.f9980b);
                    return;
                }
                return;
            }
            AppLovinWebViewActivity.this.finish();
        }

        @Override // com.applovin.impl.k4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f9981c == webView) {
                AppLovinWebViewActivity.this.f9981c.destroy();
                AppLovinWebViewActivity.this.f9981c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final j jVar = this.f9983a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinWebViewActivity.a.this.a(jVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.f9983a.I();
            if (n.a()) {
                n I = this.f9983a.I();
                I.a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f9982d != null) {
                if (path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                    if (StringUtils.isValidString(str2)) {
                        String queryParameter = parse.getQueryParameter(str2);
                        this.f9983a.I();
                        if (n.a()) {
                            n I2 = this.f9983a.I();
                            I2.a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                        }
                        AppLovinWebViewActivity.this.f9982d.onReceivedEvent(queryParameter);
                        return true;
                    }
                    this.f9983a.I();
                    if (n.a()) {
                        this.f9983a.I().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f9982d = eventListener;
        this.f9980b = str;
        this.f9979a.set(false);
        WebView webView = this.f9981c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f9982d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            n.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).a());
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra2)) {
            this.f9980b = stringExtra2;
        }
        if (StringUtils.isValidString(this.f9980b)) {
            this.f9981c.loadUrl(this.f9980b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        WebView b10 = d7.b(this, "WebView Activity");
        this.f9981c = b10;
        if (b10 == null) {
            finish();
            return;
        }
        setContentView(b10);
        WebSettings settings = this.f9981c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f9981c.setVerticalScrollBarEnabled(true);
        this.f9981c.setHorizontalScrollBarEnabled(true);
        this.f9981c.setScrollBarStyle(33554432);
        this.f9981c.setWebViewClient(new a(jVar));
    }
}
