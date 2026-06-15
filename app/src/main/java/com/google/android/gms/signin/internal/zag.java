package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f13775a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f13776b;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param List<String> list, @SafeParcelable.Param String str) {
        this.f13775a = list;
        this.f13776b = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status a() {
        return this.f13776b != null ? Status.f12066f : Status.f12070j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f13775a, false);
        SafeParcelWriter.r(parcel, 2, this.f13776b, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
