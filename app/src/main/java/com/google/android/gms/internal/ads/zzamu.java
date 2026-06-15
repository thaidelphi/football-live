package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamu implements zzamn {
    final /* synthetic */ zzamw zza;
    private final zzdw zzb = new zzdw(new byte[4], 4);

    public zzamu(zzamw zzamwVar) {
        this.zza = zzamwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamn
    public final void zza(zzdx zzdxVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i10;
        if (zzdxVar.zzm() == 0 && (zzdxVar.zzm() & 128) != 0) {
            zzdxVar.zzM(6);
            int zzb = zzdxVar.zzb() / 4;
            for (int i11 = 0; i11 < zzb; i11++) {
                zzdxVar.zzG(this.zzb, 4);
                zzdw zzdwVar = this.zzb;
                int zzd = zzdwVar.zzd(16);
                zzdwVar.zzn(3);
                if (zzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzamw zzamwVar = this.zza;
                        sparseArray3 = zzamwVar.zzg;
                        sparseArray3.put(zzd2, new zzamo(new zzamv(zzamwVar, zzd2)));
                        zzamw zzamwVar2 = this.zza;
                        i10 = zzamwVar2.zzm;
                        zzamwVar2.zzm = i10 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamn
    public final void zzb(zzee zzeeVar, zzacm zzacmVar, zzana zzanaVar) {
    }
}
