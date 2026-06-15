package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class w extends BroadcastReceiver {
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    static final String f13196d = w.class.getName();

    /* renamed from: a  reason: collision with root package name */
    private final zzkz f13197a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13198b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13199c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(zzkz zzkzVar) {
        Preconditions.m(zzkzVar);
        this.f13197a = zzkzVar;
    }

    public final void b() {
        this.f13197a.b();
        this.f13197a.zzaz().c();
        if (this.f13198b) {
            return;
        }
        this.f13197a.zzau().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f13199c = this.f13197a.T().h();
        this.f13197a.zzay().q().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f13199c));
        this.f13198b = true;
    }

    public final void c() {
        this.f13197a.b();
        this.f13197a.zzaz().c();
        this.f13197a.zzaz().c();
        if (this.f13198b) {
            this.f13197a.zzay().q().a("Unregistering connectivity change receiver");
            this.f13198b = false;
            this.f13199c = false;
            try {
                this.f13197a.zzau().unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                this.f13197a.zzay().m().b("Failed to unregister the network broadcast receiver", e8);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f13197a.b();
        String action = intent.getAction();
        this.f13197a.zzay().q().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean h10 = this.f13197a.T().h();
            if (this.f13199c != h10) {
                this.f13199c = h10;
                this.f13197a.zzaz().u(new v(this, h10));
                return;
            }
            return;
        }
        this.f13197a.zzay().r().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
