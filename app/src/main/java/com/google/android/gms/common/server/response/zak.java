package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zak implements Parcelable.Creator<zam> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zam createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        int i10 = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 != 3) {
                SafeParcelReader.I(parcel, C);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.o(parcel, C, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zam(i10, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zam[] newArray(int i10) {
        return new zam[i10];
    }
}
