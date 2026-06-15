package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaj implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 3:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 4:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 5:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 8:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 9:
                    zaaVar = (zaa) SafeParcelReader.o(parcel, C, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new FastJsonResponse.Field(i10, i11, z10, i12, z11, str, i13, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}
