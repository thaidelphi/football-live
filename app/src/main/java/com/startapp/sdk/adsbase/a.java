package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ironsource.b9;
import com.startapp.c5;
import com.startapp.g9;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.p;
import com.startapp.q;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.Constants;
import com.startapp.y;
import com.startapp.y5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f22950a;

    /* renamed from: b  reason: collision with root package name */
    public static ProgressDialog f22951b;

    public static String a(Activity activity) {
        try {
            return activity.getResources().getString(activity.getApplicationInfo().labelRes);
        } catch (Throwable unused) {
            PackageManager packageManager = activity.getPackageManager();
            ApplicationInfo applicationInfo = null;
            try {
                applicationInfo = packageManager.getApplicationInfo(activity.getApplicationInfo().packageName, 0);
            } catch (Throwable unused2) {
            }
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Welcome!");
        }
    }

    public static boolean b(Activity activity) {
        boolean z10 = activity.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
            return true;
        }
        return z10;
    }

    public static void a(String str, String str2, String str3, Context context, TrackingParams trackingParams) {
        if (o9.b(str3)) {
            StringBuilder sb = new StringBuilder(str3);
            String a10 = a(str3, (String) null);
            if (a10 != null) {
                sb.append(com.startapp.a.c(a10));
            }
            if (trackingParams != null) {
                sb.append(trackingParams.e());
            }
            str3 = sb.toString();
        }
        try {
            com.startapp.sdk.components.a a11 = com.startapp.sdk.components.a.a(context);
            a11.f23249y.a().execute(new g9(a11.f23232h, a11.f23237m, str3, null));
        } catch (Throwable th) {
            l3.a(th);
        }
        Intent b10 = o9.b(context, str);
        if (b10 != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b10.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b10 != null) {
            try {
                context.startActivity(b10);
            } catch (Throwable th2) {
                l3.a(th2);
            }
        }
    }

    public static boolean b(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    public static void b(Context context) {
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            WeakHashMap weakHashMap = o9.f22359a;
            o9.a(activity, activity.getResources().getConfiguration().orientation, false);
        }
        ProgressDialog progressDialog = f22951b;
        if (progressDialog != null) {
            synchronized (progressDialog) {
                ProgressDialog progressDialog2 = f22951b;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    f22951b.cancel();
                    f22951b = null;
                }
            }
        }
    }

    public static void a(Context context, String str, String[] strArr, String str2, TrackingParams trackingParams, long j10, long j11, boolean z10, Boolean bool, boolean z11, Runnable runnable) {
        String str3;
        boolean a10;
        if (AdsCommonMetaData.f22889h.N()) {
            Pair<String, String> a11 = a(context, strArr, str, trackingParams, z11);
            String str4 = (String) a11.first;
            String str5 = (String) a11.second;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(AdsCommonMetaData.f22889h.M() || TextUtils.isEmpty(str4) ? com.startapp.a.c(str5) : "");
            String sb2 = sb.toString();
            Intent intent = new Intent("com.startapp.android.OnClickCallback");
            intent.putExtra("dParam", str5);
            c5.a(context).a(intent);
            if (a(sb2)) {
                if (str2 != null && !str2.equals("") && !sb2.toLowerCase().contains(str2.toLowerCase())) {
                    l3 l3Var = new l3(m3.f22275e);
                    l3Var.f22228d = "Wrong package reached";
                    l3Var.f22229e = "Expected: " + str2 + ", Link: " + sb2;
                    l3Var.f22231g = str5;
                    l3Var.a();
                }
                a(context, sb2);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                WeakHashMap weakHashMap = o9.f22359a;
                o9.a(activity, activity.getResources().getConfiguration().orientation, true);
            }
            try {
                WebView c10 = com.startapp.sdk.components.a.a(context).f23225a.a().c();
                if (f22951b == null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 22) {
                        f22951b = new ProgressDialog(context, 16974545);
                    } else {
                        f22951b = new ProgressDialog(context);
                    }
                    f22951b.setTitle((CharSequence) null);
                    f22951b.setMessage("Loading....");
                    f22951b.setIndeterminate(false);
                    f22951b.setCancelable(false);
                    f22951b.setOnCancelListener(new p(c10));
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        f22951b.show();
                    } else if (!(context instanceof Activity)) {
                        if (i10 >= 23) {
                            a10 = Settings.canDrawOverlays(context);
                        } else {
                            a10 = y.a(context, "android.permission.SYSTEM_ALERT_WINDOW");
                        }
                        if (a10 && f22951b.getWindow() != null) {
                            if (i10 >= 26) {
                                f22951b.getWindow().setType(2038);
                            } else {
                                f22951b.getWindow().setType(2003);
                            }
                            f22951b.show();
                        }
                    }
                }
                c10.getSettings().setJavaScriptEnabled(true);
                c10.setWebChromeClient(new WebChromeClient());
                try {
                    c10.setWebViewClient(new y5(context, com.startapp.sdk.components.a.a(context).E, com.startapp.sdk.components.a.a(context).B, new Handler(Looper.getMainLooper()), j10, j11, z10, bool, sb2, str2, str5, runnable));
                    str3 = sb2;
                    try {
                        c10.loadUrl(str3);
                    } catch (Throwable th) {
                        th = th;
                        l3.a(th);
                        a(context, str3);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str3 = sb2;
                }
            } catch (Throwable th3) {
                th = th3;
                str3 = sb2;
            }
        } else {
            a(context, str, strArr, trackingParams, z10, z11);
        }
    }

    public static void a(String[] strArr, String str, int i10, String str2) {
        String encode;
        TrackingParams a10 = new TrackingParams(str).a(i10).a(str2);
        if (strArr != null && strArr.length != 0) {
            for (String str3 : strArr) {
                if (str3 != null && str3.length() > 0) {
                    l3 l3Var = new l3(m3.f22281k);
                    if (o9.b(str3)) {
                        StringBuilder sb = new StringBuilder(str3);
                        String a11 = a(str3, (String) null);
                        if (a11 != null) {
                            sb.append(com.startapp.a.c(a11));
                        }
                        sb.append(a10.e());
                        str3 = sb.toString();
                    }
                    l3Var.f22229e = str3;
                    l3Var.a();
                }
            }
            return;
        }
        l3 l3Var2 = new l3(m3.f22275e);
        l3Var2.f22228d = "Non-impression without trackingUrls";
        l3Var2.f22233i = str2;
        String d10 = a10.d();
        if (d10 != null) {
            try {
                encode = URLEncoder.encode(d10, "UTF-8");
            } catch (UnsupportedEncodingException e8) {
                throw new RuntimeException(e8);
            }
        } else {
            encode = "";
        }
        l3Var2.f22229e = encode;
        l3Var2.a();
    }

    public static ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int i11 = i10 + 5;
            List subList = arrayList.subList(i10, Math.min(i11, arrayList.size()));
            arrayList2.add(q.f22399e + "?" + TextUtils.join(b9.i.f16694c, subList) + "&isShown=false" + "&appPresence=".concat(str));
            i10 = i11;
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x000c, B:5:0x0014, B:11:0x0020, B:12:0x0033, B:15:0x003d, B:16:0x0041, B:18:0x0047, B:20:0x004d, B:21:0x007f), top: B:26:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r0, java.lang.String r1, java.lang.String[] r2, com.startapp.sdk.adsbase.commontracking.TrackingParams r3, boolean r4, boolean r5) {
        /*
            android.util.Pair r2 = a(r0, r2, r1, r3, r5)
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            com.startapp.sdk.adsbase.AdsCommonMetaData r5 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22889h     // Catch: java.lang.Throwable -> L83
            boolean r5 = r5.M()     // Catch: java.lang.Throwable -> L83
            if (r5 != 0) goto L1d
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            r5 = 0
            goto L1e
        L1d:
            r5 = 1
        L1e:
            if (r5 == 0) goto L33
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L83
            r5.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = com.startapp.a.c(r2)     // Catch: java.lang.Throwable -> L83
            r5.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L83
        L33:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k     // Catch: java.lang.Throwable -> L83
            boolean r5 = r5.W()     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L41
            if (r4 == 0) goto L41
            a(r0, r1, r2)     // Catch: java.lang.Throwable -> L83
            goto L87
        L41:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L7f
            boolean r2 = a(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L7f
            com.startapp.sdk.components.a r2 = com.startapp.sdk.components.a.a(r0)     // Catch: java.lang.Throwable -> L83
            com.startapp.t4<com.startapp.sdk.adsbase.e> r2 = r2.E     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L83
            com.startapp.sdk.adsbase.e r2 = (com.startapp.sdk.adsbase.e) r2     // Catch: java.lang.Throwable -> L83
            com.startapp.sdk.adsbase.e$a r2 = r2.edit()     // Catch: java.lang.Throwable -> L83
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "shared_prefs_CookieFeatureTS"
            com.startapp.sdk.adsbase.e$a r2 = r2.putLong(r5, r3)     // Catch: java.lang.Throwable -> L83
            r2.apply()     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            r2.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "&cki=1"
            r2.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L83
            a(r0, r1)     // Catch: java.lang.Throwable -> L83
            goto L87
        L7f:
            a(r0, r1)     // Catch: java.lang.Throwable -> L83
            goto L87
        L83:
            r0 = move-exception
            com.startapp.l3.a(r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.a.a(android.content.Context, java.lang.String, java.lang.String[], com.startapp.sdk.adsbase.commontracking.TrackingParams, boolean, boolean):void");
    }

    public static Pair<String, String> a(Context context, String[] strArr, String str, TrackingParams trackingParams, boolean z10) {
        String str2;
        if (strArr != null) {
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    a(context, str3, trackingParams);
                }
            }
        }
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.f22921m = true;
        startAppSDKInternal.f22913e = true;
        String str4 = null;
        if (z10 || strArr == null) {
            str2 = null;
        } else {
            try {
                str2 = null;
                for (String str5 : strArr) {
                    try {
                        str2 = a(str, str5);
                        if (str2 != null || o9.b(str5)) {
                            str4 = str5;
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        l3.a(th);
                        return new Pair<>(str4, str2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
            }
        }
        return new Pair<>(str4, str2);
    }

    public static void a(Context context, String str, TrackingParams trackingParams) {
        String sb;
        if (context == null) {
            return;
        }
        if (str != null && str.length() > 0) {
            if (o9.b(str)) {
                StringBuilder sb2 = new StringBuilder(str);
                String a10 = a(str, (String) null);
                if (a10 != null) {
                    sb2.append(com.startapp.a.c(a10));
                }
                if (trackingParams != null) {
                    sb2.append(trackingParams.e());
                }
                sb = sb2.toString();
            } else {
                sb = str;
            }
            try {
                com.startapp.sdk.components.a a11 = com.startapp.sdk.components.a.a(context);
                a11.f23249y.a().execute(new g9(a11.f23232h, a11.f23237m, sb, null));
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        o9.a(context, 4, TextUtils.isEmpty(str) ? "Closed Ad" : "Clicked Ad", true);
    }

    public static boolean a(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void a(Context context, String str) {
        boolean z10;
        boolean b10 = b(str);
        if (context == null) {
            return;
        }
        int i10 = 76021760;
        i10 = (AdsCommonMetaData.f22889h.J() || !(context instanceof Activity)) ? 344457216 : 344457216;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(i10);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.packageName.equalsIgnoreCase(Constants.f23213a)) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                z10 = true;
                break;
            }
        }
        if (!z10) {
            try {
                if (Build.VERSION.SDK_INT >= 18 && MetaData.f23158k.k() && com.startapp.sdk.components.a.a(context).E.a().getBoolean("chromeTabs", false)) {
                    a(context, str, b10);
                    return;
                }
            } catch (Throwable th) {
                l3.a(th);
                try {
                    Intent parseUri = Intent.parseUri(str, i10);
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(parseUri, 0).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ResolveInfo next2 = it2.next();
                        if (next2.activityInfo.packageName.equalsIgnoreCase(Constants.f23213a)) {
                            ActivityInfo activityInfo2 = next2.activityInfo;
                            parseUri.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            break;
                        }
                    }
                    if (!(context instanceof Activity)) {
                        parseUri.addFlags(268435456);
                    }
                    context.startActivity(parseUri);
                    return;
                } catch (Throwable th2) {
                    l3.a(th2);
                    return;
                }
            }
        }
        if (b10 && !z10) {
            a(context, intent, i10);
        }
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[LOOP:0: B:8:0x0021->B:18:0x003f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r6, android.content.Intent r7, int r8) {
        /*
            java.lang.String r0 = "com.android.chrome"
            java.lang.String r1 = "com.android.browser"
            java.lang.String r2 = "com.opera.mini.native"
            java.lang.String r3 = "org.mozilla.firefox"
            java.lang.String r4 = "com.opera.browser"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L42
            java.util.List r8 = r1.queryIntentActivities(r7, r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L46
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r8 <= r1) goto L46
            r8 = 0
            r2 = r8
        L21:
            r3 = 5
            if (r2 >= r3) goto L46
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L42
            int r4 = com.startapp.y.f23556a     // Catch: java.lang.Throwable -> L42
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L42
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r3, r5)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L42
            int r4 = r4.versionCode     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L42
            if (r4 < 0) goto L38
            r4 = r1
            goto L39
        L38:
            r4 = r8
        L39:
            if (r4 == 0) goto L3f
            r7.setPackage(r3)     // Catch: java.lang.Throwable -> L42
            goto L46
        L3f:
            int r2 = r2 + 1
            goto L21
        L42:
            r6 = move-exception
            com.startapp.l3.a(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.a.a(android.content.Context, android.content.Intent, int):void");
    }

    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            l3 l3Var = new l3(m3.f22275e);
            l3Var.f22228d = "Can not open in app browser, clickUrl is empty";
            if (str2 != null) {
                l3Var.f22231g = str2;
            }
            l3Var.a();
        } else if (!a(str)) {
            WeakHashMap weakHashMap = o9.f22359a;
            try {
                if (Build.VERSION.SDK_INT >= 18 && MetaData.f23158k.l() && com.startapp.sdk.components.a.a(context).E.a().getBoolean("chromeTabs", false)) {
                    a(context, str, true);
                    return;
                }
            } catch (Throwable th) {
                l3.a(th);
            }
            Intent intent = new Intent(context, OverlayActivity.class);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                intent.addFlags(524288);
            }
            if (i10 >= 11) {
                intent.addFlags(32768);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("placement", AdPreferences.Placement.INAPP_BROWSER.a());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
            } catch (Throwable th2) {
                l3.a(th2);
            }
        } else {
            a(context, str);
        }
    }

    public static void a(Context context, String str, boolean z10) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
        if (z10) {
            try {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (queryIntentActivities != null && queryIntentActivities.size() > 1) {
                    intent.setPackage(queryIntentActivities.get(0).activityInfo.packageName);
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th2) {
            l3.a(th2);
        }
    }

    public static String a(String str, String str2) {
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    str = str2;
                }
            } catch (Exception unused) {
            }
        }
        if (str != null) {
            String[] split = str.split("[?&]d=");
            if (split.length >= 2) {
                return split[1].split("[?&]")[0];
            }
        }
        return null;
    }

    public static String a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i10 = 0; i10 < 8; i10++) {
            if (stackTrace[i10].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (stackTrace[i10].getMethodName().compareTo("onBackPressed") == 0) {
                Object obj = StartAppSDKInternal.C;
                StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
                Activity activity = startAppSDKInternal.f22920l;
                if (activity != null ? activity.isTaskRoot() : true) {
                    startAppSDKInternal.f22912d = false;
                    startAppSDKInternal.f22914f = true;
                    return "back";
                }
                return "interstitial";
            }
        }
        return "interstitial";
    }

    public static void a(Context context, String[] strArr, String str, int i10, String str2, JSONObject jSONObject) {
        try {
            AnalyticsConfig analyticsConfig = MetaData.f23158k.analytics;
            if (analyticsConfig != null && analyticsConfig.l() && jSONObject != null) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "viewability_info";
                l3Var.f22233i = str2;
                l3Var.f22229e = o9.a(jSONObject.toString());
                l3Var.a();
            }
        } catch (Throwable th) {
            l3.a(th);
        }
        try {
            String str3 = "Dropped impression because " + str2;
            if (jSONObject != null) {
                str3 = str3 + ", view hierarchy: " + jSONObject.toString(2);
            }
            o9.a(context, 6, str3, false);
        } catch (Throwable th2) {
            l3.a(th2);
        }
        a(strArr, str, i10, str2);
    }

    public static boolean a(Context context, AdPreferences.Placement placement) {
        if (placement.equals(AdPreferences.Placement.INAPP_SPLASH) || !AdsCommonMetaData.f22889h.a()) {
            return false;
        }
        return a(context);
    }

    public static boolean a(Context context) {
        com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
        if (a10.f23231g.a().a().f22481c) {
            return false;
        }
        long j10 = a10.E.a().getLong("shared_prefs_CookieFeatureTS", 0L);
        return j10 == 0 || (((long) AdsCommonMetaData.f22889h.e()) * 86400000) + j10 <= System.currentTimeMillis();
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null && mainLooper.getThread() != Thread.currentThread()) {
                Handler handler = f22950a;
                if (handler == null) {
                    handler = new Handler(mainLooper);
                    f22950a = handler;
                }
                handler.post(runnable);
                return;
            }
            runnable.run();
        }
    }

    public static String a(Context context, Object obj) {
        String str;
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        String packageName = context.getPackageName();
        String name = obj.getClass().getName();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                str = null;
                break;
            } else if (context instanceof Activity) {
                str = context.getClass().getName();
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return a(packageName, name, str, (String) null);
    }

    public static String a(BannerBase bannerBase) {
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        StringBuilder sb = null;
        String str = null;
        for (ViewParent viewParent = bannerBase; viewParent instanceof View; viewParent = ((View) viewParent).getParent()) {
            if (str == null) {
                Context context = ((View) viewParent).getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        str = null;
                        break;
                    } else if (context instanceof Activity) {
                        str = context.getClass().getName();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            try {
                String resourceEntryName = ((View) viewParent).getResources().getResourceEntryName(((View) viewParent).getId());
                if (sb == null) {
                    sb = new StringBuilder();
                } else {
                    sb.insert(0, "/");
                }
                sb.insert(0, resourceEntryName);
            } catch (Resources.NotFoundException unused) {
            }
        }
        Pair pair = new Pair(str, sb != null ? sb.toString() : null);
        return a(bannerBase.getContext().getPackageName(), bannerBase.getClass().getName(), (String) pair.first, (String) pair.second);
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.ROOT;
        sb.append(String.format(locale, "10%08x", Integer.valueOf((str + str2).hashCode())));
        sb.append(str3 != null ? String.format(locale, "ac%08x", Integer.valueOf(str3.hashCode())) : "");
        sb.append(str4 != null ? String.format(locale, "b1%08x", Integer.valueOf(str4.hashCode())) : "");
        return sb.toString();
    }
}
