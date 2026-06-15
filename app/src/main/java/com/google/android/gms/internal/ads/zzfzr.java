package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.b;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfzr extends zzfzq {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzr(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzq
    public final int zza(zzfzu zzfzuVar) {
        return this.zzb.decrementAndGet(zzfzuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zzb(zzfzu zzfzuVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            if (b.a(atomicReferenceFieldUpdater, zzfzuVar, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzfzuVar) == null);
    }
}
