package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 4:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 5:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 7:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 8:
                    z13 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.r(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzbwk(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbwk[i10];
    }
}
