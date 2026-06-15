package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        IBinder iBinder = null;
        boolean z10 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                z10 = SafeParcelReader.w(parcel, C);
            } else if (v10 == 2) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v10 != 3) {
                SafeParcelReader.I(parcel, C);
            } else {
                iBinder2 = SafeParcelReader.D(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new PublisherAdViewOptions(z10, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublisherAdViewOptions[i10];
    }
}
