package w6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import n6.c;
/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32368a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f32369b;

    /* renamed from: c  reason: collision with root package name */
    private final c f32370c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f32371d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f32368a = a10;
        this.f32369b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f32370c = cVar;
        this.f32371d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        if (this.f32369b.contains("firebase_data_collection_default_enabled")) {
            return this.f32369b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f32368a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f32368a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f32371d;
    }
}
