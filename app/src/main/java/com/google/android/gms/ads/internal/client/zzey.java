package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzey> CREATOR = new zzez();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final int f11280a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f11281b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f11282c;

    public zzey() {
        this(ModuleDescriptor.MODULE_VERSION, 250505300, "24.0.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f11280a);
        SafeParcelWriter.k(parcel, 2, this.f11281b);
        SafeParcelWriter.r(parcel, 3, this.f11282c, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public final int zza() {
        return this.f11281b;
    }

    public final String zzb() {
        return this.f11282c;
    }

    @SafeParcelable.Constructor
    public zzey(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str) {
        this.f11280a = i10;
        this.f11281b = i11;
        this.f11282c = str;
    }
}
