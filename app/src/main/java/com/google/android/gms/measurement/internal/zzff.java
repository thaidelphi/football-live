package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzff implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final String f13520a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzfg f13521b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzff(zzfg zzfgVar, String str) {
        this.f13521b = zzfgVar;
        this.f13520a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.f13521b.f13522a.zzay().r().a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f13521b.f13522a.zzay().q().a("Install Referrer Service connected");
                this.f13521b.f13522a.zzaz().u(new z(this, zzb, this));
                return;
            } catch (RuntimeException e8) {
                this.f13521b.f13522a.zzay().r().b("Exception occurred while calling Install Referrer API", e8);
                return;
            }
        }
        this.f13521b.f13522a.zzay().r().a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f13521b.f13522a.zzay().q().a("Install Referrer Service disconnected");
    }
}
