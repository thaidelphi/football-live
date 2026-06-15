package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 2:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 3:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 8:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzcl(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcl[i10];
    }
}
