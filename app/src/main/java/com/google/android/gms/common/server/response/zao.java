package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zao implements Parcelable.Creator<zan> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zan createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                arrayList = SafeParcelReader.t(parcel, C, zal.CREATOR);
            } else if (v10 != 3) {
                SafeParcelReader.I(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zan(i10, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zan[] newArray(int i10) {
        return new zan[i10];
    }
}
