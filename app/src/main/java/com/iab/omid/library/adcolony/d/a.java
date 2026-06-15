package com.iab.omid.library.adcolony.d;

import android.os.Build;
import com.ironsource.b9;
import com.ironsource.fe;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return b9.f16509d;
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "deviceType", a());
        b.a(jSONObject, "osVersion", b());
        b.a(jSONObject, fe.E, c());
        return jSONObject;
    }
}
