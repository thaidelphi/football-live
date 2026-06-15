package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzced {
    public static final zzcdq zza(final Context context, final zzcfk zzcfkVar, final String str, final boolean z10, final boolean z11, final zzauc zzaucVar, final zzbct zzbctVar, final VersionInfoParcel versionInfoParcel, zzbcb zzbcbVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbak zzbakVar, final zzezu zzezuVar, final zzezx zzezxVar, final zzeaf zzeafVar, final zzfat zzfatVar) throws zzcec {
        zzbbm.zza(context);
        try {
            zzftn zzftnVar = new zzftn(context, zzcfkVar, str, z10, z11, zzaucVar, zzbctVar, versionInfoParcel, null, zznVar, zzaVar, zzbakVar, zzezuVar, zzezxVar, zzfatVar, zzeafVar) { // from class: com.google.android.gms.internal.ads.zzcdz
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcfk zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzauc zzf;
                public final /* synthetic */ zzbct zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbak zzk;
                public final /* synthetic */ zzezu zzl;
                public final /* synthetic */ zzezx zzm;
                public final /* synthetic */ zzfat zzn;
                public final /* synthetic */ zzeaf zzo;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbakVar;
                    this.zzl = zzezuVar;
                    this.zzm = zzezxVar;
                    this.zzn = zzfatVar;
                    this.zzo = zzeafVar;
                }

                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object zza() {
                    zzcfk zzcfkVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    zzbak zzbakVar2 = this.zzk;
                    boolean z13 = this.zze;
                    zzauc zzaucVar2 = this.zzf;
                    zzezu zzezuVar2 = this.zzl;
                    zzbct zzbctVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    zzezx zzezxVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfat zzfatVar2 = this.zzn;
                    zzeaf zzeafVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcep.zza;
                        zzcei zzceiVar = new zzcei(new zzcep(new zzcfj(context2), zzcfkVar2, str2, z12, z13, zzaucVar2, zzbctVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbakVar2, zzezuVar2, zzezxVar2, zzfatVar2));
                        zzceiVar.setWebViewClient(com.google.android.gms.ads.internal.zzv.zzr().zzc(zzceiVar, zzbakVar2, z13, zzeafVar2));
                        zzceiVar.setWebChromeClient(new zzcdp(zzceiVar));
                        return zzceiVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object zza = zzftnVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return (zzcdq) zza;
        } catch (Throwable th) {
            throw new zzcec("Webview initialization failed.", th);
        }
    }
}
