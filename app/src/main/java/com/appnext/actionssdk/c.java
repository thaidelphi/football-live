package com.appnext.actionssdk;

import android.content.Context;
import com.appnext.base.b.d;
import com.ironsource.yk;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {
    private static HashMap<String, String> aE;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        aE = hashMap;
        hashMap.put("sapst", "Strategy games");
        aE.put("sapmg", "Music games");
        aE.put("saprp", "RPG games");
        aE.put("sapt", "Transportation");
        aE.put("sapop", "Popular apps");
        aE.put("salmu", "Listen to Music");
        aE.put("saop", "Optimize Phone");
        aE.put("samnp", "Meet people");
        aE.put("sapcr", "Card games");
        aE.put("sastr", "Exercise");
        aE.put("saot", "Order a Taxi");
        aE.put("sand", "Navigate");
        aE.put("sapbg", "Board games");
        aE.put("saof", "Order Food");
        aE.put("saso", "Shopping");
        aE.put("sapag", "Arcade games");
        aE.put("sapeg", "Educational games");
        aE.put("sapwg", "Words games");
        aE.put("sapsp", "Simulation games");
        aE.put("sapcg", "Casino games");
        aE.put("sawmo", "Watch a Movie");
        aE.put("sapad", "Adventure games");
        aE.put("saprg", "Racing games");
        aE.put("sabv", "Book Flights");
        aE.put("sabh", "Book Hotels");
        aE.put("sapsg", "Sports games");
        aE.put("spag", "Play a game");
        aE.put("saei", "Edit an Image");
        aE.put("sapca", "Casual games");
        aE.put("safpe", "Restaurants");
        aE.put("sappg", "Puzzle games");
        aE.put("saptg", "Trivia games");
        aE.put("sapat", "Action games");
        aE.put("sare", "Recharge");
    }

    public static void a(Context context, String str, String str2) {
    }

    public static void a(final Context context, final String str, final String str2, final String str3) {
        new Thread(new Runnable() { // from class: com.appnext.actionssdk.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JSONObject put = new JSONObject(str3).put(yk.f21552b, com.appnext.core.f.b(context.getApplicationContext(), false)).put("avid", Action.VID).put("app_package", context.getPackageName());
                    try {
                        put.put("localdate", URLEncoder.encode(com.appnext.base.b.k.a(new Date()), "UTF-8"));
                        put.put("timezone", URLEncoder.encode(com.appnext.base.b.k.cu(), "UTF-8"));
                    } catch (Throwable unused) {
                    }
                    new String(com.appnext.core.f.b(str + str2, put, true, 8000, d.a.JSONObject), "UTF-8");
                } catch (Throwable unused2) {
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String m(String str) {
        String str2 = aE.get(str);
        return str2 != null ? str2 : "";
    }
}
