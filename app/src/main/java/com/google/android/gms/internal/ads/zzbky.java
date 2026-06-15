package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbky extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbky> CREATOR = new zzbkz();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final int zzd;

    @SafeParcelable.Constructor
    public zzbky(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str, @SafeParcelable.Param int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzb;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.r(parcel, 2, this.zzc, false);
        SafeParcelWriter.k(parcel, 3, this.zzd);
        SafeParcelWriter.k(parcel, 1000, this.zza);
        SafeParcelWriter.b(parcel, a10);
    }
}
