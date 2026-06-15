package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12590a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final Account f12591b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f12592c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final GoogleSignInAccount f12593d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param int i10, @SafeParcelable.Param Account account, @SafeParcelable.Param int i11, @SafeParcelable.Param GoogleSignInAccount googleSignInAccount) {
        this.f12590a = i10;
        this.f12591b = account;
        this.f12592c = i11;
        this.f12593d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12590a);
        SafeParcelWriter.q(parcel, 2, this.f12591b, i10, false);
        SafeParcelWriter.k(parcel, 3, this.f12592c);
        SafeParcelWriter.q(parcel, 4, this.f12593d, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public zat(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
