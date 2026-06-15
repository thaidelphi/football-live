package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final String f12010a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final int f12011b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final long f12012c;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param long j10) {
        this.f12010a = str;
        this.f12011b = i10;
        this.f12012c = j10;
    }

    @KeepForSdk
    public Feature(String str, long j10) {
        this.f12010a = str;
        this.f12012c = j10;
        this.f12011b = -1;
    }

    @KeepForSdk
    public String X() {
        return this.f12010a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((X() != null && X().equals(feature.X())) || (X() == null && feature.X() == null)) && n0() == feature.n0()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(X(), Long.valueOf(n0()));
    }

    @KeepForSdk
    public long n0() {
        long j10 = this.f12012c;
        return j10 == -1 ? this.f12011b : j10;
    }

    public final String toString() {
        Objects.ToStringHelper c10 = Objects.c(this);
        c10.a("name", X());
        c10.a("version", Long.valueOf(n0()));
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, X(), false);
        SafeParcelWriter.k(parcel, 2, this.f12011b);
        SafeParcelWriter.n(parcel, 3, n0());
        SafeParcelWriter.b(parcel, a10);
    }
}
