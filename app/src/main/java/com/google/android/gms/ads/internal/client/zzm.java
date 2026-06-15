package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    @Deprecated
    public final long zzb;
    @SafeParcelable.Field
    public final Bundle zzc;
    @SafeParcelable.Field
    @Deprecated
    public final int zzd;
    @SafeParcelable.Field
    public final List zze;
    @SafeParcelable.Field
    public final boolean zzf;
    @SafeParcelable.Field
    public final int zzg;
    @SafeParcelable.Field
    public final boolean zzh;
    @SafeParcelable.Field
    public final String zzi;
    @SafeParcelable.Field
    public final zzfu zzj;
    @SafeParcelable.Field
    public final Location zzk;
    @SafeParcelable.Field
    public final String zzl;
    @SafeParcelable.Field
    public final Bundle zzm;
    @SafeParcelable.Field
    public final Bundle zzn;
    @SafeParcelable.Field
    public final List zzo;
    @SafeParcelable.Field
    public final String zzp;
    @SafeParcelable.Field
    public final String zzq;
    @SafeParcelable.Field
    @Deprecated
    public final boolean zzr;
    @SafeParcelable.Field
    public final zzc zzs;
    @SafeParcelable.Field
    public final int zzt;
    @SafeParcelable.Field
    public final String zzu;
    @SafeParcelable.Field
    public final List zzv;
    @SafeParcelable.Field
    public final int zzw;
    @SafeParcelable.Field
    public final String zzx;
    @SafeParcelable.Field
    public final int zzy;
    @SafeParcelable.Field
    public final long zzz;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param int i10, @SafeParcelable.Param long j10, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param int i11, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str, @SafeParcelable.Param zzfu zzfuVar, @SafeParcelable.Param Location location, @SafeParcelable.Param String str2, @SafeParcelable.Param Bundle bundle2, @SafeParcelable.Param Bundle bundle3, @SafeParcelable.Param List list2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z12, @SafeParcelable.Param zzc zzcVar, @SafeParcelable.Param int i13, @SafeParcelable.Param String str5, @SafeParcelable.Param List list3, @SafeParcelable.Param int i14, @SafeParcelable.Param String str6, @SafeParcelable.Param int i15, @SafeParcelable.Param long j11) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i11;
        this.zze = list;
        this.zzf = z10;
        this.zzg = i12;
        this.zzh = z11;
        this.zzi = str;
        this.zzj = zzfuVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z12;
        this.zzs = zzcVar;
        this.zzt = i13;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i14;
        this.zzx = str6;
        this.zzy = i15;
        this.zzz = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.n(parcel, 2, this.zzb);
        SafeParcelWriter.e(parcel, 3, this.zzc, false);
        SafeParcelWriter.k(parcel, 4, this.zzd);
        SafeParcelWriter.t(parcel, 5, this.zze, false);
        SafeParcelWriter.c(parcel, 6, this.zzf);
        SafeParcelWriter.k(parcel, 7, this.zzg);
        SafeParcelWriter.c(parcel, 8, this.zzh);
        SafeParcelWriter.r(parcel, 9, this.zzi, false);
        SafeParcelWriter.q(parcel, 10, this.zzj, i10, false);
        SafeParcelWriter.q(parcel, 11, this.zzk, i10, false);
        SafeParcelWriter.r(parcel, 12, this.zzl, false);
        SafeParcelWriter.e(parcel, 13, this.zzm, false);
        SafeParcelWriter.e(parcel, 14, this.zzn, false);
        SafeParcelWriter.t(parcel, 15, this.zzo, false);
        SafeParcelWriter.r(parcel, 16, this.zzp, false);
        SafeParcelWriter.r(parcel, 17, this.zzq, false);
        SafeParcelWriter.c(parcel, 18, this.zzr);
        SafeParcelWriter.q(parcel, 19, this.zzs, i10, false);
        SafeParcelWriter.k(parcel, 20, this.zzt);
        SafeParcelWriter.r(parcel, 21, this.zzu, false);
        SafeParcelWriter.t(parcel, 22, this.zzv, false);
        SafeParcelWriter.k(parcel, 23, this.zzw);
        SafeParcelWriter.r(parcel, 24, this.zzx, false);
        SafeParcelWriter.k(parcel, 25, this.zzy);
        SafeParcelWriter.n(parcel, 26, this.zzz);
        SafeParcelWriter.b(parcel, a10);
    }

    public final boolean zza(Object obj) {
        if (obj instanceof zzm) {
            zzm zzmVar = (zzm) obj;
            return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && Objects.a(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && Objects.a(this.zzi, zzmVar.zzi) && Objects.a(this.zzj, zzmVar.zzj) && Objects.a(this.zzk, zzmVar.zzk) && Objects.a(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && Objects.a(this.zzo, zzmVar.zzo) && Objects.a(this.zzp, zzmVar.zzp) && Objects.a(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && Objects.a(this.zzu, zzmVar.zzu) && Objects.a(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && Objects.a(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy;
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }
}
