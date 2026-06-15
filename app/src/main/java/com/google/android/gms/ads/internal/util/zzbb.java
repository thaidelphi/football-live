package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfbq;
import com.google.android.gms.internal.ads.zzftm;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param String str, @SafeParcelable.Param int i10) {
        this.zza = str == null ? "" : str;
        this.zzb = i10;
    }

    public static zzbb zzb(Throwable th) {
        String message;
        com.google.android.gms.ads.internal.client.zze zza = zzfbq.zza(th);
        if (zzftm.zzd(th.getMessage())) {
            message = zza.zzb;
        } else {
            message = th.getMessage();
        }
        return new zzbb(message, zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        SafeParcelWriter.k(parcel, 2, this.zzb);
        SafeParcelWriter.b(parcel, a10);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
