package com.appnext.banners;

import com.ironsource.ug;
import java.util.Random;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {
    public static String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                i10 += jSONArray.getJSONObject(i11).getInt("p");
                if (nextInt < i10) {
                    return jSONArray.getJSONObject(i11).getString(ug.f21009x);
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("TemplateRandomizer$getTemplate", th);
        }
        return "";
    }
}
