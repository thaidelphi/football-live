package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 3:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    f10 = SafeParcelReader.A(parcel, C);
                    break;
                case 7:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 8:
                    z13 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    z14 = SafeParcelReader.w(parcel, C);
                    break;
                case 10:
                    z15 = SafeParcelReader.w(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzl(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
