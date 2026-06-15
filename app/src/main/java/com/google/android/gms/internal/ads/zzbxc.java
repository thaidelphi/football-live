package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbxc {
    static zzbxc zza;

    public static synchronized zzbxc zzd(Context context) {
        synchronized (zzbxc.class) {
            zzbxc zzbxcVar = zza;
            if (zzbxcVar != null) {
                return zzbxcVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbbm.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
            zzi.zzp(applicationContext);
            zzbwu zzbwuVar = new zzbwu(null);
            zzbwuVar.zzb(applicationContext);
            zzbwuVar.zzc(com.google.android.gms.ads.internal.zzv.zzC());
            zzbwuVar.zza(zzi);
            zzbwuVar.zzd(com.google.android.gms.ads.internal.zzv.zzo());
            zzbxc zze = zzbwuVar.zze();
            zza = zze;
            zze.zza().zza();
            zzbxg zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaE)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                Map zzw = com.google.android.gms.ads.internal.util.zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaF));
                for (String str : zzw.keySet()) {
                    zzc.zzc(str);
                }
                zzc.zzd(new zzbxe(zzc, zzw));
            }
            return zza;
        }
    }

    abstract zzbwo zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzbws zzb();

    abstract zzbxg zzc();
}
