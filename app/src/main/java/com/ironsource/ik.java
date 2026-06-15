package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.eh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ik {

    /* renamed from: b  reason: collision with root package name */
    private static final String f17837b = "ik";

    /* renamed from: c  reason: collision with root package name */
    private static final String f17838c = "supersonic_shared_preferen";

    /* renamed from: d  reason: collision with root package name */
    private static final String f17839d = "version";

    /* renamed from: e  reason: collision with root package name */
    private static final String f17840e = "back_button_state";

    /* renamed from: f  reason: collision with root package name */
    private static final String f17841f = "search_keys";

    /* renamed from: g  reason: collision with root package name */
    private static final String f17842g = "^\\d+_\\d+$";

    /* renamed from: h  reason: collision with root package name */
    private static ik f17843h;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f17844a;

    private ik(Context context) {
        this.f17844a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized ik a(Context context) {
        ik ikVar;
        synchronized (ik.class) {
            if (f17843h == null) {
                f17843h = new ik(context);
            }
            ikVar = f17843h;
        }
        return ikVar;
    }

    private boolean b(String str) {
        return str.matches(f17842g);
    }

    public static synchronized ik e() {
        ik ikVar;
        synchronized (ik.class) {
            ikVar = f17843h;
        }
        return ikVar;
    }

    public String a(String str) {
        String string = this.f17844a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f17844a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.f17844a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.f17844a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f17844a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put(da.a.f16995d, str);
            SharedPreferences.Editor edit = this.f17844a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }

    public eh.a b() {
        int parseInt = Integer.parseInt(this.f17844a.getString(f17840e, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION));
        return parseInt == 0 ? eh.a.None : parseInt == 1 ? eh.a.Device : parseInt == 2 ? eh.a.Controller : eh.a.Controller;
    }

    public String c() {
        return this.f17844a.getString("version", "-1");
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.f17844a.edit();
        edit.putString(f17840e, str);
        edit.apply();
    }

    public List<String> d() {
        String string = this.f17844a.getString(f17841f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            fr frVar = new fr(string);
            if (frVar.a(b9.h.R)) {
                try {
                    arrayList.addAll(frVar.a((JSONArray) frVar.b(b9.h.R)));
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
            }
        }
        return arrayList;
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f17844a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.f17844a.edit();
        edit.putString(f17841f, str);
        edit.apply();
    }
}
