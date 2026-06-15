package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.j;
import com.appnext.ads.fullscreen.RewardedVideo;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: CommonNotificationBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f14961a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.e f14962a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14963b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14964c;

        a(j.e eVar, String str, int i10) {
            this.f14962a = eVar;
            this.f14963b = str;
            this.f14964c = i10;
        }
    }

    private static PendingIntent a(Context context, f0 f0Var, String str, PackageManager packageManager) {
        Intent f10 = f(str, f0Var, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(f0Var.y());
        if (q(f0Var)) {
            f10.putExtra("gcm.n.analytics_data", f0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, f0 f0Var) {
        if (q(f0Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(f0Var.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, f0 f0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        j.e eVar = new j.e(context2, str);
        String n10 = f0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.k(n10);
        }
        String n11 = f0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.j(n11);
            eVar.x(new j.c().h(n11));
        }
        eVar.v(m(packageManager, resources, packageName, f0Var.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, f0Var, resources);
        if (n12 != null) {
            eVar.w(n12);
        }
        eVar.i(a(context, f0Var, packageName, packageManager));
        PendingIntent b10 = b(context, context2, f0Var);
        if (b10 != null) {
            eVar.m(b10);
        }
        Integer h10 = h(context2, f0Var.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.h(h10.intValue());
        }
        eVar.f(!f0Var.a("gcm.n.sticky"));
        eVar.q(f0Var.a("gcm.n.local_only"));
        String p10 = f0Var.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.y(p10);
        }
        Integer m7 = f0Var.m();
        if (m7 != null) {
            eVar.t(m7.intValue());
        }
        Integer r10 = f0Var.r();
        if (r10 != null) {
            eVar.A(r10.intValue());
        }
        Integer l10 = f0Var.l();
        if (l10 != null) {
            eVar.r(l10.intValue());
        }
        Long j10 = f0Var.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.u(true);
            eVar.B(j10.longValue());
        }
        long[] q10 = f0Var.q();
        if (q10 != null) {
            eVar.z(q10);
        }
        int[] e8 = f0Var.e();
        if (e8 != null) {
            eVar.p(e8[0], e8[1], e8[2]);
        }
        eVar.l(i(f0Var));
        return new a(eVar, o(f0Var), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(Context context, f0 f0Var) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, f0Var, k(context, f0Var.k(), j10), j10);
    }

    private static Intent f(String str, f0 f0Var, PackageManager packageManager) {
        String p10 = f0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = f0Var.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f14961a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.a.d(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(f0 f0Var) {
        boolean a10 = f0Var.a("gcm.n.default_sound");
        ?? r02 = a10;
        if (f0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (a10 ? 1 : 0) | true;
        }
        return f0Var.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e8);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string2)) {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return Build.VERSION.SDK_INT >= 23 ? i10 | 67108864 : i10;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e8) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e8);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri n(String str, f0 f0Var, Resources resources) {
        String o10 = f0Var.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if (!RewardedVideo.VIDEO_MODE_DEFAULT.equals(o10) && resources.getIdentifier(o10, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o10);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String o(f0 f0Var) {
        String p10 = f0Var.p("gcm.n.tag");
        if (TextUtils.isEmpty(p10)) {
            return "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return p10;
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable) {
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(f0 f0Var) {
        return f0Var.a("google.c.a.e");
    }
}
