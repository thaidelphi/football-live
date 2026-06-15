package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zae implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i10 = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    arrayList = SafeParcelReader.t(parcel, C, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.o(parcel, C, Account.CREATOR);
                    break;
                case 4:
                    z10 = SafeParcelReader.w(parcel, C);
                    break;
                case 5:
                    z11 = SafeParcelReader.w(parcel, C);
                    break;
                case 6:
                    z12 = SafeParcelReader.w(parcel, C);
                    break;
                case 7:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 8:
                    str2 = SafeParcelReader.p(parcel, C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.t(parcel, C, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.p(parcel, C);
                    break;
                default:
                    SafeParcelReader.I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, J);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
