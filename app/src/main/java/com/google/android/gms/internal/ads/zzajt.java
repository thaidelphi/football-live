package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzajt {
    private final zzdx zza = new zzdx();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzajt zzajtVar, zzdx zzdxVar, int i10) {
        int zzo;
        if (i10 < 4) {
            return;
        }
        zzdxVar.zzM(3);
        int i11 = i10 - 4;
        if ((zzdxVar.zzm() & 128) != 0) {
            if (i11 < 7 || (zzo = zzdxVar.zzo()) < 4) {
                return;
            }
            zzajtVar.zzh = zzdxVar.zzq();
            zzajtVar.zzi = zzdxVar.zzq();
            zzajtVar.zza.zzI(zzo - 4);
            i11 -= 7;
        }
        zzdx zzdxVar2 = zzajtVar.zza;
        int zzd = zzdxVar2.zzd();
        int zze = zzdxVar2.zze();
        if (zzd >= zze || i11 <= 0) {
            return;
        }
        int min = Math.min(i11, zze - zzd);
        zzdxVar.zzH(zzdxVar2.zzN(), zzd, min);
        zzajtVar.zza.zzL(zzd + min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzajt zzajtVar, zzdx zzdxVar, int i10) {
        if (i10 < 19) {
            return;
        }
        zzajtVar.zzd = zzdxVar.zzq();
        zzajtVar.zze = zzdxVar.zzq();
        zzdxVar.zzM(11);
        zzajtVar.zzf = zzdxVar.zzq();
        zzajtVar.zzg = zzdxVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzajt zzajtVar, zzdx zzdxVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzdxVar.zzM(2);
        int i11 = 0;
        Arrays.fill(zzajtVar.zzb, 0);
        int i12 = i10 / 5;
        int i13 = 0;
        while (i13 < i12) {
            int zzm = zzdxVar.zzm();
            int zzm2 = zzdxVar.zzm();
            int zzm3 = zzdxVar.zzm();
            int zzm4 = zzdxVar.zzm();
            int zzm5 = zzdxVar.zzm();
            double d10 = zzm2;
            int[] iArr = zzajtVar.zzb;
            int i14 = zzeh.zza;
            double d11 = zzm3 - 128;
            double d12 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)) | (zzm5 << 24) | (Math.max(i11, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8);
            i13++;
            i11 = 0;
        }
        zzajtVar.zzc = true;
    }

    public final zzcn zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzdx zzdxVar = this.zza;
        if (zzdxVar.zze() != 0 && zzdxVar.zzd() == zzdxVar.zze() && this.zzc) {
            zzdxVar.zzL(0);
            int i11 = this.zzh * this.zzi;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int zzm = this.zza.zzm();
                if (zzm != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.zzb[zzm];
                } else {
                    int zzm2 = this.zza.zzm();
                    if (zzm2 != 0) {
                        int i13 = zzm2 & 63;
                        if ((zzm2 & 64) != 0) {
                            i13 = (i13 << 8) | this.zza.zzm();
                        }
                        i10 = i13 + i12;
                        Arrays.fill(iArr, i12, i10, (zzm2 & 128) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]);
                    }
                }
                i12 = i10;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
            zzcl zzclVar = new zzcl();
            zzclVar.zzc(createBitmap);
            zzclVar.zzh(this.zzf / this.zzd);
            zzclVar.zzi(0);
            zzclVar.zze(this.zzg / this.zze, 0);
            zzclVar.zzf(0);
            zzclVar.zzk(this.zzh / this.zzd);
            zzclVar.zzd(this.zzi / this.zze);
            return zzclVar.zzp();
        }
        return null;
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
