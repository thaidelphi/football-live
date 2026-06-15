package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzale implements zzalm {
    private final zzdw zza;
    private final zzdx zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzadp zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn;

    public zzale(String str, int i10, String str2) {
        zzdw zzdwVar = new zzdw(new byte[128], 128);
        this.zza = zzdwVar;
        this.zzb = new zzdx(zzdwVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
        if (java.util.Objects.equals(r4, r2) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzale.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzf = zzanaVar.zzb();
        this.zzg = zzacmVar.zzw(zzanaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }
}
