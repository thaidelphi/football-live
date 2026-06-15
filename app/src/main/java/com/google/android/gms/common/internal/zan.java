package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zan implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 3:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 5:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 6:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 9:
                    i14 = SafeParcelReader.E(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new MethodInvocation(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
