package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 == 2) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v10 == 3) {
                z10 = SafeParcelReader.w(parcel, C);
            } else if (v10 != 4) {
                SafeParcelReader.I(parcel, C);
            } else {
                z11 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzs(str, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
