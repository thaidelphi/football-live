package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzckq implements zzcjs {
    private final zzdte zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckq(zzdte zzdteVar) {
        this.zza = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals(com.ironsource.mediationsdk.metadata.a.f18924g));
    }
}
