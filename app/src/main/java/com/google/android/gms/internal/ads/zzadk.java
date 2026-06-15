package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzadk implements zzacj {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacm zzf;
    private zzadp zzg;

    public zzadk(int i10, int i11, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        int i10 = this.zze;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzadp zzadpVar = this.zzg;
        Objects.requireNonNull(zzadpVar);
        int zzf = zzadpVar.zzf(zzackVar, 1024, true);
        if (zzf == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zzf;
        }
        return 0;
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
        zzadp zzw = zzacmVar.zzw(1024, 4);
        this.zzg = zzw;
        zzx zzxVar = new zzx();
        String str = this.zzc;
        zzxVar.zzE(str);
        zzxVar.zzad(str);
        zzw.zzm(zzxVar.zzaj());
        this.zzf.zzG();
        this.zzf.zzP(new zzadl(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        if (j10 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        zzcv.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzdx zzdxVar = new zzdx(this.zzb);
        ((zzaby) zzackVar).zzm(zzdxVar.zzN(), 0, this.zzb, false);
        return zzdxVar.zzq() == this.zza;
    }
}
