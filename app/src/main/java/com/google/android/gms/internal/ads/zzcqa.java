package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcqa {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final b6.a zzc;
    private volatile boolean zzd = true;

    public zzcqa(Executor executor, ScheduledExecutorService scheduledExecutorService, b6.a aVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    public static /* synthetic */ b6.a zza(zzcqa zzcqaVar, zzgal zzgalVar, b6.a aVar, zzcpl zzcplVar) {
        if (zzcplVar != null) {
            zzgalVar.zzb(zzcplVar);
        }
        return zzgap.zzo(aVar, ((Long) zzbea.zza.zze()).longValue(), TimeUnit.MILLISECONDS, zzcqaVar.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(final zzcqa zzcqaVar, List list, final zzgal zzgalVar) {
        if (list != null && !list.isEmpty()) {
            b6.a zzh = zzgap.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final b6.a aVar = (b6.a) it.next();
                zzh = zzgap.zzn(zzgap.zzf(zzh, Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzcpw
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        zzgal.this.zza((Throwable) obj);
                        return zzgap.zzh(null);
                    }
                }, zzcqaVar.zza), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzcpx
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        return zzcqa.zza(zzcqa.this, zzgalVar, aVar, (zzcpl) obj);
                    }
                }, zzcqaVar.zza);
            }
            zzgap.zzr(zzh, new zzcpz(zzcqaVar, zzgalVar), zzcqaVar.zza);
            return;
        }
        zzcqaVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpv
            @Override // java.lang.Runnable
            public final void run() {
                zzgal.this.zza(new zzduh(3));
            }
        });
    }

    public final void zze(zzgal zzgalVar) {
        zzgap.zzr(this.zzc, new zzcpy(this, zzgalVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
