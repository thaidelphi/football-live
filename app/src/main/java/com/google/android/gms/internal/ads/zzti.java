package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzti implements zzvu {
    private final zzfvv zza;
    private long zzb;

    public zzti(List list, List list2) {
        int i10 = zzfvv.zzd;
        zzfvs zzfvsVar = new zzfvs();
        zzcv.zzd(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfvsVar.zzf(new zzth((zzvu) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzfvsVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzth zzthVar = (zzth) this.zza.get(i10);
            long zzb = zzthVar.zzb();
            if ((zzthVar.zza().contains(1) || zzthVar.zza().contains(2) || zzthVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j11 = Math.min(j11, zzb);
            }
        }
        if (j10 != Long.MAX_VALUE) {
            this.zzb = j10;
            return j10;
        } else if (j11 != Long.MAX_VALUE) {
            long j12 = this.zzb;
            return j12 != -9223372036854775807L ? j12 : j11;
        } else {
            return Long.MIN_VALUE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            long zzc = ((zzth) this.zza.get(i10)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            ((zzth) this.zza.get(i10)).zzm(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        boolean z10;
        boolean z11 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                long zzc2 = ((zzth) this.zza.get(i10)).zzc();
                boolean z12 = zzc2 != Long.MIN_VALUE && zzc2 <= zzkaVar.zza;
                if (zzc2 == zzc || z12) {
                    z10 |= ((zzth) this.zza.get(i10)).zzo(zzkaVar);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (((zzth) this.zza.get(i10)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
