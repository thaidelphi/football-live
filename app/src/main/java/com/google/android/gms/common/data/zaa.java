package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaa implements Parcelable.Creator<BitmapTeleporter> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BitmapTeleporter createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i11 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.o(parcel, C, ParcelFileDescriptor.CREATOR);
            } else if (v10 != 3) {
                SafeParcelReader.I(parcel, C);
            } else {
                i11 = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new BitmapTeleporter(i10, parcelFileDescriptor, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BitmapTeleporter[] newArray(int i10) {
        return new BitmapTeleporter[i10];
    }
}
