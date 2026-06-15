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
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
    @KeepForSdk
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f12459a;
    @KeepForSdk
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f12460b;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param int i10, @SafeParcelable.Param String str) {
        this.f12459a = i10;
        this.f12460b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f12459a == this.f12459a && Objects.a(clientIdentity.f12460b, this.f12460b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12459a;
    }

    public final String toString() {
        int i10 = this.f12459a;
        String str = this.f12460b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i10);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12459a);
        SafeParcelWriter.r(parcel, 2, this.f12460b, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
