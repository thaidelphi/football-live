package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: ActivityCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends androidx.core.content.a {

    /* renamed from: d  reason: collision with root package name */
    private static f f2440d;

    /* compiled from: ActivityCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f2441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f2442b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f2443c;

        a(String[] strArr, Activity activity, int i10) {
            this.f2441a = strArr;
            this.f2442b = activity;
            this.f2443c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2441a.length];
            PackageManager packageManager = this.f2442b.getPackageManager();
            String packageName = this.f2442b.getPackageName();
            int length = this.f2441a.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f2441a[i10], packageName);
            }
            ((e) this.f2442b).onRequestPermissionsResult(this.f2443c, this.f2441a, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0034b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface g {
        void validateRequestPermissionsRequestCode(int i10);
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0034b.a(activity);
        } else {
            activity.finish();
        }
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.a(activity);
        } else {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void p(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.b(activity);
        }
    }

    public static void q(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.o(activity);
                }
            });
        }
    }

    public static void r(Activity activity, String[] strArr, int i10) {
        f fVar = f2440d;
        if (fVar == null || !fVar.a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (!TextUtils.isEmpty(strArr[i11])) {
                    if (!androidx.core.os.a.d() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof g) {
                    ((g) activity).validateRequestPermissionsRequestCode(i10);
                }
                d.b(activity, strArr, i10);
            } else if (activity instanceof e) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    public static void s(Activity activity, q qVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.c(activity, null);
        }
    }

    public static void t(Activity activity, q qVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.d(activity, null);
        }
    }

    public static void u(Activity activity, Intent intent, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0034b.b(activity, intent, i10, bundle);
        } else {
            activity.startActivityForResult(intent, i10);
        }
    }

    public static void v(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            C0034b.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
        }
    }

    public static void w(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.e(activity);
        }
    }
}
