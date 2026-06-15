package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbo extends zzgax {
    final /* synthetic */ zzgbq zza;
    private final zzfzv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbo(zzgbq zzgbqVar, zzfzv zzfzvVar) {
        this.zza = zzgbqVar;
        this.zzb = zzfzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfzv zzfzvVar = this.zzb;
        b6.a zza = zzfzvVar.zza();
        zzfsv.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfzvVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((b6.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final boolean zzg() {
        return this.zza.isDone();
    }
}
