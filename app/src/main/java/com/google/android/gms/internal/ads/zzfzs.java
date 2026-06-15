package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfzs extends zzfzq {
    private zzfzs() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfzs(zzfzt zzfztVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzq
    public final int zza(zzfzu zzfzuVar) {
        int i10;
        int i11;
        synchronized (zzfzuVar) {
            i10 = zzfzuVar.remaining;
            i11 = i10 - 1;
            zzfzuVar.remaining = i11;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zzb(zzfzu zzfzuVar, Set set, Set set2) {
        Set set3;
        synchronized (zzfzuVar) {
            set3 = zzfzuVar.seenExceptions;
            if (set3 == null) {
                zzfzuVar.seenExceptions = set2;
            }
        }
    }
}
