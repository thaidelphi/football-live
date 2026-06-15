package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfzk extends zzfzm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzk(b6.a aVar, zzfzw zzfzwVar) {
        super(aVar, zzfzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzm
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzfzw zzfzwVar = (zzfzw) obj;
        b6.a zza = zzfzwVar.zza(obj2);
        zzfsv.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfzwVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzm
    final /* synthetic */ void zzf(Object obj) {
        zzs((b6.a) obj);
    }
}
