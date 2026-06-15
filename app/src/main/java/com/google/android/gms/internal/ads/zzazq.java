package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazq implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzazs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazq(zzazs zzazsVar) {
        this.zza = zzazsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzazv zzazvVar;
        zzazv zzazvVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzazs zzazsVar = this.zza;
                zzazvVar = zzazsVar.zzd;
                if (zzazvVar != null) {
                    zzazvVar2 = zzazsVar.zzd;
                    zzazsVar.zzf = zzazvVar2.zzq();
                }
            } catch (DeadObjectException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e8);
                zzazs.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
