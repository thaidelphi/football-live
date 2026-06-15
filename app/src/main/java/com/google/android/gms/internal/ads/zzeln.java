package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeln implements zzerw {
    final zzbyf zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgba zzd;
    private final Context zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeln(Context context, zzbyf zzbyfVar, ScheduledExecutorService scheduledExecutorService, zzgba zzgbaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdc)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbyfVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcY)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdd)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcZ)).booleanValue()) {
                    return zzgap.zzm(zzfpr.zza(this.zzb.getAppSetIdInfo(), null), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzelk
                        @Override // com.google.android.gms.internal.ads.zzfsk
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzelo(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzbyp.zzg);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdc)).booleanValue()) {
                    appSetIdInfo = zzfbt.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzgap.zzh(new zzelo(null, -1));
                }
                b6.a zzn = zzgap.zzn(zzfpr.zza(appSetIdInfo, null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzell
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzgap.zzh(new zzelo(null, -1));
                        }
                        return zzgap.zzh(new zzelo(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzbyp.zzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzda)).booleanValue()) {
                    zzn = zzgap.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdb)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgap.zze(zzn, Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzelm
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        zzeln.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzelo(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgap.zzh(new zzelo(null, -1));
    }
}
