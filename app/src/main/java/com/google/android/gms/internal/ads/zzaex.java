package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaex implements zzacj {
    private zzacm zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaga zzg;
    private zzack zzh;
    private zzafa zzi;
    private zzahw zzj;
    private final zzdx zza = new zzdx(6);
    private long zzf = -1;

    private final int zza(zzack zzackVar) throws IOException {
        this.zza.zzI(2);
        ((zzaby) zzackVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzacm zzacmVar = this.zzb;
        Objects.requireNonNull(zzacmVar);
        zzacmVar.zzG();
        this.zzb.zzP(new zzadh(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzack r24, com.google.android.gms.internal.ads.zzadf r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaex.zzb(com.google.android.gms.internal.ads.zzack, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return zzfvv.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        this.zzb = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzahw zzahwVar = this.zzj;
            Objects.requireNonNull(zzahwVar);
            zzahwVar.zzf(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        if (zza(zzackVar) != 65496) {
            return false;
        }
        int zza = zza(zzackVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzI(2);
            zzaby zzabyVar = (zzaby) zzackVar;
            zzabyVar.zzm(this.zza.zzN(), 0, 2, false);
            zzabyVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzackVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzaby zzabyVar2 = (zzaby) zzackVar;
            zzabyVar2.zzl(2, false);
            this.zza.zzI(6);
            zzabyVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
