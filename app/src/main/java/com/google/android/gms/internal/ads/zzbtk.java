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
public final class zzbtk implements Parcelable.Creator {
    public static final zzbtj zza(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        long j10 = 0;
        long j11 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzben zzbenVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzee zzeeVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbky zzbkyVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.o(parcel, C, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.o(parcel, C, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 9:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 10:
                    str4 = SafeParcelReader.p(parcel, C);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.o(parcel, C, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.f(parcel, C);
                    break;
                case 13:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 14:
                    arrayList = SafeParcelReader.r(parcel, C);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.f(parcel, C);
                    break;
                case 16:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
                case 18:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 19:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 20:
                    f10 = SafeParcelReader.A(parcel, C);
                    break;
                case 21:
                    str5 = SafeParcelReader.p(parcel, C);
                    break;
                case 25:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 26:
                    str6 = SafeParcelReader.p(parcel, C);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.r(parcel, C);
                    break;
                case 28:
                    str7 = SafeParcelReader.p(parcel, C);
                    break;
                case 29:
                    zzbenVar = (zzben) SafeParcelReader.o(parcel, C, zzben.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.r(parcel, C);
                    break;
                case 31:
                    j11 = SafeParcelReader.F(parcel, C);
                    break;
                case 33:
                    str8 = SafeParcelReader.p(parcel, C);
                    break;
                case 34:
                    f11 = SafeParcelReader.A(parcel, C);
                    break;
                case 35:
                    i14 = SafeParcelReader.E(parcel, C);
                    break;
                case 36:
                    i15 = SafeParcelReader.E(parcel, C);
                    break;
                case 37:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 39:
                    str9 = SafeParcelReader.p(parcel, C);
                    break;
                case 40:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 41:
                    str10 = SafeParcelReader.p(parcel, C);
                    break;
                case 42:
                    z13 = SafeParcelReader.w(parcel, C);
                    break;
                case 43:
                    i16 = SafeParcelReader.E(parcel, C);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.f(parcel, C);
                    break;
                case 45:
                    str11 = SafeParcelReader.p(parcel, C);
                    break;
                case 46:
                    zzeeVar = (com.google.android.gms.ads.internal.client.zzee) SafeParcelReader.o(parcel, C, com.google.android.gms.ads.internal.client.zzee.CREATOR);
                    break;
                case 47:
                    z14 = SafeParcelReader.w(parcel, C);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.f(parcel, C);
                    break;
                case 49:
                    str12 = SafeParcelReader.p(parcel, C);
                    break;
                case 50:
                    str13 = SafeParcelReader.p(parcel, C);
                    break;
                case 51:
                    str14 = SafeParcelReader.p(parcel, C);
                    break;
                case 52:
                    z15 = SafeParcelReader.w(parcel, C);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.k(parcel, C);
                    break;
                case 54:
                    str15 = SafeParcelReader.p(parcel, C);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.r(parcel, C);
                    break;
                case 56:
                    i17 = SafeParcelReader.E(parcel, C);
                    break;
                case 57:
                    z16 = SafeParcelReader.w(parcel, C);
                    break;
                case 58:
                    z17 = SafeParcelReader.w(parcel, C);
                    break;
                case 59:
                    z18 = SafeParcelReader.w(parcel, C);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.r(parcel, C);
                    break;
                case 61:
                    str16 = SafeParcelReader.p(parcel, C);
                    break;
                case 63:
                    zzbkyVar = (zzbky) SafeParcelReader.o(parcel, C, zzbky.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.p(parcel, C);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.f(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzbtj(i10, bundle, zzmVar, zzrVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j10, str6, arrayList2, str7, zzbenVar, arrayList3, j11, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, zzeeVar, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, zzbkyVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbtj[i10];
    }
}
