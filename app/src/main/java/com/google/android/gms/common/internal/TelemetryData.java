package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final int f12533a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private List<MethodInvocation> f12534b;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param int i10, @SafeParcelable.Param List<MethodInvocation> list) {
        this.f12533a = i10;
        this.f12534b = list;
    }

    public final int X() {
        return this.f12533a;
    }

    public final List<MethodInvocation> n0() {
        return this.f12534b;
    }

    public final void o0(MethodInvocation methodInvocation) {
        if (this.f12534b == null) {
            this.f12534b = new ArrayList();
        }
        this.f12534b.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12533a);
        SafeParcelWriter.v(parcel, 2, this.f12534b, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
