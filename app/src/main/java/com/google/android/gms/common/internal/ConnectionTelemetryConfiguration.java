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
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final RootTelemetryConfiguration f12476a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12477b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12478c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int[] f12479d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final int f12480e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final int[] f12481f;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@SafeParcelable.Param RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int i10, @SafeParcelable.Param int[] iArr2) {
        this.f12476a = rootTelemetryConfiguration;
        this.f12477b = z10;
        this.f12478c = z11;
        this.f12479d = iArr;
        this.f12480e = i10;
        this.f12481f = iArr2;
    }

    public final RootTelemetryConfiguration C0() {
        return this.f12476a;
    }

    @KeepForSdk
    public int X() {
        return this.f12480e;
    }

    @KeepForSdk
    public int[] n0() {
        return this.f12479d;
    }

    @KeepForSdk
    public int[] o0() {
        return this.f12481f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f12476a, i10, false);
        SafeParcelWriter.c(parcel, 2, y0());
        SafeParcelWriter.c(parcel, 3, z0());
        SafeParcelWriter.l(parcel, 4, n0(), false);
        SafeParcelWriter.k(parcel, 5, X());
        SafeParcelWriter.l(parcel, 6, o0(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    @KeepForSdk
    public boolean y0() {
        return this.f12477b;
    }

    @KeepForSdk
    public boolean z0() {
        return this.f12478c;
    }
}
