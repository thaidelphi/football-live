package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfrt implements ServiceConnection {
    final /* synthetic */ zzfrv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfrt(zzfrv zzfrvVar, zzfru zzfruVar) {
        this.zza = zzfrvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfrv.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfrv.zzl(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrr
            @Override // java.lang.Runnable
            public final void run() {
                zzfpv zzb = zzfpu.zzb(iBinder);
                zzfrt zzfrtVar = zzfrt.this;
                zzfrv.zzk(zzfrtVar.zza, zzb);
                zzfrv.zzd(zzfrtVar.zza).zzc("linkToDeath", new Object[0]);
                try {
                    IInterface zzb2 = zzfrv.zzb(zzfrtVar.zza);
                    Objects.requireNonNull(zzb2);
                    zzb2.asBinder().linkToDeath(zzfrv.zza(zzfrtVar.zza), 0);
                } catch (RemoteException e8) {
                    zzfrv.zzd(zzfrtVar.zza).zzb(e8, "linkToDeath failed", new Object[0]);
                }
                zzfrv.zzj(zzfrtVar.zza, false);
                synchronized (zzfrv.zze(zzfrtVar.zza)) {
                    for (Runnable runnable : zzfrv.zze(zzfrtVar.zza)) {
                        runnable.run();
                    }
                    zzfrv.zze(zzfrtVar.zza).clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfrv.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfrv.zzl(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrs
            @Override // java.lang.Runnable
            public final void run() {
                zzfrt zzfrtVar = zzfrt.this;
                zzfrv.zzd(zzfrtVar.zza).zzc("unlinkToDeath", new Object[0]);
                IInterface zzb = zzfrv.zzb(zzfrtVar.zza);
                Objects.requireNonNull(zzb);
                zzb.asBinder().unlinkToDeath(zzfrv.zza(zzfrtVar.zza), 0);
                zzfrv.zzk(zzfrtVar.zza, null);
                zzfrv.zzj(zzfrtVar.zza, false);
            }
        });
    }
}
