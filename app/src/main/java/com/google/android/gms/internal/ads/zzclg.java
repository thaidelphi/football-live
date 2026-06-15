package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclg implements zzcui {
    private final zzezx zza;
    private final zzfag zzb;
    private final zzfhk zzc;
    private final zzfhp zzd;

    public zzclg(zzfag zzfagVar, zzfhp zzfhpVar, zzfhk zzfhkVar) {
        this.zzb = zzfagVar;
        this.zzd = zzfhpVar;
        this.zzc = zzfhkVar;
        this.zza = zzfagVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzc(this.zzb, null, list), null);
    }
}
