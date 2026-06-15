package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfio {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbod zze;
    private final Clock zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfio(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static zzfhv zzc() {
        return new zzfhv(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzw)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzx)).longValue(), 0.2d);
    }

    public final zzfin zza(com.google.android.gms.ads.internal.client.zzfq zzfqVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfqVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return new zzfhx(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfqVar, zzceVar, this.zzc, zzc(), this.zzf);
        } else if (ordinal == 2) {
            return new zzfir(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfqVar, zzceVar, this.zzc, zzc(), this.zzf);
        } else if (ordinal != 5) {
            return null;
        } else {
            return new zzfhu(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfqVar, zzceVar, this.zzc, zzc(), this.zzf);
        }
    }

    public final void zzb(zzbod zzbodVar) {
        this.zze = zzbodVar;
    }
}
