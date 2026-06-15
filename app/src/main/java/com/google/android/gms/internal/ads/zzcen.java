package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcen implements zzbio {
    final /* synthetic */ zzcep zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcen(zzcep zzcepVar) {
        this.zza = zzcepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        zzcdq zzcdqVar = (zzcdq) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcep zzcepVar = this.zza;
                    i10 = zzcepVar.zzI;
                    if (i10 != parseInt) {
                        zzcepVar.zzI = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e8) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Exception occurred while getting webview content height", e8);
            }
        }
    }
}
