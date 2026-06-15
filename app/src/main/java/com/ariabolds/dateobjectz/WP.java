package com.ariabolds.dateobjectz;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.ironsource.cc;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class WP extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    WebView f10221a;

    /* renamed from: b  reason: collision with root package name */
    String f10222b;

    /* renamed from: c  reason: collision with root package name */
    String f10223c;

    /* renamed from: d  reason: collision with root package name */
    ProgressBar f10224d;

    /* renamed from: e  reason: collision with root package name */
    Intent f10225e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            WP.this.f10224d.setVisibility(8);
            WP.this.f10221a.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WP.this.f10224d.setVisibility(8);
            WP.this.f10221a.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
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
                this.f10225e = getIntent();
            } catch (Exception unused2) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10225e = getIntent();
            } catch (Exception unused3) {
            }
        }
        this.f10222b = this.f10225e.getStringExtra("url");
        this.f10223c = this.f10225e.getStringExtra("agent");
        this.f10221a = (WebView) findViewById(2131362541);
        this.f10224d = (ProgressBar) findViewById(2131362349);
        this.f10221a.setBackgroundColor(0);
        this.f10221a.setFocusableInTouchMode(false);
        this.f10221a.setFocusable(false);
        this.f10221a.getSettings().setEnableSmoothTransition(true);
        this.f10221a.getSettings().setDefaultTextEncodingName("UTF-8");
        this.f10221a.getSettings().setJavaScriptEnabled(true);
        this.f10221a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f10221a.getSettings().setSupportMultipleWindows(true);
        this.f10221a.getSettings().setDomStorageEnabled(true);
        this.f10221a.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
        this.f10221a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f10221a.getSettings().setUseWideViewPort(false);
        if (!this.f10223c.toLowerCase().equals(RewardedVideo.VIDEO_MODE_DEFAULT) && !this.f10223c.isEmpty()) {
            this.f10221a.getSettings().setUserAgentString(this.f10223c);
        } else {
            String userAgentString = this.f10221a.getSettings().getUserAgentString();
            WebSettings settings = this.f10221a.getSettings();
            settings.setUserAgentString(userAgentString + " " + getBaseContext().getPackageName());
        }
        if (!this.f10222b.startsWith("http") && !this.f10222b.startsWith("www")) {
            this.f10221a.loadDataWithBaseURL(null, "<html><head><style data=\"text/css\">a {\n      color: #8ebf42;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{align-items: center; justify-content: center; width: 100%; height: 100%; font-family: MyFont;color: #ffffff;text-align:center;font-size:20px;margin-left:0px;line-height:1.2}</style>    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\n</head><body><div class=\"separator\"  style=\"clear: both; text-align: center; width: 100%;\">" + this.f10222b + "</div></body></html>", "text/html; charset=UTF-8", cc.N, null);
        } else {
            this.f10221a.loadUrl(this.f10222b);
        }
        this.f10221a.setWebViewClient(new a());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f10221a;
        if (webView != null) {
            webView.loadUrl("");
            this.f10221a.destroy();
            this.f10221a.clearHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        WebView webView = this.f10221a;
        if (webView != null) {
            webView.loadUrl("");
            this.f10221a.destroy();
            this.f10221a.clearHistory();
        }
        finish();
        super.onPause();
    }
}
