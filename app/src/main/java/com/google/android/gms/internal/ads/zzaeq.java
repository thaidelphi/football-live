package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaeq implements zzacj {
    private zzacm zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaep zzo;
    private zzaeu zzp;
    private final zzdx zza = new zzdx(4);
    private final zzdx zzb = new zzdx(9);
    private final zzdx zzc = new zzdx(11);
    private final zzdx zzd = new zzdx();
    private final zzaer zze = new zzaer();
    private int zzg = 1;

    private final zzdx zza(zzack zzackVar) throws IOException {
        if (this.zzl > this.zzd.zzc()) {
            zzdx zzdxVar = this.zzd;
            int zzc = zzdxVar.zzc();
            zzdxVar.zzJ(new byte[Math.max(zzc + zzc, this.zzl)], 0);
        } else {
            this.zzd.zzL(0);
        }
        this.zzd.zzK(this.zzl);
        zzackVar.zzi(this.zzd.zzN(), 0, this.zzl);
        return this.zzd;
    }

    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzP(new zzadh(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzack r17, com.google.android.gms.internal.ads.zzadf r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeq.zzb(com.google.android.gms.internal.ads.zzack, com.google.android.gms.internal.ads.zzadf):int");
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
        this.zzf = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        zzaby zzabyVar = (zzaby) zzackVar;
        zzabyVar.zzm(this.zza.zzN(), 0, 3, false);
        this.zza.zzL(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzabyVar.zzm(this.zza.zzN(), 0, 2, false);
        this.zza.zzL(0);
        if ((this.zza.zzq() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        zzabyVar.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        int zzg = this.zza.zzg();
        zzackVar.zzj();
        zzaby zzabyVar2 = (zzaby) zzackVar;
        zzabyVar2.zzl(zzg, false);
        zzabyVar2.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        return this.zza.zzg() == 0;
    }
}
