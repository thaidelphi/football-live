package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
/* compiled from: NotificationManagerCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2529c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static Set<String> f2530d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2531e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f2532a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f2533b;

    private m(Context context) {
        this.f2532a = context;
        this.f2533b = (NotificationManager) context.getSystemService("notification");
    }

    public static m b(Context context) {
        return new m(context);
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return this.f2533b.areNotificationsEnabled();
        }
        if (i10 >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f2532a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f2532a.getApplicationInfo();
            String packageName = this.f2532a.getApplicationContext().getPackageName();
            int i11 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        }
        return true;
    }
}
