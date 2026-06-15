package com.startapp.sdk.adsbase.consent;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.v1;
import com.startapp.y;
import java.net.URI;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConsentActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public WebView f23071a;

    /* renamed from: b  reason: collision with root package name */
    public String f23072b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23073c;

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f23071a;
        if (webView == null) {
            this.f23073c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.f23072b;
        if (str != null && url != null && url.contains(str)) {
            this.f23071a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f23071a.canGoBack()) {
            this.f23071a.goBack();
        } else {
            this.f23073c = true;
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.f23072b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                WebView c10 = com.startapp.sdk.components.a.a(this).f23225a.a().c();
                this.f23071a = c10;
                c10.setWebViewClient(new a());
                this.f23071a.getSettings().setJavaScriptEnabled(true);
                this.f23071a.setHorizontalScrollBarEnabled(false);
                this.f23071a.setVerticalScrollBarEnabled(false);
                if (Build.VERSION.SDK_INT >= 15) {
                    this.f23071a.getSettings().setTextZoom(100);
                } else {
                    this.f23071a.getSettings().setTextSize(WebSettings.TextSize.NORMAL);
                }
                this.f23071a.loadUrl(dataString);
                this.f23071a.setBackgroundColor(0);
                y.b(this.f23071a);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f23071a, layoutParams2);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        ConsentConfig o10 = MetaData.f23158k.o();
        if (!this.f23073c && o10 != null && o10.k()) {
            WeakHashMap weakHashMap = o9.f22359a;
            if (com.startapp.sdk.components.a.a(this).f23243s.a().b() && o9.e(this)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "ConsentActivityHasBeenCovered";
                l3Var.a();
                finish();
                try {
                    startActivity(getIntent());
                } catch (Throwable th) {
                    l3.a(th);
                }
            }
        }
        v1 a10 = com.startapp.sdk.components.a.a(this).f23233i.a();
        a10.f23466e = false;
        if (v1.a(4)) {
            l3 l3Var2 = new l3(m3.f22274d);
            l3Var2.f22228d = "CNS.closed";
            l3Var2.f22229e = String.valueOf(System.currentTimeMillis());
            l3Var2.a();
        }
        Intent intent = a10.f23465d;
        if (intent != null) {
            try {
                a10.f23462a.startActivity(intent);
            } catch (Throwable th2) {
                if (v1.a(8)) {
                    l3.a(th2);
                }
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends WebViewClient {
        public a() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:10|(2:11|12)|(7:14|15|16|17|(1:19)|21|22)|27|16|17|(0)|21|22) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
            r12 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
            com.startapp.l3.a(r12);
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:20:0x004d, B:22:0x0053), top: B:34:0x004d }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(android.net.Uri r12) {
            /*
                r11 = this;
                java.lang.String r0 = r12.getScheme()
                java.lang.String r1 = r12.getHost()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k
                com.startapp.sdk.adsbase.consent.ConsentConfig r2 = r2.o()
                r3 = 0
                if (r0 == 0) goto L8e
                java.lang.String r4 = "startappad"
                boolean r0 = r0.equalsIgnoreCase(r4)
                if (r0 == 0) goto L8e
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L8e
                if (r2 != 0) goto L22
                goto L8e
            L22:
                java.lang.String r0 = "setconsent"
                boolean r0 = r1.equalsIgnoreCase(r0)
                r4 = 1
                if (r0 == 0) goto L7e
                java.lang.String r0 = "status"
                java.lang.String r0 = r12.getQueryParameter(r0)
                java.lang.String r1 = "apc"
                java.lang.String r12 = r12.getQueryParameter(r1)
                r1 = 0
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L48 java.lang.NumberFormatException -> L4c
                if (r3 != 0) goto L4c
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L48 java.lang.NumberFormatException -> L4c
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L48 java.lang.NumberFormatException -> L4c
                r6 = r0
                goto L4d
            L48:
                r0 = move-exception
                com.startapp.l3.a(r0)
            L4c:
                r6 = r1
            L4d:
                boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L5c
                if (r0 != 0) goto L60
                boolean r12 = java.lang.Boolean.parseBoolean(r12)     // Catch: java.lang.Throwable -> L5c
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L5c
                goto L60
            L5c:
                r12 = move-exception
                com.startapp.l3.a(r12)
            L60:
                r8 = r1
                com.startapp.sdk.adsbase.consent.ConsentActivity r12 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                com.startapp.sdk.components.a r12 = com.startapp.sdk.components.a.a(r12)
                com.startapp.t4<com.startapp.v1> r12 = r12.f23233i
                java.lang.Object r12 = r12.a()
                r5 = r12
                com.startapp.v1 r5 = (com.startapp.v1) r5
                long r0 = r2.j()
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                r9 = 1
                r10 = 1
                r5.a(r6, r7, r8, r9, r10)
                return r4
            L7e:
                java.lang.String r12 = "close"
                boolean r12 = r1.equalsIgnoreCase(r12)
                if (r12 == 0) goto L8e
                com.startapp.sdk.adsbase.consent.ConsentActivity r12 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                r12.f23073c = r4
                r12.finish()
                return r4
            L8e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.consent.ConsentActivity.a.a(android.net.Uri):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPageFinished(android.webkit.WebView r9, java.lang.String r10) {
            /*
                Method dump skipped, instructions count: 456
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.consent.ConsentActivity.a.onPageFinished(android.webkit.WebView, java.lang.String):void");
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(Uri.parse(str));
        }
    }
}
