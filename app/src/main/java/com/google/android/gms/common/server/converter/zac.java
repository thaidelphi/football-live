package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12660a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    final String f12661b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final int f12662c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param int i11) {
        this.f12660a = i10;
        this.f12661b = str;
        this.f12662c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12660a);
        SafeParcelWriter.r(parcel, 2, this.f12661b, false);
        SafeParcelWriter.k(parcel, 3, this.f12662c);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zac(String str, int i10) {
        this.f12660a = 1;
        this.f12661b = str;
        this.f12662c = i10;
    }
}
