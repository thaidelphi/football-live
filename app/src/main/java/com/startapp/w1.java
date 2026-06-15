package com.startapp;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.b9;
import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    public static CookieManager f23496a;

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 9) {
            f23496a = new CookieManager(new r6(context), CookiePolicy.ACCEPT_ALL);
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str) throws IOException {
        CookieManager cookieManager;
        if (Build.VERSION.SDK_INT < 9 || (cookieManager = f23496a) == null) {
            return;
        }
        cookieManager.put(URI.create(str), httpURLConnection.getHeaderFields());
    }

    public static void a(HttpURLConnection httpURLConnection, String str) throws IOException {
        CookieManager cookieManager;
        Map<String, List<String>> map;
        if (Build.VERSION.SDK_INT < 9 || (cookieManager = f23496a) == null || (map = cookieManager.get(URI.create(str), httpURLConnection.getRequestProperties())) == null || map.size() <= 0 || map.get("Cookie").size() <= 0) {
            return;
        }
        httpURLConnection.addRequestProperty("Cookie", TextUtils.join(b9.i.f16692b, map.get("Cookie")));
    }
}
