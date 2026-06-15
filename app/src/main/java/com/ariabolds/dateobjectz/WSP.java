package com.ariabolds.dateobjectz;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.ironsource.cc;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class WSP extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    WebView f10227a;

    /* renamed from: b  reason: collision with root package name */
    String f10228b;

    /* renamed from: c  reason: collision with root package name */
    String f10229c;

    /* renamed from: d  reason: collision with root package name */
    ProgressBar f10230d;

    /* renamed from: e  reason: collision with root package name */
    Intent f10231e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (str.equals("https://www.scorebat.com/") || str.contains("utm_campaign=match") || str.equals("https://www.scorebat.com/video-widget/") || str.equals("https://www.scorebat.com/free-livescore-widget/")) {
                return;
            }
            super.onLoadResource(webView, str);
            Log.e("SCOREAPP", " " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            WSP.this.f10230d.setVisibility(8);
            WSP.this.f10227a.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WSP.this.f10230d.setVisibility(8);
            WSP.this.f10227a.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f10227a.canGoBack()) {
            this.f10227a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getWindow().getDecorView().setSystemUiVisibility(4102);
            if (getSupportActionBar() != null) {
                getSupportActionBar().k();
            }
        } catch (Exception unused) {
        }
        setContentView(2131558621);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10231e = getIntent();
            } catch (Exception unused2) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10231e = getIntent();
            } catch (Exception unused3) {
            }
        }
        this.f10228b = this.f10231e.getStringExtra("url");
        this.f10229c = this.f10231e.getStringExtra("agent");
        this.f10227a = (WebView) findViewById(2131362541);
        this.f10230d = (ProgressBar) findViewById(2131362349);
        this.f10227a.setBackgroundColor(0);
        this.f10227a.setFocusableInTouchMode(false);
        this.f10227a.setFocusable(false);
        this.f10227a.getSettings().setEnableSmoothTransition(true);
        this.f10227a.getSettings().setDefaultTextEncodingName("UTF-8");
        this.f10227a.getSettings().setJavaScriptEnabled(true);
        this.f10227a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f10227a.getSettings().setSupportMultipleWindows(true);
        this.f10227a.getSettings().setDomStorageEnabled(true);
        this.f10227a.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
        this.f10227a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f10227a.getSettings().setUseWideViewPort(true);
        this.f10227a.canGoBack();
        if (!this.f10229c.toLowerCase().equals(RewardedVideo.VIDEO_MODE_DEFAULT) && !this.f10229c.isEmpty()) {
            this.f10227a.getSettings().setUserAgentString(this.f10229c);
        } else {
            this.f10227a.getSettings().setUserAgentString(this.f10227a.getSettings().getUserAgentString());
        }
        if (!this.f10228b.startsWith("http") && !this.f10228b.startsWith("www")) {
            this.f10227a.loadDataWithBaseURL(null, "<html><head><style data=\"text/css\">a {\n      color: #8ebf42;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{align-items: center; justify-content: center; width: 100%; height: 100%; font-family: MyFont;color: #ffffff;text-align:center;font-size:20px;margin-left:0px;line-height:1.2}</style>    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\n</head><body><div class=\"separator\"  style=\"clear: both; text-align: center; width: 100%;\">" + this.f10228b + "</div></body></html>", "text/html; charset=UTF-8", cc.N, null);
        } else {
            this.f10227a.loadUrl(this.f10228b);
        }
        this.f10227a.setWebViewClient(new a());
        this.f10227a.setWebChromeClient(new WebChromeClient() { // from class: com.ariabolds.dateobjectz.WSP.2

            /* renamed from: com.ariabolds.dateobjectz.WSP$2$a */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            class a extends WebViewClient {
                a() {
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str.equals("https://www.scorebat.com/") || str.contains("utm_campaign=match") || str.equals("https://www.scorebat.com/video-widget/") || str.equals("https://www.scorebat.com/free-livescore-widget/")) {
                        return true;
                    }
                    WSP.this.f10227a.loadUrl(str);
                    return true;
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
                WebView webView2 = new WebView(webView.getContext());
                webView2.setWebViewClient(new a());
                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                message.sendToTarget();
                return true;
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f10227a;
        if (webView != null) {
            webView.loadUrl("");
            this.f10227a.destroy();
            this.f10227a.clearHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        WebView webView = this.f10227a;
        if (webView != null) {
            webView.loadUrl("");
            this.f10227a.destroy();
            this.f10227a.clearHistory();
        }
        finish();
        super.onPause();
    }
}
