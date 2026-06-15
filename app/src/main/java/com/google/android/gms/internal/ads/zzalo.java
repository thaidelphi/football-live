package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalo implements zzalm {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzadp zzc;
    private final zzand zzd;
    private final String zze;
    private final zzdx zzf;
    private final zzame zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaln zzi = new zzaln(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalo(zzand zzandVar, String str) {
        zzdx zzdxVar;
        this.zzd = zzandVar;
        this.zze = str;
        if (zzandVar != null) {
            this.zzg = new zzame(178, 128);
            zzdxVar = new zzdx();
        } else {
            zzdxVar = null;
            this.zzg = null;
        }
        this.zzf = zzdxVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0  */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r22) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzb = zzanaVar.zzb();
        this.zzc = zzacmVar.zzw(zzanaVar.zza(), 2);
        zzand zzandVar = this.zzd;
        if (zzandVar != null) {
            zzandVar.zzb(zzacmVar, zzanaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
        zzcv.zzb(this.zzc);
        if (z10) {
            boolean z11 = this.zzq;
            long j10 = this.zzj - this.zzo;
            this.zzc.zzt(this.zzp, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        zzfd.zzi(this.zzh);
        this.zzi.zzb();
        zzame zzameVar = this.zzg;
        if (zzameVar != null) {
            zzameVar.zzb();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }
}
