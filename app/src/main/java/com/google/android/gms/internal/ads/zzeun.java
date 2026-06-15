package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeun implements zzerw {
    private final zzbyf zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgba zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeun(zzbyf zzbyfVar, boolean z10, boolean z11, zzbxu zzbxuVar, zzgba zzgbaVar, String str, ScheduledExecutorService scheduledExecutorService, int i10, int i11) {
        this.zza = zzbyfVar;
        this.zzb = z10;
        this.zzc = z11;
        this.zze = zzgbaVar;
        this.zzd = scheduledExecutorService;
        this.zzf = i10;
        this.zzg = i11;
    }

    public static /* synthetic */ zzeuo zzc(zzeun zzeunVar, Exception exc) {
        zzeunVar.zza.zzw(exc, "TrustlessTokenSignal");
        return new zzeuo(null);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgR)).booleanValue() && this.zzc) {
            return zzgap.zzh(new zzeuo(null));
        }
        if (this.zzg != 2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgT)).booleanValue()) {
                z10 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgU)).split(",")).contains(String.valueOf(this.zzf));
            } else {
                z10 = this.zzb;
            }
            if (!z10) {
                return zzgap.zzh(new zzeuo(null));
            }
            return zzgap.zze(zzgap.zzo(zzgap.zzm(zzgap.zzh(null), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeul
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    return new zzeuo((String) obj);
                }
            }, this.zze), ((Long) zzbeb.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeum
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    return zzeun.zzc(zzeun.this, (Exception) obj);
                }
            }, this.zze);
        }
        return zzgap.zzh(new zzeuo(null));
    }
}
