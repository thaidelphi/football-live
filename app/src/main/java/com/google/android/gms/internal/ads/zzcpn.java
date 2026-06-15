package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcpn implements zzcpo {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpn(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final zzebg zza(int i10, String str) {
        return (zzebg) this.zza.get(str);
    }
}
