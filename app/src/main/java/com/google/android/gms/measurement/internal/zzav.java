package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzav implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                bundle = SafeParcelReader.f(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzau(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzau[i10];
    }
}
