package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final String f12776a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12777b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12778c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final Context f12779d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12780e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12781f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13) {
        this.f12776a = str;
        this.f12777b = z10;
        this.f12778c = z11;
        this.f12779d = (Context) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder));
        this.f12780e = z12;
        this.f12781f = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f12776a;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.c(parcel, 2, this.f12777b);
        SafeParcelWriter.c(parcel, 3, this.f12778c);
        SafeParcelWriter.j(parcel, 4, ObjectWrapper.u0(this.f12779d), false);
        SafeParcelWriter.c(parcel, 5, this.f12780e);
        SafeParcelWriter.c(parcel, 6, this.f12781f);
        SafeParcelWriter.b(parcel, a10);
    }
}
