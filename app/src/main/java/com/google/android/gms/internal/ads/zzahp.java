package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzahp {
    public final zzadp zza;
    public zzaif zzd;
    public zzahl zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final String zzj;
    private boolean zzm;
    public final zzaie zzb = new zzaie();
    public final zzdx zzc = new zzdx();
    private final zzdx zzk = new zzdx(1);
    private final zzdx zzl = new zzdx();

    public zzahp(zzadp zzadpVar, zzaif zzaifVar, zzahl zzahlVar, String str) {
        this.zza = zzadpVar;
        this.zzd = zzaifVar;
        this.zze = zzahlVar;
        this.zzj = str;
        zzh(zzaifVar, zzahlVar);
    }

    public final int zza() {
        int i10;
        if (this.zzm) {
            i10 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i10 = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i10 | 1073741824 : i10;
    }

    public final int zzb() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzdx zzdxVar;
        zzaid zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i12 = zzf.zzd;
        if (i12 != 0) {
            zzdxVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i13 = zzeh.zza;
            zzdx zzdxVar2 = this.zzl;
            int length = bArr.length;
            zzdxVar2.zzJ(bArr, length);
            zzdxVar = this.zzl;
            i12 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z10 = zzb || i11 != 0;
        zzdx zzdxVar3 = this.zzk;
        zzdxVar3.zzN()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        zzdxVar3.zzL(0);
        this.zza.zzs(this.zzk, 1, 1);
        this.zza.zzs(zzdxVar, i12, 1);
        if (z10) {
            if (!zzb) {
                this.zzc.zzI(8);
                zzdx zzdxVar4 = this.zzc;
                byte[] zzN = zzdxVar4.zzN();
                zzN[0] = 0;
                zzN[1] = 1;
                zzN[2] = 0;
                zzN[3] = (byte) i11;
                zzN[4] = (byte) ((i10 >> 24) & 255);
                zzN[5] = (byte) ((i10 >> 16) & 255);
                zzN[6] = (byte) ((i10 >> 8) & 255);
                zzN[7] = (byte) (i10 & 255);
                this.zza.zzs(zzdxVar4, 8, 1);
                return i12 + 9;
            }
            int i14 = i12 + 1;
            zzdx zzdxVar5 = this.zzb.zzn;
            int zzq = zzdxVar5.zzq();
            zzdxVar5.zzM(-2);
            int i15 = (zzq * 6) + 2;
            if (i11 != 0) {
                this.zzc.zzI(i15);
                byte[] zzN2 = this.zzc.zzN();
                zzdxVar5.zzH(zzN2, 0, i15);
                int i16 = (((zzN2[2] & 255) << 8) | (zzN2[3] & 255)) + i11;
                zzN2[2] = (byte) ((i16 >> 8) & 255);
                zzN2[3] = (byte) (i16 & 255);
                zzdxVar5 = this.zzc;
            }
            this.zza.zzs(zzdxVar5, i15, 1);
            return i14 + i15;
        }
        return i12 + 1;
    }

    public final long zzd() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (this.zzm) {
            zzaie zzaieVar = this.zzb;
            return zzaieVar.zzi[this.zzf];
        }
        return this.zzd.zzf[this.zzf];
    }

    public final zzaid zzf() {
        if (this.zzm) {
            zzaie zzaieVar = this.zzb;
            zzahl zzahlVar = zzaieVar.zza;
            int i10 = zzeh.zza;
            int i11 = zzahlVar.zza;
            zzaid zzaidVar = zzaieVar.zzm;
            if (zzaidVar == null) {
                zzaidVar = this.zzd.zza.zzb(i11);
            }
            if (zzaidVar == null || !zzaidVar.zza) {
                return null;
            }
            return zzaidVar;
        }
        return null;
    }

    public final void zzh(zzaif zzaifVar, zzahl zzahlVar) {
        this.zzd = zzaifVar;
        this.zze = zzahlVar;
        zzx zzb = zzaifVar.zza.zzg.zzb();
        zzb.zzE(this.zzj);
        this.zza.zzm(zzb.zzaj());
        zzi();
    }

    public final void zzi() {
        zzaie zzaieVar = this.zzb;
        zzaieVar.zzd = 0;
        zzaieVar.zzp = 0L;
        zzaieVar.zzq = false;
        zzaieVar.zzk = false;
        zzaieVar.zzo = false;
        zzaieVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final void zzj(zzs zzsVar) {
        zzaic zzaicVar = this.zzd.zza;
        zzahl zzahlVar = this.zzb.zza;
        int i10 = zzeh.zza;
        zzaid zzb = zzaicVar.zzb(zzahlVar.zza);
        zzs zzb2 = zzsVar.zzb(zzb != null ? zzb.zzb : null);
        zzz zzzVar = this.zzd.zza.zzg;
        String str = this.zzj;
        zzx zzb3 = zzzVar.zzb();
        zzb3.zzE(str);
        zzb3.zzH(zzb2);
        this.zza.zzm(zzb3.zzaj());
    }

    public final boolean zzl() {
        this.zzf++;
        if (this.zzm) {
            int i10 = this.zzg + 1;
            this.zzg = i10;
            int[] iArr = this.zzb.zzg;
            int i11 = this.zzh;
            if (i10 == iArr[i11]) {
                this.zzh = i11 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
