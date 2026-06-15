package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdwk implements zzcxc {
    private final Context zza;
    private final zzbxb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwk(Context context, zzbxb zzbxbVar) {
        this.zza = context;
        this.zzb = zzbxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
        if (TextUtils.isEmpty(zzfagVar.zzb.zzb.zze)) {
            return;
        }
        this.zzb.zzm(this.zza, zzfagVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzfagVar.zzb.zzb.zze);
    }
}
