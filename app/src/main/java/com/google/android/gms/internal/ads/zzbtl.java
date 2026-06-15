package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbtl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtl> CREATOR = new zzbtm();
    @SafeParcelable.Field
    public final boolean zza;
    @SafeParcelable.Field
    public final List zzb;

    public zzbtl() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, z10);
        SafeParcelWriter.t(parcel, 3, this.zzb, false);
        SafeParcelWriter.b(parcel, a10);
    }

    @SafeParcelable.Constructor
    public zzbtl(@SafeParcelable.Param boolean z10, @SafeParcelable.Param List list) {
        this.zza = z10;
        this.zzb = list;
    }
}
