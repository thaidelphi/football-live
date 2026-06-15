package com.google.android.gms.security;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ProviderInstaller {

    /* renamed from: a  reason: collision with root package name */
    private static final GoogleApiAvailabilityLight f13753a = GoogleApiAvailabilityLight.h();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f13754b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Method f13755c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f13756d = null;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface ProviderInstallListener {
    }

    public static void a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.n(context, "Context must not be null");
        f13753a.n(context, 11925000);
        synchronized (f13754b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f12799f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.LoadingException e8) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e8.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context e10 = GooglePlayServicesUtilLight.e(context);
            if (e10 != null) {
                try {
                    if (f13756d == null) {
                        Class cls = Long.TYPE;
                        f13756d = b(e10, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f13756d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (e10 != null) {
                c(e10, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f13755c == null) {
                f13755c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f13755c.invoke(null, context);
        } catch (Exception e8) {
            Throwable cause = e8.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e8.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
