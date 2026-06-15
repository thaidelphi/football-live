package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z10 = false;
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
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    str6 = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    str7 = SafeParcelReader.p(parcel, C);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.o(parcel, C, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = SafeParcelReader.D(parcel, C);
                    break;
                case 11:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzc[i10];
    }
}
