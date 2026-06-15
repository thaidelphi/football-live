package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12063a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f12064b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public Scope(@SafeParcelable.Param int i10, @SafeParcelable.Param String str) {
        Preconditions.h(str, "scopeUri must not be null or empty");
        this.f12063a = i10;
        this.f12064b = str;
    }

    @KeepForSdk
    public String X() {
        return this.f12064b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f12064b.equals(((Scope) obj).f12064b);
        }
        return false;
    }

    public int hashCode() {
        return this.f12064b.hashCode();
    }

    public String toString() {
        return this.f12064b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f12063a;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.r(parcel, 2, X(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
