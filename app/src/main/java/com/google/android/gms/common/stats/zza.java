package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 6:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 8:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 10:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 11:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 12:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 13:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 14:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 15:
                    f10 = SafeParcelReader.A(parcel, C);
                    break;
                case 16:
                    j12 = SafeParcelReader.F(parcel, C);
                    break;
                case 17:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 18:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new WakeLockEvent(i10, j10, i11, str, i12, arrayList, str2, j11, i13, str3, str4, f10, j12, str5, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
