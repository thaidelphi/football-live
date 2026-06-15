package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.b9;
import com.ironsource.eh;
import com.ironsource.fr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.o9;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SDKUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f20640a = "SDKUtils";

    /* renamed from: b  reason: collision with root package name */
    private static String f20641b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f20642c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f20643d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f20644e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static String f20645f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, String> f20646g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f20647h = "";

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicInteger f20648i = new AtomicInteger(1);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f20648i;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e8) {
            o9.d().a(e8);
            String str2 = f20640a;
            Logger.d(str2, "Failed decoding string " + e8.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((((float) j10) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e8) {
            o9.d().a(e8);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1b
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L2d
        L14:
            r3 = move-exception
            goto L1d
        L16:
            r3 = move-exception
            goto L1d
        L18:
            r3 = move-exception
        L19:
            r1 = r0
            goto L1d
        L1b:
            r3 = move-exception
            goto L19
        L1d:
            com.ironsource.o9 r2 = com.ironsource.o9.d()
            r2.a(r3)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = r3.toString()
            r2.error(r3)
        L2d:
            if (r1 == 0) goto L34
            byte[] r3 = r1.digest()
            return r3
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(fr frVar) {
        return fetchDemandSourceId(frVar.a());
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    String str = f20640a;
                    Logger.i(str, "flatMapToJsonAsStringfailed " + e8.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f20641b;
    }

    public static String getControllerConfig() {
        return f20645f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f20643d) ? f20643d : "";
    }

    public static int getDebugMode() {
        return f20644e;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f20646g;
    }

    public static String getLimitAdTracking() {
        return f20642c;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e8) {
            o9.d().a(e8);
            throw new RuntimeException(e8);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(b9.d.f16583b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(b9.a.f16531b);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        nf f10 = mm.S().f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(f10.H(context)));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject;
    }

    public static eh.e getProductType(String str) {
        eh.e eVar = eh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        eh.e eVar2 = eh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "8.7.0";
    }

    public static String getTesterParameters() {
        return f20647h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e8) {
            o9.d().a(e8);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState)) {
                if (!"mounted_ro".equals(externalStorageState)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e8) {
            o9.d().a(e8);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        nf f10 = mm.S().f();
        String p10 = f10.p(context);
        String a10 = f10.a(context);
        if (!TextUtils.isEmpty(p10)) {
            f20641b = p10;
        }
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        f20642c = a10;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((((float) j10) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        Objects.requireNonNull(str, str2);
        return str;
    }

    public static <T> T requireNonNull(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static void setControllerConfig(String str) {
        f20645f = str;
        mm.M().n().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f20643d = str;
    }

    public static void setDebugMode(int i10) {
        f20644e = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f20646g = map;
    }

    public static void setTesterParameters(String str) {
        f20647h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 11) {
                    if (i10 != 12) {
                        switch (i10) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f20645f);
            jSONObject2.put(str, jSONObject);
            f20645f = jSONObject2.toString();
        } catch (JSONException e8) {
            o9.d().a(e8);
            String str2 = f20640a;
            Logger.i(str2, "Unable to update controllerConfigs: " + e8.toString());
        }
    }
}
