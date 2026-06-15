package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbjz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjz> CREATOR = new zzbka();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String[] zzb;
    @SafeParcelable.Field
    public final String[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbjz(@SafeParcelable.Param String str, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.s(parcel, 2, this.zzb, false);
        SafeParcelWriter.s(parcel, 3, this.zzc, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
