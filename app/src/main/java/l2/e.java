package l2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import l2.c;
/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27489a;

    /* renamed from: b  reason: collision with root package name */
    final c.a f27490b;

    /* renamed from: c  reason: collision with root package name */
    boolean f27491c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27492d;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f27493e = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z10 = eVar.f27491c;
            eVar.f27491c = eVar.i(context);
            if (z10 != e.this.f27491c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f27491c);
                }
                e eVar2 = e.this;
                eVar2.f27490b.a(eVar2.f27491c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, c.a aVar) {
        this.f27489a = context.getApplicationContext();
        this.f27490b = aVar;
    }

    private void j() {
        if (this.f27492d) {
            return;
        }
        this.f27491c = i(this.f27489a);
        try {
            this.f27489a.registerReceiver(this.f27493e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f27492d = true;
        } catch (SecurityException e8) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e8);
            }
        }
    }

    private void k() {
        if (this.f27492d) {
            this.f27489a.unregisterReceiver(this.f27493e);
            this.f27492d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    boolean i(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) s2.j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e8) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e8);
            }
            return true;
        }
    }

    @Override // l2.m
    public void onDestroy() {
    }

    @Override // l2.m
    public void onStart() {
        j();
    }

    @Override // l2.m
    public void onStop() {
        k();
    }
}
