package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaa implements Parcelable.Creator<ClientIdentity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientIdentity createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new ClientIdentity(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ClientIdentity[] newArray(int i10) {
        return new ClientIdentity[i10];
    }
}
