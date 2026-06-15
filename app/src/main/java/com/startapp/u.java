package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.startapp.u1;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u extends u1.b {
    public u(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    @Override // com.startapp.u1.b
    public final int a() {
        Network[] allNetworks;
        if (!y.a(this.f23429a, "android.permission.ACCESS_NETWORK_STATE") || (allNetworks = this.f23430b.getAllNetworks()) == null) {
            return 0;
        }
        int i10 = 0;
        for (Network network : allNetworks) {
            if (network != null) {
                i10 |= u1.a(this.f23430b.getNetworkCapabilities(network));
            }
        }
        return i10;
    }
}
