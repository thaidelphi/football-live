package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zay implements Parcelable.Creator<zax> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zax createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        int i11 = 0;
        Scope[] scopeArr = null;
        int i12 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                i12 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 3) {
                i11 = SafeParcelReader.E(parcel, C);
            } else if (v10 != 4) {
                SafeParcelReader.I(parcel, C);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.s(parcel, C, Scope.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zax(i10, i12, i11, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zax[] newArray(int i10) {
        return new zax[i10];
    }
}
