package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfbo {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgba zzc;

    public zzfbo(Callable callable, zzgba zzgbaVar) {
        this.zzb = callable;
        this.zzc = zzgbaVar;
    }

    public final synchronized b6.a zza() {
        zzc(1);
        return (b6.a) this.zza.poll();
    }

    public final synchronized void zzb(b6.a aVar) {
        this.zza.addFirst(aVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
