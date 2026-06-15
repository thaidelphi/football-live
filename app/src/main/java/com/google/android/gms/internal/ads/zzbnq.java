package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbnq implements zzbjd {
    private final zzbyu zza;

    public zzbnq(zzbnr zzbnrVar, zzbyu zzbyuVar) {
        this.zza = zzbyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbmu());
            } else {
                this.zza.zzd(new zzbmu(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e8) {
            this.zza.zzd(e8);
        }
    }
}
