package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbqr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqr> CREATOR = new zzbqs();
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbqr(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzbqr zza(VersionInfo versionInfo) {
        return new zzbqr(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbqr)) {
            zzbqr zzbqrVar = (zzbqr) obj;
            if (zzbqrVar.zzc == this.zzc && zzbqrVar.zzb == this.zzb && zzbqrVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.k(parcel, 2, this.zzb);
        SafeParcelWriter.k(parcel, 3, this.zzc);
        SafeParcelWriter.b(parcel, a10);
    }
}
