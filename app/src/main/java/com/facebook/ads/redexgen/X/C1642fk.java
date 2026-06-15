package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.facebook.ads.redexgen.X.fk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1642fk {
    public static C1642fk A04;
    public static byte[] A05;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<InterfaceC1640fi>> A03 = new CopyOnWriteArrayList<>();
    public final Object A02 = new Object();
    public int A00 = 0;

    static {
        A06();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{108, 99, 105, Byte.MAX_VALUE, 98, 100, 105, 35, 99, 104, 121, 35, 110, 98, 99, 99, 35, 78, 66, 67, 67, 72, 78, 89, 68, 91, 68, 89, 84, 82, 78, 69, 76, 67, 74, 72, 9, 5, 4, 4, 15, 9, 30, 3, 28, 3, 30, 19};
    }

    public C1642fk(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A04(0, 36, 71));
        context.registerReceiver(new C1641fj(this), intentFilter);
    }

    public static int A00(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(A04(36, 12, 32));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 1;
            }
            switch (networkInfo.getType()) {
                case 0:
                case 4:
                case 5:
                    return A02(networkInfo);
                case 1:
                    return 2;
                case 2:
                case 3:
                case 7:
                case 8:
                default:
                    return 8;
                case 6:
                    return 5;
                case 9:
                    return 7;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static int A02(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return AbstractC1672gE.A02 >= 29 ? 9 : 0;
        }
    }

    public static synchronized C1642fk A03(Context context) {
        C1642fk c1642fk;
        synchronized (C1642fk.class) {
            if (A04 == null) {
                A04 = new C1642fk(context);
            }
            c1642fk = A04;
        }
        return c1642fk;
    }

    private void A05() {
        Iterator<WeakReference<InterfaceC1640fi>> it = this.A03.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1640fi> next = it.next();
            if (next.get() == null) {
                this.A03.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10) {
        synchronized (this.A02) {
            if (this.A00 == i10) {
                return;
            }
            this.A00 = i10;
            Iterator<WeakReference<InterfaceC1640fi>> it = this.A03.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC1640fi> next = it.next();
                InterfaceC1640fi interfaceC1640fi = next.get();
                if (interfaceC1640fi != null) {
                    interfaceC1640fi.AEG(i10);
                } else {
                    this.A03.remove(next);
                }
            }
        }
    }

    public final int A09() {
        int i10;
        synchronized (this.A02) {
            i10 = this.A00;
        }
        return i10;
    }

    public final void A0A(final InterfaceC1640fi interfaceC1640fi) {
        A05();
        this.A03.add(new WeakReference<>(interfaceC1640fi));
        this.A01.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.fe
            @Override // java.lang.Runnable
            public final void run() {
                C1642fk.this.A0B(interfaceC1640fi);
            }
        });
    }

    public final /* synthetic */ void A0B(InterfaceC1640fi interfaceC1640fi) {
        interfaceC1640fi.AEG(A09());
    }
}
