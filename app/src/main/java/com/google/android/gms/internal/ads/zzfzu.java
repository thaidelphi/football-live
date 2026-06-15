package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzf;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzfzu extends zzfzf.zzi {
    private static final zzfzq zzbe;
    private static final zzgay zzbf = new zzgay(zzfzu.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfzq zzfzsVar;
        try {
            zzfzsVar = new zzfzr(AtomicReferenceFieldUpdater.newUpdater(zzfzu.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfzu.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzfzsVar = new zzfzs(null);
        }
        zzbe = zzfzsVar;
        if (th != null) {
            zzbf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzu(int i10) {
        this.remaining = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzA() {
        return zzbe.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbe.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
