package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgaa extends zzgab {
    final /* synthetic */ zzgac zza;
    private final Callable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgaa(zzgac zzgacVar, Callable callable, Executor executor) {
        super(zzgacVar, executor);
        this.zza = zzgacVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
