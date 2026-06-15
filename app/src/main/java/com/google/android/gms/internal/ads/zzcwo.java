package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcwo extends zzczv implements zzcuz, zzcwe {
    private final zzezu zzb;
    private final AtomicBoolean zzc;

    public zzcwo(Set set, zzezu zzezuVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzezuVar;
    }

    private final void zza() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhL)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcwn
                @Override // com.google.android.gms.internal.ads.zzczu
                public final void zza(Object obj) {
                    ((zzcwq) obj).zzh(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zza();
        }
    }
}
