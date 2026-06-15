package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12594a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    final IBinder f12595b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final ConnectionResult f12596c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12597d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12598e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param int i10, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.f12594a = i10;
        this.f12595b = iBinder;
        this.f12596c = connectionResult;
        this.f12597d = z10;
        this.f12598e = z11;
    }

    public final ConnectionResult X() {
        return this.f12596c;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zav) {
            zav zavVar = (zav) obj;
            return this.f12596c.equals(zavVar.f12596c) && Objects.a(n0(), zavVar.n0());
        }
        return false;
    }

    public final IAccountAccessor n0() {
        IBinder iBinder = this.f12595b;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.Z(iBinder);
    }

    public final boolean o0() {
        return this.f12597d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12594a);
        SafeParcelWriter.j(parcel, 2, this.f12595b, false);
        SafeParcelWriter.q(parcel, 3, this.f12596c, i10, false);
        SafeParcelWriter.c(parcel, 4, this.f12597d);
        SafeParcelWriter.c(parcel, 5, this.f12598e);
        SafeParcelWriter.b(parcel, a10);
    }

    public final boolean y0() {
        return this.f12598e;
    }
}
