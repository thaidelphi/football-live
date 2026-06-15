package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zaj implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zai createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        zat zatVar = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                zatVar = (zat) SafeParcelReader.o(parcel, C, zat.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zai(i10, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i10) {
        return new zai[i10];
    }
}
