package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzi {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzi() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzi(zzk zzkVar, zzj zzjVar) {
        this.zza = zzkVar.zzb;
        this.zzb = zzkVar.zzc;
        this.zzc = zzkVar.zzd;
        this.zzd = zzkVar.zze;
        this.zze = zzkVar.zzf;
        this.zzf = zzkVar.zzg;
    }

    public final zzi zza(int i10) {
        this.zzf = i10;
        return this;
    }

    public final zzi zzb(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzi zzc(int i10) {
        this.zza = i10;
        return this;
    }

    public final zzi zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzi zze(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzi zzf(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzk zzg() {
        return new zzk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }
}
