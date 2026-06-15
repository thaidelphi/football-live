package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalv implements zzalm {
    private final zzamq zza;
    private String zzb;
    private zzadp zzc;
    private zzalu zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzame zzg = new zzame(32, 128);
    private final zzame zzh = new zzame(33, 128);
    private final zzame zzi = new zzame(34, 128);
    private final zzame zzj = new zzame(39, 128);
    private final zzame zzk = new zzame(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzdx zzn = new zzdx();

    public zzalv(zzamq zzamqVar, String str) {
        this.zza = zzamqVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd  */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r29) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalv.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzb = zzanaVar.zzb();
        zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzalu(zzw);
        this.zza.zzd(zzacmVar, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
        zzcv.zzb(this.zzc);
        int i10 = zzeh.zza;
        if (z10) {
            this.zza.zze();
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfd.zzi(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzb();
        zzalu zzaluVar = this.zzd;
        if (zzaluVar != null) {
            zzaluVar.zzd();
        }
    }
}
