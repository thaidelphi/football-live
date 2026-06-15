package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public zze zzd;
    @SafeParcelable.Field
    public IBinder zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param IBinder iBinder) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.r(parcel, 2, this.zzb, false);
        SafeParcelWriter.r(parcel, 3, this.zzc, false);
        SafeParcelWriter.q(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.j(parcel, 5, this.zze, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public final AdError zza() {
        AdError adError;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            String str = zzeVar.zzc;
            adError = new AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final LoadAdError zzb() {
        AdError adError;
        zze zzeVar = this.zzd;
        zzdx zzdxVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i10 = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdxVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(iBinder);
        }
        return new LoadAdError(i10, str, str2, adError, ResponseInfo.zza(zzdxVar));
    }
}
