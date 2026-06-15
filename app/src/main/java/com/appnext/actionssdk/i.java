package com.appnext.actionssdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.appnext.core.AppnextError;
import com.appnext.core.ResultActivity;
import com.appnext.core.e;
import com.ironsource.b9;
import com.ironsource.m5;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {
    public static void a(final Context context, final AdData adData, int i10, final e eVar) {
        String str;
        adData.C();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("acid", adData.I());
            jSONObject.put("is_sponsored", adData.getType().equals(AdData.SPONSORED) ? 1 : 0);
            jSONObject.put("package", adData.C());
            jSONObject.put("name", adData.getName() != null ? adData.getName() : context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(adData.C(), 0)));
            jSONObject.put(m5.f18418u, i10);
            c.a(context, "suggested-clicked", jSONObject.toString());
        } catch (Throwable unused) {
        }
        if (ActionSDK.aT.getOnAdClickedCallback() != null) {
            ActionSDK.aT.getOnAdClickedCallback().adClicked();
        }
        if (com.appnext.core.f.i(context, adData.C())) {
            try {
                c.a(context, "opened", new JSONObject().put("acid", adData.I()).put("name", adData.getName() != null ? adData.getName() : context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(adData.C(), 0))).put("package", adData.C()).toString());
            } catch (Throwable unused2) {
            }
            if (!adData.getType().equals(AdData.SPONSORED)) {
                c(context, adData.C());
                return;
            }
            com.appnext.core.e.r(context).a(adData.B() + "&device=" + com.appnext.core.f.cE() + "&ins=1", adData.J(), new e.a() { // from class: com.appnext.actionssdk.i.1
                public final void error(String str2) {
                    i.c(context, adData.C());
                }

                public final void onMarket(String str2) {
                    if (str2.startsWith("market://")) {
                        i.c(context, adData.C());
                    } else {
                        i.c(context, str2, adData.C());
                    }
                }
            });
            return;
        }
        String B = adData.B();
        if (B.startsWith("https://play.google.com/store/apps/")) {
            str = B.replace("https://play.google.com/store/apps/", "market://");
        } else {
            str = B + "&device=" + com.appnext.core.f.cE() + "&ins=0";
        }
        if (!adData.getWebview().equals(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION) && (str.startsWith("http://") || str.startsWith("https://"))) {
            if (adData.getWebview().equals("0")) {
                com.appnext.core.e.r(context).a(str, adData.J(), new e.a() { // from class: com.appnext.actionssdk.i.2
                    public final void error(String str2) {
                        Context context2 = context;
                        i.c(context2, "market://details?id=" + adData.C(), null);
                    }

                    public final void onMarket(String str2) {
                        i.a(context, adData, str2, eVar);
                        i.c(context, str2, adData.C());
                    }
                });
                return;
            }
            Intent intent = new Intent(context, ResultActivity.class);
            intent.putExtra("url", str);
            intent.putExtra(b9.h.D0, adData.getName());
            intent.addFlags(268435456);
            context.startActivity(intent);
            return;
        }
        a(context, adData, str, eVar);
        c(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, String str2) {
        String b10;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (str2 != null && (b10 = b(context, str, str2)) != null) {
            intent.setPackage(b10);
        }
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            if (ActionSDK.aT.getOnAdErrorCallback() != null) {
                ActionSDK.aT.getOnAdErrorCallback().adError(AppnextError.NO_MARKET);
            }
        }
    }

    private static String b(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            String str3 = resolveActivity.activityInfo.packageName;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (arrayList.contains(str2)) {
            return str2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
        } catch (Throwable unused) {
            ActionAd actionAd = ActionSDK.aT;
            if (actionAd == null || actionAd.getOnAdErrorCallback() == null) {
                return;
            }
            ActionSDK.aT.getOnAdErrorCallback().adError(AppnextError.NO_MARKET);
        }
    }

    private static void b(Context context, String str) {
        c(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, AdData adData, String str, e eVar) {
        if (eVar != null) {
            eVar.a(adData.C(), str, com.appnext.core.f.n("admin.appnext.com", "applink"), adData.J(), adData.getPlacementID().equals("") ? ActionSDK.aT.getPlacementID() : adData.getPlacementID(), ActionSDK.aT.getVID(), adData.I(), adData.getName(), null);
            eVar.A(context.getApplicationContext());
        }
    }
}
