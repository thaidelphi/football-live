package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcn {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzp;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public final CharSequence zza;
    public final Layout.Alignment zzb;
    public final Layout.Alignment zzc;
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;

    static {
        zzcl zzclVar = new zzcl();
        zzclVar.zzl("");
        zzclVar.zzp();
        int i10 = zzeh.zza;
        zzp = Integer.toString(0, 36);
        zzq = Integer.toString(17, 36);
        zzr = Integer.toString(1, 36);
        zzs = Integer.toString(2, 36);
        Integer.toString(3, 36);
        zzt = Integer.toString(18, 36);
        zzu = Integer.toString(4, 36);
        zzv = Integer.toString(5, 36);
        zzw = Integer.toString(6, 36);
        zzx = Integer.toString(7, 36);
        zzy = Integer.toString(8, 36);
        zzz = Integer.toString(9, 36);
        zzA = Integer.toString(10, 36);
        zzB = Integer.toString(11, 36);
        zzC = Integer.toString(12, 36);
        zzD = Integer.toString(13, 36);
        zzE = Integer.toString(14, 36);
        zzF = Integer.toString(15, 36);
        zzG = Integer.toString(16, 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcn(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, zzcm zzcmVar) {
        if (charSequence == null) {
            Objects.requireNonNull(bitmap);
        } else {
            zzcv.zzd(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = f11;
        this.zzi = i12;
        this.zzj = f13;
        this.zzk = f14;
        this.zzl = i13;
        this.zzm = f12;
        this.zzn = i15;
        this.zzo = f15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcn.class == obj.getClass()) {
            zzcn zzcnVar = (zzcn) obj;
            if (TextUtils.equals(this.zza, zzcnVar.zza) && this.zzb == zzcnVar.zzb && this.zzc == zzcnVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcnVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcnVar.zzd == null) && this.zze == zzcnVar.zze && this.zzf == zzcnVar.zzf && this.zzg == zzcnVar.zzg && this.zzh == zzcnVar.zzh && this.zzi == zzcnVar.zzi && this.zzj == zzcnVar.zzj && this.zzk == zzcnVar.zzk && this.zzl == zzcnVar.zzl && this.zzm == zzcnVar.zzm && this.zzn == zzcnVar.zzn && this.zzo == zzcnVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), Boolean.FALSE, -16777216, Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo)});
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzp, charSequence);
            CharSequence charSequence2 = this.zza;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> zza = zzcp.zza((Spanned) charSequence2);
                if (!zza.isEmpty()) {
                    bundle.putParcelableArrayList(zzq, zza);
                }
            }
        }
        bundle.putSerializable(zzr, this.zzb);
        bundle.putSerializable(zzs, this.zzc);
        bundle.putFloat(zzu, this.zze);
        bundle.putInt(zzv, this.zzf);
        bundle.putInt(zzw, this.zzg);
        bundle.putFloat(zzx, this.zzh);
        bundle.putInt(zzy, this.zzi);
        bundle.putInt(zzz, this.zzl);
        bundle.putFloat(zzA, this.zzm);
        bundle.putFloat(zzB, this.zzj);
        bundle.putFloat(zzC, this.zzk);
        bundle.putBoolean(zzE, false);
        bundle.putInt(zzD, -16777216);
        bundle.putInt(zzF, this.zzn);
        bundle.putFloat(zzG, this.zzo);
        if (this.zzd != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzcv.zzf(this.zzd.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzt, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final zzcl zzb() {
        return new zzcl(this, null);
    }
}
