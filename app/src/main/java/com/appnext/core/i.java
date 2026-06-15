package com.appnext.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.appnext.base.a.a.a;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.in;
import com.ironsource.x8;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.StringWriter;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {
    private static double cZ;
    private static String da;
    private static String db;
    private static String dc;
    private static String dd;

    static {
        CookieHandler.setDefault(new CookieManager());
        cZ = -1.0d;
        da = "";
        db = "";
        dc = "";
        dd = "https://cdn.appnext.com/tools/sdk/privacy_policy/index2.html?z=";
    }

    public static String X() {
        try {
            return URLEncoder.encode("android " + Build.VERSION.SDK_INT + " " + Build.MANUFACTURER + " " + Build.MODEL, "UTF-8");
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextHelperClass$getDevice", th);
            return "android";
        }
    }

    public static String Y() {
        String[] split = "2.7.6.473".split("\\.");
        if (split.length < 4) {
            return "2.7.6.473";
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb.append(split[i10]);
            if (i10 < 2) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static String a(Context context, boolean z10) {
        if (context == null || context.getApplicationContext() == null) {
            return "";
        }
        try {
            String a10 = AdsIDHelper.a(context.getApplicationContext());
            db = a10;
            return a10;
        }
    }

    private static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean c(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) ? false : true;
    }

    public static String d(Context context) {
        if (context != null && context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return "-";
            }
            if (activeNetworkInfo.getType() == 1) {
                return x8.f21379b;
            }
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2G";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3G";
                    case 13:
                        return "4G";
                    default:
                        return "Unknown";
                }
            }
            return "Unknown";
        }
        return "Unknown";
    }

    public static String e(String str, String str2) {
        String[] split;
        String cookie = android.webkit.CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            return "";
        }
        String str3 = "";
        for (String str4 : cookie.split(";")) {
            if (str4.contains(str2)) {
                String[] split2 = str4.split(b9.i.f16692b);
                if (split2.length <= 1) {
                    return "";
                }
                str3 = split2[1];
            }
        }
        return str3;
    }

    public static String f(AppnextAd appnextAd) {
        try {
            if (e(appnextAd).booleanValue()) {
                f fVar = new f(appnextAd.getAdTitle(), appnextAd.getAdvertiserName(), appnextAd.getAdvertiserEntity(), appnextAd.getAdvertiserWebsite(), appnextAd.getINN(), appnextAd.getToken());
                ArrayList arrayList = new ArrayList();
                arrayList.add(fVar);
                String U = new g(arrayList).U();
                return dd + g(appnextAd) + "&apps=" + U;
            }
        } catch (Exception unused) {
        }
        return dd + g(appnextAd);
    }

    private static String g(AppnextAd appnextAd) {
        try {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            sb.append(random.nextInt(10));
            sb.append(appnextAd.getZoneID());
            sb.append(random.nextInt(10));
            sb.append("&geo=");
            sb.append(appnextAd.getCountry());
            sb.append(appnextAd.isGdpr() ? "&edda=1" : "");
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static Bitmap p(String str) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
                if (decodeStream == null) {
                    httpURLConnection.disconnect();
                    return null;
                }
                httpURLConnection.disconnect();
                return decodeStream;
            } catch (Throwable th) {
                th = th;
                try {
                    com.appnext.base.a.a("AppnextHelperClass$getBitmapFromURL", th);
                    return null;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int q(String str) {
        boolean z10;
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case 1653:
                if (lowerCase.equals("2g")) {
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            case 1684:
                if (lowerCase.equals(x8.f21378a)) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1715:
                if (lowerCase.equals("4g")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 3649301:
                if (lowerCase.equals(x8.f21379b)) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            default:
                z10 = true;
                break;
        }
        switch (z10) {
            case false:
                return 0;
            case true:
                return 1;
            case true:
                return 2;
            case true:
                return 3;
            default:
                return -1;
        }
    }

    private static String r(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length << 1);
            for (int i10 = 0; i10 < length; i10++) {
                sb.append(Character.forDigit((digest[i10] & 240) >> 4, 16));
                sb.append(Character.forDigit(digest[i10] & 15, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e8) {
            com.appnext.base.a.a("AppnextHelperClass$md5", e8);
            return c(32);
        }
    }

    private static String c(int i10) {
        char[] charArray = "0123456789abcdef".toCharArray();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < 32; i11++) {
            sb.append(charArray[random.nextInt(charArray.length)]);
        }
        return sb.toString();
    }

    public static boolean g(Context context) {
        try {
            if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                a(context, "http://www.appnext.com/myid.html", null);
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                throw new IOException();
            }
            return true;
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextHelperClass$checkConnection", th);
            return false;
        }
    }

    public static boolean b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Context context, String str, HashMap<String, String> hashMap) throws IOException {
        return a(context, str, hashMap, true, 16000);
    }

    public static String b(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            return substring.substring(0, substring.lastIndexOf(46)) + "_" + queryParameter + substring.substring(substring.lastIndexOf(46));
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextHelperClass$extractFileNameFromPath", th);
            return substring;
        }
    }

    public static String d(ArrayList<? extends AppnextAd> arrayList) {
        AppnextAd appnextAd = arrayList.get(0);
        try {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                AppnextAd appnextAd2 = arrayList.get(i10);
                if (e(appnextAd2).booleanValue()) {
                    arrayList2.add(new f(appnextAd2.getAdTitle(), appnextAd2.getAdvertiserName(), appnextAd2.getAdvertiserEntity(), appnextAd2.getAdvertiserWebsite(), appnextAd2.getINN(), appnextAd2.getToken()));
                }
            }
            if (arrayList2.size() > 0) {
                String U = new g(arrayList2).U();
                return dd + g(appnextAd) + "&apps=" + U;
            }
        } catch (Exception unused) {
        }
        return dd + g(appnextAd);
    }

    public static String a(Context context, String str, HashMap<String, String> hashMap, boolean z10, int i10) throws IOException {
        return new String(a(context, str, hashMap, z10, i10, a.EnumC0154a.HashMap), "UTF-8");
    }

    public static String e(Context context) {
        if (TextUtils.isEmpty(dc)) {
            synchronized ("2.7.6.473") {
                if (TextUtils.isEmpty(dc)) {
                    dc = f(context);
                }
            }
        }
        return dc;
    }

    public static String f(String str, String str2) {
        try {
            String[] split = str.split(b9.i.f16694c);
            HashMap hashMap = new HashMap();
            for (String str3 : split) {
                String[] split2 = str3.split(b9.i.f16692b);
                String str4 = split2[0];
                String str5 = "";
                if (split2.length == 2) {
                    str5 = split2[1];
                }
                hashMap.put(str4, str5);
            }
            return (String) hashMap.get(str2);
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextHelperClass$getQueryMap", th);
            return null;
        }
    }

    public static String a(Context context, String str, ArrayList<Pair<String, String>> arrayList, int i10) throws IOException {
        return new String(a(context, str, arrayList, true, 16000, a.EnumC0154a.ArrayList), "UTF-8");
    }

    public static byte[] a(Context context, String str, Object obj, boolean z10, int i10, a.EnumC0154a enumC0154a) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        InputStream inputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.setRequestProperty("User-Agent", s.af().k(context));
                if (obj != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod(in.f17849b);
                    a.EnumC0154a enumC0154a2 = a.EnumC0154a.JSONObject;
                    if (enumC0154a == enumC0154a2 || enumC0154a == a.EnumC0154a.JSONArray) {
                        httpURLConnection.setRequestProperty("Content-Type", cc.L);
                        obj.toString();
                    }
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    if (enumC0154a == a.EnumC0154a.JSONArray) {
                        bufferedWriter.write(((JSONArray) obj).toString());
                    } else if (enumC0154a == enumC0154a2) {
                        bufferedWriter.write(((JSONObject) obj).toString());
                    } else if (enumC0154a == a.EnumC0154a.HashMap) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                            arrayList.add(new Pair((String) entry.getKey(), (String) entry.getValue()));
                        }
                        bufferedWriter.write(a(arrayList, z10));
                    } else if (enumC0154a == a.EnumC0154a.ArrayList) {
                        bufferedWriter.write(a((ArrayList) obj, z10));
                    }
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    byte[] b10 = b(a(inputStream2));
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpURLConnection.disconnect();
                    return b10;
                } else if (responseCode != 301 && responseCode != 302 && responseCode != 303) {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    throw new HttpRetryException(errorStream != null ? new String(b(errorStream), "UTF-8") : "", responseCode);
                } else {
                    byte[] a10 = a(context, httpURLConnection.getHeaderField("Location"), obj, z10, i10, enumC0154a);
                    httpURLConnection.disconnect();
                    return a10;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    public static Boolean e(AppnextAd appnextAd) {
        if (!appnextAd.getAdvertiserEntity().isEmpty() && !appnextAd.getAdvertiserWebsite().isEmpty() && !appnextAd.getAdvertiserName().isEmpty() && !appnextAd.getINN().isEmpty() && !appnextAd.getToken().isEmpty()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static String f(Context context) {
        String a10 = a(context, true);
        if (TextUtils.isEmpty(a10)) {
            return c(32);
        }
        return r(a10 + "_" + (System.currentTimeMillis() / 1000));
    }

    public static InputStream a(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        byte[] bArr = new byte[2];
        try {
            pushbackInputStream.unread(bArr, 0, pushbackInputStream.read(bArr));
            return (bArr[0] == 31 && bArr[1] == -117) ? new GZIPInputStream(pushbackInputStream) : pushbackInputStream;
        } catch (Throwable unused) {
            return inputStream;
        }
    }

    private static String a(List<Pair<String, String>> list, boolean z10) {
        StringBuilder sb = new StringBuilder();
        boolean z11 = true;
        for (Pair<String, String> pair : list) {
            try {
                if (pair.first != null && pair.second != null) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z11) {
                        z11 = false;
                    } else {
                        sb2.append(b9.i.f16694c);
                    }
                    if (z10) {
                        sb2.append(URLEncoder.encode(URLDecoder.decode((String) pair.first, "UTF-8"), "UTF-8"));
                        sb2.append(b9.i.f16692b);
                        sb2.append(URLEncoder.encode(URLDecoder.decode((String) pair.second, "UTF-8"), "UTF-8"));
                    } else {
                        sb2.append(URLEncoder.encode((String) pair.first, "UTF-8"));
                        sb2.append(b9.i.f16692b);
                        sb2.append(URLEncoder.encode((String) pair.second, "UTF-8"));
                    }
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    sb.append((CharSequence) sb2);
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("AppnextHelperClass$getPostDataString", th);
            }
        }
        return sb.toString();
    }

    public static int a(Context context, float f10) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static void a(final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9) {
        try {
            if (TextUtils.isEmpty(str6)) {
                return;
            }
            if (str6.equals("video_started") || str6.equals("video_ended")) {
                p.ac().a(new Runnable() { // from class: com.appnext.core.i.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str10;
                        String str11 = "";
                        try {
                            str10 = URLEncoder.encode(str5.replace(" ", "_"), "UTF-8");
                        } catch (Throwable unused) {
                            str10 = "";
                        }
                        try {
                            str11 = URLEncoder.encode(str6.replace(" ", "_"), "UTF-8");
                        } catch (Throwable unused2) {
                        }
                        Object[] objArr = new Object[10];
                        objArr[0] = str;
                        objArr[1] = str2;
                        objArr[2] = "100";
                        objArr[3] = str3;
                        objArr[4] = str10;
                        objArr[5] = str4;
                        objArr[6] = str11;
                        objArr[7] = str7;
                        objArr[8] = TextUtils.isEmpty(str8) ? "0" : str8;
                        objArr[9] = TextUtils.isEmpty(str9) ? "0" : str9;
                        try {
                            i.a(context, String.format("https://admin.appnext.com/tp12.aspx?tid=%s&vid=%s&osid=%s&auid=%s&session_id=%s&pid=%s&ref=%s&ads_type=%s&bid=%s&cid=%s", objArr), null);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextHelperClass$report", th);
        }
    }

    public static void a(final Ad ad, final AppnextAd appnextAd, final String str, final String str2, final SettingsManager settingsManager) {
        p.ac().a(new Runnable() { // from class: com.appnext.core.i.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (AppnextAd.this != null && Boolean.parseBoolean(settingsManager.t("stp_flag"))) {
                        ArrayList arrayList = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        arrayList.add(new Pair("client_date", sb.toString()));
                        arrayList.add(new Pair("did", i.a(ad.getContext(), true)));
                        arrayList.add(new Pair("session_id", AppnextAd.this.getSession()));
                        arrayList.add(new Pair(ScarConstants.TOKEN_ID_KEY, ad.getTID()));
                        arrayList.add(new Pair("vid", ad.getVID()));
                        arrayList.add(new Pair("auid", ad.getAUID()));
                        arrayList.add(new Pair("osid", "100"));
                        arrayList.add(new Pair("tem_id", str2));
                        arrayList.add(new Pair("pid", ad.getPlacementID()));
                        arrayList.add(new Pair("banner_id", AppnextAd.this.getBannerID()));
                        arrayList.add(new Pair("cm_id", AppnextAd.this.getCampaignID()));
                        arrayList.add(new Pair("event_name", str));
                        arrayList.add(new Pair("package_id", ad.getContext().getPackageName()));
                        i.a(ad.context, "https://global.appnext.com/stp.aspx", arrayList, 16000);
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("AppnextHelperClass$tpReport", th);
                }
            }
        });
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String obj = stringWriter.toString();
        return obj.length() > 512 ? obj.substring(0, AdRequest.MAX_CONTENT_URL_LENGTH) : obj;
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        file.delete();
    }
}
