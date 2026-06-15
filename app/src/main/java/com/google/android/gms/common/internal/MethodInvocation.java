package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final int f12510a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f12511b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f12512c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final long f12513d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final long f12514e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final String f12515f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    private final String f12516g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    private final int f12517h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    private final int f12518i;

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param int i13, @SafeParcelable.Param int i14) {
        this.f12510a = i10;
        this.f12511b = i11;
        this.f12512c = i12;
        this.f12513d = j10;
        this.f12514e = j11;
        this.f12515f = str;
        this.f12516g = str2;
        this.f12517h = i13;
        this.f12518i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12510a);
        SafeParcelWriter.k(parcel, 2, this.f12511b);
        SafeParcelWriter.k(parcel, 3, this.f12512c);
        SafeParcelWriter.n(parcel, 4, this.f12513d);
        SafeParcelWriter.n(parcel, 5, this.f12514e);
        SafeParcelWriter.r(parcel, 6, this.f12515f, false);
        SafeParcelWriter.r(parcel, 7, this.f12516g, false);
        SafeParcelWriter.k(parcel, 8, this.f12517h);
        SafeParcelWriter.k(parcel, 9, this.f12518i);
        SafeParcelWriter.b(parcel, a10);
    }
}
