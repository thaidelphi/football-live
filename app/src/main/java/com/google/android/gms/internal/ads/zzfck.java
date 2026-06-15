package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfck implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String str = null;
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
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 5:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    i14 = SafeParcelReader.E(parcel, C);
                    break;
                case 7:
                    i15 = SafeParcelReader.E(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzfcj(i10, i11, i12, i13, str, i14, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfcj[i10];
    }
}
