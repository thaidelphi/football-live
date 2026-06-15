package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final String zze;
    @SafeParcelable.Field
    public final String zzf;
    @SafeParcelable.Field
    public final String zzg;
    @SafeParcelable.Field
    public final Intent zzh;
    @SafeParcelable.Field
    public final zzaa zzi;
    @SafeParcelable.Field
    public final boolean zzj;

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, ObjectWrapper.u0(zzaaVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, str, false);
        SafeParcelWriter.r(parcel, 3, this.zzb, false);
        SafeParcelWriter.r(parcel, 4, this.zzc, false);
        SafeParcelWriter.r(parcel, 5, this.zzd, false);
        SafeParcelWriter.r(parcel, 6, this.zze, false);
        SafeParcelWriter.r(parcel, 7, this.zzf, false);
        SafeParcelWriter.r(parcel, 8, this.zzg, false);
        SafeParcelWriter.q(parcel, 9, this.zzh, i10, false);
        SafeParcelWriter.j(parcel, 10, ObjectWrapper.u0(this.zzi).asBinder(), false);
        SafeParcelWriter.c(parcel, 11, this.zzj);
        SafeParcelWriter.b(parcel, a10);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param Intent intent, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzaa) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder));
        this.zzj = z10;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, ObjectWrapper.u0(zzaaVar).asBinder(), false);
    }
}
