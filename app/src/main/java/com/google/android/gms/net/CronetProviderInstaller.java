package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class CronetProviderInstaller {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13745a = "Google-Play-Services-Cronet-Provider";

    /* renamed from: b  reason: collision with root package name */
    private static final String f13746b = "CronetProviderInstaller";

    /* renamed from: c  reason: collision with root package name */
    private static final GoogleApiAvailabilityLight f13747c = GoogleApiAvailabilityLight.h();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f13748d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static DynamiteModule f13749e = null;

    /* renamed from: f  reason: collision with root package name */
    private static String f13750f = "0";

    private CronetProviderInstaller() {
    }

    public static Task<Void> a(final Context context) {
        Preconditions.n(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (b()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable() { // from class: com.google.android.gms.net.zza
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                String str = CronetProviderInstaller.f13745a;
                try {
                    CronetProviderInstaller.e(context2);
                    taskCompletionSource2.setResult(null);
                } catch (Exception e8) {
                    taskCompletionSource2.setException(e8);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static boolean b() {
        return c() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DynamiteModule c() {
        DynamiteModule dynamiteModule;
        synchronized (f13748d) {
            dynamiteModule = f13749e;
        }
        return dynamiteModule;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        String str;
        synchronized (f13748d) {
            str = f13750f;
        }
        return str;
    }

    @ShowFirstParty
    @Deprecated
    public static void e(Context context) throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        synchronized (f13748d) {
            if (b()) {
                return;
            }
            Preconditions.n(context, "Context must not be null");
            try {
                ((ClassLoader) Preconditions.m(CronetProviderInstaller.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                int apiLevel = ApiVersion.getApiLevel();
                GoogleApiAvailabilityLight googleApiAvailabilityLight = f13747c;
                googleApiAvailabilityLight.n(context, 11925000);
                try {
                    DynamiteModule e8 = DynamiteModule.e(context, DynamiteModule.f12795b, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = e8.b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() != CronetProviderInstaller.class.getClassLoader()) {
                            Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                            Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                            int intValue = ((Integer) Preconditions.m((Integer) method.invoke(null, new Object[0]))).intValue();
                            f13750f = (String) Preconditions.m((String) method2.invoke(null, new Object[0]));
                            if (apiLevel > intValue) {
                                Intent d10 = googleApiAvailabilityLight.d(context, 2, "cr");
                                if (d10 == null) {
                                    Log.e(f13746b, "Unable to fetch error resolution intent");
                                    throw new GooglePlayServicesNotAvailableException(2);
                                }
                                String str = f13750f;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                                sb.append("Google Play Services update is required. The API Level of the client is ");
                                sb.append(apiLevel);
                                sb.append(". The API Level of the implementation is ");
                                sb.append(intValue);
                                sb.append(". The Cronet implementation version is ");
                                sb.append(str);
                                throw new GooglePlayServicesRepairableException(2, sb.toString(), d10);
                            }
                            f13749e = e8;
                            return;
                        }
                        Log.e(f13746b, "ImplVersion class is missing from Cronet module.");
                        throw new GooglePlayServicesNotAvailableException(8);
                    } catch (Exception e10) {
                        Log.e(f13746b, "Unable to read Cronet version from the Cronet module ", e10);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e10));
                    }
                } catch (DynamiteModule.LoadingException e11) {
                    Log.e(f13746b, "Unable to load Cronet module", e11);
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e11));
                }
            } catch (ClassNotFoundException e12) {
                Log.e(f13746b, "Cronet API is not available. Have you included all required dependencies?");
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e12));
            }
        }
    }
}
