package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdt(zzee zzeeVar, boolean z10) {
        this.zzk = zzeeVar;
        this.zzh = zzeeVar.zza.a();
        this.zzi = zzeeVar.zza.b();
        this.zzj = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.zzk.zzh;
        if (z10) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e8) {
            this.zzk.zzS(e8, false, this.zzj);
            zzb();
        }
    }

    abstract void zza() throws RemoteException;

    protected void zzb() {
    }
}
