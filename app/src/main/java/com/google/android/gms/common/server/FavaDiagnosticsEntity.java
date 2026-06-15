package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12652a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f12653b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final int f12654c;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param int i11) {
        this.f12652a = i10;
        this.f12653b = str;
        this.f12654c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12652a);
        SafeParcelWriter.r(parcel, 2, this.f12653b, false);
        SafeParcelWriter.k(parcel, 3, this.f12654c);
        SafeParcelWriter.b(parcel, a10);
    }
}
