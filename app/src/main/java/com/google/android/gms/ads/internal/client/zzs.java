package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        zzr[] zzrVarArr = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 5:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 7:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 8:
                    zzrVarArr = (zzr[]) SafeParcelReader.s(parcel, C, zzr.CREATOR);
                    break;
                case 9:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 10:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 11:
                    z13 = SafeParcelReader.w(parcel, C);
                    break;
                case 12:
                    z14 = SafeParcelReader.w(parcel, C);
                    break;
                case 13:
                    z15 = SafeParcelReader.w(parcel, C);
                    break;
                case 14:
                    z16 = SafeParcelReader.w(parcel, C);
                    break;
                case 15:
                    z17 = SafeParcelReader.w(parcel, C);
                    break;
                case 16:
                    z18 = SafeParcelReader.w(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzr(str, i10, i11, z10, i12, i13, zzrVarArr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
