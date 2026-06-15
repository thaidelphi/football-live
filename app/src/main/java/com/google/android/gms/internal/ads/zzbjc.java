package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbjc implements zzbjd {
    final /* synthetic */ zzbyu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjc(zzbje zzbjeVar, zzbyu zzbyuVar) {
        this.zza = zzbyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final void zza(String str) {
        this.zza.zzd(new zzbmu(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
