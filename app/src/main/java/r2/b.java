package r2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import w1.f;
/* compiled from: ApplicationVersionSignature.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<String, f> f30348a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e8);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    public static f c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, f> concurrentMap = f30348a;
        f fVar = concurrentMap.get(packageName);
        if (fVar == null) {
            f d10 = d(context);
            f putIfAbsent = concurrentMap.putIfAbsent(packageName, d10);
            return putIfAbsent == null ? d10 : putIfAbsent;
        }
        return fVar;
    }

    private static f d(Context context) {
        return new d(b(a(context)));
    }
}
