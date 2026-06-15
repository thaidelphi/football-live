package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12599a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f12600b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f12601c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    private final Scope[] f12602d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param Scope[] scopeArr) {
        this.f12599a = i10;
        this.f12600b = i11;
        this.f12601c = i12;
        this.f12602d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12599a);
        SafeParcelWriter.k(parcel, 2, this.f12600b);
        SafeParcelWriter.k(parcel, 3, this.f12601c);
        SafeParcelWriter.u(parcel, 4, this.f12602d, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
