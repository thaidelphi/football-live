package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class jn implements hf {

    /* renamed from: a  reason: collision with root package name */
    private String f17970a = jn.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private int f17971b = 23;

    /* renamed from: c  reason: collision with root package name */
    private final Cif f17972c;

    /* renamed from: d  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f17973d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f17974a;

        a(Context context) {
            this.f17974a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                jn.this.f17972c.a(y8.a(network, this.f17974a), y8.a(this.f17974a, network));
                return;
            }
            Cif cif = jn.this.f17972c;
            String b10 = y8.b(this.f17974a);
            Context context = this.f17974a;
            cif.a(b10, y8.a(context, y8.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                jn.this.f17972c.b(y8.a(network, this.f17974a), y8.a(this.f17974a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                jn.this.f17972c.b(y8.a(network, this.f17974a), y8.a(this.f17974a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (y8.b(this.f17974a).equals("none")) {
                jn.this.f17972c.a();
            }
        }
    }

    public jn(Cif cif) {
        this.f17972c = cif;
    }

    @Override // com.ironsource.hf
    public void a() {
        this.f17973d = null;
    }

    @Override // com.ironsource.hf
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f17971b || this.f17973d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f17973d);
        } catch (Exception e8) {
            o9.d().a(e8);
            Log.e(this.f17970a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.hf
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f17971b) {
            a(context);
            if (y8.b(context).equals("none")) {
                this.f17972c.a();
            }
            if (this.f17973d == null) {
                this.f17973d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f17973d);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                Log.e(this.f17970a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.hf
    public JSONObject c(Context context) {
        return y8.a(context, y8.a(context));
    }
}
