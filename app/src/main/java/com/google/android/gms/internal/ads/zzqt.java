package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqt {
    public final int zza;
    public final zzty zzb;
    private final CopyOnWriteArrayList zzc;

    public zzqt() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzqt(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzty zztyVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztyVar;
    }

    public final zzqt zza(int i10, zzty zztyVar) {
        return new zzqt(this.zzc, 0, zztyVar);
    }

    public final void zzb(Handler handler, zzqu zzquVar) {
        this.zzc.add(new zzqs(handler, zzquVar));
    }

    public final void zzc(zzqu zzquVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqs zzqsVar = (zzqs) it.next();
            if (zzqsVar.zza == zzquVar) {
                this.zzc.remove(zzqsVar);
            }
        }
    }
}
