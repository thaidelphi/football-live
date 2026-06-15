package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.o(parcel, C, ParcelFileDescriptor.CREATOR);
            } else if (v10 == 3) {
                z10 = SafeParcelReader.w(parcel, C);
            } else if (v10 == 4) {
                z11 = SafeParcelReader.w(parcel, C);
            } else if (v10 == 5) {
                j10 = SafeParcelReader.F(parcel, C);
            } else if (v10 != 6) {
                SafeParcelReader.I(parcel, C);
            } else {
                z12 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzazt(parcelFileDescriptor, z10, z11, j10, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzazt[i10];
    }
}
