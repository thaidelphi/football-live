package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.b9;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f13311a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param Bundle bundle) {
        this.f13311a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String C0(String str) {
        return this.f13311a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new j(this);
    }

    public final Bundle n0() {
        return new Bundle(this.f13311a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double o0(String str) {
        return Double.valueOf(this.f13311a.getDouble(b9.h.X));
    }

    public final String toString() {
        return this.f13311a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 2, n0(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long y0(String str) {
        return Long.valueOf(this.f13311a.getLong(b9.h.X));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z0(String str) {
        return this.f13311a.get(str);
    }

    public final int zza() {
        return this.f13311a.size();
    }
}
