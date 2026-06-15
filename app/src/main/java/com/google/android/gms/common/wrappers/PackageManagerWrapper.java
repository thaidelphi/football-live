package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class PackageManagerWrapper {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f12768a;

    public PackageManagerWrapper(Context context) {
        this.f12768a = context;
    }

    @KeepForSdk
    public int a(String str) {
        return this.f12768a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public int b(String str, String str2) {
        return this.f12768a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public ApplicationInfo c(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f12768a.getPackageManager().getApplicationInfo(str, i10);
    }

    @KeepForSdk
    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        Context context = this.f12768a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public e<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f12768a.getPackageManager().getApplicationInfo(str, 0);
        return e.a(this.f12768a.getPackageManager().getApplicationLabel(applicationInfo), this.f12768a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public PackageInfo f(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f12768a.getPackageManager().getPackageInfo(str, i10);
    }

    @KeepForSdk
    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.a(this.f12768a);
        }
        if (!PlatformVersion.i() || (nameForUid = this.f12768a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f12768a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean h(int i10, String str) {
        if (PlatformVersion.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f12768a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f12768a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
