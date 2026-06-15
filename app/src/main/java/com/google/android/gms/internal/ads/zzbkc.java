package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbkc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    bArr = SafeParcelReader.g(parcel, C);
                    break;
                case 5:
                    strArr = SafeParcelReader.q(parcel, C);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.q(parcel, C);
                    break;
                case 7:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 8:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzbkb(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbkb[i10];
    }
}
