package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class InstantApps {

    /* renamed from: a  reason: collision with root package name */
    private static Context f12766a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f12767b;

    @KeepForSdk
    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f12766a;
            if (context2 != null && (bool = f12767b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f12767b = null;
            if (PlatformVersion.i()) {
                f12767b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12767b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f12767b = Boolean.FALSE;
                }
            }
            f12766a = applicationContext;
            return f12767b.booleanValue();
        }
    }
}
