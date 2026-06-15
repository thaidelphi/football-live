package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleSignatureVerifier {

    /* renamed from: c  reason: collision with root package name */
    private static GoogleSignatureVerifier f12031c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12032a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f12033b;

    public GoogleSignatureVerifier(Context context) {
        this.f12032a = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier a(Context context) {
        Preconditions.m(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f12031c == null) {
                k.d(context);
                f12031c = new GoogleSignatureVerifier(context);
            }
        }
        return f12031c;
    }

    static final g d(PackageInfo packageInfo, g... gVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            h hVar = new h(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                if (gVarArr[i10].equals(hVar)) {
                    return gVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            com.google.android.gms.common.g[] r4 = com.google.android.gms.common.j.f12634a
            com.google.android.gms.common.g r4 = d(r2, r4)
            goto L46
        L3a:
            com.google.android.gms.common.g[] r4 = new com.google.android.gms.common.g[r0]
            com.google.android.gms.common.g[] r5 = com.google.android.gms.common.j.f12634a
            r5 = r5[r1]
            r4[r1] = r5
            com.google.android.gms.common.g r4 = d(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final m f(String str, boolean z10, boolean z11) {
        m c10;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return m.c("null pkg");
        }
        if (str.equals(this.f12033b)) {
            return m.b();
        }
        if (k.e()) {
            c10 = k.b(str, GooglePlayServicesUtilLight.g(this.f12032a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f12032a.getPackageManager().getPackageInfo(str, 64);
                boolean g10 = GooglePlayServicesUtilLight.g(this.f12032a);
                if (packageInfo == null) {
                    c10 = m.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr != null && signatureArr.length == 1) {
                        h hVar = new h(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        m a10 = k.a(str2, hVar, g10, false);
                        c10 = (!a10.f12644a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !k.a(str2, hVar, false, true).f12644a) ? a10 : m.c("debuggable release cert app rejected");
                    } else {
                        c10 = m.c("single cert required");
                    }
                }
            } catch (PackageManager.NameNotFoundException e8) {
                return m.d("no pkg ".concat(str), e8);
            }
        }
        if (c10.f12644a) {
            this.f12033b = str;
        }
        return c10;
    }

    @KeepForSdk
    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.g(this.f12032a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean c(int i10) {
        m c10;
        int length;
        String[] packagesForUid = this.f12032a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    c10 = f(packagesForUid[i11], false, false);
                    if (c10.f12644a) {
                        break;
                    }
                    i11++;
                } else {
                    Preconditions.m(c10);
                    break;
                }
            }
        } else {
            c10 = m.c("no pkgs");
        }
        c10.e();
        return c10.f12644a;
    }
}
