package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbue implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        boolean z11 = false;
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfcj zzfcjVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.o(parcel, C, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.o(parcel, C, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.o(parcel, C, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
                case 9:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 10:
                    zzfcjVar = (zzfcj) SafeParcelReader.o(parcel, C, zzfcj.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 12:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 13:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 14:
                    bundle2 = SafeParcelReader.f(parcel, C);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.f(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzbud(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfcjVar, str4, z10, z11, bundle2, bundle3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbud[i10];
    }
}
