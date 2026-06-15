package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzang implements zzanf {
    private final zzacm zza;
    private final zzadp zzb;
    private final zzani zzc;
    private final zzz zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzang(zzacm zzacmVar, zzadp zzadpVar, zzani zzaniVar, String str, int i10) throws zzaz {
        this.zza = zzacmVar;
        this.zzb = zzadpVar;
        this.zzc = zzaniVar;
        int i11 = zzaniVar.zzb * zzaniVar.zze;
        int i12 = zzaniVar.zzd;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = zzaniVar.zzc * i13;
            int i15 = i14 * 8;
            int max = Math.max(i13, i14 / 10);
            this.zze = max;
            zzx zzxVar = new zzx();
            zzxVar.zzE("audio/wav");
            zzxVar.zzad(str);
            zzxVar.zzA(i15);
            zzxVar.zzY(i15);
            zzxVar.zzT(max);
            zzxVar.zzB(zzaniVar.zzb);
            zzxVar.zzae(zzaniVar.zzc);
            zzxVar.zzX(i10);
            this.zzd = zzxVar.zzaj();
            return;
        }
        throw zzaz.zza("Expected block size: " + i13 + "; got: " + i12, null);
    }

    @Override // com.google.android.gms.internal.ads.zzanf
    public final void zza(int i10, long j10) {
        zzanl zzanlVar = new zzanl(this.zzc, 1, i10, j10);
        this.zza.zzP(zzanlVar);
        this.zzb.zzm(this.zzd);
        this.zzb.zzl(zzanlVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzanf
    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzanf
    public final boolean zzc(zzack zzackVar, long j10) throws IOException {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.zzg) >= (i12 = this.zze)) {
                break;
            }
            int zzf = this.zzb.zzf(zzackVar, (int) Math.min(i12 - i11, j11), true);
            if (zzf == -1) {
                j11 = 0;
            } else {
                this.zzg += zzf;
                j11 -= zzf;
            }
        }
        zzani zzaniVar = this.zzc;
        int i13 = this.zzg;
        int i14 = zzaniVar.zzd;
        int i15 = i13 / i14;
        if (i15 > 0) {
            int i16 = i15 * i14;
            int i17 = this.zzg - i16;
            this.zzb.zzt(this.zzf + zzeh.zzu(this.zzh, 1000000L, zzaniVar.zzc, RoundingMode.DOWN), 1, i16, i17, null);
            this.zzh += i15;
            this.zzg = i17;
        }
        return i10 <= 0;
    }
}
