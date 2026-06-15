package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfel {
    private static final b6.a zza = zzgap.zzh(null);
    private final zzgba zzb;
    private final ScheduledExecutorService zzc;
    private final zzfem zzd;

    public zzfel(zzgba zzgbaVar, ScheduledExecutorService scheduledExecutorService, zzfem zzfemVar) {
        this.zzb = zzgbaVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfemVar;
    }

    public final zzfeb zza(Object obj, b6.a... aVarArr) {
        return new zzfeb(this, obj, Arrays.asList(aVarArr), null);
    }

    public final zzfej zzb(Object obj, b6.a aVar) {
        return new zzfej(this, obj, aVar, Collections.singletonList(aVar), aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
