package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagn {
    private final zzdx zza = new zzdx(8);
    private int zzb;

    private final long zzb(zzack zzackVar) throws IOException {
        int i10;
        zzaby zzabyVar = (zzaby) zzackVar;
        int i11 = 0;
        zzabyVar.zzm(this.zza.zzN(), 0, 1, false);
        int i12 = this.zza.zzN()[0] & 255;
        if (i12 != 0) {
            int i13 = 128;
            int i14 = 0;
            while (true) {
                i10 = i14 + 1;
                if ((i12 & i13) != 0) {
                    break;
                }
                i13 >>= 1;
                i14 = i10;
            }
            int i15 = i12 & (~i13);
            zzabyVar.zzm(this.zza.zzN(), 1, i14, false);
            while (i11 < i14) {
                i11++;
                i15 = (this.zza.zzN()[i11] & 255) + (i15 << 8);
            }
            this.zzb += i10;
            return i15;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzack zzackVar) throws IOException {
        long zzb;
        int i10;
        long zzd = zzackVar.zzd();
        int i11 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && zzd <= 1024) {
            j10 = zzd;
        }
        zzaby zzabyVar = (zzaby) zzackVar;
        zzabyVar.zzm(this.zza.zzN(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i12 = (int) j10;
            int i13 = this.zzb + 1;
            this.zzb = i13;
            if (i13 == i12) {
                return false;
            }
            zzabyVar.zzm(this.zza.zzN(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzN()[0] & 255);
        }
        long zzb2 = zzb(zzackVar);
        long j11 = this.zzb;
        if (zzb2 != Long.MIN_VALUE) {
            long j12 = j11 + zzb2;
            if (i11 == 0 || j12 < zzd) {
                while (true) {
                    int i14 = (this.zzb > j12 ? 1 : (this.zzb == j12 ? 0 : -1));
                    if (i14 < 0) {
                        if (zzb(zzackVar) == Long.MIN_VALUE || (zzb = zzb(zzackVar)) < 0) {
                            return false;
                        }
                        if (i10 != 0) {
                            int i15 = (int) zzb;
                            zzabyVar.zzl(i15, false);
                            this.zzb += i15;
                        }
                    } else if (i14 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
