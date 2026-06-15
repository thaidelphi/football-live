package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzns {
    final /* synthetic */ zznt zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzty zze;
    private boolean zzf;
    private boolean zzg;

    public zzns(zznt zzntVar, String str, int i10, zzty zztyVar) {
        this.zza = zzntVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zztyVar == null ? -1L : zztyVar.zzd;
        if (zztyVar == null || !zztyVar.zzb()) {
            return;
        }
        this.zze = zztyVar;
    }

    public final void zzg(int i10, zzty zztyVar) {
        if (this.zzd == -1 && i10 == this.zzc && zztyVar != null) {
            zznt zzntVar = this.zza;
            long j10 = zztyVar.zzd;
            if (j10 >= zznt.zza(zzntVar)) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzj(int i10, zzty zztyVar) {
        if (zztyVar == null) {
            return i10 == this.zzc;
        }
        zzty zztyVar2 = this.zze;
        return zztyVar2 == null ? !zztyVar.zzb() && zztyVar.zzd == this.zzd : zztyVar.zzd == zztyVar2.zzd && zztyVar.zzb == zztyVar2.zzb && zztyVar.zzc == zztyVar2.zzc;
    }

    public final boolean zzk(zzln zzlnVar) {
        zzty zztyVar = zzlnVar.zzd;
        if (zztyVar == null) {
            return this.zzc != zzlnVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        if (zztyVar.zzd > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbn zzbnVar = zzlnVar.zzb;
        int zza = zzbnVar.zza(zztyVar.zza);
        int zza2 = zzbnVar.zza(this.zze.zza);
        zzty zztyVar2 = zzlnVar.zzd;
        if (zztyVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zztyVar2.zzb()) {
            zzty zztyVar3 = zzlnVar.zzd;
            int i10 = zztyVar3.zzb;
            int i11 = zztyVar3.zzc;
            zzty zztyVar4 = this.zze;
            int i12 = zztyVar4.zzb;
            if (i10 <= i12) {
                return i10 == i12 && i11 > zztyVar4.zzc;
            }
            return true;
        }
        int i13 = zzlnVar.zzd.zze;
        return i13 == -1 || i13 > this.zze.zzb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzbn r7, com.google.android.gms.internal.ads.zzbn r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zznt r1 = r6.zza
            com.google.android.gms.internal.ads.zzbm r1 = com.google.android.gms.internal.ads.zznt.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zznt r0 = r6.zza
            com.google.android.gms.internal.ads.zzbm r0 = com.google.android.gms.internal.ads.zznt.zzc(r0)
            int r0 = r0.zzn
        L26:
            com.google.android.gms.internal.ads.zznt r1 = r6.zza
            com.google.android.gms.internal.ads.zzbm r1 = com.google.android.gms.internal.ads.zznt.zzc(r1)
            int r1 = r1.zzo
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zznt r7 = r6.zza
            com.google.android.gms.internal.ads.zzbl r7 = com.google.android.gms.internal.ads.zznt.zzb(r7)
            com.google.android.gms.internal.ads.zzbl r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzc
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzty r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzns.zzl(com.google.android.gms.internal.ads.zzbn, com.google.android.gms.internal.ads.zzbn):boolean");
    }
}
