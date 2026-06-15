package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfnh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnh> CREATOR = new zzfni();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final byte[] zzb;
    @SafeParcelable.Field
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfnh(@SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i11) {
        this.zza = i10;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.f(parcel, 2, this.zzb, false);
        SafeParcelWriter.k(parcel, 3, this.zzc);
        SafeParcelWriter.b(parcel, a10);
    }

    public zzfnh(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
