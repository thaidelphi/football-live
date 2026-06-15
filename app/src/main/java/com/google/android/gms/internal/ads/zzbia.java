package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbia implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        try {
            zzfpm.zzj(zzcdqVar.getContext()).zzk();
            zzfpn.zzi(zzcdqVar.getContext()).zzj();
            zzfpo.zza(zzcdqVar.getContext()).zzb(null);
        } catch (IOException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
