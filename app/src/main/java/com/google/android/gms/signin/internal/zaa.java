package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f13772a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private int f13773b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private Intent f13774c;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status a() {
        return this.f13773b == 0 ? Status.f12066f : Status.f12070j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f13772a);
        SafeParcelWriter.k(parcel, 2, this.f13773b);
        SafeParcelWriter.q(parcel, 3, this.f13774c, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param Intent intent) {
        this.f13772a = i10;
        this.f13773b = i11;
        this.f13774c = intent;
    }
}
