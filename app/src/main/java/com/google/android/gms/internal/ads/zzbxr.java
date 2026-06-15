package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxr> CREATOR = new zzbxs();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzr zzc;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final String zzf;

    @SafeParcelable.Constructor
    public zzbxr(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzr zzrVar, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param int i10, @SafeParcelable.Param String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzmVar;
        this.zze = i10;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.r(parcel, 2, this.zzb, false);
        SafeParcelWriter.q(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.q(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.k(parcel, 5, this.zze);
        SafeParcelWriter.r(parcel, 6, this.zzf, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
