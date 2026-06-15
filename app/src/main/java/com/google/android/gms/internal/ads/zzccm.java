package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzccm implements zzfr {
    private final zzfr zza;
    private final long zzb;
    private final zzfr zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccm(zzfr zzfrVar, int i10, zzfr zzfrVar2) {
        this.zza = zzfrVar;
        this.zzb = i10;
        this.zzc = zzfrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + zza;
            this.zzd = j12;
            i12 = zza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
            int i13 = i12 + zza2;
            this.zzd += zza2;
            return i13;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws IOException {
        zzfw zzfwVar2;
        this.zze = zzfwVar.zza;
        long j10 = zzfwVar.zze;
        long j11 = this.zzb;
        zzfw zzfwVar3 = null;
        if (j10 >= j11) {
            zzfwVar2 = null;
        } else {
            long j12 = zzfwVar.zzf;
            long j13 = j11 - j10;
            if (j12 != -1) {
                j13 = Math.min(j12, j13);
            }
            zzfwVar2 = new zzfw(zzfwVar.zza, j10, j13, null);
        }
        long j14 = zzfwVar.zzf;
        if (j14 == -1 || zzfwVar.zze + j14 > this.zzb) {
            long max = Math.max(this.zzb, zzfwVar.zze);
            long j15 = zzfwVar.zzf;
            zzfwVar3 = new zzfw(zzfwVar.zza, max, j15 != -1 ? Math.min(j15, (zzfwVar.zze + j15) - this.zzb) : -1L, null);
        }
        long zzb = zzfwVar2 != null ? this.zza.zzb(zzfwVar2) : 0L;
        long zzb2 = zzfwVar3 != null ? this.zzc.zzb(zzfwVar3) : 0L;
        this.zzd = zzfwVar.zze;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Map zze() {
        return zzfvy.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzf(zzgr zzgrVar) {
    }
}
