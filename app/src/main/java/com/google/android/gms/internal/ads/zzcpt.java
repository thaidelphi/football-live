package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcpt implements zzeew {
    public final List zza;

    public zzcpt(zzcpl zzcplVar) {
        this.zza = Collections.singletonList(zzgap.zzh(zzcplVar));
    }

    public zzcpt(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeew
    public final void zzq() {
        for (b6.a aVar : this.zza) {
            zzgap.zzr(aVar, new zzcps(this), zzgbh.zzc());
        }
    }
}
