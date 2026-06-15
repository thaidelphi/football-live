package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfpe;
import com.ironsource.fe;
import com.ironsource.ug;
import com.unity3d.services.core.network.model.HttpRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzf {

    /* renamed from: a  reason: collision with root package name */
    private float f11380a = -1.0f;
    public static final Handler zza = new zzfpe(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final String f11374b = AdView.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final String f11375c = InterstitialAd.class.getName();

    /* renamed from: d  reason: collision with root package name */
    private static final String f11376d = AdManagerAdView.class.getName();

    /* renamed from: e  reason: collision with root package name */
    private static final String f11377e = AdManagerInterstitialAd.class.getName();

    /* renamed from: f  reason: collision with root package name */
    private static final String f11378f = zzflk.class.getName();

    /* renamed from: g  reason: collision with root package name */
    private static final String f11379g = AdLoader.class.getName();

    private static String a(String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray b(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    private final void c(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzj((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzk((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(f((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void d(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzo)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzj((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzk((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, b(Arrays.asList((Object[]) obj)));
        } else {
            int i10 = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i10 < length) {
                        numArr2[i10] = Integer.valueOf(iArr[i10]);
                        i10++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, f(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i10 < length2) {
                        dArr3[i10] = Double.valueOf(dArr2[i10]);
                        i10++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, f(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i10 < length3) {
                        lArr2[i10] = Long.valueOf(jArr[i10]);
                        i10++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, f(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i10 < length4) {
                        boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                        i10++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, f(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    private static final void e(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int zzy = zzy(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzrVar.zzf - zzy, zzrVar.zzc - zzy, 17));
        viewGroup.addView(frameLayout, zzrVar.zzf, zzrVar.zzc);
    }

    public static int zza(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        if (i10 == i11) {
            return Math.round(displayMetrics.heightPixels / displayMetrics.density);
        }
        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static ActivityManager.MemoryInfo zzc(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (NullPointerException unused) {
            zzo.zzj("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static AdSize zzd(Context context, int i10, int i11, int i12) {
        int round;
        int zza2 = zza(context, i12);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i10 > 655) {
            round = Math.round((i10 / 728.0f) * 90.0f);
        } else if (i10 > 632) {
            round = 81;
        } else if (i10 > 526) {
            round = Math.round((i10 / 468.0f) * 60.0f);
        } else {
            round = i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f);
        }
        return new AdSize(i10, Math.max(Math.min(round, min), 50));
    }

    public static Object zze(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    public static String zzf() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zzg(String str) {
        return a(str, "MD5");
    }

    public static String zzh(String str) {
        return a(str, "SHA-256");
    }

    public static boolean zzp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbdv.zzd.zze());
    }

    public static final int zzq(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final String zzr(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        int i11;
        String str2;
        while (true) {
            i11 = i10 + 1;
            if (i11 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            String className = stackTraceElement.getClassName();
            i10 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f11374b.equalsIgnoreCase(className) || f11375c.equalsIgnoreCase(className) || f11376d.equalsIgnoreCase(className) || f11377e.equalsIgnoreCase(className) || f11378f.equalsIgnoreCase(className) || f11379g.equalsIgnoreCase(className))) ? 0 : i11;
        }
        str2 = stackTraceElementArr[i11].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzs() {
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbbm.zzlp)).booleanValue();
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (str.contains("generic") || str.contains("emulator")) {
                return true;
            }
            return booleanValue && Build.HARDWARE.contains("ranchu");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzt(Context context, int i10) {
        return GoogleApiAvailabilityLight.h().j(context, i10) == 0;
    }

    public static final boolean zzu(Context context) {
        int j10 = GoogleApiAvailabilityLight.h().j(context, GooglePlayServicesUtilLight.f12026a);
        return j10 == 0 || j10 == 2;
    }

    public static final boolean zzv() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void zzx(Context context, String str, String str2, Bundle bundle, boolean z10, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(fe.E, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.h().b(context) + ".250505300";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(ug.f21009x, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(appendQueryParameter.toString());
    }

    public static final int zzy(Context context, int i10) {
        return zzq(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String zzz(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return a(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzs()) ? "emulator" : "emulator", "MD5");
    }

    final JSONArray f(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final int zzb(Context context, int i10) {
        if (this.f11380a < 0.0f) {
            synchronized (this) {
                if (this.f11380a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f11380a = displayMetrics.density;
                }
            }
        }
        return Math.round(i10 / this.f11380a);
    }

    public final JSONObject zzj(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzk(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e8) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e8.getMessage())));
        }
    }

    public final JSONObject zzl(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzj(bundle);
            } catch (JSONException e8) {
                zzo.zzh("Error converting Bundle to JSON", e8);
                return null;
            }
        }
        return null;
    }

    public final void zzm(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, String str2) {
        if (str2 != null) {
            zzo.zzj(str2);
        }
        e(viewGroup, zzrVar, str, -65536, -16777216);
    }

    public final void zzn(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str) {
        e(viewGroup, zzrVar, "Ads by Google", -16777216, -1);
    }

    public final void zzo(Context context, String str, String str2, Bundle bundle, boolean z10) {
        zzx(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzc
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final zzt zza(String str3) {
                new zzd(zzf.this, str3).start();
                return zzt.SUCCESS;
            }
        });
    }
}
