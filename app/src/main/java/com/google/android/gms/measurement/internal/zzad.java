package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        zzlc zzlcVar = null;
        String str3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 4:
                    zzlcVar = (zzlc) SafeParcelReader.o(parcel, C, zzlc.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 6:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    zzawVar = (zzaw) SafeParcelReader.o(parcel, C, zzaw.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 10:
                    zzawVar2 = (zzaw) SafeParcelReader.o(parcel, C, zzaw.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.F(parcel, C);
                    break;
                case 12:
                    zzawVar3 = (zzaw) SafeParcelReader.o(parcel, C, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzac(str, str2, zzlcVar, j10, z10, str3, zzawVar, j11, zzawVar2, j12, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}
