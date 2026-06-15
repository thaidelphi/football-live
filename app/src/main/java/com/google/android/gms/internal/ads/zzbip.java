package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbip implements zzbio {
    private final zzdte zza;

    public zzbip(zzdte zzdteVar) {
        Preconditions.n(zzdteVar, "The Inspector Manager must not be null");
        this.zza = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}
