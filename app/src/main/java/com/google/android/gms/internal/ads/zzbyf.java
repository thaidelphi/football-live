package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbyf {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbyj zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbbr zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbyd zzl;
    private final Object zzm;
    private b6.a zzn;
    private final AtomicBoolean zzo;

    public zzbyf() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbyj(com.google.android.gms.ads.internal.client.zzbb.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbyd(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public static /* synthetic */ ArrayList zzo(zzbyf zzbyfVar) {
        Context zza = zzbun.zza(zzbyfVar.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f10 = Wrappers.a(zza).f(zza.getApplicationInfo().packageName, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (f10.requestedPermissions != null && f10.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = f10.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((f10.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final boolean zzA(Context context) {
        if (PlatformVersion.i()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzip)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkO)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zza(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zza(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot load resource from dynamite apk or local jar", e8);
            return null;
        }
    }

    public final zzbbr zzg() {
        zzbbr zzbbrVar;
        synchronized (this.zza) {
            zzbbrVar = this.zzh;
        }
        return zzbbrVar;
    }

    public final zzbyj zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final b6.a zzk() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcX)).booleanValue()) {
                synchronized (this.zzm) {
                    b6.a aVar = this.zzn;
                    if (aVar != null) {
                        return aVar;
                    }
                    b6.a zzb = zzbyp.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbya
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbyf.zzo(zzbyf.this);
                        }
                    });
                    this.zzn = zzb;
                    return zzb;
                }
            }
        }
        return zzgap.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzu(Context context, VersionInfoParcel versionInfoParcel) {
        zzbbr zzbbrVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzv.zzb().zzc(this.zzc);
                this.zzb.zzp(this.zze);
                zzbta.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzv.zze();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcf)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbbrVar = null;
                } else {
                    zzbbrVar = new zzbbr();
                }
                this.zzh = zzbbrVar;
                if (zzbbrVar != null) {
                    zzbys.zza(new zzbyb(this).zzb(), "AppState.registerCsiReporter");
                }
                Context context2 = this.zze;
                if (PlatformVersion.i()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzip)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbyc(this));
                        } catch (RuntimeException e8) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e8);
                            this.zzo.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzk();
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void zzv(Throwable th, String str) {
        zzbta.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbdv.zzf.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        zzbta.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzx(Throwable th, String str) {
        zzbta.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}
