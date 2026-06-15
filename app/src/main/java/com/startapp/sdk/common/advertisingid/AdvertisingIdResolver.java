package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.b9;
import com.ironsource.dp;
import com.startapp.j2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.s;
import com.startapp.s1;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import com.startapp.sdk.components.e;
import com.startapp.t;
import com.startapp.y;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdvertisingIdResolver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23214a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f23215b;

    /* renamed from: c  reason: collision with root package name */
    public final j2<AdvertisingIdResolverMetadata> f23216c;

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f23217d;

    /* renamed from: e  reason: collision with root package name */
    public final Condition f23218e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<s> f23219f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f23220g;

    /* renamed from: h  reason: collision with root package name */
    public volatile int f23221h;

    /* renamed from: i  reason: collision with root package name */
    public final double f23222i;

    /* renamed from: j  reason: collision with root package name */
    public int f23223j;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class InternalException extends Exception {
        private static final long serialVersionUID = -3951983339713608735L;
        final int infoEventFlags;

        public InternalException(int i10) {
            super(String.valueOf(i10));
            this.infoEventFlags = i10;
        }
    }

    public AdvertisingIdResolver(Context context, s1 s1Var, e eVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f23217d = reentrantLock;
        this.f23218e = reentrantLock.newCondition();
        this.f23219f = new AtomicReference<>();
        this.f23220g = true;
        this.f23221h = 0;
        this.f23222i = Math.random();
        this.f23214a = context;
        this.f23215b = s1Var;
        this.f23216c = eVar;
    }

    public final boolean a(int i10) {
        AdvertisingIdResolverMetadata call = this.f23216c.call();
        call = (call == null || !call.c()) ? null : null;
        return call != null && this.f23222i < call.b() && (call.a() & i10) == i10;
    }

    public final void b(int i10) {
        if (a(i10)) {
            int i11 = this.f23223j;
            if ((i11 & i10) == i10) {
                return;
            }
            this.f23223j = i11 | i10;
            l3 l3Var = new l3(m3.f22275e);
            l3Var.f22228d = "AIR";
            l3Var.f22229e = String.valueOf(i10);
            l3Var.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r9.f23214a.checkSelfPermission("com.google.android.gms.permission.AD_ID") == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.startapp.s a() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<com.startapp.s> r0 = r9.f23219f
            java.lang.Object r0 = r0.get()
            com.startapp.s r0 = (com.startapp.s) r0
            if (r0 != 0) goto Ld6
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            r2 = 1
            if (r0 != r1) goto L1f
            r9.b(r2)
            com.startapp.s r0 = com.startapp.s.f22478d
            return r0
        L1f:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc8
            r3 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.locks.ReentrantLock r5 = r9.f23217d     // Catch: java.lang.Throwable -> Lc8
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lc8
            boolean r5 = r5.tryLock(r3, r6)     // Catch: java.lang.Throwable -> Lc8
            if (r5 == 0) goto Lc0
            boolean r5 = r9.f23220g     // Catch: java.lang.Throwable -> Lb9
            if (r5 != 0) goto L3b
            com.startapp.s r0 = com.startapp.s.f22478d     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.locks.ReentrantLock r1 = r9.f23217d     // Catch: java.lang.Throwable -> Lc8
            r1.unlock()     // Catch: java.lang.Throwable -> Lc8
            return r0
        L3b:
            int r5 = r9.f23221h     // Catch: java.lang.Throwable -> Lb9
            if (r5 != 0) goto L4f
            java.util.concurrent.ThreadFactory r5 = r9.f23215b     // Catch: java.lang.Throwable -> Lb9
            com.startapp.sdk.common.advertisingid.a r6 = new com.startapp.sdk.common.advertisingid.a     // Catch: java.lang.Throwable -> Lb9
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Thread r5 = r5.newThread(r6)     // Catch: java.lang.Throwable -> Lb9
            r5.start()     // Catch: java.lang.Throwable -> Lb9
            r9.f23221h = r2     // Catch: java.lang.Throwable -> Lb9
        L4f:
            int r5 = r9.f23221h     // Catch: java.lang.Throwable -> Lb9
            r6 = 2
            if (r5 == r6) goto L72
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb9
            long r7 = r7 - r0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r9.b(r6)     // Catch: java.lang.Throwable -> Lb9
            com.startapp.s r0 = com.startapp.s.f22478d     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.locks.ReentrantLock r1 = r9.f23217d     // Catch: java.lang.Throwable -> Lc8
            r1.unlock()     // Catch: java.lang.Throwable -> Lc8
            return r0
        L68:
            java.util.concurrent.locks.Condition r5 = r9.f23218e     // Catch: java.lang.Throwable -> Lb9
            long r6 = r3 - r7
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lb9
            r5.await(r6, r8)     // Catch: java.lang.Throwable -> Lb9
            goto L4f
        L72:
            java.util.concurrent.atomic.AtomicReference<com.startapp.s> r0 = r9.f23219f     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb9
            com.startapp.s r0 = (com.startapp.s) r0     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L83
            r0 = 4
            r9.b(r0)     // Catch: java.lang.Throwable -> Lb9
            com.startapp.s r0 = com.startapp.s.f22478d     // Catch: java.lang.Throwable -> Lb9
            goto Lb3
        L83:
            java.lang.String r1 = "00000000-0000-0000-0000-000000000000"
            java.lang.String r3 = r0.f22479a     // Catch: java.lang.Throwable -> Lb9
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto Lb3
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb9
            r3 = 31
            if (r1 >= r3) goto L94
            goto Lac
        L94:
            android.content.Context r1 = r9.f23214a     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = "com.google.android.gms.permission.AD_ID"
            int r1 = r1.checkSelfPermission(r3)     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto Lab
            goto Lac
        L9f:
            r1 = move-exception
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r9.a(r2)     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto Lab
            com.startapp.l3.a(r1)     // Catch: java.lang.Throwable -> Lb9
        Lab:
            r2 = 0
        Lac:
            if (r2 != 0) goto Lb3
            r1 = 4096(0x1000, float:5.74E-42)
            r9.b(r1)     // Catch: java.lang.Throwable -> Lb9
        Lb3:
            java.util.concurrent.locks.ReentrantLock r1 = r9.f23217d     // Catch: java.lang.Throwable -> Lc8
            r1.unlock()     // Catch: java.lang.Throwable -> Lc8
            goto Ld6
        Lb9:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r9.f23217d     // Catch: java.lang.Throwable -> Lc8
            r1.unlock()     // Catch: java.lang.Throwable -> Lc8
            throw r0     // Catch: java.lang.Throwable -> Lc8
        Lc0:
            r0 = 8
            r9.b(r0)     // Catch: java.lang.Throwable -> Lc8
            com.startapp.s r0 = com.startapp.s.f22478d     // Catch: java.lang.Throwable -> Lc8
            goto Ld6
        Lc8:
            r0 = move-exception
            r1 = 32
            boolean r1 = r9.a(r1)
            if (r1 == 0) goto Ld4
            com.startapp.l3.a(r0)
        Ld4:
            com.startapp.s r0 = com.startapp.s.f22478d
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.advertisingid.AdvertisingIdResolver.a():com.startapp.s");
    }

    public static s b(Context context) throws Exception {
        t tVar;
        try {
            context.getPackageManager().getPackageInfo(dp.f17077b, 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            tVar = new t();
            try {
                if (context.bindService(intent, tVar, 1)) {
                    if (!tVar.f23362b) {
                        IBinder take = tVar.f23361a.take();
                        if (take != null) {
                            tVar.f23362b = true;
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            take.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            obtain2.recycle();
                            obtain.recycle();
                            if (readString != null) {
                                Parcel obtain3 = Parcel.obtain();
                                Parcel obtain4 = Parcel.obtain();
                                obtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                obtain3.writeInt(1);
                                take.transact(2, obtain3, obtain4, 0);
                                obtain4.readException();
                                boolean z10 = obtain4.readInt() != 0;
                                obtain4.recycle();
                                obtain3.recycle();
                                s sVar = new s(readString, "DEVICE", z10);
                                int i10 = y.f23556a;
                                try {
                                    context.unbindService(tVar);
                                } catch (Throwable unused) {
                                }
                                return sVar;
                            }
                            throw new RemoteException();
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                throw new InternalException(com.ironsource.mediationsdk.metadata.a.f18931n);
            } catch (Throwable th) {
                th = th;
                int i11 = y.f23556a;
                if (tVar != null) {
                    try {
                        context.unbindService(tVar);
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = null;
        }
    }

    public static s a(Context context) throws Exception {
        Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
        if (invoke != null) {
            String str = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (str != null && str.length() >= 1) {
                return new s(str, "APP", Boolean.TRUE.equals((Boolean) invoke.getClass().getMethod(b9.i.M, new Class[0]).invoke(invoke, new Object[0])));
            }
            throw new InternalException(1024);
        }
        throw new InternalException(AdRequest.MAX_CONTENT_URL_LENGTH);
    }
}
