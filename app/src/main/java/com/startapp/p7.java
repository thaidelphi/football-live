package com.startapp;

import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class p7 extends HttpURLConnection {
    public static HttpURLConnection a(String str, String str2) throws IOException {
        boolean z10;
        try {
            URLDecoder.decode(str, "UTF-8");
            z10 = false;
        } catch (UnsupportedEncodingException unused) {
            z10 = true;
        }
        if (!z10) {
            try {
                str = a(str);
            } catch (Exception unused2) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setConnectTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            httpURLConnection.setReadTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            return httpURLConnection;
        }
        throw new UnsupportedEncodingException(str);
    }

    public static String a(String str) throws Exception {
        boolean z10;
        URI uri;
        try {
            new URI(str);
            z10 = false;
        } catch (URISyntaxException unused) {
            z10 = true;
        }
        if (z10) {
            URL url = new URL(str);
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        } else {
            uri = new URI(str);
        }
        return uri.toURL().toString();
    }
}
