package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzctd implements zzcvt, zzcva {
    private final zzezu zza;

    public zzctd(Context context, zzezu zzezuVar, zzbsi zzbsiVar) {
        this.zza = zzezuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdh(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdk(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        zzbsj zzbsjVar = this.zza.zzad;
        if (zzbsjVar == null || !zzbsjVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zza.zzad.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zza.zzad.zzb);
    }
}
