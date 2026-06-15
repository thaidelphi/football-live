package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zal implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zak createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.o(parcel, C, ConnectionResult.CREATOR);
            } else if (v10 != 3) {
                SafeParcelReader.I(parcel, C);
            } else {
                zavVar = (zav) SafeParcelReader.o(parcel, C, zav.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zak(i10, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i10) {
        return new zak[i10];
    }
}
