package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbni implements zzbjd {
    final /* synthetic */ zzbnj zza;
    private final zzbml zzb;
    private final zzbyu zzc;

    public zzbni(zzbnj zzbnjVar, zzbml zzbmlVar, zzbyu zzbyuVar) {
        this.zza = zzbnjVar;
        this.zzb = zzbmlVar;
        this.zzc = zzbyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbmu());
            } else {
                this.zzc.zzd(new zzbmu(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final void zzb(JSONObject jSONObject) {
        zzbmx zzbmxVar;
        try {
            try {
                zzbyu zzbyuVar = this.zzc;
                zzbmxVar = this.zza.zza;
                zzbyuVar.zzc(zzbmxVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e8) {
                this.zzc.zzd(e8);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
