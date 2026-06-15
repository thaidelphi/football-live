package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeiv implements zzcwq {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzewz.zza(this.zza, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeiu
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }
}
