package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzld implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(zzlc zzlcVar, Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, zzlcVar.f13707a);
        SafeParcelWriter.r(parcel, 2, zzlcVar.f13708b, false);
        SafeParcelWriter.n(parcel, 3, zzlcVar.f13709c);
        SafeParcelWriter.o(parcel, 4, zzlcVar.f13710d, false);
        SafeParcelWriter.i(parcel, 5, null, false);
        SafeParcelWriter.r(parcel, 6, zzlcVar.f13711e, false);
        SafeParcelWriter.r(parcel, 7, zzlcVar.f13712f, false);
        SafeParcelWriter.g(parcel, 8, zzlcVar.f13713g, false);
        SafeParcelWriter.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 3:
                    j10 = SafeParcelReader.F(parcel, C);
                    break;
                case 4:
                    l10 = SafeParcelReader.G(parcel, C);
                    break;
                case 5:
                    f10 = SafeParcelReader.B(parcel, C);
                    break;
                case 6:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    d10 = SafeParcelReader.z(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzlc(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzlc[i10];
    }
}
