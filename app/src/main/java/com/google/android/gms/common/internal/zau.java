package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zau implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zat createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            int v10 = SafeParcelReader.v(C);
            if (v10 == 1) {
                i10 = SafeParcelReader.E(parcel, C);
            } else if (v10 == 2) {
                account = (Account) SafeParcelReader.o(parcel, C, Account.CREATOR);
            } else if (v10 == 3) {
                i11 = SafeParcelReader.E(parcel, C);
            } else if (v10 != 4) {
                SafeParcelReader.I(parcel, C);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.o(parcel, C, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new zat(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i10) {
        return new zat[i10];
    }
}
