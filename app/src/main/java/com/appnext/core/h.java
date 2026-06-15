package com.appnext.core;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.dp;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {
    @SuppressLint({"StaticFieldLeak"})
    private static h cL;
    private WebView cE;
    private WebView cF;
    private a cG;
    private Runnable cH;
    private List cI;
    private final ArrayList<b> cJ = new ArrayList<>();
    private int cK;
    private Context context;
    private Handler handler;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void error(String str);

        void onMarket(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b {
        String cT;
        String cU;
        a cV;
        String cW;
        long cX;

        /* renamed from: v  reason: collision with root package name */
        String f10055v;

        b(String str, String str2, String str3, String str4, a aVar, long j10) {
            this.cT = str;
            this.cU = str2;
            this.f10055v = str3;
            this.cV = aVar;
            this.cW = str4;
            this.cX = j10;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private h(Context context) {
        try {
            this.context = context.getApplicationContext();
            this.handler = new Handler(Looper.getMainLooper());
            this.cK = 0;
            this.cG = new a() { // from class: com.appnext.core.h.1
                @Override // com.appnext.core.h.a
                public final void error(String str) {
                    h.this.b(0);
                    if (h.this.cJ.size() == 0) {
                        return;
                    }
                    a aVar = ((b) h.this.cJ.get(0)).cV;
                    if (aVar != null) {
                        aVar.error(str);
                    }
                    h.this.V();
                }

                @Override // com.appnext.core.h.a
                public final void onMarket(String str) {
                    try {
                        h.this.b(0);
                        if (h.this.cJ.size() == 0) {
                            return;
                        }
                        a aVar = ((b) h.this.cJ.get(0)).cV;
                        if (aVar != null) {
                            aVar.onMarket(str);
                        }
                        String str2 = "";
                        try {
                            if (h.this.cJ != null && !h.this.cJ.isEmpty()) {
                                str2 = "https://admin.appnext.com/tools/navtac.html?bid=" + ((b) h.this.cJ.get(0)).cW + "&guid=" + i.e("admin.appnext.com", "applink") + "&url=" + URLEncoder.encode(str, "UTF-8");
                            }
                            if (h.this.cF == null) {
                                h.this.cF = new WebView(h.this.context);
                                h.this.cF.getSettings().setJavaScriptEnabled(true);
                                h.this.cF.getSettings().setDomStorageEnabled(true);
                                if (Build.VERSION.SDK_INT >= 21) {
                                    h.this.cF.getSettings().setMixedContentMode(0);
                                }
                                h.this.cF.setWebViewClient(new WebViewClient() { // from class: com.appnext.core.h.1.1
                                    @Override // android.webkit.WebViewClient
                                    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                                        if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                                            return false;
                                        }
                                        if (h.this.cF != null) {
                                            h.this.cF.destroy();
                                            h.this.cF = null;
                                            return true;
                                        }
                                        return true;
                                    }

                                    @Override // android.webkit.WebViewClient
                                    public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                                        if (str3 == null) {
                                            return false;
                                        }
                                        try {
                                            if (str3.contains(AndroidWebViewClient.BLANK_PAGE)) {
                                                return false;
                                            }
                                            webView.loadUrl(str3);
                                            return true;
                                        } catch (Throwable th) {
                                            com.appnext.base.a.a("AppnextCK$AppnextCK", th);
                                            return false;
                                        }
                                    }
                                });
                            }
                            h.this.cF.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                            h.this.cF.loadUrl(str2);
                            h.this.W();
                            h.this.V();
                        } catch (UnsupportedEncodingException e8) {
                            com.appnext.base.a.a("AppnextCK$AppnextCK", e8);
                            h.this.V();
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("AppnextCK$AppnextCK", th);
                    }
                }
            };
            this.cH = new Runnable() { // from class: com.appnext.core.h.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (h.this.cG != null && h.this.cE != null) {
                        h.this.cG.error(h.this.cE.getUrl());
                        h.this.cE.stopLoading();
                    }
                    h.this.V();
                }
            };
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextCK$AppnextCK", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        try {
            this.cK = 0;
            if (this.cJ.size() == 0) {
                return;
            }
            String str = this.cJ.get(0).f10055v;
            this.cJ.get(0).cV = null;
            this.cJ.remove(0);
            this.cJ.size();
            a(null, null, null, null, null);
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextCK$loadNext", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        this.cK = i10;
    }

    public static h c(Context context) {
        if (cL == null) {
            synchronized (h.class) {
                if (cL == null) {
                    cL = new h(context);
                }
            }
        }
        return cL;
    }

    private boolean n(String str) {
        try {
            this.context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openMarket(String str) {
        try {
            if ((str.startsWith("market://") || str.startsWith("https://play.google.com/store")) && n(dp.f17077b)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                Iterator<ResolveInfo> it = this.context.getPackageManager().queryIntentActivities(intent, 0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (next.activityInfo.applicationInfo.packageName.equals(dp.f17077b)) {
                        ActivityInfo activityInfo = next.activityInfo;
                        ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                        intent.addFlags(268435456);
                        intent.addFlags(2097152);
                        intent.addFlags(131072);
                        intent.addFlags(67108864);
                        intent.setComponent(componentName);
                        this.context.startActivity(intent);
                        break;
                    }
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.setFlags(268435456);
                this.context.startActivity(intent2);
            }
            a aVar = this.cG;
            if (aVar != null) {
                aVar.onMarket(str);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextCK$openMarket", th);
            a aVar2 = this.cG;
            if (aVar2 != null) {
                aVar2.error(str);
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, a aVar) {
        a(str, str2, str3, str4, aVar, 16000L);
    }

    public final void d(final AppnextAd appnextAd) {
        p.ac().a(new Runnable() { // from class: com.appnext.core.h.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    i.a(h.this.context, appnextAd.getImpressionURL(), null);
                } catch (Throwable th) {
                    com.appnext.base.a.a("AppnextCK$adImpression", th);
                }
            }
        });
    }

    public final void a(String str, String str2, String str3, String str4, a aVar, long j10) {
        try {
            if (this.context == null) {
                return;
            }
            if (str3 != null) {
                Iterator<b> it = this.cJ.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (!TextUtils.isEmpty(next.f10055v) && next.f10055v.equals(str3)) {
                        return;
                    }
                }
                if (str3.endsWith("&ox=0")) {
                    this.cJ.add(new b(str, str2, str3, str4, aVar, j10));
                } else {
                    this.cK = 0;
                    if (this.cJ.size() > 0 && !this.cJ.get(0).f10055v.endsWith("&ox=0")) {
                        String str5 = this.cJ.get(0).f10055v;
                        this.cJ.get(0).cV = null;
                        this.cJ.remove(0);
                        this.cJ.size();
                    }
                    this.cJ.add(0, new b(str, str2, str3, str4, aVar, j10));
                }
            }
            if (this.cJ.size() <= 0 || this.cK == 1) {
                return;
            }
            this.cK = 1;
            String str6 = this.cJ.get(0).cW;
            String str7 = this.cJ.get(0).f10055v;
            a(this.cJ.get(0));
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextCK$load", th);
        }
    }

    public final void a(String str, a aVar) {
        if (!TextUtils.isEmpty(str)) {
            openMarket(str);
        } else if (aVar != null) {
            aVar.error(str);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(final b bVar) {
        try {
            if (!TextUtils.isEmpty(bVar.cU)) {
                openMarket(bVar.cU);
                p.ac().a(new Runnable() { // from class: com.appnext.core.h.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            i.a(h.this.context, bVar.cT, null);
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            W();
            if (this.cE == null) {
                WebView webView = new WebView(this.context);
                this.cE = webView;
                webView.getSettings().setJavaScriptEnabled(true);
                this.cE.getSettings().setDomStorageEnabled(true);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.cE.getSettings().setMixedContentMode(0);
                }
                this.cE.setWebViewClient(new WebViewClient() { // from class: com.appnext.core.h.4
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                            return false;
                        }
                        if (h.this.cE != null) {
                            h.this.cE.destroy();
                            h.this.cE = null;
                            return true;
                        }
                        return true;
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                        String str2;
                        List<ResolveInfo> queryIntentActivities;
                        if (str == null) {
                            return false;
                        }
                        if (str.startsWith("https://play.google.com/store/apps/")) {
                            str = str.replace("https://play.google.com/store/apps/", "market://");
                        }
                        if (str.contains(AndroidWebViewClient.BLANK_PAGE)) {
                            return false;
                        }
                        if (!str.startsWith("http://") && !str.startsWith("https://")) {
                            if (str.startsWith("intent://")) {
                                try {
                                    Intent parseUri = Intent.parseUri(str, 1);
                                    if (h.this.context.getPackageManager().resolveActivity(parseUri, 65536) != null) {
                                        h.this.W();
                                        if (h.this.cG != null) {
                                            h.this.cG.onMarket(parseUri.getData().toString());
                                        }
                                        return true;
                                    }
                                    if (parseUri.getExtras() != null && parseUri.getExtras().containsKey("browser_fallback_url") && !parseUri.getExtras().getString("browser_fallback_url").equals("")) {
                                        str2 = parseUri.getExtras().getString("browser_fallback_url");
                                    } else if (parseUri.getExtras().containsKey("market_referrer") && !parseUri.getExtras().getString("market_referrer").equals("")) {
                                        str2 = "market://details?id=" + parseUri.getPackage() + "&referrer=" + parseUri.getExtras().getString("market_referrer");
                                    } else {
                                        h.this.W();
                                        if (h.this.cG != null) {
                                            h.this.cG.error(str);
                                        }
                                        return true;
                                    }
                                    h.this.W();
                                    if (h.this.cG != null) {
                                        h.this.cG.onMarket(str2);
                                    }
                                    return true;
                                } catch (Throwable unused) {
                                    return false;
                                }
                            }
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            try {
                                queryIntentActivities = h.this.context.getPackageManager().queryIntentActivities(intent, 0);
                            } catch (Throwable unused2) {
                            }
                            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                                h.this.W();
                                h.this.openMarket(str);
                                if (h.this.cG != null) {
                                    h.this.cG.onMarket(str);
                                }
                                return true;
                            }
                            webView2.loadUrl(str);
                            return false;
                        }
                        Intent a10 = h.this.a(h.o(str).setComponent(null));
                        if (a10 != null) {
                            h.this.W();
                            if (h.this.cG != null) {
                                h.this.cG.onMarket(str);
                            }
                            a10.addFlags(268435456);
                            h.this.context.startActivity(a10);
                            return true;
                        }
                        webView2.loadUrl(str);
                        return true;
                    }
                });
            }
            this.cE.stopLoading();
            this.cE.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            this.cI = a(this.context, o(bVar.f10055v).setComponent(null));
            this.cE.loadUrl(bVar.f10055v);
            this.handler.postDelayed(this.cH, bVar.f10055v.endsWith("&ox=0") ? 15000L : bVar.cX);
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextCK$load1", th);
            a aVar = this.cG;
            if (aVar != null) {
                aVar.error(bVar.f10055v);
            }
            V();
        }
    }

    private static List a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        return arrayList;
    }

    public final Intent a(Intent intent) {
        List<ComponentName> a10 = a(this.context, intent);
        new HashSet();
        for (ComponentName componentName : a10) {
            if (!this.cI.contains(componentName)) {
                Intent intent2 = new Intent();
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }
}
