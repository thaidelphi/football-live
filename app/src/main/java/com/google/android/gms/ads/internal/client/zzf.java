package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        String str2 = null;
        zze zzeVar = null;
        IBinder iBinder = null;
        int i10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 == 3) {
                str2 = SafeParcelReader.p(parcel, C);
            } else if (v10 == 4) {
                zzeVar = (zze) SafeParcelReader.o(parcel, C, zze.CREATOR);
            } else if (v10 != 5) {
                SafeParcelReader.I(parcel, C);
            } else {
                iBinder = SafeParcelReader.D(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zze(i10, str, str2, zzeVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
