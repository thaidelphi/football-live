package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdo extends zzhdg {
    static {
        zzhdl.zza(Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhdo(Map map, zzhdm zzhdmVar) {
        super(map);
    }

    public static zzhdn zzc(int i10) {
        return new zzhdn(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzhdh.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhdt) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
