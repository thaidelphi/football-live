package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvo implements zzdwq {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdup zzb;
    private final zzgba zzc;
    private final zzfap zzd;
    private final ScheduledExecutorService zze;
    private final zzdyq zzf;
    private final zzffn zzg;
    private final Context zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvo(Context context, zzfap zzfapVar, zzdup zzdupVar, zzgba zzgbaVar, ScheduledExecutorService scheduledExecutorService, zzdyq zzdyqVar, zzffn zzffnVar) {
        this.zzh = context;
        this.zzd = zzfapVar;
        this.zzb = zzdupVar;
        this.zzc = zzgbaVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzdyqVar;
        this.zzg = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final b6.a zzc(zzbud zzbudVar) {
        Context context = this.zzh;
        b6.a zzc = this.zzb.zzc(zzbudVar);
        zzffc zza2 = zzffb.zza(context, 11);
        zzffm.zzd(zzc, zza2);
        b6.a zzn = zzgap.zzn(zzc, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvl
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                b6.a zzh;
                zzh = zzgap.zzh(new zzfag(new zzfad(zzdvo.this.zzd), zzfaf.zza(new InputStreamReader(r2.zzb()), ((zzdws) obj).zza())));
                return zzh;
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfy)).booleanValue()) {
            zzbbd zzbbdVar = zzbbm.zzfz;
            zzn = zzgap.zzf(zzgap.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvm
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzgap.zzg(new zzduh(5));
                }
            }, zzbyp.zzg);
        }
        zzffm.zza(zzn, this.zzg, zza2);
        zzgap.zzr(zzn, new zzdvn(this), zzbyp.zzg);
        return zzn;
    }
}
