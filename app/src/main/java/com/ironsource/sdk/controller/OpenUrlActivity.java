package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.b9;
import com.ironsource.gv;
import com.ironsource.hs;
import com.ironsource.ik;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o8;
import com.ironsource.o9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.vj;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: j  reason: collision with root package name */
    private static final String f20187j = "OpenUrlActivity";

    /* renamed from: k  reason: collision with root package name */
    private static final int f20188k = SDKUtils.generateViewId();

    /* renamed from: l  reason: collision with root package name */
    private static final int f20189l = SDKUtils.generateViewId();

    /* renamed from: b  reason: collision with root package name */
    private v f20191b;

    /* renamed from: c  reason: collision with root package name */
    private ProgressBar f20192c;

    /* renamed from: d  reason: collision with root package name */
    boolean f20193d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f20194e;

    /* renamed from: f  reason: collision with root package name */
    private String f20195f;

    /* renamed from: a  reason: collision with root package name */
    private WebView f20190a = null;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f20196g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private boolean f20197h = false;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f20198i = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                OpenUrlActivity.this.f20196g.removeCallbacks(OpenUrlActivity.this.f20198i);
                OpenUrlActivity.this.f20196g.postDelayed(OpenUrlActivity.this.f20198i, 500L);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f20197h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends WebViewClient {
        private c() {
        }

        /* synthetic */ c(OpenUrlActivity openUrlActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f20192c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f20192c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            try {
                o8 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.c()) {
                    if (featureFlagCatchUrlError.e() && OpenUrlActivity.this.f20191b != null) {
                        OpenUrlActivity.this.f20191b.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                o9.d().a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.f20187j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (new hs(str, ik.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                try {
                    gv.a(OpenUrlActivity.this, str);
                    OpenUrlActivity.this.f20191b.z();
                } catch (Exception e8) {
                    o9.d().a(e8);
                    StringBuilder sb = new StringBuilder();
                    sb.append(e8 instanceof ActivityNotFoundException ? b9.c.f16579x : b9.c.f16580y);
                    if (OpenUrlActivity.this.f20191b != null) {
                        OpenUrlActivity.this.f20191b.d(sb.toString(), str);
                    }
                }
                OpenUrlActivity.this.finish();
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        static final String f20202a = "is_store";

        /* renamed from: b  reason: collision with root package name */
        static final String f20203b = "external_url";

        /* renamed from: c  reason: collision with root package name */
        static final String f20204c = "secondary_web_view";

        /* renamed from: d  reason: collision with root package name */
        static final String f20205d = "immersive";

        /* renamed from: e  reason: collision with root package name */
        static final String f20206e = "no activity to handle url";

        /* renamed from: f  reason: collision with root package name */
        static final String f20207f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final com.ironsource.h f20208a;

        /* renamed from: b  reason: collision with root package name */
        private int f20209b;

        /* renamed from: c  reason: collision with root package name */
        private String f20210c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f20211d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f20212e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20213f = false;

        public e(com.ironsource.h hVar) {
            this.f20208a = hVar;
        }

        public Intent a(Context context) {
            Intent a10 = this.f20208a.a(context);
            a10.putExtra("external_url", this.f20210c);
            a10.putExtra("secondary_web_view", this.f20211d);
            a10.putExtra("is_store", this.f20212e);
            a10.putExtra(b9.h.f16680v, this.f20213f);
            if (!(context instanceof Activity)) {
                a10.setFlags(this.f20209b);
            }
            return a10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e a(int i10) {
            this.f20209b = i10;
            return this;
        }

        public e a(String str) {
            this.f20210c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e a(boolean z10) {
            this.f20213f = z10;
            return this;
        }

        public e b(boolean z10) {
            this.f20211d = z10;
            return this;
        }

        public e c(boolean z10) {
            this.f20212e = z10;
            return this;
        }
    }

    private void a() {
        if (this.f20192c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, 16973939));
            this.f20192c = progressBar;
            progressBar.setId(f20189l);
        }
        if (findViewById(f20189l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f20192c.setLayoutParams(layoutParams);
            this.f20192c.setVisibility(4);
            this.f20194e.addView(this.f20192c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.f20190a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f20190a = webView;
            webView.setId(f20188k);
            this.f20190a.getSettings().setJavaScriptEnabled(true);
            this.f20190a.setWebViewClient(new c(this, null));
            loadUrl(this.f20195f);
        }
        if (findViewById(f20188k) == null) {
            this.f20194e.addView(this.f20190a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f20191b;
        if (vVar != null) {
            vVar.a(true, b9.h.Y);
        }
    }

    private void c() {
        WebView webView = this.f20190a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f20191b;
        if (vVar != null) {
            vVar.a(false, b9.h.Y);
            if (this.f20194e == null || (viewGroup = (ViewGroup) this.f20190a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f20188k) != null) {
                viewGroup.removeView(this.f20190a);
            }
            if (viewGroup.findViewById(f20189l) != null) {
                viewGroup.removeView(this.f20192c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f20193d && (vVar = this.f20191b) != null) {
            vVar.c(b9.h.f16656j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f20190a.stopLoading();
        this.f20190a.clearHistory();
        try {
            this.f20190a.loadUrl(str);
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.e(f20187j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f20190a.canGoBack()) {
            this.f20190a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f20187j, "onCreate()");
        try {
            this.f20191b = (v) vj.b((Context) this).a().j();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f20195f = extras.getString("external_url");
            this.f20193d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(b9.h.f16680v, false);
            this.f20197h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f20198i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f20194e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f20197h && (i10 == 25 || i10 == 24)) {
            this.f20196g.postDelayed(this.f20198i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f20197h && z10) {
            runOnUiThread(this.f20198i);
        }
    }
}
