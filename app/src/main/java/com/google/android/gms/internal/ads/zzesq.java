package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesq implements zzerw {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgba zzc;
    private final ScheduledExecutorService zzd;
    private final zzebe zze;
    private final zzfap zzf;
    private final VersionInfoParcel zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesq(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgba zzgbaVar, ScheduledExecutorService scheduledExecutorService, zzebe zzebeVar, zzfap zzfapVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgbaVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzebeVar;
        this.zzf = zzfapVar;
        this.zzg = versionInfoParcel;
    }

    public static /* synthetic */ b6.a zzc(zzesq zzesqVar, final Throwable th) {
        zzess zzessVar;
        zzesqVar.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesn
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkq)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzessVar = new zzess("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzessVar = new zzess("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzessVar = new zzess("", 4, null);
        } else if (th instanceof TimeoutException) {
            zzessVar = new zzess("", 5, null);
        } else {
            zzessVar = new zzess("", 0, null);
        }
        return zzgap.zzh(zzessVar);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzerw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b6.a zzb() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesq.zzb():b6.a");
    }
}
