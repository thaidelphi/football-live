package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.dp;
import com.ironsource.xn;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b7 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6708a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f6709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f6710c;

        a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
            this.f6708a = str;
            this.f6709b = aVar;
            this.f6710c = jVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f6708a, null);
                l2.c(this.f6709b.e(), this.f6709b.g(), this.f6709b.i());
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                l2.a(this.f6709b.e(), this.f6709b.g(), this.f6709b.i());
                this.f6710c.e().b(this);
            }
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.j jVar) {
        return a(uri, null, context, jVar);
    }

    public static boolean b(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && "com.applovin.sdk".equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static boolean a(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.j jVar) {
        boolean z10 = false;
        if (uri == null) {
            return false;
        }
        try {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = jVar.I();
                I.d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme()) || "play.google.com".equals(uri.getHost())) {
                if (Boolean.FALSE.equals(a(context))) {
                    intent.setPackage(dp.f17077b);
                } else {
                    intent.setPackage(null);
                }
            }
            jVar.e0().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I2 = jVar.I();
                I2.a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("url", uri.toString());
            if (bVar != null) {
                hashMap.putAll(a2.b(bVar));
                hashMap.putAll(a2.a(bVar));
            }
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) jVar.x().H().get("ps_version"), hashMap);
            }
            jVar.D().a("UriUtils", "openUri", th, hashMap);
        }
        if (!z10) {
            jVar.e0().resumeForClick();
        }
        return z10;
    }

    public static void b(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        String emptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter(xn.a.f21422g));
        String emptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String emptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> hashMap = CollectionUtils.hashMap("source", emptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", emptyIfNull2, hashMap);
        CollectionUtils.putStringIfValid("details", emptyIfNull3, hashMap);
        if (bVar != null) {
            hashMap.putAll(a2.b(bVar));
            hashMap.putAll(a2.a(bVar));
        }
        jVar.D().d(y1.f9691s0, hashMap);
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.adview.b f10 = aVar.f();
        String queryParameter = uri.getQueryParameter(com.ironsource.cc.f16875q);
        if (TextUtils.isEmpty(queryParameter)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("UriUtils", "Could not find url to load from query in original uri");
                return;
            }
            return;
        }
        String queryParameter2 = uri.getQueryParameter("load_type");
        if (com.ironsource.b4.f16497e.equalsIgnoreCase(queryParameter2)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = jVar.I();
                I.a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            a(queryParameter, aVar, jVar);
        } else if ("internal".equalsIgnoreCase(queryParameter2)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I2 = jVar.I();
                I2.a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            f10.loadUrl(queryParameter);
            String queryParameter3 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter3)) {
                f10.setBackgroundColor(Color.parseColor(queryParameter3));
            }
        } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I3 = jVar.I();
                I3.a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            jVar.e().a(new a(queryParameter, aVar, jVar));
            Intent intent = new Intent(com.applovin.impl.sdk.j.m(), AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, jVar.a0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.j.m().startActivity(intent);
        } else if ("in_app_v2".equalsIgnoreCase(queryParameter2)) {
            aVar.a(aVar.g(), aVar.i(), (Uri) null, f10.getAndClearLastClickEvent(), (Bundle) null);
            if (aVar.h() != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I4 = jVar.I();
                    I4.a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
                }
                jVar.w().a(queryParameter, aVar, jVar.m0());
                return;
            }
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I5 = jVar.I();
                I5.a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
            }
            a(queryParameter, aVar, jVar);
        } else {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("UriUtils", "Could not find load type in original uri");
            }
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        String queryParameter = uri.getQueryParameter(com.ironsource.cc.f16875q);
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode());
            jVar.W().e(com.applovin.impl.sdk.network.d.b().d(appendQueryParameter).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = jVar.I();
            I.b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    public static Bundle a(Uri uri) {
        Bundle bundle = new Bundle();
        for (String str : uri.getQueryParameterNames()) {
            bundle.putString(str, uri.getQueryParameter(str));
        }
        return bundle;
    }

    private static void a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        a(Uri.parse(str), aVar.g(), aVar.f().getContext(), jVar);
        l2.b(aVar.e(), aVar.g(), aVar.i());
    }

    public static Boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = true;
            packageManager.getPackageInfo(dp.f17077b, 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(dp.f17077b);
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
