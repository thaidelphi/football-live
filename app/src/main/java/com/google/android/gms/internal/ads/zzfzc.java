package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfzc extends zzfze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzc(b6.a aVar, Class cls, zzfzw zzfzwVar) {
        super(aVar, cls, zzfzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzfzw zzfzwVar = (zzfzw) obj;
        b6.a zza = zzfzwVar.zza(th);
        zzfsv.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfzwVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    final /* synthetic */ void zzf(Object obj) {
        zzs((b6.a) obj);
    }
}
