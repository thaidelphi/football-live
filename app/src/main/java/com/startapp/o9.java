package com.startapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Base64OutputStream;
import android.util.Log;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.nativead.NativeAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o9 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile Intent f22360b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Boolean f22361c;

    /* renamed from: d  reason: collision with root package name */
    public static Random f22362d;

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap f22359a = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final a f22363e = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a {
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(String str, int i10);

        void a(boolean z10, long j10, long j11, boolean z11);
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {
        public static StackTraceElement[] a() {
            return Thread.currentThread().getStackTrace();
        }
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        boolean z10 = false;
        for (Object obj : set) {
            if (z10) {
                sb.append(";");
            }
            sb.append(obj);
            z10 = true;
        }
        return sb.toString();
    }

    public static Intent b(Context context, String str) {
        String str2;
        Intent intent;
        if (context == null) {
            return null;
        }
        try {
            str2 = context.getPackageName();
        } catch (Throwable unused) {
            str2 = null;
        }
        if (str == null) {
            str = str2;
        }
        if (str == null) {
            return null;
        }
        if (str.equals(str2) && (intent = f22360b) != null) {
            return new Intent(intent);
        }
        long j10 = Thread.currentThread() == Looper.getMainLooper().getThread() ? 100L : ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
        Intent[] intentArr = {null};
        synchronized (intentArr) {
            try {
                new Thread(new m9(intentArr, context, str)).start();
                intentArr.wait(j10);
            } catch (Throwable unused2) {
            }
        }
        Intent intent2 = intentArr[0];
        if (intent2 != null) {
            if (str.equals(str2)) {
                f22360b = intent2;
                return new Intent(intent2);
            }
            return intent2;
        }
        return null;
    }

    public static String c(Context context) {
        ComponentName component;
        Intent b10 = b(context, null);
        if (b10 == null || (component = b10.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    public static boolean d(Context context) {
        boolean z10 = false;
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            boolean z11 = false;
            int i10 = 0;
            while (!z11) {
                try {
                    if (i10 >= activityInfoArr.length) {
                        return z11;
                    }
                    int i11 = i10 + 1;
                    ActivityInfo activityInfo = activityInfoArr[i10];
                    if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                        z11 = (activityInfo.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0;
                    }
                    i10 = i11;
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                    z10 = z11;
                    return z10;
                }
            }
            return z11;
        } catch (PackageManager.NameNotFoundException | Exception unused2) {
        }
    }

    public static boolean e(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable th) {
            if (!a(th, (Class<? extends Throwable>) SecurityException.class) && !a(th, (Class<? extends Throwable>) RemoteException.class)) {
                l3.a(th);
            }
        }
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100 && packageName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        Boolean bool = f22361c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                bool = Boolean.valueOf((applicationInfo.flags & 2) != 0);
            }
        } catch (Throwable unused) {
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        f22361c = bool;
        return bool.booleanValue();
    }

    public static boolean g(Context context) {
        if (Build.VERSION.SDK_INT < 13) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("uimode");
            if (systemService instanceof UiModeManager) {
                return ((UiModeManager) systemService).getCurrentModeType() == 4;
            }
        } catch (Throwable th) {
            l3.a(th);
        }
        return false;
    }

    public static boolean c(Context context, String str) {
        if (Build.VERSION.SDK_INT < 15) {
            return false;
        }
        if (str.startsWith("sms:") || str.startsWith("smsto:")) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        return false;
    }

    public static String a(Activity activity, Drawable drawable) {
        try {
            float f10 = activity.getResources().getDisplayMetrics().density;
            int i10 = (int) (48.0f * f10);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                Drawable mutate = drawable.mutate();
                mutate.setBounds(0, 0, i10, i10);
                mutate.draw(new Canvas(createBitmap));
                e2 e2Var = new e2(i10 * i10);
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, e2Var);
                return new String(Base64.encode(e2Var.a(), 0, e2Var.b(), 2));
            } catch (OutOfMemoryError unused) {
                int i11 = (int) (f10 * 24.0f);
                try {
                    Bitmap createBitmap2 = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_4444);
                    Drawable mutate2 = drawable.mutate();
                    mutate2.setBounds(0, 0, i11, i11);
                    mutate2.draw(new Canvas(createBitmap2));
                    e2 e2Var2 = new e2(i11 * i11);
                    createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, e2Var2);
                    return new String(Base64.encode(e2Var2.a(), 0, e2Var2.b(), 2));
                } catch (OutOfMemoryError unused2) {
                    return null;
                }
            }
        } catch (Throwable th) {
            l3.a(th);
            return null;
        }
    }

    public static int[][] d(String str) {
        String[] split;
        int parseInt;
        int i10;
        ArrayList arrayList = null;
        for (String str2 : str.split(",")) {
            int indexOf = str2.indexOf("..");
            if (indexOf < 0) {
                i10 = Integer.parseInt(str2);
                parseInt = i10;
            } else {
                String substring = str2.substring(0, indexOf);
                int parseInt2 = substring.length() > 0 ? Integer.parseInt(substring) : RecyclerView.UNDEFINED_DURATION;
                String substring2 = str2.substring(indexOf + 2);
                parseInt = substring2.length() > 0 ? Integer.parseInt(substring2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i10 = parseInt2;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i10, parseInt), Math.max(i10, parseInt)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0]);
        }
        return null;
    }

    public static long c(String str) {
        long j10;
        if (str == null || str.length() < 1) {
            return 0L;
        }
        int length = str.length() - 1;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = true;
        char c10 = 0;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 'm' || c10 != 's') {
                    if (z10) {
                        if (charAt == 's') {
                            j10 = 1000;
                        } else if (charAt == 'm') {
                            j10 = 60000;
                        } else if (charAt == 'h') {
                            j10 = 3600000;
                        } else if (charAt == 'd') {
                            j10 = 86400000;
                        }
                        z10 = false;
                    }
                    return ~length;
                }
                j10 = 1;
                j12 = j10;
                length--;
                c10 = charAt;
            } else if (j12 == 0) {
                return ~length;
            } else {
                j11 += (charAt - '0') * j12;
                j12 *= 10;
                z10 = true;
                length--;
                c10 = charAt;
            }
        }
        return j11;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        a aVar = f22363e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i10 = -1;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > 0) {
                i11 += i13;
                i10++;
                iArr2[i10] = i11 - 1;
                iArr3[i10] = i12;
            }
        }
        for (int i14 = i10 + 1; i14 < length; i14++) {
            iArr2[i14] = ((i11 + i14) - i10) - 1;
            iArr3[i14] = -1;
        }
        aVar.getClass();
        Random random = f22362d;
        if (random == null) {
            random = new Random();
            f22362d = random;
        }
        int binarySearch = Arrays.binarySearch(iArr2, random.nextInt(i11));
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        return iArr3[binarySearch];
    }

    public static Intent a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getLaunchIntentForPackage(str);
            }
        } catch (Throwable th) {
            l3.a(th);
        }
        return null;
    }

    public static String a(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    public static int a(Activity activity, int i10, boolean z10) {
        if (z10) {
            WeakHashMap weakHashMap = f22359a;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i10 == activity.getResources().getConfiguration().orientation) {
                return y.a(activity, i10, false);
            }
            return y.a(activity, i10, true);
        }
        int i11 = -1;
        WeakHashMap weakHashMap2 = f22359a;
        if (weakHashMap2.containsKey(activity)) {
            i11 = ((Integer) weakHashMap2.get(activity)).intValue();
            int i12 = y.f23556a;
            try {
                activity.setRequestedOrientation(i11);
            } catch (Throwable unused) {
            }
            f22359a.remove(activity);
        }
        return i11;
    }

    public static String b(Throwable th) {
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintWriter printWriter = new PrintWriter(a(byteArrayOutputStream));
                a(th, printWriter);
                printWriter.close();
                return byteArrayOutputStream.toString();
            } catch (Throwable unused) {
                return th.toString();
            }
        } catch (Throwable unused2) {
            return th.getMessage();
        }
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] split = new URL(MetaData.f23158k.d()).getHost().split("\\.");
            if (split.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(split[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static List a(LinkedList linkedList, Class cls) {
        linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            a(linkedList, cls.getSuperclass());
        }
        return linkedList;
    }

    public static boolean a(Serializable serializable, Serializable serializable2) {
        Object obj;
        boolean z10 = false;
        try {
            for (Field field : a(new LinkedList(), (Class) serializable2.getClass())) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers) && !Modifier.isStatic(modifiers)) {
                    field.setAccessible(true);
                    if (field.get(serializable) == null && (obj = field.get(serializable2)) != null) {
                        field.set(serializable, obj);
                        z10 = true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z10;
    }

    public static String b(Context context) {
        PackageManager packageManager;
        String str = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    str = installSourceInfo.getInstallingPackageName();
                }
            } catch (Throwable unused2) {
            }
        }
        if (str == null) {
            try {
                return packageManager.getInstallerPackageName(context.getPackageName());
            } catch (Throwable unused3) {
                return str;
            }
        }
        return str;
    }

    public static boolean a(double d10) {
        if (Double.compare(d10, 0.0d) <= 0) {
            return false;
        }
        return Double.compare(d10, 1.0d) >= 0 || Math.random() < d10;
    }

    public static String a(Context context) {
        ActivityInfo activityInfo;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                return "";
            }
            String str = activityInfo.packageName;
            return str != null ? str.toLowerCase() : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(WebView webView, boolean z10, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    if (z10 && (objArr[i10] instanceof String)) {
                        sb.append("\"");
                        sb.append(objArr[i10]);
                        sb.append("\"");
                    } else {
                        sb.append(objArr[i10]);
                    }
                    if (i10 < objArr.length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                webView.loadUrl("javascript:" + sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static String a(Activity activity, int i10) {
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(activity.getResources(), i10);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> boolean a(T t10, T t11) {
        if (t10 == null) {
            return t11 == null;
        }
        return t10.equals(t11);
    }

    public static String a(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(com.startapp.a.a(byteArrayOutputStream.toByteArray()), 10);
    }

    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, new Inflater(true));
        inflaterOutputStream.write(bArr);
        inflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(int... iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        char c10 = (char) length;
        for (int i10 = 0; i10 < length; i10++) {
            c10 = (char) (c10 + iArr[i10]);
            cArr[i10] = c10;
        }
        return new String(cArr);
    }

    public static DeflaterOutputStream a(ByteArrayOutputStream byteArrayOutputStream) {
        return new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static StackTraceElement a(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        StackTraceElement[] a10 = c.a();
        if (a10 != null) {
            String name = c.class.getName();
            int length = a10.length;
            for (int i11 = 0; i11 < length; i11++) {
                StackTraceElement stackTraceElement = a10[i11];
                if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                    int i12 = i11 + 3 + i10;
                    if (i12 < length) {
                        return a10[i12];
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "null";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    public static void a(Context context, int i10, String str, boolean z10) {
        Log.println(i10, "StartAppSDK", str);
        if (z10) {
            if (f(context) || y.e(context)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "Log for a publisher";
                l3Var.f22229e = str;
                l3Var.a();
            }
        }
    }

    public static String a(Ad ad) {
        if (ad instanceof VideoEnabledAd) {
            VideoEnabledAd videoEnabledAd = (VideoEnabledAd) ad;
            return videoEnabledAd.getType() == Ad.AdType.VIDEO ? "VIDEO" : videoEnabledAd.getType() == Ad.AdType.REWARDED_VIDEO ? "REWARDED_VIDEO" : "INTERSTITIAL";
        } else if (ad instanceof ReturnAd) {
            return "RETURN";
        } else {
            if (ad instanceof OfferWallAd) {
                return "OFFER_WALL";
            }
            if (ad instanceof OfferWall3DAd) {
                return "OFFER_WALL_3D";
            }
            if (!(ad instanceof BannerStandardAd)) {
                return ad instanceof Banner3DAd ? "BANNER_3D" : ad instanceof NativeAd ? "NATIVE" : ad instanceof SplashAd ? "SPLASH" : "UNDEFINED";
            }
            BannerStandardAd bannerStandardAd = (BannerStandardAd) ad;
            return bannerStandardAd.u() == 0 ? "BANNER" : bannerStandardAd.u() == 1 ? "MREC" : bannerStandardAd.u() == 2 ? "COVER" : "BANNER_UNDEFINED";
        }
    }

    public static int[] a(Context context, String... strArr) {
        int[] iArr = new int[strArr.length];
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), CodedOutputStream.DEFAULT_BUFFER_SIZE);
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null) {
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int length2 = strArr.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (strArr[i11].equals(packageInfo.requestedPermissions[i10])) {
                            if (Build.VERSION.SDK_INT < 16) {
                                iArr[i11] = 2;
                            } else if ((packageInfo.requestedPermissionsFlags[i10] & 2) == 2) {
                                iArr[i11] = 2;
                            } else {
                                iArr[i11] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public static <T> List<T> a(List<T> list) {
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static void a(Object obj, Throwable th) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            l3.a(th);
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        int i10;
        String className;
        z8 z8Var = new z8(th);
        while (z8Var.hasNext()) {
            Throwable th2 = z8Var.f23677a;
            z8Var.f23680d = false;
            if (th2 != null) {
                z8Var.f23677a = th2.getCause();
            } else {
                Throwable[] thArr = z8Var.f23678b;
                if (thArr != null && (i10 = z8Var.f23679c) < thArr.length) {
                    z8Var.f23680d = i10 == 0;
                    z8Var.f23679c = i10 + 1;
                    th2 = thArr[i10];
                }
            }
            if (th2 != null) {
                if (z8Var.f23680d) {
                    printWriter.println('-');
                }
                printWriter.println(th2.toString().trim());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace != null) {
                    int length = stackTrace.length;
                    int i11 = 0;
                    int i12 = 0;
                    boolean z10 = false;
                    StackTraceElement stackTraceElement = null;
                    while (i11 < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i11];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                            boolean z11 = i11 < 3;
                            boolean startsWith = className.startsWith("com.startapp.");
                            if (z11 || startsWith || z10) {
                                if (i12 > 0) {
                                    printWriter.print(' ');
                                    printWriter.println(i12);
                                    i12 = 0;
                                }
                                if (stackTraceElement != null) {
                                    printWriter.print(' ');
                                    printWriter.print(stackTraceElement.getClassName());
                                    printWriter.print('.');
                                    printWriter.print(stackTraceElement.getMethodName());
                                    printWriter.println("()");
                                    stackTraceElement = null;
                                }
                                printWriter.print(' ');
                                printWriter.print(stackTraceElement2.getClassName());
                                printWriter.print('.');
                                printWriter.print(stackTraceElement2.getMethodName());
                                printWriter.println("()");
                            } else {
                                if (stackTraceElement != null) {
                                    i12++;
                                }
                                stackTraceElement = stackTraceElement2;
                            }
                            z10 = startsWith;
                        }
                        i11++;
                    }
                    if (stackTraceElement != null) {
                        i12++;
                    }
                    if (i12 > 0) {
                        printWriter.print(' ');
                        printWriter.println(i12);
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    public static StackTraceElement a(Throwable th) {
        String className;
        Throwable th2 = th;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (th2 == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i10];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            th2 = th2.getCause();
        }
    }

    public static boolean a(Throwable th, Class<? extends Throwable> cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static long a() {
        if (Build.VERSION.SDK_INT < 17) {
            return SystemClock.elapsedRealtime() * 1000000;
        }
        return SystemClock.elapsedRealtimeNanos();
    }
}
