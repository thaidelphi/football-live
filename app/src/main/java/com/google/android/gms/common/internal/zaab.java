package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaab implements Parcelable.Creator<TelemetryData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TelemetryData createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                arrayList = SafeParcelReader.t(parcel, C, MethodInvocation.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new TelemetryData(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TelemetryData[] newArray(int i10) {
        return new TelemetryData[i10];
    }
}
