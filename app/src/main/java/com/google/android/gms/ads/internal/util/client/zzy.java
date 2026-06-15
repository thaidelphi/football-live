package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 == 3) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 4) {
                i11 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 5) {
                z10 = SafeParcelReader.w(parcel, C);
            } else if (v10 != 6) {
                SafeParcelReader.I(parcel, C);
            } else {
                z11 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new VersionInfoParcel(str, i10, i11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VersionInfoParcel[i10];
    }
}
