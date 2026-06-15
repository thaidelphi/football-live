package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfcu implements zzgal {
    final /* synthetic */ zzfcx zza;
    final /* synthetic */ zzfcy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfcu(zzfcy zzfcyVar, zzfcx zzfcxVar) {
        this.zza = zzfcxVar;
        this.zzb = zzfcyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i10;
        Void r42 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfcy zzfcyVar = this.zzb;
            i10 = zzfcyVar.zzf;
            if (i10 == 1) {
                zzfcyVar.zzh();
            }
        }
    }
}
