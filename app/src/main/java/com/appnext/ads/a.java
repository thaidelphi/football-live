package com.appnext.ads;

import android.text.TextUtils;
import com.ironsource.ug;
import java.util.Random;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    public static String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                i10 += jSONArray.getJSONObject(i11).getInt("p");
                if (nextInt < i10) {
                    return jSONArray.getJSONObject(i11).getString(ug.f21009x);
                }
            }
            return "";
        } catch (Throwable th) {
            com.appnext.base.a.a("TemplateRandomizer$getTemplate", th);
            return "";
        }
    }
}
