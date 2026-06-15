package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzd implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                i10 = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzc(str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i10) {
        return new zzc[i10];
    }
}
