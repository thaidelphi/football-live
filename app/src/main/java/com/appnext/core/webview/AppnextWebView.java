package com.appnext.core.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.i;
import com.appnext.core.p;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppnextWebView {
    private static AppnextWebView eU;
    private Context aO;
    private WebAppInterface av;
    private final HashMap<String, b> eV = new HashMap<>();
    private HashMap<String, WebView> eW;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class WebInterface extends WebAppInterface {
        private String auid;
        private String bm;

        public WebInterface(Context context, String str, String str2) {
            super(context);
            this.bm = "";
            this.auid = "";
            this.bm = str;
            this.auid = str2;
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void destroy(String str) {
            super.destroy(str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.destroy(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public String filterAds(String str) {
            super.filterAds(str);
            return AppnextWebView.eU.av != null ? AppnextWebView.eU.av.filterAds(str) : str;
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void gotoAppWall() {
            super.gotoAppWall();
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.gotoAppWall();
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void jsError(String str) {
            super.jsError(str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.jsError(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public String loadAds() {
            super.loadAds();
            return AppnextWebView.eU.av != null ? AppnextWebView.eU.av.loadAds() : "";
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void logSTP(String str, String str2) {
            super.logSTP(str, str2);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.logSTP(str, str2);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            AppnextWebView.this.b(this.bm, this.auid, str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.notifyImpression(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void openLink(String str) {
            super.openLink(str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.openLink(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void openResultPage(String str) {
            super.openResultPage(str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.openResultPage(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void openStore(String str) {
            super.openStore(str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.openStore(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void play() {
            super.play();
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.play();
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void postView(String str) {
            super.postView(str);
            AppnextWebView.this.b(this.bm, this.auid, str);
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.postView(str);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void videoPlayed() {
            super.videoPlayed();
            if (AppnextWebView.eU.av != null) {
                AppnextWebView.eU.av.videoPlayed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends AsyncTask<String, Void, String> {
        b eZ;

        public a(b bVar) {
            this.eZ = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public final String doInBackground(String... strArr) {
            try {
                b bVar = (b) AppnextWebView.this.eV.get(strArr[0]);
                bVar.fa = i.a(AppnextWebView.this.aO, strArr[0], (HashMap<String, String>) null, true, (int) UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                AppnextWebView.this.eV.put(strArr[0], bVar);
                return strArr[0];
            } catch (HttpRetryException e8) {
                com.appnext.base.a.a("AppnextWebView$doInBackground", e8);
                return "error: " + e8.getReason();
            } catch (IOException e10) {
                com.appnext.base.a.a("AppnextWebView$doInBackground", e10);
                return "error: network problem";
            } catch (Throwable th) {
                com.appnext.base.a.a("AppnextWebView$doInBackground", th);
                return "error: unknown error";
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(String str) {
            String str2 = str;
            super.onPostExecute(str2);
            try {
                if (str2.startsWith("error:")) {
                    this.eZ.f10057m = 0;
                    HashMap hashMap = AppnextWebView.this.eV;
                    b bVar = this.eZ;
                    hashMap.put(bVar.f10058v, bVar);
                    AppnextWebView.this.a(this.eZ, str2.substring(7));
                    return;
                }
                this.eZ.f10057m = 2;
                HashMap hashMap2 = AppnextWebView.this.eV;
                b bVar2 = this.eZ;
                hashMap2.put(bVar2.f10058v, bVar2);
                AppnextWebView.this.b(this.eZ, str2);
            } catch (Throwable th) {
                com.appnext.base.a.a("AppnextWebView$download", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b {
        public ArrayList<c> dA;
        public String fa;

        /* renamed from: m  reason: collision with root package name */
        public int f10057m;

        /* renamed from: v  reason: collision with root package name */
        public String f10058v;

        private b() {
            this.f10057m = 0;
            this.fa = "";
            this.dA = new ArrayList<>();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void error(String str);

        void f(String str);
    }

    private AppnextWebView(Context context) {
        this.aO = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(b bVar, String str) {
        synchronized (this.eV) {
            Iterator<c> it = bVar.dA.iterator();
            while (it.hasNext()) {
                it.next().f(str);
            }
            bVar.dA.clear();
        }
    }

    @SuppressLint({"NewApi"})
    public static AppnextWebView t(Context context) {
        if (eU == null) {
            AppnextWebView appnextWebView = new AppnextWebView(context);
            eU = appnextWebView;
            appnextWebView.eW = new HashMap<>();
        }
        return eU;
    }

    public final WebView C(String str) {
        WebView webView = this.eW.get(str);
        if (webView != null && webView.getParent() != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        return webView;
    }

    public final String D(String str) {
        b bVar = this.eV.get(str);
        if (bVar == null || bVar.f10057m != 2) {
            return null;
        }
        return bVar.fa;
    }

    public final void a(WebAppInterface webAppInterface) {
        if (this.av == webAppInterface) {
            this.av = null;
        }
    }

    public final synchronized void a(String str, c cVar) {
        b bVar;
        int i10;
        try {
            if (this.eV.containsKey(str)) {
                bVar = this.eV.get(str);
            } else {
                bVar = new b();
                bVar.f10058v = str;
            }
            i10 = bVar.f10057m;
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextWebView$download", th);
        }
        if (i10 != 2) {
            if (i10 == 0) {
                bVar.f10057m = 1;
                new a(bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str, null);
            }
            if (cVar != null) {
                bVar.dA.add(cVar);
            }
            this.eV.put(str, bVar);
        } else if (cVar != null) {
            cVar.f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final String str2, final String str3) {
        p.ac().a(new Runnable() { // from class: com.appnext.core.webview.AppnextWebView.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String f10 = i.f(str3, "b");
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(f10) || TextUtils.isEmpty(str2)) {
                        return;
                    }
                    com.appnext.core.adswatched.a.m(AppnextWebView.this.av.context).j(f10, str2);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final WebView a(Context context, String str, String str2, String str3, WebAppInterface webAppInterface, com.appnext.core.webview.a aVar, String str4) {
        String str5;
        try {
            eU.av = webAppInterface;
            WebView webView = this.eW.get(str4);
            if (webView != null && webView.getParent() != null) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            URL url = new URL(str3);
            String str6 = url.getProtocol() + "://" + url.getHost();
            WebView webView2 = new WebView(context.getApplicationContext());
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.getSettings().setAppCacheEnabled(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setDatabaseEnabled(true);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                webView2.getSettings().setMixedContentMode(0);
            }
            if (i10 >= 17) {
                webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            webView2.setWebChromeClient(new WebChromeClient());
            webView2.setWebViewClient(new WebViewClient() { // from class: com.appnext.core.webview.AppnextWebView.1
                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView3, String str7) {
                    if (str7 == null) {
                        return false;
                    }
                    if (str7.startsWith("http")) {
                        webView3.loadUrl(str7);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView3, str7);
                }
            });
            if (this.eV.containsKey(str3) && this.eV.get(str3).f10057m == 2 && !this.eV.get(str3).fa.equals("")) {
                str5 = "<script>" + this.eV.get(str3).fa + "</script>";
            } else if (aVar != null) {
                str5 = "<script>" + aVar.D() + "</script>";
            } else {
                str5 = "<script src='" + str3 + "'></script>";
            }
            webView2.loadDataWithBaseURL(str6, "<html><body>" + str5 + "</body></html>", null, "UTF-8", null);
            this.eW.put(str4, webView2);
            webView2.addJavascriptInterface(new WebInterface(context, str, str2), "Appnext");
            return webView2;
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextWebView$loadWebview", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, String str) {
        synchronized (this.eV) {
            Iterator<c> it = bVar.dA.iterator();
            while (it.hasNext()) {
                it.next().error(str);
            }
            bVar.dA.clear();
            this.eV.remove(bVar.f10058v);
        }
    }
}
