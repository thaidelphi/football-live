package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final boolean zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final int zzf;
    @SafeParcelable.Field
    public final zzr[] zzg;
    @SafeParcelable.Field
    public final boolean zzh;
    @SafeParcelable.Field
    public final boolean zzi;
    @SafeParcelable.Field
    public boolean zzj;
    @SafeParcelable.Field
    public boolean zzk;
    @SafeParcelable.Field
    public boolean zzl;
    @SafeParcelable.Field
    public boolean zzm;
    @SafeParcelable.Field
    public boolean zzn;
    @SafeParcelable.Field
    public boolean zzo;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int X(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (X(displayMetrics) * displayMetrics.density);
    }

    public static zzr zzb() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzr zzc() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, str, false);
        SafeParcelWriter.k(parcel, 3, this.zzb);
        SafeParcelWriter.k(parcel, 4, this.zzc);
        SafeParcelWriter.c(parcel, 5, this.zzd);
        SafeParcelWriter.k(parcel, 6, this.zze);
        SafeParcelWriter.k(parcel, 7, this.zzf);
        SafeParcelWriter.u(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.c(parcel, 9, this.zzh);
        SafeParcelWriter.c(parcel, 10, this.zzi);
        SafeParcelWriter.c(parcel, 11, this.zzj);
        SafeParcelWriter.c(parcel, 12, this.zzk);
        SafeParcelWriter.c(parcel, 13, this.zzl);
        SafeParcelWriter.c(parcel, 14, this.zzm);
        SafeParcelWriter.c(parcel, 15, this.zzn);
        SafeParcelWriter.c(parcel, 16, this.zzo);
        SafeParcelWriter.b(parcel, a10);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzr(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzr.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13, @SafeParcelable.Param zzr[] zzrVarArr, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param boolean z15, @SafeParcelable.Param boolean z16, @SafeParcelable.Param boolean z17, @SafeParcelable.Param boolean z18) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = zzrVarArr;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = z14;
        this.zzl = z15;
        this.zzm = z16;
        this.zzn = z17;
        this.zzo = z18;
    }
}
