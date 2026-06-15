package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalt implements zzalm {
    private final zzamq zza;
    private long zzf;
    private String zzh;
    private zzadp zzi;
    private zzals zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzame zzc = new zzame(7, 128);
    private final zzame zzd = new zzame(8, 128);
    private final zzame zze = new zzame(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzdx zzn = new zzdx();

    public zzalt(zzamq zzamqVar, boolean z10, boolean z11, String str) {
        this.zza = zzamqVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzk) {
            this.zzc.zza(bArr, i10, i11);
            this.zzd.zza(bArr, i10, i11);
        }
        this.zze.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r19) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzh = zzanaVar.zzb();
        zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 2);
        this.zzi = zzw;
        this.zzj = new zzals(zzw, false, false);
        this.zza.zzd(zzacmVar, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
        zzcv.zzb(this.zzi);
        int i10 = zzeh.zza;
        if (z10) {
            this.zza.zze();
            this.zzj.zza(this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzl = j10;
        int i11 = i10 & 2;
        this.zzm = (i11 != 0) | this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfd.zzi(this.zzg);
        this.zzc.zzb();
        this.zzd.zzb();
        this.zze.zzb();
        this.zza.zzb();
        zzals zzalsVar = this.zzj;
        if (zzalsVar != null) {
            zzalsVar.zzd();
        }
    }
}
