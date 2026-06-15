package com.appnext.banners;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.appnext.banners.e;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.C0400r;
import com.appnext.core.SettingsManager;
import com.appnext.core.h;
import com.appnext.core.i;
import com.appnext.core.p;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerActivity extends Activity {
    boolean aA;
    BannerAd bannerAd;
    BannerAdData bj;
    String bk;
    String bl;
    String bm;
    String bn;
    String bo;
    BaseBannerAdapter bp;
    Banner bq;
    BannerAdData selectedAd;
    C0400r userAction;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class Banner extends BannerView {
        public Banner(Context context) {
            super(context);
        }

        @Override // com.appnext.banners.BannerView, com.appnext.banners.BaseBannerView
        protected BaseBannerAdapter getBannerAdapter() {
            return BannerActivity.this.bp;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends e {

        /* renamed from: com.appnext.banners.BannerActivity$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class C0152a extends WebViewClient {
            public C0152a() {
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                p.ac().a(new Runnable() { // from class: com.appnext.banners.BannerActivity.a.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final String a10 = i.a(a.this.context, false);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.banners.BannerActivity.a.a.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    a aVar = a.this;
                                    aVar.loadJS("javascript:(function() { try { Appnext.setParams(" + a.this.getConfigParams().put("did", a10).toString() + "); } catch(err){ Appnext.jsError(err.message); }})()");
                                } catch (Throwable unused) {
                                }
                                a aVar2 = a.this;
                                aVar2.loadJS("javascript:(function() { try { Appnext.load(" + a.this.getSelectedAd().getAdJSON() + "," + BannerActivity.this.bo + "," + BannerActivity.this.bk + "); } catch(err){ Appnext.jsError(err.message); }})()");
                            }
                        });
                    }
                });
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str == null) {
                    return false;
                }
                try {
                    if (str.startsWith("http")) {
                        webView.loadUrl(str);
                        return true;
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("BWebViewClient$shouldOverrideUrlLoading", th);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class b extends e.a {
            public b() {
                super();
            }

            @JavascriptInterface
            public final void adClicked(String str, int i10) {
                BannerActivity bannerActivity = BannerActivity.this;
                com.appnext.banners.b.J();
                bannerActivity.bj = new BannerAdData((AppnextAd) com.appnext.core.d.parseAd(str));
                BannerActivity bannerActivity2 = BannerActivity.this;
                C0400r c0400r = bannerActivity2.userAction;
                BannerAdData bannerAdData = bannerActivity2.bj;
                c0400r.a(bannerAdData, BannerActivity.this.bj.getAppURL() + "&tem_id=" + a.this.getBannerAd().getTemId(a.this.getSelectedAd()) + "1", a.this.getPlacementId(), new h.a() { // from class: com.appnext.banners.BannerActivity.a.b.1
                    @Override // com.appnext.core.h.a
                    public final void error(String str2) {
                    }

                    @Override // com.appnext.core.h.a
                    public final void onMarket(String str2) {
                        BannerActivity bannerActivity3 = BannerActivity.this;
                        if (bannerActivity3.aA) {
                            bannerActivity3.finish();
                        }
                    }
                });
            }

            @JavascriptInterface
            public final void impression(String str) {
                com.appnext.banners.b.J();
                BannerActivity.this.userAction.d((AppnextAd) com.appnext.core.d.parseAd(str));
            }

            @Override // com.appnext.banners.e.a
            @JavascriptInterface
            public final void openLink(String str) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                BannerActivity.this.startActivity(intent);
            }

            @JavascriptInterface
            public final void postView(String str) {
                com.appnext.banners.b.J();
                BannerAdData bannerAdData = new BannerAdData((AppnextAd) com.appnext.core.d.parseAd(str));
                C0400r c0400r = BannerActivity.this.userAction;
                c0400r.a(bannerAdData, bannerAdData.getImpressionURL() + "&tem_id=" + a.this.getBannerAd().getTemId(a.this.getSelectedAd()) + "1", null);
            }
        }

        private a() {
        }

        @Override // com.appnext.banners.a
        protected final BannerAdRequest getAdRequest() {
            return new BannerAdRequest();
        }

        @Override // com.appnext.banners.a
        protected final BannerAd getBannerAd() {
            return BannerActivity.this.bannerAd;
        }

        @Override // com.appnext.banners.e
        protected final String getFallbackScript() {
            return new com.appnext.core.result.b().D();
        }

        @Override // com.appnext.banners.e
        protected final String getJSurl() {
            return "https://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
        }

        @Override // com.appnext.banners.e
        protected final int getLayout() {
            return R.layout.apnxt_full_screen;
        }

        @Override // com.appnext.banners.e, com.appnext.banners.a
        protected final BannerAdData getSelectedAd() {
            return BannerActivity.this.selectedAd;
        }

        @Override // com.appnext.banners.e
        protected final e.a getWebInterface() {
            return new b();
        }

        @Override // com.appnext.banners.e
        protected final WebViewClient getWebViewClient() {
            return new C0152a();
        }

        @Override // com.appnext.banners.a, com.appnext.banners.BaseBannerAdapter
        public final void loadAd(BannerAdRequest bannerAdRequest) {
            inflateView(0, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r0 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r0 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        return com.appnext.banners.BannerSize.BANNER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
        return com.appnext.banners.BannerSize.MEDIUM_RECTANGLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
        return com.appnext.banners.BannerSize.LARGE_BANNER;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.appnext.banners.BannerSize j(java.lang.String r5) {
        /*
            r0 = -1
            int r1 = r5.hashCode()     // Catch: java.lang.Throwable -> L46
            r2 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2b
            r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r1 == r2) goto L21
            r2 = 1951953708(0x7458732c, float:6.859571E31)
            if (r1 == r2) goto L17
            goto L34
        L17:
            java.lang.String r1 = "BANNER"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L34
            r0 = 0
            goto L34
        L21:
            java.lang.String r1 = "MEDIUM_RECTANGLE"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L34
            r0 = r3
            goto L34
        L2b:
            java.lang.String r1 = "LARGE_BANNER"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L34
            r0 = r4
        L34:
            if (r0 == 0) goto L43
            if (r0 == r4) goto L40
            if (r0 == r3) goto L3d
            com.appnext.banners.BannerSize r5 = com.appnext.banners.BannerSize.BANNER
            return r5
        L3d:
            com.appnext.banners.BannerSize r5 = com.appnext.banners.BannerSize.MEDIUM_RECTANGLE     // Catch: java.lang.Throwable -> L46
            return r5
        L40:
            com.appnext.banners.BannerSize r5 = com.appnext.banners.BannerSize.LARGE_BANNER     // Catch: java.lang.Throwable -> L46
            return r5
        L43:
            com.appnext.banners.BannerSize r5 = com.appnext.banners.BannerSize.BANNER     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            java.lang.String r0 = "BannerActivity$getSize"
            com.appnext.base.a.a(r0, r5)
            com.appnext.banners.BannerSize r5 = com.appnext.banners.BannerSize.BANNER
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerActivity.j(java.lang.String):com.appnext.banners.BannerSize");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r0 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r0 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        return new com.appnext.banners.SmallBannerAd(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        return new com.appnext.banners.MediumRectangleAd(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        return new com.appnext.banners.LargeBannerAd(r5, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.appnext.core.Ad b(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = -1
            int r1 = r7.hashCode()     // Catch: java.lang.Throwable -> L52
            r2 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2b
            r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r1 == r2) goto L21
            r2 = 1951953708(0x7458732c, float:6.859571E31)
            if (r1 == r2) goto L17
            goto L34
        L17:
            java.lang.String r1 = "BANNER"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L34
            r0 = 0
            goto L34
        L21:
            java.lang.String r1 = "MEDIUM_RECTANGLE"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L34
            r0 = r3
            goto L34
        L2b:
            java.lang.String r1 = "LARGE_BANNER"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L34
            r0 = r4
        L34:
            if (r0 == 0) goto L4c
            if (r0 == r4) goto L46
            if (r0 == r3) goto L40
            com.appnext.banners.SmallBannerAd r7 = new com.appnext.banners.SmallBannerAd
            r7.<init>(r5, r6)
            return r7
        L40:
            com.appnext.banners.MediumRectangleAd r7 = new com.appnext.banners.MediumRectangleAd     // Catch: java.lang.Throwable -> L52
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L52
            return r7
        L46:
            com.appnext.banners.LargeBannerAd r7 = new com.appnext.banners.LargeBannerAd     // Catch: java.lang.Throwable -> L52
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L52
            return r7
        L4c:
            com.appnext.banners.SmallBannerAd r7 = new com.appnext.banners.SmallBannerAd     // Catch: java.lang.Throwable -> L52
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L52
            return r7
        L52:
            r7 = move-exception
            java.lang.String r0 = "BannerActivity$createAd"
            com.appnext.base.a.a(r0, r7)
            com.appnext.banners.SmallBannerAd r7 = new com.appnext.banners.SmallBannerAd
            r7.<init>(r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerActivity.b(java.lang.String, java.lang.String):com.appnext.core.Ad");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            super.onCreate(bundle);
            this.bp = new a();
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            setContentView(linearLayout);
            this.userAction = new C0400r(this, new C0400r.a() { // from class: com.appnext.banners.BannerActivity.1
                @Override // com.appnext.core.C0400r.a
                public final Ad c() {
                    return BannerActivity.this.bannerAd;
                }

                @Override // com.appnext.core.C0400r.a
                public final AppnextAd d() {
                    return BannerActivity.this.bj;
                }

                @Override // com.appnext.core.C0400r.a
                public final SettingsManager e() {
                    return d.K();
                }

                @Override // com.appnext.core.C0400r.a
                public final void report(String str) {
                }
            });
            Bundle extras = getIntent().getExtras();
            this.bm = extras.getString("placement");
            String string = extras.getString("size");
            this.bn = string;
            BannerAd bannerAd = (BannerAd) b(this.bm, string);
            this.bannerAd = bannerAd;
            bannerAd.setPostback(extras.getString("postback"));
            this.bannerAd.setCategories(extras.getString("category"));
            this.bl = extras.getString("clicked");
            this.aA = extras.getBoolean("shouldClose", false);
            this.selectedAd = (BannerAdData) extras.getSerializable("selected");
            this.bk = b.J().k(this.bannerAd);
            ArrayList<AppnextAd> e8 = b.J().e(this.bannerAd);
            JSONArray jSONArray = new JSONArray();
            if (e8 != null) {
                Iterator<AppnextAd> it = e8.iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(new BannerAdData(it.next()).getAdJSON()));
                }
            }
            this.bo = new JSONObject().put("apps", jSONArray).toString();
            Banner banner = new Banner(this);
            this.bq = banner;
            linearLayout.addView(banner);
            this.bq.getLayoutParams().height = -1;
            this.bq.getLayoutParams().width = -1;
            this.bq.setPlacementId(this.bm);
            this.bq.setBannerSize(j(this.bn));
            this.bq.loadAd(null);
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerActivity$onCreate", th);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            C0400r c0400r = this.userAction;
            if (c0400r != null) {
                c0400r.destroy();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("BannerActivity$onDestroy", th);
        }
        try {
            BannerAd bannerAd = this.bannerAd;
            if (bannerAd != null) {
                bannerAd.destroy();
            }
        } catch (Throwable th2) {
            com.appnext.base.a.a("BannerActivity$onDestroy", th2);
        }
        try {
            Banner banner = this.bq;
            if (banner != null) {
                banner.destroy();
            }
        } catch (Throwable th3) {
            com.appnext.base.a.a("BannerActivity$onDestroy", th3);
        }
    }
}
