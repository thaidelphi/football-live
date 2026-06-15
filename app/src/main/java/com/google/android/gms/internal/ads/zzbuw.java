package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbuw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuw> CREATOR = new zzbux();
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzm zza;
    @SafeParcelable.Field
    public final String zzb;

    @SafeParcelable.Constructor
    public zzbuw(@SafeParcelable.Param com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param String str) {
        this.zza = zzmVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, zzmVar, i10, false);
        SafeParcelWriter.r(parcel, 3, this.zzb, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
