package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfku {
    private JSONObject zza;
    private final zzfld zzb;

    public zzfku(zzfld zzfldVar) {
        this.zzb = zzfldVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfle(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzflf(this, hashSet, jSONObject, j10));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzflg(this, hashSet, jSONObject, j10));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
