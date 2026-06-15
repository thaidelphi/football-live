package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzael implements zzabt {
    private final zzacu zza;
    private final int zzb;
    private final zzacp zzc = new zzacp();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzael(zzacu zzacuVar, int i10, zzaem zzaemVar) {
        this.zza = zzacuVar;
        this.zzb = i10;
    }

    private final long zzc(zzack zzackVar) throws IOException {
        while (zzackVar.zze() < zzackVar.zzd() - 6) {
            zzacu zzacuVar = this.zza;
            int i10 = this.zzb;
            zzacp zzacpVar = this.zzc;
            long zze = zzackVar.zze();
            byte[] bArr = new byte[2];
            zzackVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzackVar.zzj();
                zzackVar.zzg((int) (zze - zzackVar.zzf()));
            } else {
                zzdx zzdxVar = new zzdx(16);
                System.arraycopy(bArr, 0, zzdxVar.zzN(), 0, 2);
                zzdxVar.zzK(zzacn.zza(zzackVar, zzdxVar.zzN(), 2, 14));
                zzackVar.zzj();
                zzackVar.zzg((int) (zze - zzackVar.zzf()));
                if (zzacq.zzc(zzdxVar, zzacuVar, i10, zzacpVar)) {
                    break;
                }
            }
            zzackVar.zzg(1);
        }
        if (zzackVar.zze() >= zzackVar.zzd() - 6) {
            zzackVar.zzg((int) (zzackVar.zzd() - zzackVar.zze()));
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzack zzackVar, long j10) throws IOException {
        long zzf = zzackVar.zzf();
        long zzc = zzc(zzackVar);
        long zze = zzackVar.zze();
        zzackVar.zzg(Math.max(6, this.zza.zzc));
        int i10 = (zzc > j10 ? 1 : (zzc == j10 ? 0 : -1));
        long zzc2 = zzc(zzackVar);
        return (i10 > 0 || zzc2 <= j10) ? zzc2 <= j10 ? zzabs.zzf(zzc2, zzackVar.zze()) : zzabs.zzd(zzc, zzf) : zzabs.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final /* synthetic */ void zzb() {
    }
}
