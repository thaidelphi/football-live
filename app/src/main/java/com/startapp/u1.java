package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.r3;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u1 {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f23422f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23423a;

    /* renamed from: b  reason: collision with root package name */
    public final j2<ConnectivityHelperMetadata> f23424b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f23425c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f23426d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public b f23427e;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ConnectivityManager.OnNetworkActiveListener {
        public a() {
        }

        @Override // android.net.ConnectivityManager.OnNetworkActiveListener
        public final void onNetworkActive() {
            u1 u1Var = u1.this;
            synchronized (u1Var.f23425c) {
                for (j2 j2Var : u1Var.f23425c) {
                    j2Var.call();
                }
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23429a;

        /* renamed from: b  reason: collision with root package name */
        public final ConnectivityManager f23430b;

        public b(Context context, ConnectivityManager connectivityManager) {
            this.f23429a = context;
            this.f23430b = connectivityManager;
        }

        public abstract int a();

        public void b() {
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
        }
        if (i10 >= 26) {
            arrayList.add(5);
        }
        if (i10 >= 27) {
            arrayList.add(6);
        }
        if (i10 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        f23422f = iArr;
    }

    public u1(Context context, com.startapp.sdk.components.t tVar) {
        this.f23423a = context;
        this.f23424b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0092 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001c, B:11:0x002f, B:16:0x003c, B:18:0x0044, B:20:0x0048, B:22:0x004c, B:24:0x004f, B:26:0x0053, B:32:0x005f, B:51:0x0092, B:29:0x0059, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:39:0x0077, B:41:0x007a, B:43:0x007e, B:49:0x0089, B:46:0x0083), top: B:56:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f23426d
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L98
            r2 = 21
            if (r0 < r2) goto L9c
            android.content.Context r2 = r11.f23423a     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L98
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L9c
            com.startapp.u1$a r3 = new com.startapp.u1$a     // Catch: java.lang.Throwable -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L98
            r2.addDefaultNetworkActiveListener(r3)     // Catch: java.lang.Throwable -> L98
            com.startapp.j2<com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata> r3 = r11.f23424b     // Catch: java.lang.Throwable -> L98
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L98
            com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata r3 = (com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata) r3     // Catch: java.lang.Throwable -> L98
            r4 = 0
            if (r3 == 0) goto L34
            com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata$Transport r3 = r3.a()     // Catch: java.lang.Throwable -> L98
            goto L35
        L34:
            r3 = r4
        L35:
            if (r3 == 0) goto L9c
            r5 = 24
            r6 = 0
            if (r0 < r5) goto L67
            int[][] r5 = r3.a()     // Catch: java.lang.Throwable -> L98
            java.util.WeakHashMap r7 = com.startapp.o9.f22359a     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L5c
            int r7 = r5.length     // Catch: java.lang.Throwable -> L98
            r8 = r6
        L46:
            if (r8 >= r7) goto L5c
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L98
            if (r9 == 0) goto L59
            int r10 = r9.length     // Catch: java.lang.Throwable -> L98
            if (r10 <= r1) goto L59
            r10 = r9[r6]     // Catch: java.lang.Throwable -> L98
            if (r10 > r0) goto L59
            r9 = r9[r1]     // Catch: java.lang.Throwable -> L98
            if (r0 > r9) goto L59
            r5 = r1
            goto L5d
        L59:
            int r8 = r8 + 1
            goto L46
        L5c:
            r5 = r6
        L5d:
            if (r5 == 0) goto L67
            com.startapp.b r4 = new com.startapp.b     // Catch: java.lang.Throwable -> L98
            android.content.Context r0 = r11.f23423a     // Catch: java.lang.Throwable -> L98
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L98
            goto L90
        L67:
            int[][] r3 = r3.b()     // Catch: java.lang.Throwable -> L98
            java.util.WeakHashMap r5 = com.startapp.o9.f22359a     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L86
            int r5 = r3.length     // Catch: java.lang.Throwable -> L98
            r7 = r6
        L71:
            if (r7 >= r5) goto L86
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L83
            int r9 = r8.length     // Catch: java.lang.Throwable -> L98
            if (r9 <= r1) goto L83
            r9 = r8[r6]     // Catch: java.lang.Throwable -> L98
            if (r9 > r0) goto L83
            r8 = r8[r1]     // Catch: java.lang.Throwable -> L98
            if (r0 > r8) goto L83
            goto L87
        L83:
            int r7 = r7 + 1
            goto L71
        L86:
            r1 = r6
        L87:
            if (r1 == 0) goto L90
            com.startapp.u r4 = new com.startapp.u     // Catch: java.lang.Throwable -> L98
            android.content.Context r0 = r11.f23423a     // Catch: java.lang.Throwable -> L98
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L98
        L90:
            if (r4 == 0) goto L9c
            r4.b()     // Catch: java.lang.Throwable -> L98
            r11.f23427e = r4     // Catch: java.lang.Throwable -> L98
            goto L9c
        L98:
            r0 = move-exception
            com.startapp.l3.a(r0)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.u1.a():void");
    }

    public final boolean b() {
        if (y.a(this.f23423a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f23423a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.isConnected()) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (!o9.a(th, (Class<? extends Throwable>) RemoteException.class)) {
                    l3.a(th);
                }
            }
        }
        return true;
    }

    public final void a(r3.a aVar) {
        synchronized (this.f23425c) {
            if (!this.f23425c.contains(aVar)) {
                this.f23425c.add(aVar);
            }
        }
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        int[] iArr;
        if (networkCapabilities != null) {
            int i10 = 0;
            for (int i11 : f23422f) {
                try {
                    if (networkCapabilities.hasTransport(i11)) {
                        i10 |= 1 << i11;
                    }
                } catch (Throwable unused) {
                }
            }
            return i10;
        }
        return 0;
    }
}
