package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.o(parcel, C, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 3:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 4:
                    iArr = SafeParcelReader.j(parcel, C);
                    break;
                case 5:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.j(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
