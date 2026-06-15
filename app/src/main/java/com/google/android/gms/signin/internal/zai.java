package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f13777a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    final zat f13778b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param int i10, @SafeParcelable.Param zat zatVar) {
        this.f13777a = i10;
        this.f13778b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f13777a);
        SafeParcelWriter.q(parcel, 2, this.f13778b, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
