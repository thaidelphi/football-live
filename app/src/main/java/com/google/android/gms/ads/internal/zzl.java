package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field
    public final boolean zza;
    @SafeParcelable.Field
    public final boolean zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final boolean zzd;
    @SafeParcelable.Field
    public final float zze;
    @SafeParcelable.Field
    public final int zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public final boolean zzh;
    @SafeParcelable.Field
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z12, @SafeParcelable.Param float f10, @SafeParcelable.Param int i10, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param boolean z15) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = z13;
        this.zzh = z14;
        this.zzi = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, z10);
        SafeParcelWriter.c(parcel, 3, this.zzb);
        SafeParcelWriter.r(parcel, 4, this.zzc, false);
        SafeParcelWriter.c(parcel, 5, this.zzd);
        SafeParcelWriter.h(parcel, 6, this.zze);
        SafeParcelWriter.k(parcel, 7, this.zzf);
        SafeParcelWriter.c(parcel, 8, this.zzg);
        SafeParcelWriter.c(parcel, 9, this.zzh);
        SafeParcelWriter.c(parcel, 10, this.zzi);
        SafeParcelWriter.b(parcel, a10);
    }

    public zzl(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }
}
