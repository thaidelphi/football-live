package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12782a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f12783b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f12784c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f12785d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param boolean z10, @SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11) {
        this.f12782a = z10;
        this.f12783b = str;
        this.f12784c = n.a(i10) - 1;
        this.f12785d = zzd.a(i11) - 1;
    }

    public final String X() {
        return this.f12783b;
    }

    public final int n0() {
        return zzd.a(this.f12785d);
    }

    public final int o0() {
        return n.a(this.f12784c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f12782a);
        SafeParcelWriter.r(parcel, 2, this.f12783b, false);
        SafeParcelWriter.k(parcel, 3, this.f12784c);
        SafeParcelWriter.k(parcel, 4, this.f12785d);
        SafeParcelWriter.b(parcel, a10);
    }

    public final boolean zzb() {
        return this.f12782a;
    }
}
