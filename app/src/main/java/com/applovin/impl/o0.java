package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.n0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8047a = {7, 4, 2, 1, 11};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8048b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8049c = {15, 13};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8050d = {20};

    public static String a(String str, com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(o4.f8243w0), str, jVar);
    }

    public static String b(String str, com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(o4.f8235v0), str, jVar);
    }

    public static Map c(com.applovin.impl.sdk.j jVar) {
        HashMap hashMap = new HashMap();
        String str = (String) jVar.a(o4.f8138j);
        if (StringUtils.isValidString(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) jVar.a(o4.S4)).booleanValue()) {
            hashMap.put("api_key", jVar.a0());
        }
        hashMap.putAll(d7.a(jVar.x().e()));
        return hashMap;
    }

    public static String d(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(o4.f8227u0), "4.0/ad", jVar);
    }

    public static String e(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(o4.f8219t0), "4.0/ad", jVar);
    }

    public static Long f(com.applovin.impl.sdk.j jVar) {
        n0.d a10 = jVar.t().a();
        if (a10 == null) {
            return null;
        }
        double c10 = d7.c(a10.b());
        double d10 = d7.d(a10.a());
        if (d10 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (c10 / d10));
    }

    public static String g(com.applovin.impl.sdk.j jVar) {
        NetworkInfo b10 = b(com.applovin.impl.sdk.j.m());
        if (b10 != null) {
            int type = b10.getType();
            int subtype = b10.getSubtype();
            return type == 1 ? com.ironsource.x8.f21379b : type == 0 ? a(subtype, f8047a) ? "2g" : a(subtype, f8048b) ? com.ironsource.x8.f21378a : a(subtype, f8049c) ? "4g" : a(subtype, f8050d) ? "5g" : "mobile" : "unknown";
        }
        return "unknown";
    }

    public static void a(JSONObject jSONObject, boolean z10, com.applovin.impl.sdk.j jVar) {
        jVar.q().a(jSONObject, z10);
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            jVar.b(q4.H, string);
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void a(int i10, com.applovin.impl.sdk.j jVar) {
        if (i10 == 401) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "SDK key \"" + jVar.a0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i10 == 418) {
            jVar.g0().a(o4.f8098e, Boolean.TRUE);
            jVar.g0().e();
        } else if (i10 >= 400 && i10 < 500) {
            if (((Boolean) jVar.a(o4.f8114g)).booleanValue()) {
                jVar.Q0();
            }
        } else if (i10 == -1 && ((Boolean) jVar.a(o4.f8114g)).booleanValue()) {
            jVar.Q0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (jVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    p4 g02 = jVar.g0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    g02.a(jSONObject.getJSONObject("settings"));
                    g02.e();
                    return;
                }
                return;
            } catch (JSONException e8) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("ConnectionUtils", "Unable to parse settings out of API response", e8);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(o4.f8219t0), ((Boolean) jVar.a(o4.f8134i3)).booleanValue() ? "5.0/ad" : "4.0/ad", jVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 != null) {
            if (jVar != null) {
                return str + str2;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No endpoint specified");
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.j.m()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    r4.a(next, object, (SharedPreferences) null, edit);
                }
            }
            if (((Boolean) jVar.a(o4.f8113f6)).booleanValue()) {
                r4.a(edit);
            } else {
                edit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.j jVar) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) jVar.a(o4.f8078b3)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") != null) {
            NetworkInfo b10 = b(context);
            if (b10 != null) {
                return b10.isConnected();
            }
            return false;
        }
        return true;
    }

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static String a(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(o4.f8227u0), ((Boolean) jVar.a(o4.f8134i3)).booleanValue() ? "5.0/ad" : "4.0/ad", jVar);
    }
}
