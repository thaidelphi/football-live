package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final int f12526a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12527b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12528c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f12529d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final int f12530e;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param int i10, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12) {
        this.f12526a = i10;
        this.f12527b = z10;
        this.f12528c = z11;
        this.f12529d = i11;
        this.f12530e = i12;
    }

    @KeepForSdk
    public int X() {
        return this.f12529d;
    }

    @KeepForSdk
    public int n0() {
        return this.f12530e;
    }

    @KeepForSdk
    public boolean o0() {
        return this.f12527b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, z0());
        SafeParcelWriter.c(parcel, 2, o0());
        SafeParcelWriter.c(parcel, 3, y0());
        SafeParcelWriter.k(parcel, 4, X());
        SafeParcelWriter.k(parcel, 5, n0());
        SafeParcelWriter.b(parcel, a10);
    }

    @KeepForSdk
    public boolean y0() {
        return this.f12528c;
    }

    @KeepForSdk
    public int z0() {
        return this.f12526a;
    }
}
