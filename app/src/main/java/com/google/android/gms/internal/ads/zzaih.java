package com.google.android.gms.internal.ads;

import java.math.BigInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaih implements zzadi {
    final /* synthetic */ zzaij zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaih(zzaij zzaijVar, zzaii zzaiiVar) {
        this.zza = zzaijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        zzaiu zzaiuVar;
        long j10;
        zzaij zzaijVar = this.zza;
        zzaiuVar = zzaijVar.zzd;
        j10 = zzaijVar.zzf;
        return zzaiuVar.zzf(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        zzaiu zzaiuVar;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        zzaij zzaijVar = this.zza;
        zzaiuVar = zzaijVar.zzd;
        long zzg = zzaiuVar.zzg(j10);
        j11 = zzaijVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaij zzaijVar2 = this.zza;
        j12 = zzaijVar2.zzc;
        j13 = zzaijVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j12 - j13));
        j14 = this.zza.zzf;
        long longValue = j11 + multiply.divide(BigInteger.valueOf(j14)).longValue();
        zzaij zzaijVar3 = this.zza;
        j15 = zzaijVar3.zzb;
        j16 = zzaijVar3.zzc;
        int i10 = zzeh.zza;
        zzadj zzadjVar = new zzadj(j10, Math.max(j15, Math.min(longValue - 30000, j16 - 1)));
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
