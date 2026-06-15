package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbp extends zzgax {
    final /* synthetic */ zzgbq zza;
    private final Callable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbp(zzgbq zzgbqVar, Callable callable) {
        this.zza = zzgbqVar;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final Object zza() throws Exception {
        return this.zzb.call();
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
    final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final boolean zzg() {
        return this.zza.isDone();
    }
}
