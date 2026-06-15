package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaf implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        int i11 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                strArr = SafeParcelReader.q(parcel, C);
            } else if (v10 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.s(parcel, C, CursorWindow.CREATOR);
            } else if (v10 == 3) {
                i11 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 4) {
                bundle = SafeParcelReader.f(parcel, C);
            } else if (v10 != 1000) {
                SafeParcelReader.I(parcel, C);
            } else {
                i10 = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.C0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
