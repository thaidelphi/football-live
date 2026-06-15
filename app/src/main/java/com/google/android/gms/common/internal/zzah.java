package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzah {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f12604a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12605b;

    /* renamed from: c  reason: collision with root package name */
    private static String f12606c;

    /* renamed from: d  reason: collision with root package name */
    private static int f12607d;

    public static int a(Context context) {
        b(context);
        return f12607d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f12604a) {
            if (f12605b) {
                return;
            }
            f12605b = true;
            try {
                bundle = Wrappers.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e8) {
                Log.wtf("MetadataValueReader", "This should never happen.", e8);
            }
            if (bundle == null) {
                return;
            }
            f12606c = bundle.getString("com.google.app.id");
            f12607d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
