package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcki implements zzcjs {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzcki(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean parseBoolean = Boolean.parseBoolean(str);
        zzgVar.zzD(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
        }
    }
}
