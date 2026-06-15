package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbkj implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbyu zza;
    final /* synthetic */ zzbkl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkj(zzbkl zzbklVar, zzbyu zzbyuVar) {
        this.zza = zzbyuVar;
        this.zzb = zzbklVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbjy zzbjyVar;
        try {
            zzbyu zzbyuVar = this.zza;
            zzbjyVar = this.zzb.zza;
            zzbyuVar.zzc(zzbjyVar.zzp());
        } catch (DeadObjectException e8) {
            this.zza.zzd(e8);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
