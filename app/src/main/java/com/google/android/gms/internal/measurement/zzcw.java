package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcw extends zzdt {
    final /* synthetic */ long zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzee zzeeVar, long j10) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        ((zzcc) Preconditions.m(zzccVar)).setSessionTimeoutDuration(this.zza);
    }
}
