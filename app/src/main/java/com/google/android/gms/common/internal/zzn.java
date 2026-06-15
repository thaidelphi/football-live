package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzn implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, getServiceRequest.f12486a);
        SafeParcelWriter.k(parcel, 2, getServiceRequest.f12487b);
        SafeParcelWriter.k(parcel, 3, getServiceRequest.f12488c);
        SafeParcelWriter.r(parcel, 4, getServiceRequest.f12489d, false);
        SafeParcelWriter.j(parcel, 5, getServiceRequest.f12490e, false);
        SafeParcelWriter.u(parcel, 6, getServiceRequest.f12491f, i10, false);
        SafeParcelWriter.e(parcel, 7, getServiceRequest.f12492g, false);
        SafeParcelWriter.q(parcel, 8, getServiceRequest.f12493h, i10, false);
        SafeParcelWriter.u(parcel, 10, getServiceRequest.f12494i, i10, false);
        SafeParcelWriter.u(parcel, 11, getServiceRequest.f12495j, i10, false);
        SafeParcelWriter.c(parcel, 12, getServiceRequest.f12496k);
        SafeParcelWriter.k(parcel, 13, getServiceRequest.f12497l);
        SafeParcelWriter.c(parcel, 14, getServiceRequest.f12498m);
        SafeParcelWriter.r(parcel, 15, getServiceRequest.X(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        Scope[] scopeArr = GetServiceRequest.f12484o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f12485p;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    i11 = SafeParcelReader.E(parcel, C);
                    break;
                case 3:
                    i12 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 5:
                    iBinder = SafeParcelReader.D(parcel, C);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.s(parcel, C, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel, C);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.o(parcel, C, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.s(parcel, C, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.s(parcel, C, Feature.CREATOR);
                    break;
                case 12:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 13:
                    i13 = SafeParcelReader.E(parcel, C);
                    break;
                case 14:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 15:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new GetServiceRequest(i10, i11, i12, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
