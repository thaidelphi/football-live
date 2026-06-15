package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    Bundle f12619a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    Feature[] f12620b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    int f12621c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    ConnectionTelemetryConfiguration f12622d;

    public zzk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param int i10, @SafeParcelable.Param ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f12619a = bundle;
        this.f12620b = featureArr;
        this.f12621c = i10;
        this.f12622d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 1, this.f12619a, false);
        SafeParcelWriter.u(parcel, 2, this.f12620b, i10, false);
        SafeParcelWriter.k(parcel, 3, this.f12621c);
        SafeParcelWriter.q(parcel, 4, this.f12622d, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
