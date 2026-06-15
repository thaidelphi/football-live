package j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.p;
/* compiled from: NetworkStateTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends d<h1.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f26776j = p.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f26777g;

    /* renamed from: h  reason: collision with root package name */
    private b f26778h;

    /* renamed from: i  reason: collision with root package name */
    private a f26779i;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            p.c().a(e.f26776j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            p.c().a(e.f26776j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            p.c().a(e.f26776j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, n1.a aVar) {
        super(context, aVar);
        this.f26777g = (ConnectivityManager) this.f26770b.getSystemService("connectivity");
        if (j()) {
            this.f26778h = new b();
        } else {
            this.f26779i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // j1.d
    public void e() {
        if (j()) {
            try {
                p.c().a(f26776j, "Registering network callback", new Throwable[0]);
                this.f26777g.registerDefaultNetworkCallback(this.f26778h);
                return;
            } catch (IllegalArgumentException | SecurityException e8) {
                p.c().b(f26776j, "Received exception while registering network callback", e8);
                return;
            }
        }
        p.c().a(f26776j, "Registering broadcast receiver", new Throwable[0]);
        this.f26770b.registerReceiver(this.f26779i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // j1.d
    public void f() {
        if (j()) {
            try {
                p.c().a(f26776j, "Unregistering network callback", new Throwable[0]);
                this.f26777g.unregisterNetworkCallback(this.f26778h);
                return;
            } catch (IllegalArgumentException | SecurityException e8) {
                p.c().b(f26776j, "Received exception while unregistering network callback", e8);
                return;
            }
        }
        p.c().a(f26776j, "Unregistering broadcast receiver", new Throwable[0]);
        this.f26770b.unregisterReceiver(this.f26779i);
    }

    h1.b g() {
        NetworkInfo activeNetworkInfo = this.f26777g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = androidx.core.net.a.a(this.f26777g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new h1.b(z11, i10, a10, z10);
    }

    @Override // j1.d
    /* renamed from: h */
    public h1.b b() {
        return g();
    }

    boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f26777g.getNetworkCapabilities(this.f26777g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e8) {
            p.c().b(f26776j, "Unable to validate active network", e8);
            return false;
        }
    }
}
