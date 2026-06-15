package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzetg implements zzerw {
    private final zzbyf zza;
    private final ScheduledExecutorService zzb;
    private final zzgba zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetg(String str, zzazn zzaznVar, zzbyf zzbyfVar, ScheduledExecutorService scheduledExecutorService, zzgba zzgbaVar) {
        this.zza = zzbyfVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgbaVar;
    }

    public static /* synthetic */ zzeth zzc(zzetg zzetgVar, Exception exc) {
        zzetgVar.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeth(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcY)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdd)).booleanValue()) {
                b6.a zzn = zzgap.zzn(zzfpr.zza(Tasks.forResult(null), null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzete
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgap.zzh(new zzeth(null, -1));
                        }
                        return zzgap.zzh(new zzeth(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzc);
                if (((Boolean) zzbcz.zza.zze()).booleanValue()) {
                    zzn = zzgap.zzo(zzn, ((Long) zzbcz.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgap.zze(zzn, Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzetf
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        return zzetg.zzc(zzetg.this, (Exception) obj);
                    }
                }, this.zzc);
            }
        }
        return zzgap.zzh(new zzeth(null, -1));
    }
}
