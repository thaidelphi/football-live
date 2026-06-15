package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public long zzb;
    @SafeParcelable.Field
    public zze zzc;
    @SafeParcelable.Field
    public final Bundle zzd;
    @SafeParcelable.Field
    public final String zze;
    @SafeParcelable.Field
    public final String zzf;
    @SafeParcelable.Field
    public final String zzg;
    @SafeParcelable.Field
    public final String zzh;

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param String str, @SafeParcelable.Param long j10, @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.n(parcel, 2, this.zzb);
        SafeParcelWriter.q(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.e(parcel, 4, this.zzd, false);
        SafeParcelWriter.r(parcel, 5, this.zze, false);
        SafeParcelWriter.r(parcel, 6, this.zzf, false);
        SafeParcelWriter.r(parcel, 7, this.zzg, false);
        SafeParcelWriter.r(parcel, 8, this.zzh, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
