package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.b9;
import java.util.concurrent.ExecutionException;
import x6.a;
/* compiled from: MessagingAnalytics.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            c6.e.k();
            Context j10 = c6.e.k().j();
            SharedPreferences sharedPreferences = j10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = j10.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(j10.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static x6.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0378a h10 = x6.a.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(a.d.ANDROID).h(k(extras));
        String h11 = h(extras);
        if (h11 != null) {
            h10.g(h11);
        }
        String o10 = o(extras);
        if (o10 != null) {
            h10.l(o10);
        }
        String c10 = c(extras);
        if (c10 != null) {
            h10.c(c10);
        }
        String i10 = i(extras);
        if (i10 != null) {
            h10.b(i10);
        }
        String e8 = e(extras);
        if (e8 != null) {
            h10.d(e8);
        }
        long n10 = n(extras);
        if (n10 > 0) {
            h10.j(n10);
        }
        return h10.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (TextUtils.isEmpty(string)) {
            try {
                return (String) Tasks.await(com.google.firebase.installations.c.q(c6.e.k()).getId());
            } catch (InterruptedException | ExecutionException e8) {
                throw new RuntimeException(e8);
            }
        }
        return string;
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c k(Bundle bundle) {
        if (bundle != null && f0.t(bundle)) {
            return a.c.DISPLAY_NOTIFICATION;
        }
        return a.c.DATA_MESSAGE;
    }

    static String l(Bundle bundle) {
        return (bundle == null || !f0.t(bundle)) ? "data" : b9.h.f16644d;
    }

    static String m() {
        return c6.e.k().j().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e8) {
                Log.w("FirebaseMessaging", "error parsing project number", e8);
            }
        }
        c6.e k10 = c6.e.k();
        String d10 = k10.m().d();
        if (d10 != null) {
            try {
                return Long.parseLong(d10);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e10);
            }
        }
        String c10 = k10.m().c();
        if (!c10.startsWith("1:")) {
            try {
                return Long.parseLong(c10);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing app ID", e11);
            }
        } else {
            String[] split = c10.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        }
        return 0L;
    }

    static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.p());
        }
    }

    private static void w(a.b bVar, Intent intent, z2.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        x6.a b10 = b(bVar, intent);
        if (b10 == null) {
            return;
        }
        try {
            gVar.a("FCM_CLIENT_EVENT_LOGGING", x6.b.class, z2.b.b("proto"), new z2.e() { // from class: com.google.firebase.messaging.c0
                @Override // z2.e
                public final Object apply(Object obj) {
                    return ((x6.b) obj).c();
                }
            }).a(z2.c.d(x6.b.b().b(b10).a()));
        } catch (RuntimeException e8) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            c6.e.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d10 = d(bundle);
            if (d10 != null) {
                bundle2.putString("_nmid", d10);
            }
            String e8 = e(bundle);
            if (e8 != null) {
                bundle2.putString("_nmn", e8);
            }
            String i10 = i(bundle);
            if (!TextUtils.isEmpty(i10)) {
                bundle2.putString("label", i10);
            }
            String g10 = g(bundle);
            if (!TextUtils.isEmpty(g10)) {
                bundle2.putString("message_channel", g10);
            }
            String o10 = o(bundle);
            if (o10 != null) {
                bundle2.putString("_nt", o10);
            }
            String j10 = j(bundle);
            if (j10 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j10));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String q10 = q(bundle);
            if (q10 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q10));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String l10 = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l10);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            d6.a aVar = (d6.a) c6.e.k().i(d6.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            d6.a aVar = (d6.a) c6.e.k().i(d6.a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (aVar != null) {
                String string = bundle.getString("google.c.a.c_id");
                aVar.b("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                aVar.a("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
