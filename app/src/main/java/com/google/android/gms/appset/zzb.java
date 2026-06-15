package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzb implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zza createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                str2 = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zza(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i10) {
        return new zza[i10];
    }
}
