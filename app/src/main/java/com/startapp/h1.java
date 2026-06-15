package com.startapp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.startapp.t0;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22009a;

    /* renamed from: b  reason: collision with root package name */
    public final n6 f22010b;

    /* renamed from: c  reason: collision with root package name */
    public final e1 f22011c = new e1();

    /* renamed from: d  reason: collision with root package name */
    public final BluetoothAdapter f22012d = a();

    /* renamed from: e  reason: collision with root package name */
    public g1 f22013e;

    public h1(Context context, t0.b bVar) {
        this.f22009a = context;
        this.f22010b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(3:6|7|(1:46)(1:11))|(3:15|16|(5:34|35|36|37|38)(4:20|21|22|24))|42|16|(1:18)|34|35|36|37|38) */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            android.bluetooth.BluetoothAdapter r0 = r6.f22012d
            r1 = 0
            if (r0 == 0) goto L8f
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Ld
            goto L8f
        Ld:
            com.startapp.e1 r0 = r6.f22011c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3f
            r3 = 31
            if (r2 >= r3) goto L1f
            android.content.Context r4 = r6.f22009a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = "android.permission.BLUETOOTH"
            boolean r4 = com.startapp.y.a(r4, r5)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L2b
        L1f:
            if (r2 < r3) goto L2d
            android.content.Context r2 = r6.f22009a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "android.permission.BLUETOOTH_CONNECT"
            boolean r2 = com.startapp.y.a(r2, r3)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L2d
        L2b:
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L43
            android.bluetooth.BluetoothAdapter r2 = r6.f22012d     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r2.isEnabled()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L43
            android.bluetooth.BluetoothAdapter r2 = r6.f22012d     // Catch: java.lang.Throwable -> L3f
            java.util.Set r2 = r2.getBondedDevices()     // Catch: java.lang.Throwable -> L3f
            goto L47
        L3f:
            r2 = move-exception
            com.startapp.l3.a(r2)
        L43:
            java.util.Set r2 = java.util.Collections.emptySet()
        L47:
            r0.f21900a = r2
            if (r7 == 0) goto L83
            android.content.Context r7 = r6.f22009a
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            boolean r7 = com.startapp.y.a(r7, r0)
            if (r7 == 0) goto L83
            android.content.IntentFilter r7 = new android.content.IntentFilter
            java.lang.String r0 = "android.bluetooth.device.action.FOUND"
            r7.<init>(r0)
            com.startapp.g1 r0 = new com.startapp.g1
            r0.<init>(r6)
            r6.f22013e = r0
            android.content.Context r2 = r6.f22009a     // Catch: java.lang.Exception -> L6e
            r2.registerReceiver(r0, r7)     // Catch: java.lang.Exception -> L6e
            android.bluetooth.BluetoothAdapter r7 = r6.f22012d     // Catch: java.lang.Exception -> L6e
            r7.startDiscovery()     // Catch: java.lang.Exception -> L6e
            goto L8e
        L6e:
            r7 = move-exception
            android.bluetooth.BluetoothAdapter r0 = r6.f22012d
            r0.cancelDiscovery()
            com.startapp.n6 r0 = r6.f22010b
            com.startapp.e1 r2 = r6.f22011c     // Catch: java.lang.Exception -> L7c
            org.json.JSONObject r1 = r2.a()     // Catch: java.lang.Exception -> L7c
        L7c:
            r0.a(r1)
            com.startapp.l3.a(r7)
            goto L8e
        L83:
            com.startapp.n6 r7 = r6.f22010b
            com.startapp.e1 r0 = r6.f22011c     // Catch: java.lang.Exception -> L8b
            org.json.JSONObject r1 = r0.a()     // Catch: java.lang.Exception -> L8b
        L8b:
            r7.a(r1)
        L8e:
            return
        L8f:
            com.startapp.n6 r7 = r6.f22010b
            r7.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h1.a(boolean):void");
    }

    @SuppressLint({"MissingPermission"})
    public final void b() {
        BluetoothAdapter bluetoothAdapter;
        if (!y.a(this.f22009a, "android.permission.BLUETOOTH_ADMIN") || this.f22013e == null || (bluetoothAdapter = this.f22012d) == null) {
            return;
        }
        bluetoothAdapter.cancelDiscovery();
        try {
            this.f22009a.unregisterReceiver(this.f22013e);
        } catch (Throwable th) {
            l3.a(th);
        }
        this.f22013e = null;
    }

    public final BluetoothAdapter a() {
        if (y.a(this.f22009a, "android.permission.BLUETOOTH")) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        return null;
    }
}
