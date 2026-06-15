package com.appnext.core.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appnext.core.i;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {
    private static final Long ej = 1209600000L;
    private static volatile b ek;
    private SharedPreferences bT;

    private b(Context context) {
        if (context == null) {
            return;
        }
        this.bT = context.getSharedPreferences("GENDER_SHARED_PREFS", 0);
    }

    private static a d(Context context, String str) {
        double d10;
        double d11;
        int i10;
        HashMap hashMap = new HashMap();
        int i11 = 0;
        double d12 = 0.0d;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i12 = 0;
            d10 = 0.0d;
            while (i11 < jSONArray.length()) {
                try {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        if (i.b(context, jSONObject.getString("package"))) {
                            double d13 = jSONObject.getDouble("male");
                            double d14 = jSONObject.getDouble("female");
                            String string = jSONObject.getString("cat_id");
                            d12 += d13;
                            d10 += d14;
                            i12++;
                            if (hashMap.containsKey(string)) {
                                hashMap.put(string, Integer.valueOf(((Integer) hashMap.get(string)).intValue() + 1));
                            } else {
                                hashMap.put(string, 1);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    i11++;
                } catch (Exception e8) {
                    e = e8;
                    i11 = i12;
                    com.appnext.base.a.a("convertJSONToArrayAndCalculate", e);
                    d11 = d10;
                    i10 = i11;
                    return new a(d12, d11, i10, hashMap);
                }
            }
            d11 = d10;
            i10 = i12;
        } catch (Exception e10) {
            e = e10;
            d10 = 0.0d;
        }
        return new a(d12, d11, i10, hashMap);
    }

    public static b o(Context context) {
        if (ek == null) {
            synchronized (b.class) {
                if (ek == null) {
                    ek = new b(context);
                }
            }
        }
        return ek;
    }

    private static String p(Context context) {
        try {
            return i.a(context, "https://cdn.appnext.com/tools/gen/pg.json", null, 16000);
        } catch (Exception e8) {
            com.appnext.base.a.a("makeGenderRequest", e8);
            return "";
        }
    }

    public final String a(Context context, long j10, long j11) {
        long j12;
        a d10;
        try {
            j12 = this.bT.getLong("LAST_REQUEST_KEY", 0L);
            if (j10 == 0) {
                j10 = ej.longValue();
            }
        } catch (Exception e8) {
            com.appnext.base.a.a("getGenderParams", e8);
            String string = this.bT.getString("GENDER_PARAMS_KEY", "");
            if (!string.isEmpty()) {
                return string;
            }
        }
        if (System.currentTimeMillis() - j12 > TimeUnit.MINUTES.toMillis(j10)) {
            String p10 = p(context);
            if (!p10.isEmpty()) {
                Objects.toString(d(context, p10));
                String str = "&gms=" + d10.ai() + "&gfs=" + d10.aj() + "&g_cnt=" + d10.getCount() + "&mcn=" + d10.a(Long.valueOf(j11));
                this.bT.edit().putString("GENDER_PARAMS_KEY", str).apply();
                this.bT.edit().putLong("LAST_REQUEST_KEY", System.currentTimeMillis()).apply();
                return str;
            }
            String string2 = this.bT.getString("GENDER_PARAMS_KEY", "");
            if (!string2.isEmpty()) {
            }
            return string2;
        }
        String string3 = this.bT.getString("GENDER_PARAMS_KEY", "");
        return !string3.isEmpty() ? string3 : "";
    }
}
