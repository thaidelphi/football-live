package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzapa {
    public static final boolean zza = zzapb.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzapb.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (!this.zzc) {
            this.zzb.add(new zzaoz(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        List list;
        this.zzc = true;
        long j10 = this.zzb.size() == 0 ? 0L : ((zzaoz) this.zzb.get(list.size() - 1)).zzc - ((zzaoz) this.zzb.get(0)).zzc;
        if (j10 > 0) {
            long j11 = ((zzaoz) this.zzb.get(0)).zzc;
            zzapb.zza("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzaoz zzaozVar : this.zzb) {
                long j12 = zzaozVar.zzc;
                zzapb.zza("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzaozVar.zzb), zzaozVar.zza);
                j11 = j12;
            }
        }
    }
}
