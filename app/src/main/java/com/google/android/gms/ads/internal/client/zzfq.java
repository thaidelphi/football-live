package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfq> CREATOR = new zzfr();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final zzm zzc;
    @SafeParcelable.Field
    public final int zzd;

    @SafeParcelable.Constructor
    public zzfq(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param zzm zzmVar, @SafeParcelable.Param int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = zzmVar;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfq) {
            zzfq zzfqVar = (zzfq) obj;
            if (this.zza.equals(zzfqVar.zza) && this.zzb == zzfqVar.zzb && this.zzc.zza(zzfqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.k(parcel, 2, this.zzb);
        SafeParcelWriter.q(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.k(parcel, 4, this.zzd);
        SafeParcelWriter.b(parcel, a10);
    }
}
