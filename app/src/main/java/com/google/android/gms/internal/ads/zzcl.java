package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcl {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = RecyclerView.UNDEFINED_DURATION;
        this.zzg = RecyclerView.UNDEFINED_DURATION;
        this.zzh = -3.4028235E38f;
        this.zzi = RecyclerView.UNDEFINED_DURATION;
        this.zzj = RecyclerView.UNDEFINED_DURATION;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcl(zzcn zzcnVar, zzcm zzcmVar) {
        this.zza = zzcnVar.zza;
        this.zzb = zzcnVar.zzd;
        this.zzc = zzcnVar.zzb;
        this.zzd = zzcnVar.zzc;
        this.zze = zzcnVar.zze;
        this.zzf = zzcnVar.zzf;
        this.zzg = zzcnVar.zzg;
        this.zzh = zzcnVar.zzh;
        this.zzi = zzcnVar.zzi;
        this.zzj = zzcnVar.zzl;
        this.zzk = zzcnVar.zzm;
        this.zzl = zzcnVar.zzj;
        this.zzm = zzcnVar.zzk;
        this.zzn = zzcnVar.zzn;
        this.zzo = zzcnVar.zzo;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzcl zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcl zzd(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcl zze(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzcl zzf(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzcl zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcl zzh(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcl zzi(int i10) {
        this.zzi = i10;
        return this;
    }

    public final zzcl zzj(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcl zzk(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcl zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcl zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcl zzn(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzcl zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzcn zzp() {
        return new zzcn(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, null);
    }

    public final CharSequence zzq() {
        return this.zza;
    }
}
