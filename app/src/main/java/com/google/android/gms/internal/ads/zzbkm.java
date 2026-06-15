package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbkm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkm> CREATOR = new zzbkn();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final boolean zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final String zzd;

    @SafeParcelable.Constructor
    public zzbkm(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i10, @SafeParcelable.Param String str2) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.c(parcel, 2, this.zzb);
        SafeParcelWriter.k(parcel, 3, this.zzc);
        SafeParcelWriter.r(parcel, 4, this.zzd, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
