package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalx implements zzalm {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzdx zzd;
    private final zzdw zze;
    private zzadp zzf;
    private String zzg;
    private zzz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzalx(String str, int i10, String str2) {
        this.zza = str;
        this.zzb = i10;
        zzdx zzdxVar = new zzdx(1024);
        this.zzd = zzdxVar;
        byte[] zzN = zzdxVar.zzN();
        this.zze = new zzdw(zzN, zzN.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzdw zzdwVar) throws zzaz {
        int zza = zzdwVar.zza();
        zzabd zzb = zzabf.zzb(zzdwVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zza - zzdwVar.zza();
    }

    private static long zzg(zzdw zzdwVar) {
        return zzdwVar.zzd((zzdwVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x015e, code lost:
        if (r14.zzn == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zzalm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzdx r15) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalx.zza(com.google.android.gms.internal.ads.zzdx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzf = zzacmVar.zzw(zzanaVar.zza(), 1);
        this.zzg = zzanaVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }
}
