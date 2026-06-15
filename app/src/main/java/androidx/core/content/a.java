package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.m;
import androidx.core.content.res.h;
import java.io.File;
/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2550a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2551b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static TypedValue f2552c;

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0037a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContextCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class e {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.h(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static int a(Context context, String str) {
        androidx.core.util.d.d(str, "permission must be non-null");
        if (androidx.core.os.a.d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return m.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.a(context);
        }
        return null;
    }

    private static File c(File file) {
        synchronized (f2551b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static int d(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    public static ColorStateList e(Context context, int i10) {
        return h.d(context.getResources(), i10, context.getTheme());
    }

    public static Drawable f(Context context, int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return b.b(context, i10);
        }
        if (i12 >= 16) {
            return context.getResources().getDrawable(i10);
        }
        synchronized (f2550a) {
            if (f2552c == null) {
                f2552c = new TypedValue();
            }
            context.getResources().getValue(i10, f2552c, true);
            i11 = f2552c.resourceId;
        }
        return context.getResources().getDrawable(i11);
    }

    public static File g(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.c(context);
        }
        return c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    static String h(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (androidx.core.content.b.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static boolean i(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0037a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0037a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            e.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
