package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityRecreator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f2445a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f2446b;

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f2447c;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f2448d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f2449e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f2450f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f2451g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0035d f2452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2453b;

        a(C0035d c0035d, Object obj) {
            this.f2452a = c0035d;
            this.f2453b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2452a.f2458a = this.f2453b;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f2454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0035d f2455b;

        b(Application application, C0035d c0035d) {
            this.f2454a = application;
            this.f2455b = c0035d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2454a.unregisterActivityLifecycleCallbacks(this.f2455b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f2456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2457b;

        c(Object obj, Object obj2) {
            this.f2456a = obj;
            this.f2457b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f2448d;
                if (method != null) {
                    method.invoke(this.f2456a, this.f2457b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f2449e.invoke(this.f2456a, this.f2457b, Boolean.FALSE);
                }
            } catch (RuntimeException e8) {
                if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                    throw e8;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class C0035d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f2458a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f2459b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2460c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2461d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2462e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2463f = false;

        C0035d(Activity activity) {
            this.f2459b = activity;
            this.f2460c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2459b == activity) {
                this.f2459b = null;
                this.f2462e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2462e || this.f2463f || this.f2461d || !d.h(this.f2458a, this.f2460c, activity)) {
                return;
            }
            this.f2463f = true;
            this.f2458a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2459b == activity) {
                this.f2461d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f2445a = a10;
        f2446b = b();
        f2447c = f();
        f2448d = d(a10);
        f2449e = c(a10);
        f2450f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2447c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f2451g.postAtFrontOfQueue(new c(f2446b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f2450f == null) {
            return false;
        } else {
            if (f2449e == null && f2448d == null) {
                return false;
            }
            try {
                Object obj2 = f2447c.get(activity);
                if (obj2 == null || (obj = f2446b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0035d c0035d = new C0035d(activity);
                application.registerActivityLifecycleCallbacks(c0035d);
                Handler handler = f2451g;
                handler.post(new a(c0035d, obj2));
                if (g()) {
                    Method method = f2450f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0035d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
