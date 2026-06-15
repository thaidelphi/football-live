package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import kotlin.jvm.internal.n;
/* compiled from: AndroidStoreDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        n.f(context, "context");
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037 A[SYNTHETIC] */
    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> fetchStores(java.util.List<java.lang.String> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "additionalStores"
            kotlin.jvm.internal.n.f(r8, r0)
            com.unity3d.ads.core.data.datasource.AndroidKnownStore[] r0 = com.unity3d.ads.core.data.datasource.AndroidKnownStore.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L20
            r5 = r0[r4]
            java.lang.String r5 = r5.getPackageName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L12
        L20:
            java.util.List r8 = j8.o.E(r1, r8)
            java.util.List r8 = j8.o.r(r8)
            android.content.Context r0 = r7.context
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L37:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r8.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            r6 = 33
            if (r5 < r6) goto L55
            r5 = 0
            android.content.pm.PackageManager$PackageInfoFlags r5 = android.content.pm.PackageManager.PackageInfoFlags.of(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            goto L59
        L55:
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
        L59:
            if (r4 == 0) goto L5d
            r4 = 1
            goto L5e
        L5d:
            r4 = r3
        L5e:
            if (r4 == 0) goto L37
            r1.add(r2)
            goto L37
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStoreDataSource.fetchStores(java.util.List):java.util.List");
    }
}
