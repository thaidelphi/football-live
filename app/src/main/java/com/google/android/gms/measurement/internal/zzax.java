package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzax implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(zzaw zzawVar, Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, zzawVar.f13312a, false);
        SafeParcelWriter.q(parcel, 3, zzawVar.f13313b, i10, false);
        SafeParcelWriter.r(parcel, 4, zzawVar.f13314c, false);
        SafeParcelWriter.n(parcel, 5, zzawVar.f13315d);
        SafeParcelWriter.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v10 == 3) {
                zzauVar = (zzau) SafeParcelReader.o(parcel, C, zzau.CREATOR);
            } else if (v10 == 4) {
                str2 = SafeParcelReader.p(parcel, C);
            } else if (v10 != 5) {
                SafeParcelReader.I(parcel, C);
            } else {
                j10 = SafeParcelReader.F(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zzaw(str, zzauVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaw[i10];
    }
}
