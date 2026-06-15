package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdph implements zzfeu {
    private final Map zza;
    private final zzbak zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdph(zzbak zzbakVar, Map map) {
        this.zza = map;
        this.zzb = zzbakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzd(zzfen zzfenVar, String str) {
        if (this.zza.containsKey(zzfenVar)) {
            this.zzb.zzc(((zzdpg) this.zza.get(zzfenVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdA(zzfen zzfenVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdB(zzfen zzfenVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfenVar)) {
            this.zzb.zzc(((zzdpg) this.zza.get(zzfenVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdC(zzfen zzfenVar, String str) {
        if (this.zza.containsKey(zzfenVar)) {
            this.zzb.zzc(((zzdpg) this.zza.get(zzfenVar)).zza);
        }
    }
}
