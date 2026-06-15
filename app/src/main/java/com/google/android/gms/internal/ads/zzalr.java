package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalr implements zzalm {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzand zzb;
    private zzalq zzg;
    private long zzh;
    private String zzi;
    private zzadp zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzalp zze = new zzalp(128);
    private long zzl = -9223372036854775807L;
    private final zzame zzf = new zzame(178, 128);
    private final zzdx zzc = new zzdx();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalr(zzand zzandVar, String str) {
        this.zzb = zzandVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r18) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzi = zzanaVar.zzb();
        zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzalq(zzw);
        this.zzb.zzb(zzacmVar, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
        zzcv.zzb(this.zzg);
        if (z10) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzl = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        zzfd.zzi(this.zzd);
        this.zze.zzb();
        zzalq zzalqVar = this.zzg;
        if (zzalqVar != null) {
            zzalqVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}
