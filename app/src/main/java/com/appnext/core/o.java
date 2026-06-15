package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.nativeads.NativeAdObject;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {
    private static volatile o dC;

    public static String a(Context context, String str, HashMap<String, String> hashMap, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
            str4 = str3;
            str5 = str4;
        } else {
            str3 = "settingsServerResponsesSettingsName" + str2;
            str4 = "settingsServerResponseAcceptedTimeSettingsName" + str2;
            str5 = "cache_config" + str2;
            if (System.currentTimeMillis() < n.i(context).a(str4, 0L) + (n.i(context).a(str5, 0) * 60 * 60000)) {
                str6 = n.i(context).c(str3, null);
            }
        }
        if (TextUtils.isEmpty(str6)) {
            try {
                String a10 = i.a(context, str, hashMap);
                if (!TextUtils.isEmpty(a10) && !TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(a10);
                        if (jSONObject.has("cache_config")) {
                            n.i(context).b(str5, jSONObject.getInt("cache_config"));
                        }
                    } catch (Throwable unused) {
                    }
                    n.i(context).d(str3, a10);
                    n.i(context).b(str4, System.currentTimeMillis());
                } else {
                    a10 = n.i(context).c(str3, null);
                }
                return a10;
            } catch (Throwable unused2) {
                return n.i(context).c(str3, null);
            }
        }
        return str6;
    }

    public static o ab() {
        if (dC == null) {
            synchronized (o.class) {
                if (dC == null) {
                    dC = new o();
                }
            }
        }
        return dC;
    }

    public static void a(Context context, Boolean bool) {
        if (Boolean.valueOf(n.i(context).a(AdsIDHelper.CONSENT, true)) != bool) {
            List asList = Arrays.asList("1000", DesignNativeAdObject.AUID, "700", "600", "1010", "1020", "500", NativeAdObject.AUID, "800", "1200");
            for (int i10 = 0; i10 < asList.size(); i10++) {
                n.i(context).d("adsServerResponseAuid" + ((String) asList.get(i10)), "");
                n.i(context).b("adsServerResponseAcceptedTimeAuid" + ((String) asList.get(i10)), 0L);
            }
            n.i(context).b(AdsIDHelper.CONSENT, bool.booleanValue());
        }
    }
}
