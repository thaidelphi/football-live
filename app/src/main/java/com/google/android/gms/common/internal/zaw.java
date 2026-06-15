package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaw implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zav createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v10 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.o(parcel, C, ConnectionResult.CREATOR);
            } else if (v10 == 4) {
                z10 = SafeParcelReader.w(parcel, C);
            } else if (v10 != 5) {
                SafeParcelReader.I(parcel, C);
            } else {
                z11 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zav(i10, iBinder, connectionResult, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i10) {
        return new zav[i10];
    }
}
