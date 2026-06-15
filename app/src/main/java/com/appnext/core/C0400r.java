package com.appnext.core;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.appnext.core.h;
import com.ironsource.b9;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.IOException;
import java.util.HashMap;
/* renamed from: com.appnext.core.r  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class C0400r {
    private h click;
    private Context context;
    private a dJ;
    private String cv = "";
    private String guid = "";
    private String banner = "";
    private h.a dK = new h.a() { // from class: com.appnext.core.r.3
        @Override // com.appnext.core.h.a
        public final void error(String str) {
            try {
                C0400r.this.a(i.e("admin.appnext.com", "applink"), C0400r.this.dJ.d().getBannerID(), C0400r.this.dJ.c().getPlacementID(), C0400r.this.dJ.c().getTID(), str, "SetDOpenV1");
            } catch (Throwable th) {
                com.appnext.base.a.a("UserAction$error", th);
            }
            try {
                if (!Boolean.parseBoolean(C0400r.this.dJ.e().t("urlApp_protection"))) {
                    if (str == null) {
                        return;
                    }
                    C0400r.this.openLink(str);
                    return;
                }
                C0400r c0400r = C0400r.this;
                c0400r.openLink("market://details?id=" + C0400r.this.dJ.d().getAdPackage());
            } catch (Throwable th2) {
                com.appnext.base.a.a("UserAction$error", th2);
            }
        }

        @Override // com.appnext.core.h.a
        public final void onMarket(String str) {
            AppnextAd d10 = C0400r.this.dJ.d();
            Ad c10 = C0400r.this.dJ.c();
            if (c10 == null || d10 == null || C0400r.this.context == null) {
                return;
            }
            if (!i.b(C0400r.this.context, d10.getAdPackage())) {
                try {
                    if (str.startsWith("market://details?id=" + d10.getAdPackage()) || str.startsWith("http")) {
                        return;
                    }
                    C0400r.this.a(i.e("admin.appnext.com", "applink"), d10.getBannerID(), c10.getPlacementID(), c10.getTID(), str, "SetROpenV1");
                } catch (Throwable th) {
                    com.appnext.base.a.a("UserAction$onMarket", th);
                }
            } else if (str.startsWith("market://")) {
                try {
                    Intent launchIntentForPackage = C0400r.this.context.getPackageManager().getLaunchIntentForPackage(d10.getAdPackage());
                    launchIntentForPackage.addFlags(268435456);
                    C0400r.this.context.startActivity(launchIntentForPackage);
                } catch (Throwable unused) {
                    C0400r.this.dJ.report("error_no_market");
                }
            } else {
                try {
                    C0400r.this.openLink(str);
                } catch (Throwable unused2) {
                    C0400r.this.dJ.report("error_no_market");
                }
            }
        }
    };

    /* renamed from: com.appnext.core.r$a */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        Ad c();

        AppnextAd d();

        SettingsManager e();

        void report(String str);
    }

    public C0400r(Context context, a aVar) {
        this.context = context;
        this.click = h.c(context);
        this.dJ = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    public final void a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        final h hVar = this.click;
        if (hVar == null) {
            return;
        }
        p.ac().a(new Runnable() { // from class: com.appnext.core.h.7
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("guid", str);
                    hashMap.put("bannerId", str2);
                    hashMap.put("placementId", str3);
                    hashMap.put("vid", str4);
                    hashMap.put("url", str5);
                    Context context = hVar.context;
                    i.a(context, "https://admin.appnext.com/AdminService.asmx/" + str6, hashMap);
                } catch (Throwable th) {
                    com.appnext.base.a.a("AppnextCK$serverNotify", th);
                }
            }
        });
    }

    protected final boolean ae() {
        try {
            if (this.context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                i.a(this.context, "http://www.appnext.com/myid.html", null);
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                throw new IOException();
            }
            return true;
        } catch (Throwable th) {
            com.appnext.base.a.a("UserAction$checkConnection", th);
            return false;
        }
    }

    public final void c(AppnextAd appnextAd, h.a aVar) {
        this.click.a(appnextAd.getMarketUrl(), aVar);
    }

    public final void d(AppnextAd appnextAd) {
        try {
            h hVar = this.click;
            if (hVar != null) {
                hVar.d(appnextAd);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("UserAction$adImpression", th);
        }
    }

    public final void destroy() {
        this.context = null;
        if (this.click != null) {
            this.click = null;
        }
    }

    public final void a(final AppnextAd appnextAd, String str, h.a aVar) {
        final h hVar = this.click;
        if (hVar == null) {
            return;
        }
        p.ac().a(new Runnable() { // from class: com.appnext.core.h.6
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context = hVar.context;
                    i.a(context, appnextAd.getImpressionURL() + "&device=" + i.X() + "&ox=0", null);
                } catch (Throwable th) {
                    com.appnext.base.a.a("AppnextCK$adVta", th);
                }
            }
        });
    }

    public final void a(AppnextAd appnextAd, final String str, String str2, final h.a aVar) {
        try {
            if (!ae()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.r.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            h.a aVar2 = C0400r.this.dK;
                            aVar2.error(str + "&device=" + i.X());
                            h.a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.error(str + "&device=" + i.X());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } else if (appnextAd == null) {
            } else {
                if (!TextUtils.isEmpty(this.cv) && this.cv.contains(appnextAd.getAdPackage())) {
                    i.a(this.context, "https://admin.appnext.com/AdminService.asmx/SetRL?guid=" + this.guid + "&bid=" + this.banner + "&pid=" + str2, null);
                    this.dK.onMarket(this.cv);
                    if (aVar != null) {
                        aVar.onMarket(this.cv);
                    }
                    this.cv = "";
                    return;
                }
                String str3 = str + "&device=" + i.X();
                String webview = appnextAd.getWebview();
                char c10 = 65535;
                switch (webview.hashCode()) {
                    case 48:
                        if (webview.equals("0")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 49:
                        if (webview.equals("1")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 50:
                        if (webview.equals(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 51:
                        if (webview.equals("3")) {
                            c10 = 0;
                            break;
                        }
                        break;
                }
                if (c10 == 0) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str3));
                    intent.addFlags(268435456);
                    try {
                        this.context.startActivity(intent);
                        if (aVar != null) {
                            aVar.onMarket(str3);
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("UserAction$doClick", th);
                    }
                } else if (c10 == 1) {
                    this.dK.onMarket(str3);
                    if (aVar != null) {
                        aVar.onMarket(str3);
                    }
                } else if (c10 != 2) {
                    h hVar = this.click;
                    if (hVar == null) {
                        return;
                    }
                    hVar.a(appnextAd.getAppURL(), appnextAd.getMarketUrl(), str3, appnextAd.getBannerID(), new h.a() { // from class: com.appnext.core.r.2
                        @Override // com.appnext.core.h.a
                        public final void error(String str4) {
                            C0400r.this.dK.error(str4);
                            h.a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.error(str4);
                            }
                        }

                        @Override // com.appnext.core.h.a
                        public final void onMarket(String str4) {
                            C0400r.this.dK.onMarket(str4);
                            h.a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.onMarket(str4);
                            }
                        }
                    }, Long.parseLong(this.dJ.e().t("resolve_timeout")) * 1000);
                } else {
                    Intent intent2 = new Intent(this.context, ResultActivity.class);
                    intent2.putExtra("url", str3);
                    intent2.putExtra(b9.h.D0, appnextAd.getAdTitle());
                    intent2.addFlags(268435456);
                    this.context.startActivity(intent2);
                    if (aVar != null) {
                        aVar.onMarket(str3);
                    }
                }
            }
        } catch (Throwable th2) {
            com.appnext.base.a.a("UserAction$doClick", th2);
        }
    }
}
