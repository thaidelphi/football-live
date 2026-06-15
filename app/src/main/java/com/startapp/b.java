package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.startapp.u1;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends u1.b {

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f21773c;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            int a10 = u1.a(networkCapabilities);
            synchronized (b.this.f21773c) {
                b.this.f21773c.put(network, Integer.valueOf(a10));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            synchronized (b.this.f21773c) {
                b.this.f21773c.remove(network);
            }
        }
    }

    public b(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f21773c = new HashMap();
    }

    @Override // com.startapp.u1.b
    public final int a() {
        int i10;
        synchronized (this.f21773c) {
            i10 = 0;
            for (Integer num : this.f21773c.values()) {
                if (num != null) {
                    i10 |= num.intValue();
                }
            }
        }
        return i10;
    }

    @Override // com.startapp.u1.b
    public final void b() {
        if (y.a(this.f23429a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f23430b.registerDefaultNetworkCallback(new a());
        }
    }
}
