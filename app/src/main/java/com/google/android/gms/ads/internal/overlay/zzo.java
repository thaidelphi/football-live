package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        long j10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.o(parcel, C, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.D(parcel, C);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.D(parcel, C);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.D(parcel, C);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.D(parcel, C);
                    break;
                case 7:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 9:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.D(parcel, C);
                    break;
                case 11:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 12:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 13:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.o(parcel, C, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
                case 16:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.D(parcel, C);
                    break;
                case 19:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 24:
                    str6 = SafeParcelReader.p(parcel, C);
                    break;
                case 25:
                    str7 = SafeParcelReader.p(parcel, C);
                    break;
                case 26:
                    iBinder7 = SafeParcelReader.D(parcel, C);
                    break;
                case 27:
                    iBinder8 = SafeParcelReader.D(parcel, C);
                    break;
                case 28:
                    iBinder9 = SafeParcelReader.D(parcel, C);
                    break;
                case 29:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 30:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z10, str2, iBinder5, i10, i11, str3, versionInfoParcel, str4, zzlVar, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
