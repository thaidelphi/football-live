package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemj implements zzerw {
    private final zzews zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemj(zzews zzewsVar) {
        this.zza = zzewsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        zzews zzewsVar = this.zza;
        if (zzewsVar == null) {
            return zzgap.zzh(new zzemi(null));
        }
        String zza = zzewsVar.zza();
        if (Strings.a(zza)) {
            return zzgap.zzh(new zzemi(null));
        }
        return zzgap.zzh(new zzemi(zza));
    }
}
