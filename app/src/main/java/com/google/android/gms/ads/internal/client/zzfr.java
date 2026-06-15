package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        zzm zzmVar = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 == 2) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 3) {
                zzmVar = (zzm) SafeParcelReader.o(parcel, C, zzm.CREATOR);
            } else if (v10 != 4) {
                SafeParcelReader.I(parcel, C);
            } else {
                i11 = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzfq(str, i10, zzmVar, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfq[i10];
    }
}
