package com.startapp;

import android.content.Context;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class x1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23531a;

    /* renamed from: b  reason: collision with root package name */
    public volatile T f23532b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f23533c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23534d;

    public x1(Context context) {
        this(context, 900000L);
    }

    public T a() {
        return null;
    }

    public T a(boolean z10) {
        return a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if ((r7.f23533c + r7.f23534d < android.os.SystemClock.uptimeMillis()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T b() {
        /*
            r7 = this;
            T r0 = r7.f23532b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            long r3 = r7.f23533c
            long r5 = r7.f23534d
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 == 0) goto L4b
        L18:
            monitor-enter(r7)
            T r0 = r7.f23532b     // Catch: java.lang.Throwable -> L53
            long r3 = r7.f23533c     // Catch: java.lang.Throwable -> L53
            long r5 = r7.f23534d     // Catch: java.lang.Throwable -> L53
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L53
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L4a
        L2e:
            java.lang.Object r0 = r7.a(r1)     // Catch: java.lang.Throwable -> L33
            goto L40
        L33:
            r1 = move-exception
            java.lang.Class<android.os.RemoteException> r2 = android.os.RemoteException.class
            boolean r2 = com.startapp.o9.a(r1, r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L3d
            goto L40
        L3d:
            com.startapp.l3.a(r1)     // Catch: java.lang.Throwable -> L53
        L40:
            if (r0 == 0) goto L4a
            r7.f23532b = r0     // Catch: java.lang.Throwable -> L53
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L53
            r7.f23533c = r1     // Catch: java.lang.Throwable -> L53
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53
        L4b:
            if (r0 == 0) goto L4e
            goto L52
        L4e:
            java.lang.Object r0 = r7.c()
        L52:
            return r0
        L53:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.x1.b():java.lang.Object");
    }

    public abstract T c();

    public x1(Context context, long j10) {
        this.f23531a = context;
        this.f23534d = j10;
    }
}
