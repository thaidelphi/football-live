package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcjy implements zzcjs {
    private final zzdte zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjy(zzdte zzdteVar) {
        this.zza = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zza(Map map) {
        char c10;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("flick")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            this.zza.zzm(zzdta.SHAKE);
        } else if (c10 != 1) {
            this.zza.zzm(zzdta.NONE);
        } else {
            this.zza.zzm(zzdta.FLICK);
        }
    }
}
