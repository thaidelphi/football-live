package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        zze zzeVar = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 2:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 3:
                    zzeVar = (zze) SafeParcelReader.o(parcel, C, zze.CREATOR);
                    break;
                case 4:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 5:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzv(str, j10, zzeVar, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzv[i10];
    }
}
