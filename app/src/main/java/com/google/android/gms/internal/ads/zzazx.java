package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 4:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 8:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 10:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 11:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzazw(str, j10, str2, str3, str4, bundle, z10, j11, str5, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzazw[i10];
    }
}
