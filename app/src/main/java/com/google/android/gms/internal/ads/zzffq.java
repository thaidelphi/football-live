package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffq implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdns zzj;
    private final List zzk;
    private final zzbul zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzffv zzg = zzffz.zzb();
    private String zzh = "";
    private boolean zzl = false;

    public zzffq(Context context, VersionInfoParcel versionInfoParcel, zzdns zzdnsVar, zzdya zzdyaVar, zzbul zzbulVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdnsVar;
        this.zzm = zzbulVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziM)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = zzfvv.zzn();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbdf.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbdf.zza.zze()).doubleValue());
                } else {
                    zzb = Boolean.FALSE;
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    public static /* synthetic */ void zzb(zzffq zzffqVar, zzffg zzffgVar) {
        synchronized (zzd) {
            if (!zzffqVar.zzl) {
                zzffqVar.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzv.zzq();
                        zzffqVar.zzh = com.google.android.gms.ads.internal.util.zzs.zzq(zzffqVar.zze);
                    } catch (RemoteException | RuntimeException e8) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    zzffqVar.zzi = GoogleApiAvailabilityLight.h().b(zzffqVar.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziH)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlN)).booleanValue()) {
                        long j10 = intValue;
                        zzbyp.zzd.scheduleWithFixedDelay(zzffqVar, j10, j10, TimeUnit.MILLISECONDS);
                    } else {
                        long j11 = intValue;
                        zzbyp.zzd.scheduleAtFixedRate(zzffqVar, j11, j11, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzffgVar != null) {
            synchronized (zzc) {
                if (zzffqVar.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziI)).intValue()) {
                    return;
                }
                zzffr zza2 = zzffu.zza();
                zza2.zzu(zzffgVar.zzm());
                zza2.zzq(zzffgVar.zzl());
                zza2.zzg(zzffgVar.zzb());
                zza2.zzw(3);
                zza2.zzn(zzffqVar.zzf.afmaVersion);
                zza2.zzb(zzffqVar.zzh);
                zza2.zzk(Build.VERSION.RELEASE);
                zza2.zzr(Build.VERSION.SDK_INT);
                zza2.zzv(zzffgVar.zzo());
                zza2.zzj(zzffgVar.zza());
                zza2.zze(zzffqVar.zzi);
                zza2.zzt(zzffgVar.zzn());
                zza2.zzc(zzffgVar.zze());
                zza2.zzf(zzffgVar.zzg());
                zza2.zzh(zzffgVar.zzh());
                zza2.zzi(zzffqVar.zzj.zzb(zzffgVar.zzh()));
                zza2.zzl(zzffgVar.zzi());
                zza2.zzm(zzffgVar.zzd());
                zza2.zzd(zzffgVar.zzf());
                zza2.zzs(zzffgVar.zzk());
                zza2.zzo(zzffgVar.zzj());
                zza2.zzp(zzffgVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziM)).booleanValue()) {
                    zza2.zza(zzffqVar.zzk);
                }
                zzffv zzffvVar = zzffqVar.zzg;
                zzffw zza3 = zzffx.zza();
                zza3.zza(zza2);
                zzffvVar.zzb(zza3);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzaV = ((zzffz) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzdxz(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(new zzdxx((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziG), 60000, new HashMap(), zzaV, CommonGatewayClient.HEADER_PROTOBUF, false));
                } catch (Exception e8) {
                    if ((e8 instanceof zzduh) && ((zzduh) e8).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzc(final zzffg zzffgVar) {
        zzbyp.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffp
            @Override // java.lang.Runnable
            public final void run() {
                zzffq.zzb(zzffq.this, zzffgVar);
            }
        });
    }
}
