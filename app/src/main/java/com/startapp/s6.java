package com.startapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.ironsource.b9;
import com.ironsource.dp;
import com.startapp.g3;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s6 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile v6 f22498a;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final String f22499a;

        /* renamed from: b  reason: collision with root package name */
        public final CountDownLatch f22500b;

        public a(String str, CountDownLatch countDownLatch) {
            this.f22499a = str;
            this.f22500b = countDownLatch;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g3 c0245a;
            try {
                int i10 = g3.a.f21981a;
                if (iBinder == null) {
                    c0245a = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof g3)) {
                        c0245a = (g3) queryLocalInterface;
                    } else {
                        c0245a = new g3.a.C0245a(iBinder);
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString(b9.h.V, this.f22499a);
                s6.f22498a = new v6(c0245a.a(bundle));
            } catch (Throwable unused) {
            }
            this.f22500b.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f22500b.countDown();
        }
    }

    public static v6 a(Context context) {
        ServiceInfo serviceInfo;
        if (f22498a == null) {
            try {
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName(dp.f17077b, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                boolean z10 = false;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (dp.f17077b.equals(str) && str2 != null) {
                        try {
                            if (context.getPackageManager().getPackageInfo(dp.f17077b, 128).versionCode >= 80837300) {
                                z10 = true;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (z10) {
                            Intent intent2 = new Intent(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            a aVar = new a(context.getPackageName(), countDownLatch);
                            if (context.bindService(intent2, aVar, 1)) {
                                try {
                                    countDownLatch.await(1L, TimeUnit.SECONDS);
                                } catch (InterruptedException unused2) {
                                }
                                int i10 = y.f23556a;
                                context.unbindService(aVar);
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return f22498a;
    }
}
