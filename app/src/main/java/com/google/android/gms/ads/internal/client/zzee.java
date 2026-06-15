package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef();
    @SafeParcelable.Field
    public final int zza;

    @SafeParcelable.Constructor
    public zzee(@SafeParcelable.Param int i10) {
        this.zza = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 2, i11);
        SafeParcelWriter.b(parcel, a10);
    }
}
