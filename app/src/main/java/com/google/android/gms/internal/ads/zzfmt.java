package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfmt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfmt> CREATOR = new zzfmu();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfmt(@SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.f(parcel, 2, this.zzb, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public zzfmt(byte[] bArr) {
        this(1, bArr);
    }
}
