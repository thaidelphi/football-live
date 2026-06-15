package com.google.android.gms.internal.ads;

import android.text.Layout;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakj {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzakc zzr;
    private String zzt;
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzakj zzA(float f10) {
        this.zzs = f10;
        return this;
    }

    public final zzakj zzB(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }

    public final zzakj zzC(boolean z10) {
        this.zzq = z10 ? 1 : 0;
        return this;
    }

    public final zzakj zzD(zzakc zzakcVar) {
        this.zzr = zzakcVar;
        return this;
    }

    public final zzakj zzE(boolean z10) {
        this.zzg = z10 ? 1 : 0;
        return this;
    }

    public final String zzF() {
        return this.zzu;
    }

    public final String zzG() {
        return this.zza;
    }

    public final String zzH() {
        return this.zzl;
    }

    public final String zzI() {
        return this.zzt;
    }

    public final boolean zzJ() {
        return this.zzq == 1;
    }

    public final boolean zzK() {
        return this.zze;
    }

    public final boolean zzL() {
        return this.zzc;
    }

    public final boolean zzM() {
        return this.zzf == 1;
    }

    public final boolean zzN() {
        return this.zzg == 1;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int i10 = this.zzh;
        if (i10 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    public final zzakc zzk() {
        return this.zzr;
    }

    public final zzakj zzl(zzakj zzakjVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzakjVar != null) {
            if (!this.zzc && zzakjVar.zzc) {
                zzp(zzakjVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzakjVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzakjVar.zzi;
            }
            if (this.zza == null && (str = zzakjVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzakjVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzakjVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzakjVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzakjVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzakjVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzakjVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzakjVar.zzj;
                this.zzk = zzakjVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzakjVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzakjVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzakjVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzakjVar.zzu;
            }
            if (!this.zze && zzakjVar.zze) {
                zzm(zzakjVar.zzd);
            }
            if (this.zzm == -1 && (i10 = zzakjVar.zzm) != -1) {
                this.zzm = i10;
            }
        }
        return this;
    }

    public final zzakj zzm(int i10) {
        this.zzd = i10;
        this.zze = true;
        return this;
    }

    public final zzakj zzn(boolean z10) {
        this.zzh = z10 ? 1 : 0;
        return this;
    }

    public final zzakj zzo(String str) {
        this.zzu = str;
        return this;
    }

    public final zzakj zzp(int i10) {
        this.zzb = i10;
        this.zzc = true;
        return this;
    }

    public final zzakj zzq(String str) {
        this.zza = str;
        return this;
    }

    public final zzakj zzr(float f10) {
        this.zzk = f10;
        return this;
    }

    public final zzakj zzs(int i10) {
        this.zzj = i10;
        return this;
    }

    public final zzakj zzt(String str) {
        this.zzl = str;
        return this;
    }

    public final zzakj zzu(boolean z10) {
        this.zzi = z10 ? 1 : 0;
        return this;
    }

    public final zzakj zzv(boolean z10) {
        this.zzf = z10 ? 1 : 0;
        return this;
    }

    public final zzakj zzw(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzakj zzx(String str) {
        this.zzt = str;
        return this;
    }

    public final zzakj zzy(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzakj zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
