package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzfu zzfuVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 3:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 4:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 5:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 6:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 7:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 8:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 10:
                    zzfuVar = (zzfu) SafeParcelReader.o(parcel, C, zzfu.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.o(parcel, C, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.f(parcel, C);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.f(parcel, C);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.r(parcel, C);
                    break;
                case 16:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 17:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 18:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.o(parcel, C, zzc.CREATOR);
                    break;
                case 20:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 21:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.r(parcel, C);
                    break;
                case 23:
                    i14 = SafeParcelReader.E(parcel, C);
                    break;
                case 24:
                    str6 = SafeParcelReader.p(parcel, C);
                    break;
                case 25:
                    i15 = SafeParcelReader.E(parcel, C);
                    break;
                case 26:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzm(i10, j10, bundle, i11, arrayList, z10, i12, z11, str, zzfuVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, zzcVar, i13, str5, arrayList3, i14, str6, i15, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
