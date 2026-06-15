package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbeo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 3:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 5:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 6:
                    zzfxVar = (com.google.android.gms.ads.internal.client.zzfx) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.client.zzfx.CREATOR);
                    break;
                case 7:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 8:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 9:
                    i14 = SafeParcelReader.E(parcel, C);
                    break;
                case 10:
                    z13 = SafeParcelReader.w(parcel, C);
                    break;
                case 11:
                    i15 = SafeParcelReader.E(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzben(i10, z10, i11, z11, i12, zzfxVar, z12, i13, i14, z13, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzben[i10];
    }
}
