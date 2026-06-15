package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ya {

    /* renamed from: a  reason: collision with root package name */
    private static final String f21520a = "ya";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f21520a, "add AID");
                jSONObject.put("deviceIds" + b9.i.f16696d + b9.i.L + b9.i.f16698e, SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f21520a, "add LAT");
                jSONObject.put(b9.i.M, Boolean.parseBoolean(limitAdTracking));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject;
    }

    private static void a(Context context, JSONObject jSONObject) {
        nf f10 = mm.S().f();
        try {
            if (a(b9.i.f16715m0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16715m0), f10.c(context));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void a(JSONObject jSONObject) {
        nf f10 = mm.S().f();
        try {
            a(jSONObject, b9.i.H, String.valueOf(f10.d()));
            a(jSONObject, b9.i.I, String.valueOf(f10.k()));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(b9.i.Y), mm.S().f().y(context));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        nf f10 = mm.S().f();
        try {
            if (a(b9.i.f16707i0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16707i0), f10.c());
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public static JSONObject c(Context context) {
        nf f10 = mm.S().f();
        za b10 = za.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String d10 = b10.d();
            if (d10 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16710k), SDKUtils.encodeString(d10));
            }
            String c10 = b10.c();
            if (c10 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16712l), SDKUtils.encodeString(c10));
            }
            String e8 = b10.e();
            if (e8 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16714m), SDKUtils.encodeString(e8));
            }
            String f11 = b10.f();
            if (f11 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16716n), f11.replaceAll("[^0-9/.]", ""));
            }
            String f12 = b10.f();
            if (f12 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16718o), SDKUtils.encodeString(f12));
            }
            jSONObject.put(SDKUtils.encodeString(b9.i.f16720p), String.valueOf(b10.a()));
            jSONObject.put(SDKUtils.encodeString(b9.i.f16722q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (b10.b() != null && b10.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16724r), SDKUtils.encodeString(b10.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16731x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(b9.i.f16709j0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16709j0), SDKUtils.encodeString(String.valueOf(f10.h(context))));
            }
            String g10 = c4.g(context);
            if (!TextUtils.isEmpty(g10)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g10));
            }
            String valueOf = String.valueOf(f10.h());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.K), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(f10.f());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.O), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), dp.d(context));
            jSONObject.put("mcc", x8.b(context));
            jSONObject.put("mnc", x8.c(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.S), x8.f(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.R), SDKUtils.encodeString(x8.g(context)));
            jSONObject.put(SDKUtils.encodeString(b9.i.V), c4.f(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.X), c4.d(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.W), SDKUtils.encodeString(c4.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), dp.c(context));
            String e10 = c4.e(context);
            if (!TextUtils.isEmpty(e10)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16695c0), SDKUtils.encodeString(e10));
            }
            jSONObject.put(b9.i.f16697d0, SDKUtils.encodeString(String.valueOf(f10.j())));
            jSONObject.put(b9.i.f16699e0, SDKUtils.encodeString(String.valueOf(f10.q())));
            String n10 = f10.n(context);
            if (!TextUtils.isEmpty(n10)) {
                jSONObject.put("icc", n10);
            }
            String b11 = f10.b();
            if (!TextUtils.isEmpty(b11)) {
                jSONObject.put("tz", SDKUtils.encodeString(b11));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
        } catch (Exception e11) {
            o9.d().a(e11);
            IronLog.INTERNAL.error(e11.toString());
        }
        return jSONObject;
    }

    private static void c(Context context, JSONObject jSONObject) {
        nf f10 = mm.S().f();
        try {
            if (a(b9.i.f16713l0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16713l0), f10.l(context));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(b9.i.f16732y), SDKUtils.encodeString(String.valueOf(mm.S().f().o())));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String b10 = y8.b(context);
            String d10 = y8.d(context);
            if (!TextUtils.isEmpty(d10)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16728u), SDKUtils.encodeString(d10));
            }
            if (!TextUtils.isEmpty(b10) && !b10.equals("none")) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16727t), SDKUtils.encodeString(b10));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16729v), y8.e(context));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(b9.i.P), za.b(context).a(context));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        nf f10 = mm.S().f();
        try {
            if (a(b9.i.f16711k0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16711k0), f10.J(context));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(fe.U0), mm.S().f().q(context));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        nf f10 = mm.S().f();
        try {
            if (a(b9.i.f16717n0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16717n0), f10.d(context));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }
}
