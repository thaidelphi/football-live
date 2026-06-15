package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbud extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbud> CREATOR = new zzbue();
    @SafeParcelable.Field
    public final Bundle zza;
    @SafeParcelable.Field
    public final VersionInfoParcel zzb;
    @SafeParcelable.Field
    public final ApplicationInfo zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final List zze;
    @SafeParcelable.Field
    public final PackageInfo zzf;
    @SafeParcelable.Field
    public final String zzg;
    @SafeParcelable.Field
    public final String zzh;
    @SafeParcelable.Field
    public zzfcj zzi;
    @SafeParcelable.Field
    public String zzj;
    @SafeParcelable.Field
    public final boolean zzk;
    @SafeParcelable.Field
    public final boolean zzl;
    @SafeParcelable.Field
    public final Bundle zzm;
    @SafeParcelable.Field
    public final Bundle zzn;

    @SafeParcelable.Constructor
    public zzbud(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param VersionInfoParcel versionInfoParcel, @SafeParcelable.Param ApplicationInfo applicationInfo, @SafeParcelable.Param String str, @SafeParcelable.Param List list, @SafeParcelable.Param PackageInfo packageInfo, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param zzfcj zzfcjVar, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param Bundle bundle2, @SafeParcelable.Param Bundle bundle3) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfcjVar;
        this.zzj = str4;
        this.zzk = z10;
        this.zzl = z11;
        this.zzm = bundle2;
        this.zzn = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 1, bundle, false);
        SafeParcelWriter.q(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.q(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.r(parcel, 4, this.zzd, false);
        SafeParcelWriter.t(parcel, 5, this.zze, false);
        SafeParcelWriter.q(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.r(parcel, 7, this.zzg, false);
        SafeParcelWriter.r(parcel, 9, this.zzh, false);
        SafeParcelWriter.q(parcel, 10, this.zzi, i10, false);
        SafeParcelWriter.r(parcel, 11, this.zzj, false);
        SafeParcelWriter.c(parcel, 12, this.zzk);
        SafeParcelWriter.c(parcel, 13, this.zzl);
        SafeParcelWriter.e(parcel, 14, this.zzm, false);
        SafeParcelWriter.e(parcel, 15, this.zzn, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
