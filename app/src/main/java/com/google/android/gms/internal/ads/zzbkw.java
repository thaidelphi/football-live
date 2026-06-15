package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkw> CREATOR = new zzbkx();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final Bundle zzb;

    @SafeParcelable.Constructor
    public zzbkw(@SafeParcelable.Param String str, @SafeParcelable.Param Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.e(parcel, 2, this.zzb, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
