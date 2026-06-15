package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfld {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzflc zzd = null;

    public zzfld() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzflc zzflcVar = (zzflc) this.zzc.poll();
        this.zzd = zzflcVar;
        if (zzflcVar != null) {
            zzflcVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzflc zzflcVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzflc zzflcVar) {
        zzflcVar.zzb(this);
        this.zzc.add(zzflcVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
