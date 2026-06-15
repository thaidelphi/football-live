package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvw> CREATOR = new zzbvx();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String zzb;

    public zzbvw(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.r(parcel, 2, this.zzb, false);
        SafeParcelWriter.b(parcel, a10);
    }

    @SafeParcelable.Constructor
    public zzbvw(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
