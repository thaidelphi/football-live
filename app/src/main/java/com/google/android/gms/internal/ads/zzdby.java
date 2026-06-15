package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdby extends zzczv implements zzaxl {
    private final Map zzb;
    private final Context zzc;
    private final zzezu zzd;

    public zzdby(Context context, Set set, zzezu zzezuVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzezuVar;
    }

    public final synchronized void zza(View view) {
        zzaxm zzaxmVar = (zzaxm) this.zzb.get(view);
        if (zzaxmVar == null) {
            zzaxm zzaxmVar2 = new zzaxm(this.zzc, view);
            zzaxmVar2.zzd(this);
            this.zzb.put(view, zzaxmVar2);
            zzaxmVar = zzaxmVar2;
        }
        if (this.zzd.zzX) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbx)).booleanValue()) {
                zzaxmVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbw)).longValue());
                return;
            }
        }
        zzaxmVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzaxm) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final synchronized void zzdn(final zzaxk zzaxkVar) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzdbx
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzaxl) obj).zzdn(zzaxk.this);
            }
        });
    }
}
