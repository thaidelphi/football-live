package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 2:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 4:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 5:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzbxr(str, str2, zzrVar, zzmVar, i10, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbxr[i10];
    }
}
