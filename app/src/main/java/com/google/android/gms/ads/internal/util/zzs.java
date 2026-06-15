package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import b6.a;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzcfj;
import com.google.android.gms.internal.ads.zzdni;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzezu;
import com.google.android.gms.internal.ads.zzezx;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfsg;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzhec;
import com.ironsource.b9;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzs {
    public static final zzfpe zza = new zzf(Looper.getMainLooper());

    /* renamed from: g */
    private String f11519g;

    /* renamed from: h */
    private volatile String f11520h;

    /* renamed from: a */
    private final AtomicReference f11513a = new AtomicReference(null);

    /* renamed from: b */
    private final AtomicReference f11514b = new AtomicReference(null);

    /* renamed from: c */
    private final AtomicReference f11515c = new AtomicReference(new Bundle());

    /* renamed from: d */
    private final AtomicBoolean f11516d = new AtomicBoolean();

    /* renamed from: e */
    private boolean f11517e = true;

    /* renamed from: f */
    private final Object f11518f = new Object();

    /* renamed from: i */
    private boolean f11521i = false;

    /* renamed from: j */
    private boolean f11522j = false;

    /* renamed from: k */
    private final Executor f11523k = Executors.newSingleThreadExecutor();

    private static KeyguardManager a(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle b(Context context) throws RemoteException {
        try {
            return Wrappers.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e8) {
            zze.zzb("Error getting metadata", e8);
            return null;
        }
    }

    private static String c(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static boolean d(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void e(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void f(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String g(final Context context, String str) {
        String str2;
        String str3;
        if (str != null) {
            try {
                zzcg zza2 = zzcg.zza();
                if (TextUtils.isEmpty(zza2.f11467a)) {
                    if (ClientLibraryUtils.a()) {
                        str3 = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzce
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                    SharedPreferencesUtils.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                    return defaultUserAgent;
                                }
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                        });
                    } else {
                        final Context e8 = GooglePlayServicesUtilLight.e(context);
                        str3 = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = e8;
                                Context context3 = context;
                                boolean z10 = false;
                                if (context2 != null) {
                                    zze.zza("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.zza("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z10 = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z10) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    zza2.f11467a = str3;
                }
                str2 = zza2.f11467a;
            } catch (Exception unused) {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = i();
            }
            String str4 = str2 + " (Mobile; " + str;
            try {
                if (Wrappers.a(context).g()) {
                    str4 = str4 + ";aia";
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "AdUtil.getUserAgent");
            }
            return str4.concat(")");
        }
        return i();
    }

    static final String i() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    protected static final int[] j() {
        return new int[]{0, 0};
    }

    public static final zzbr zzA(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(iBinder);
        } catch (Exception e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        Context zza2 = zzbun.zza(context);
        return Wrappers.a(zza2).b(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            return DeviceProperties.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzD(String str) {
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfc)).booleanValue()) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfe);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfd);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        KeyguardManager a10;
        return (context == null || (a10 = a(context)) == null || !a10.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzH(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle b10 = b(context);
            String string = b10.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(c(b10))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzK(View view, int i10, MotionEvent motionEvent) {
        String str;
        int i11;
        int i12;
        int i13;
        String str2;
        zzezu zzD;
        zzezx zzR;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdni) {
                view2 = ((zzdni) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzj) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i13 = rect.width();
                i12 = rect.height();
            } else {
                i12 = 0;
                i13 = 0;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            long zzx = zzx(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof zzcet) || (zzR = ((zzcet) view2).zzR()) == null) {
                str2 = "none";
            } else {
                str2 = zzR.zzb;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof zzcdh) && (zzD = ((zzcdh) view2).zzD()) != null) {
                str = zzezu.zza(zzD.zzb);
                i11 = zzD.zze;
                str3 = zzD.zzE;
            }
            String format = String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(zzx), Integer.toString(i10, 2));
            int i16 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(format);
        } catch (Exception e8) {
            int i17 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e8);
        }
    }

    public static final AlertDialog.Builder zzL(Context context) {
        com.google.android.gms.ads.internal.zzv.zzr();
        return new AlertDialog.Builder(context, 16974374);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, null, null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context != null) {
            try {
                if (!((Boolean) zzbdv.zzb.zze()).booleanValue()) {
                    return;
                }
                CrashUtils.a(context, th);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            String concat = "Could not parse value:".concat(e8.toString());
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
            return 0;
        }
    }

    public static final Map zzP(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzp)).booleanValue()) {
            HashMap hashMap = new HashMap();
            if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
                int i10 = 0;
                while (true) {
                    int indexOf = encodedQuery.indexOf(38, i10);
                    int length = encodedQuery.length();
                    if (indexOf != -1) {
                        length = indexOf;
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i10);
                    if (indexOf2 > length || indexOf2 == -1) {
                        indexOf2 = length;
                    }
                    hashMap.put(Uri.decode(encodedQuery.substring(i10, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                    if (indexOf == -1) {
                        break;
                    }
                    i10 = indexOf + 1;
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap2.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap2;
    }

    public static final int[] zzQ(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? j() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzR(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] j10 = (window == null || (findViewById = window.findViewById(16908290)) == null) ? j() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, j10[0]), com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, j10[1])};
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.zzv.zzq().f11517e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long zzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbu)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzky)).booleanValue()) {
                    return true;
                }
                if (zzx >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkA)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkV)).booleanValue()) {
            try {
                f(context, intent);
                return;
            } catch (SecurityException e8) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("", e8);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdUtil.startActivityWithUnknownContext");
                return;
            }
        }
        f(context, intent);
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e8) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("No browser is found.", e8);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] zzQ = zzQ(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, zzQ[0]), com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, zzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzS(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, a(context));
    }

    public static final void zzX(Context context, Intent intent, zzdqf zzdqfVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmV)).booleanValue() && (context instanceof zzcfj)) {
            try {
                Uri data = intent.getData();
                if (data != null && data.toString() != null) {
                    if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmX))) {
                        ((zzcfj) context).zzc(intent, 236);
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmW)).booleanValue() || zzdqfVar == null) {
                            return;
                        }
                        zzdqe zza2 = zzdqfVar.zza();
                        zza2.zzb("action", "hila");
                        zza2.zzb("gqi", zzftm.zzc(str));
                        zza2.zzi();
                        return;
                    }
                }
                zzT(context, intent);
                return;
            } catch (ActivityNotFoundException e8) {
                e = e8;
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
                zzT(context, intent);
                return;
            } catch (SecurityException e10) {
                e = e10;
                int i102 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
                zzT(context, intent);
                return;
            } catch (Exception e11) {
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e11);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "AdUtil.startActivityForResult");
                zzT(context, intent);
                return;
            }
        }
        zzT(context, intent);
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 > 0) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static List zzd() {
        zzbbd zzbbdVar = zzbbm.zza;
        List<String> zzb = com.google.android.gms.ads.internal.client.zzbd.zza().zzb();
        ArrayList arrayList = new ArrayList();
        for (String str : zzb) {
            for (String str2 : zzftk.zzb(zzfsg.zzc(',')).zzd(str)) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbyp.zza.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzo(android.view.View):boolean");
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzq(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return c(b(context));
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService(b9.h.f16644d);
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzw(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        String optString = optJSONArray.optString(i10);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final long zzx(View view) {
        int i10;
        float f10 = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f10 = Math.min(f10, view2.getAlpha());
            i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i10 > 0);
        return Math.round((f10 >= 0.0f ? f10 : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e8) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not fetch MRAID JS.", e8);
        }
        return null;
    }

    public static final String zzz() {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        return zze != null ? zze.getString(R.string.f11140s7) : "Test Ad";
    }

    public final a zzb(final Uri uri) {
        return zzgap.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfpe zzfpeVar = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                return zzs.zzP(uri);
            }
        }, this.f11523k);
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlh)).booleanValue()) {
            if (this.f11520h != null) {
                return this.f11520h;
            }
            this.f11520h = g(context, str);
            return this.f11520h;
        }
        synchronized (this.f11518f) {
            String str2 = this.f11519g;
            if (str2 != null) {
                return str2;
            }
            String g10 = g(context, str);
            this.f11519g = g10;
            return g10;
        }
    }

    public final void zzg(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int zza2 = zza(i10);
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzi(final Context context, final String str, String str2, Bundle bundle, boolean z10) {
        com.google.android.gms.ads.internal.zzv.zzq();
        bundle.putString(b9.h.G, zzs());
        zzbbd zzbbdVar = zzbbm.zza;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zza().zza()));
        if (bundle.isEmpty()) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkw);
            if (!this.f11516d.getAndSet(true)) {
                this.f11515c.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        zzs.this.f11515c.set(zzad.zzb(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) this.f11515c.get());
        }
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzx(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzfpe zzfpeVar = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                zzs.zzM(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzj(String str) {
        zzbbd zzbbdVar = zzbbm.zzao;
        return d(str, this.f11513a, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar));
    }

    public final boolean zzk(String str) {
        zzbbd zzbbdVar = zzbbm.zzap;
        return d(str, this.f11514b, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.f11522j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbbm.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkU)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        }
        this.f11522j = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzm(Context context) {
        if (this.f11521i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbbm.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkU)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter);
        }
        this.f11521i = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        } else if (!(context instanceof Activity)) {
            e(context, uri);
            return 2;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeH)).booleanValue()) {
                d a10 = new d.C0026d(com.google.android.gms.ads.internal.zzv.zzf().zza()).a();
                a10.f1858a.setPackage(zzhec.zza(context));
                a10.a(context, uri);
                return 5;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeF)).booleanValue()) {
                zzbcn zzbcnVar = new zzbcn();
                zzbcnVar.zze(new zzo(this, zzbcnVar, context, uri));
                zzbcnVar.zzb((Activity) context);
                return 5;
            }
            e(context, uri);
            return 9;
        }
    }
}
