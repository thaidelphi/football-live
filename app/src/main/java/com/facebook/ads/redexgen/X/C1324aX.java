package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.aX  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1324aX extends ConnectivityManager.NetworkCallback {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C1325aY A02;

    public C1324aX(C1325aY c1325aY) {
        this.A02 = c1325aY;
    }

    private void A00() {
        Handler handler;
        handler = this.A02.A04;
        handler.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aV
            @Override // java.lang.Runnable
            public final void run() {
                C1324aX.this.A02();
            }
        });
    }

    private void A01() {
        Handler handler;
        handler = this.A02.A04;
        handler.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aW
            @Override // java.lang.Runnable
            public final void run() {
                C1324aX.this.A03();
            }
        });
    }

    public final /* synthetic */ void A02() {
        C1324aX c1324aX;
        c1324aX = this.A02.A02;
        if (c1324aX == null) {
            return;
        }
        this.A02.A03();
    }

    public final /* synthetic */ void A03() {
        C1324aX c1324aX;
        c1324aX = this.A02.A02;
        if (c1324aX == null) {
            return;
        }
        this.A02.A04();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        A00();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (!z10) {
            A01();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean networkValidated = this.A01;
        if (networkValidated) {
            boolean networkValidated2 = this.A00;
            if (networkValidated2 == hasCapability) {
                if (!hasCapability) {
                    return;
                }
                A01();
                return;
            }
        }
        this.A01 = true;
        this.A00 = hasCapability;
        A00();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        A00();
    }
}
