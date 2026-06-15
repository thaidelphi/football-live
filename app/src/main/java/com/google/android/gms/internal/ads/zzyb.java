package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzyb {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyc zzycVar) {
        zzc(zzycVar);
        this.zza.add(new zzya(handler, zzycVar));
    }

    public final void zzb(final int i10, final long j10, final long j11) {
        boolean z10;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzya zzyaVar = (zzya) it.next();
            z10 = zzyaVar.zzc;
            if (!z10) {
                handler = zzyaVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyc zzycVar;
                        zzycVar = zzya.this.zzb;
                        zzycVar.zzY(i10, j10, j11);
                    }
                });
            }
        }
    }

    public final void zzc(zzyc zzycVar) {
        zzyc zzycVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzya zzyaVar = (zzya) it.next();
            zzycVar2 = zzyaVar.zzb;
            if (zzycVar2 == zzycVar) {
                zzyaVar.zzc();
                this.zza.remove(zzyaVar);
            }
        }
    }
}
