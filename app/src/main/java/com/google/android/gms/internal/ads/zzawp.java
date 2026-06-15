package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawp extends zzaws {
    private final View zzh;

    public zzawp(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, View view) {
        super(zzavfVar, "qdXdYKGIDEc2nBTvoPjz+CgR+4W5sp2yvVwp3UKT3AUX5lHNEM0A4zI5MI07tN9G", "GvtK8JGCkHfavcPlTIA1koV/bSO3r4QwG/aY/ttYw/o=", zzarfVar, i10, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdz);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkS);
            zzavj zzavjVar = new zzavj((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzary zza = zzarz.zza();
            zza.zzb(zzavjVar.zza.longValue());
            zza.zzd(zzavjVar.zzb.longValue());
            zza.zze(zzavjVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzavjVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzavjVar.zzd.longValue());
            }
            this.zzd.zzW((zzarz) zza.zzbr());
        }
    }
}
