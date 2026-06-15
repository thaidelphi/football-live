package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.ironsource.Cdo;
import com.ironsource.environment.thread.IronSourceThreadManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private ConnectivityManager f17267a;

    /* renamed from: b  reason: collision with root package name */
    private Cdo f17268b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17269c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkStateReceiver.this.f17268b != null) {
                NetworkStateReceiver.this.f17268b.a(NetworkStateReceiver.this.f17269c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Cdo cdo) {
        this.f17268b = cdo;
        if (context != null) {
            this.f17267a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a() {
        /*
            r5 = this;
            boolean r0 = r5.f17269c
            android.net.ConnectivityManager r1 = r5.f17267a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            boolean r1 = r1.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            r5.f17269c = r1     // Catch: java.lang.Exception -> L1a
            goto L24
        L1a:
            r1 = move-exception
            com.ironsource.o9 r4 = com.ironsource.o9.d()
            r4.a(r1)
        L22:
            r5.f17269c = r3
        L24:
            boolean r1 = r5.f17269c
            if (r0 == r1) goto L29
            goto L2a
        L29:
            r2 = r3
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.a():boolean");
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
