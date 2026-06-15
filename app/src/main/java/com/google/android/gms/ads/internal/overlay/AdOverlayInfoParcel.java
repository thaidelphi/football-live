package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzcus;
import com.google.android.gms.internal.ads.zzdce;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f11316a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f11317b = new ConcurrentHashMap();
    @SafeParcelable.Field
    public final zzc zza;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zza zzb;
    @SafeParcelable.Field
    public final zzr zzc;
    @SafeParcelable.Field
    public final zzcdq zzd;
    @SafeParcelable.Field
    public final zzbhg zze;
    @SafeParcelable.Field
    public final String zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public final String zzh;
    @SafeParcelable.Field
    public final zzac zzi;
    @SafeParcelable.Field
    public final int zzj;
    @SafeParcelable.Field
    public final int zzk;
    @SafeParcelable.Field
    public final String zzl;
    @SafeParcelable.Field
    public final VersionInfoParcel zzm;
    @SafeParcelable.Field
    public final String zzn;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.zzl zzo;
    @SafeParcelable.Field
    public final zzbhe zzp;
    @SafeParcelable.Field
    public final String zzq;
    @SafeParcelable.Field
    public final String zzr;
    @SafeParcelable.Field
    public final String zzs;
    @SafeParcelable.Field
    public final zzcus zzt;
    @SafeParcelable.Field
    public final zzdce zzu;
    @SafeParcelable.Field
    public final zzbrw zzv;
    @SafeParcelable.Field
    public final boolean zzw;
    @SafeParcelable.Field
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbhe zzbheVar, zzbhg zzbhgVar, zzac zzacVar, zzcdq zzcdqVar, boolean z10, int i10, String str, VersionInfoParcel versionInfoParcel, zzdce zzdceVar, zzbrw zzbrwVar, boolean z11) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcdqVar;
        this.zzp = zzbheVar;
        this.zze = zzbhgVar;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdceVar;
        this.zzv = zzbrwVar;
        this.zzw = z11;
        this.zzx = f11316a.getAndIncrement();
    }

    private static final IBinder n0(Object obj) {
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmM)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.u0(obj).asBinder();
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e8) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdOverlayInfoParcel.getFromIntent");
                return null;
            }
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.zza, i10, false);
        SafeParcelWriter.j(parcel, 3, n0(this.zzb), false);
        SafeParcelWriter.j(parcel, 4, n0(this.zzc), false);
        SafeParcelWriter.j(parcel, 5, n0(this.zzd), false);
        SafeParcelWriter.j(parcel, 6, n0(this.zze), false);
        SafeParcelWriter.r(parcel, 7, this.zzf, false);
        SafeParcelWriter.c(parcel, 8, this.zzg);
        SafeParcelWriter.r(parcel, 9, this.zzh, false);
        SafeParcelWriter.j(parcel, 10, n0(this.zzi), false);
        SafeParcelWriter.k(parcel, 11, this.zzj);
        SafeParcelWriter.k(parcel, 12, this.zzk);
        SafeParcelWriter.r(parcel, 13, this.zzl, false);
        SafeParcelWriter.q(parcel, 14, this.zzm, i10, false);
        SafeParcelWriter.r(parcel, 16, this.zzn, false);
        SafeParcelWriter.q(parcel, 17, this.zzo, i10, false);
        SafeParcelWriter.j(parcel, 18, n0(this.zzp), false);
        SafeParcelWriter.r(parcel, 19, this.zzq, false);
        SafeParcelWriter.r(parcel, 24, this.zzr, false);
        SafeParcelWriter.r(parcel, 25, this.zzs, false);
        SafeParcelWriter.j(parcel, 26, n0(this.zzt), false);
        SafeParcelWriter.j(parcel, 27, n0(this.zzu), false);
        SafeParcelWriter.j(parcel, 28, n0(this.zzv), false);
        SafeParcelWriter.c(parcel, 29, this.zzw);
        SafeParcelWriter.n(parcel, 30, this.zzx);
        SafeParcelWriter.b(parcel, a10);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmM)).booleanValue()) {
            long j10 = this.zzx;
            ScheduledFuture schedule = zzbyp.zzd.schedule(new zzq(j10), ((Integer) zzbd.zzc().zzb(zzbbm.zzmO)).intValue(), TimeUnit.SECONDS);
            f11317b.put(Long.valueOf(this.zzx), new zzp(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, schedule));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbhe zzbheVar, zzbhg zzbhgVar, zzac zzacVar, zzcdq zzcdqVar, boolean z10, int i10, String str, String str2, VersionInfoParcel versionInfoParcel, zzdce zzdceVar, zzbrw zzbrwVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcdqVar;
        this.zzp = zzbheVar;
        this.zze = zzbhgVar;
        this.zzf = str2;
        this.zzg = z10;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdceVar;
        this.zzv = zzbrwVar;
        this.zzw = false;
        this.zzx = f11316a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, zzcdq zzcdqVar, int i10, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzcus zzcusVar, zzbrw zzbrwVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzcdqVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzaT)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i10;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcusVar;
        this.zzu = null;
        this.zzv = zzbrwVar;
        this.zzw = false;
        this.zzx = f11316a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, zzcdq zzcdqVar, boolean z10, int i10, VersionInfoParcel versionInfoParcel, zzdce zzdceVar, zzbrw zzbrwVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcdqVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i10;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdceVar;
        this.zzv = zzbrwVar;
        this.zzw = false;
        this.zzx = f11316a.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param zzc zzcVar, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2, @SafeParcelable.Param IBinder iBinder3, @SafeParcelable.Param IBinder iBinder4, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param String str2, @SafeParcelable.Param IBinder iBinder5, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str3, @SafeParcelable.Param VersionInfoParcel versionInfoParcel, @SafeParcelable.Param String str4, @SafeParcelable.Param com.google.android.gms.ads.internal.zzl zzlVar, @SafeParcelable.Param IBinder iBinder6, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param IBinder iBinder7, @SafeParcelable.Param IBinder iBinder8, @SafeParcelable.Param IBinder iBinder9, @SafeParcelable.Param boolean z11, @SafeParcelable.Param long j10) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z10;
        this.zzh = str2;
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z11;
        this.zzx = j10;
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmM)).booleanValue()) {
            zzp zzpVar = (zzp) f11317b.remove(Long.valueOf(j10));
            Objects.requireNonNull(zzpVar, "AdOverlayObjects is null");
            this.zzb = zzp.a(zzpVar);
            this.zzc = zzp.e(zzpVar);
            this.zzd = zzp.g(zzpVar);
            this.zzp = zzp.b(zzpVar);
            this.zze = zzp.c(zzpVar);
            this.zzt = zzp.h(zzpVar);
            this.zzu = zzp.i(zzpVar);
            this.zzv = zzp.d(zzpVar);
            this.zzi = zzp.f(zzpVar);
            zzp.j(zzpVar).cancel(false);
            return;
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder));
        this.zzc = (zzr) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder2));
        this.zzd = (zzcdq) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder3));
        this.zzp = (zzbhe) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder6));
        this.zze = (zzbhg) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder4));
        this.zzi = (zzac) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder5));
        this.zzt = (zzcus) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder7));
        this.zzu = (zzdce) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder8));
        this.zzv = (zzbrw) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, zzcdq zzcdqVar, zzdce zzdceVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcdqVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdceVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = f11316a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzcdq zzcdqVar, int i10, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzcdqVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = f11316a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcdq zzcdqVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i10, zzbrw zzbrwVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcdqVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbrwVar;
        this.zzw = false;
        this.zzx = f11316a.getAndIncrement();
    }
}
