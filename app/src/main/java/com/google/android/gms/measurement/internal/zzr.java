package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = true;
        boolean z11 = true;
        String str = "";
        String str2 = str;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j15 = -2147483648L;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 4:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    str6 = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 7:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 8:
                    str7 = SafeParcelReader.p(parcel, C);
                    break;
                case 9:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 10:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 11:
                    j15 = SafeParcelReader.F(parcel, C);
                    break;
                case 12:
                    str8 = SafeParcelReader.p(parcel, C);
                    break;
                case 13:
                    j12 = SafeParcelReader.F(parcel, C);
                    break;
                case 14:
                    j13 = SafeParcelReader.F(parcel, C);
                    break;
                case 15:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 16:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
                case 18:
                    z13 = SafeParcelReader.w(parcel, C);
                    break;
                case 19:
                    str9 = SafeParcelReader.p(parcel, C);
                    break;
                case 21:
                    bool = SafeParcelReader.x(parcel, C);
                    break;
                case 22:
                    j14 = SafeParcelReader.F(parcel, C);
                    break;
                case 23:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 24:
                    str10 = SafeParcelReader.p(parcel, C);
                    break;
                case 25:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 26:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 27:
                    str11 = SafeParcelReader.p(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzq(str3, str4, str5, str6, j10, j11, str7, z10, z12, j15, str8, j12, j13, i10, z11, z13, str9, bool, j14, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
