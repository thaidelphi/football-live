package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzact zzk;
    private final zzav zzl;

    private zzacu(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzact zzactVar, zzav zzavVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzactVar;
        this.zzl = zzavVar;
    }

    public zzacu(byte[] bArr, int i10) {
        zzdw zzdwVar = new zzdw(bArr, bArr.length);
        zzdwVar.zzl(i10 * 8);
        this.zza = zzdwVar.zzd(16);
        this.zzb = zzdwVar.zzd(16);
        this.zzc = zzdwVar.zzd(24);
        this.zzd = zzdwVar.zzd(24);
        int zzd = zzdwVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzdwVar.zzd(3) + 1;
        int zzd2 = zzdwVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        this.zzj = zzdwVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.zze;
    }

    public final long zzb(long j10) {
        int i10 = zzeh.zza;
        return Math.max(0L, Math.min((j10 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzz zzc(byte[] bArr, zzav zzavVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzav zzd = zzd(zzavVar);
        zzx zzxVar = new zzx();
        zzxVar.zzad("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzxVar.zzT(i10);
        zzxVar.zzB(this.zzg);
        zzxVar.zzae(this.zze);
        zzxVar.zzX(zzeh.zzn(this.zzh));
        zzxVar.zzP(Collections.singletonList(bArr));
        zzxVar.zzW(zzd);
        return zzxVar.zzaj();
    }

    public final zzav zzd(zzav zzavVar) {
        zzav zzavVar2 = this.zzl;
        return zzavVar2 == null ? zzavVar : zzavVar2.zzd(zzavVar);
    }

    public final zzacu zze(List list) {
        return new zzacu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzav(list)));
    }

    public final zzacu zzf(zzact zzactVar) {
        return new zzacu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzactVar, this.zzl);
    }

    public final zzacu zzg(List list) {
        return new zzacu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzadv.zzb(list)));
    }
}
