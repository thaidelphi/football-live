package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdls implements zzbio {
    final /* synthetic */ zzdlu zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbio zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdls(zzdlu zzdluVar, WeakReference weakReference, String str, zzbio zzbioVar, zzdlt zzdltVar) {
        this.zza = zzdluVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
