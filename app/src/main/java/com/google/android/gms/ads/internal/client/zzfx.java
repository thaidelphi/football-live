package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfx> CREATOR = new zzfy();
    @SafeParcelable.Field
    public final boolean zza;
    @SafeParcelable.Field
    public final boolean zzb;
    @SafeParcelable.Field
    public final boolean zzc;

    public zzfx(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, z10);
        SafeParcelWriter.c(parcel, 3, this.zzb);
        SafeParcelWriter.c(parcel, 4, this.zzc);
        SafeParcelWriter.b(parcel, a10);
    }

    @SafeParcelable.Constructor
    public zzfx(@SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = z12;
    }
}
