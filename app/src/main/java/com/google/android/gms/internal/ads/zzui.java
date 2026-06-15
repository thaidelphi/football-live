package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzui {
    public final int zza;
    public final zzty zzb;
    private final CopyOnWriteArrayList zzc;

    public zzui() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzui(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzty zztyVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztyVar;
    }

    public final zzui zza(int i10, zzty zztyVar) {
        return new zzui(this.zzc, 0, zztyVar);
    }

    public final void zzb(Handler handler, zzuj zzujVar) {
        this.zzc.add(new zzuh(handler, zzujVar));
    }

    public final void zzc(final zzda zzdaVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuh zzuhVar = (zzuh) it.next();
            final zzuj zzujVar = zzuhVar.zzb;
            Handler handler = zzuhVar.zza;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzug
                @Override // java.lang.Runnable
                public final void run() {
                    zzda.this.zza(zzujVar);
                }
            };
            int i10 = zzeh.zza;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void zzd(final zztu zztuVar) {
        zzc(new zzda() { // from class: com.google.android.gms.internal.ads.zzub
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                ((zzuj) obj).zzaf(0, zzui.this.zzb, zztuVar);
            }
        });
    }

    public final void zze(final zztp zztpVar, final zztu zztuVar) {
        zzc(new zzda() { // from class: com.google.android.gms.internal.ads.zzuf
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                ((zzuj) obj).zzag(0, zzui.this.zzb, zztpVar, zztuVar);
            }
        });
    }

    public final void zzf(final zztp zztpVar, final zztu zztuVar) {
        zzc(new zzda() { // from class: com.google.android.gms.internal.ads.zzud
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                ((zzuj) obj).zzah(0, zzui.this.zzb, zztpVar, zztuVar);
            }
        });
    }

    public final void zzg(final zztp zztpVar, final zztu zztuVar, final IOException iOException, final boolean z10) {
        zzc(new zzda() { // from class: com.google.android.gms.internal.ads.zzue
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                ((zzuj) obj).zzai(0, zzui.this.zzb, zztpVar, zztuVar, iOException, z10);
            }
        });
    }

    public final void zzh(final zztp zztpVar, final zztu zztuVar, final int i10) {
        zzc(new zzda() { // from class: com.google.android.gms.internal.ads.zzuc
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                ((zzuj) obj).zzaj(0, zzui.this.zzb, zztpVar, zztuVar, i10);
            }
        });
    }

    public final void zzi(zzuj zzujVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuh zzuhVar = (zzuh) it.next();
            if (zzuhVar.zzb == zzujVar) {
                this.zzc.remove(zzuhVar);
            }
        }
    }
}
