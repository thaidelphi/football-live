package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f13779a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f13780b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final zav f13781c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param int i10, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param zav zavVar) {
        this.f13779a = i10;
        this.f13780b = connectionResult;
        this.f13781c = zavVar;
    }

    public final ConnectionResult X() {
        return this.f13780b;
    }

    public final zav n0() {
        return this.f13781c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f13779a);
        SafeParcelWriter.q(parcel, 2, this.f13780b, i10, false);
        SafeParcelWriter.q(parcel, 3, this.f13781c, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
