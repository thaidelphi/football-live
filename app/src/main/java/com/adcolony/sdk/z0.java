package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.e0;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.fe;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f6418a = h();

    /* renamed from: b  reason: collision with root package name */
    static Handler f6419b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f6420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6421b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6422c;

        a(Context context, String str, int i10) {
            this.f6420a = context;
            this.f6421b = str;
            this.f6422c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f6420a, this.f6421b, this.f6422c).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b extends Runnable {
        boolean a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Context context, String str) {
        return b(c(context), str);
    }

    static SharedPreferences c(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int d() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return 0;
        }
        try {
            return a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new e0.a().a("Failed to retrieve package info.").a(e0.f5981i);
            return 0;
        }
    }

    private static Handler e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f6419b == null) {
            f6419b = new Handler(mainLooper);
        }
        return f6419b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new e0.a().a("Unable to parse '").a(str).a("' as a color.").a(e0.f5979g);
            return -16777216;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g() {
        Context a10 = com.adcolony.sdk.a.a();
        return a10 != null && Build.VERSION.SDK_INT >= 24 && (a10 instanceof Activity) && ((Activity) a10).isInMultiWindowMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService h() {
        return new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private long f6423a;

        /* renamed from: b  reason: collision with root package name */
        private long f6424b = System.currentTimeMillis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(long j10) {
            a(j10);
        }

        void a(long j10) {
            this.f6423a = j10;
            this.f6424b = System.currentTimeMillis() + this.f6423a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public long b() {
            return this.f6423a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public long c() {
            return this.f6424b - this.f6423a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public long d() {
            long currentTimeMillis = this.f6424b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0L;
            }
            return currentTimeMillis;
        }

        public String toString() {
            return String.valueOf(d() / 1000.0d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a() {
            return d() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Runnable runnable) {
        return a(f6418a, runnable);
    }

    static String b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, null);
        } catch (ClassCastException unused) {
            e0.a aVar = new e0.a();
            aVar.a("Key " + str + " in SharedPreferences ").a("does not have a String value.").a(e0.f5979g);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, String str) {
        return a(c(context), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Date g(String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", locale);
        try {
            try {
                try {
                    return simpleDateFormat.parse(str);
                } catch (Exception unused) {
                    return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).parse(str);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return new SimpleDateFormat("yyyy-MM-dd", locale).parse(str);
        }
    }

    static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            e0.a aVar = new e0.a();
            aVar.a("Key " + str + " in SharedPreferences ").a("does not have an int value.").a(e0.f5979g);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 c(f1 f1Var) {
        f1Var.a(new String[]{"ads_to_restore"});
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        if (str == null || str.length() > 128) {
            new e0.a().a("String must be non-null and the max length is 128 characters.").a(e0.f5978f);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(String str) {
        Application application;
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        try {
            if (a10 instanceof Application) {
                application = (Application) a10;
            } else {
                application = ((Activity) a10).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 b(f1 f1Var) {
        f1Var.r("launch_metadata");
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f() {
        Context a10 = com.adcolony.sdk.a.a();
        return ((a10 instanceof Activity) && a10.getResources().getConfiguration().orientation == 1) ? "portrait" : "landscape";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        Application application;
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return "";
        }
        if (a10 instanceof Application) {
            application = (Application) a10;
        } else {
            application = ((Activity) a10).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(a10.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new e0.a().a("Failed to retrieve application label.").a(e0.f5981i);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(String str) {
        str.hashCode();
        if (str.equals("portrait")) {
            return 0;
        }
        return !str.equals("landscape") ? -1 : 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 a(f1 f1Var) {
        f1Var.a(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", "mac_address", "memory_class", "memory_used_mb", fe.B, "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode", "launch_metadata"});
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 e(Context context) {
        e1 a10 = c0.a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), CodedOutputStream.DEFAULT_BUFFER_SIZE);
                if (packageInfo.requestedPermissions != null) {
                    a10 = c0.a();
                    int i10 = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i10 >= strArr.length) {
                            break;
                        }
                        a10.b(strArr[i10]);
                        i10++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            crc32.update(str.charAt(i10));
        }
        return (int) crc32.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return com.appnext.actionssdk.h.VERSION_NAME;
        }
        try {
            return a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new e0.a().a("Failed to retrieve package info.").a(e0.f5981i);
            return com.appnext.actionssdk.h.VERSION_NAME;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 a(int i10) {
        e1 a10 = c0.a();
        for (int i11 = 0; i11 < i10; i11++) {
            c0.a(a10, a());
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Runnable runnable, long j10) {
        if (runnable == null) {
            return false;
        }
        if (j10 <= 0) {
            return b(runnable);
        }
        Handler e8 = e();
        if (e8 != null) {
            return e8.postDelayed(runnable, j10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Runnable runnable) {
        Handler e8;
        if (runnable == null || (e8 = e()) == null) {
            return false;
        }
        e8.removeCallbacks(runnable);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        try {
            return d1.a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Runnable runnable) {
        Handler e8;
        if (runnable == null || (e8 = e()) == null) {
            return false;
        }
        if (e8.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return e8.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(b bVar) {
        Handler e8;
        if (bVar == null || (e8 = e()) == null) {
            return false;
        }
        e8.removeCallbacks(bVar);
        if (bVar.a()) {
            return true;
        }
        if (e8.getLooper() == Looper.myLooper()) {
            bVar.run();
            return true;
        }
        e8.post(bVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(AudioManager audioManager) {
        if (audioManager == null) {
            new e0.a().a("isAudioEnabled() called with a null AudioManager").a(e0.f5981i);
            return false;
        }
        try {
            return audioManager.getStreamVolume(3) > 0;
        } catch (Exception e8) {
            new e0.a().a("Exception occurred when accessing AudioManager.getStreamVolume: ").a(e8.toString()).a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(AudioManager audioManager) {
        if (audioManager == null) {
            new e0.a().a("getAudioVolume() called with a null AudioManager").a(e0.f5981i);
            return 0.0d;
        }
        try {
            double streamVolume = audioManager.getStreamVolume(3);
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            return streamVolume / streamMaxVolume;
        } catch (Exception e8) {
            new e0.a().a("Exception occurred when accessing AudioManager: ").a(e8.toString()).a(e0.f5981i);
            return 0.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Context context) {
        int identifier;
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        } else {
            identifier = context.getResources().getIdentifier("navigation_bar_height_landscape", "dimen", "android");
        }
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioManager a(Context context) {
        if (context == null) {
            new e0.a().a("getAudioManager called with a null Context").a(e0.f5981i);
            return null;
        }
        return (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(e1 e1Var) throws JSONException {
        String str = "";
        for (int i10 = 0; i10 < e1Var.b(); i10++) {
            if (i10 > 0) {
                str = str + ",";
            }
            str = str + e1Var.b(i10);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(v0 v0Var) {
        boolean z10 = false;
        try {
            Context a10 = com.adcolony.sdk.a.a();
            if (a10 != null) {
                int i10 = (int) (a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0).lastUpdateTime / 1000);
                f1 g10 = v0Var.g();
                int i11 = 1;
                if (!g10.a("last_update")) {
                    i11 = 2;
                    z10 = true;
                } else if (c0.d(g10, "last_update") != i10) {
                    z10 = true;
                } else {
                    i11 = 0;
                }
                if (z10) {
                    try {
                        c0.b(g10, "last_update", i10);
                        v0Var.a(g10);
                    } catch (Exception unused) {
                        return i11;
                    }
                }
                return i11;
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, File file) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                        } catch (IOException e8) {
                            throw new RuntimeException("Unable to process file for MD5", e8);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new e0.a().a("Exception on closing MD5 input stream").a(e0.f5981i);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new e0.a().a("Exception on closing MD5 input stream").a(e0.f5981i);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new e0.a().a("Exception while getting FileInputStream").a(e0.f5981i);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new e0.a().a("Exception while getting Digest").a(e0.f5981i);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (iArr[1] / com.adcolony.sdk.a.b().n().s());
    }

    private static void b(Vibrator vibrator, long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a(vibrator, j10);
        } else {
            vibrator.vibrate(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(e1 e1Var) throws JSONException {
        String str = "";
        for (int i10 = 0; i10 < e1Var.b(); i10++) {
            if (i10 > 0) {
                str = str + ",";
            }
            switch (e1Var.b(i10)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent, boolean z10) {
        try {
            Context a10 = com.adcolony.sdk.a.a();
            if (a10 == null) {
                return false;
            }
            if (!(a10 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial j10 = com.adcolony.sdk.a.b().j();
            if (j10 != null && j10.i()) {
                j10.e().f();
            }
            if (z10) {
                a10.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            a10.startActivity(intent);
            return true;
        } catch (Exception e8) {
            new e0.a().a(e8.toString()).a(e0.f5979g);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent) {
        return a(intent, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, int i10) {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null) {
            b(new a(a10, str, i10));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(v0 v0Var) {
        f1 g10 = v0Var.g();
        String h10 = c0.h(g10, "adc_alt_id");
        if (h10.isEmpty()) {
            String a10 = a();
            c0.a(g10, "adc_alt_id", a10);
            v0Var.a(g10);
            return a10;
        }
        return h10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (iArr[0] / com.adcolony.sdk.a.b().n().s());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, long j10) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                return false;
            }
            b(vibrator, j10);
            return true;
        } catch (Exception unused) {
            new e0.a().a("Vibrate command failed.").a(e0.f5978f);
            return false;
        }
    }

    private static void a(Vibrator vibrator, long j10) {
        vibrator.vibrate(VibrationEffect.createOneShot(j10, -1));
    }
}
