package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzail extends zzaiu {
    private zzacu zza;
    private zzaik zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    protected final long zza(zzdx zzdxVar) {
        if (zzd(zzdxVar.zzN())) {
            int i10 = (zzdxVar.zzN()[2] & 255) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int zza = zzacq.zza(zzdxVar, i10);
                zzdxVar.zzL(0);
                return zza;
            }
            zzdxVar.zzM(4);
            zzdxVar.zzx();
            int zza2 = zzacq.zza(zzdxVar, i10);
            zzdxVar.zzL(0);
            return zza2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    protected final boolean zzc(zzdx zzdxVar, long j10, zzair zzairVar) {
        byte[] zzN = zzdxVar.zzN();
        zzacu zzacuVar = this.zza;
        if (zzacuVar == null) {
            zzacu zzacuVar2 = new zzacu(zzN, 17);
            this.zza = zzacuVar2;
            zzx zzb = zzacuVar2.zzc(Arrays.copyOfRange(zzN, 9, zzdxVar.zze()), null).zzb();
            zzb.zzE("audio/ogg");
            zzairVar.zza = zzb.zzaj();
            return true;
        } else if ((zzN[0] & Byte.MAX_VALUE) == 3) {
            zzact zzb2 = zzacr.zzb(zzdxVar);
            zzacu zzf = zzacuVar.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzaik(zzf, zzb2);
            return true;
        } else if (zzd(zzN)) {
            zzaik zzaikVar = this.zzb;
            if (zzaikVar != null) {
                zzaikVar.zza(j10);
                zzairVar.zzb = this.zzb;
            }
            Objects.requireNonNull(zzairVar.zza);
            return false;
        } else {
            return true;
        }
    }
}
