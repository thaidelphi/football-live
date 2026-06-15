package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfnf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnf> CREATOR = new zzfng();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfnf(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.k(parcel, 2, this.zzb);
        SafeParcelWriter.r(parcel, 3, this.zzc, false);
        SafeParcelWriter.r(parcel, 4, this.zzd, false);
        SafeParcelWriter.k(parcel, 5, this.zze);
        SafeParcelWriter.b(parcel, a10);
    }

    public zzfnf(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }
}
