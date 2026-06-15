package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfzp extends zzfzu {
    private static final zzgay zza = new zzgay(zzfzp.class);
    private zzfvq zzb;
    private final boolean zzc;
    private final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzp(zzfvq zzfvqVar, boolean z10, boolean z11) {
        super(zzfvqVar.size());
        this.zzb = zzfvqVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzf(i10, zzgbs.zza(future));
        } catch (ExecutionException e8) {
            zzI(e8.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzx(zzfvq zzfvqVar) {
        int zzA = zzA();
        int i10 = 0;
        zzfsv.zzm(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfvqVar != null) {
                zzfyb it = zzfvqVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK */
    public final void zzw(int i10, b6.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, aVar);
            }
        } finally {
            zzx(null);
        }
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        zzfvq zzfvqVar = this.zzb;
        return zzfvqVar != null ? "futures=".concat(zzfvqVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzb() {
        zzfvq zzfvqVar = this.zzb;
        zzy(1);
        if ((zzfvqVar != null) && isCancelled()) {
            boolean zzt = zzt();
            zzfyb it = zzfvqVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    final void zze(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable zzl = zzl();
        Objects.requireNonNull(zzl);
        zzL(set, zzl);
    }

    abstract void zzf(int i10, Object obj);

    abstract void zzu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
        } else if (this.zzc) {
            zzfyb it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final b6.a aVar = (b6.a) it.next();
                int i11 = i10 + 1;
                if (aVar.isDone()) {
                    zzw(i10, aVar);
                } else {
                    aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfzn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfzp.this.zzw(i10, aVar);
                        }
                    }, zzgad.INSTANCE);
                }
                i10 = i11;
            }
        } else {
            zzfvq zzfvqVar = this.zzb;
            final zzfvq zzfvqVar2 = true != this.zzd ? null : zzfvqVar;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfzo
                @Override // java.lang.Runnable
                public final void run() {
                    zzfzp.this.zzx(zzfvqVar2);
                }
            };
            zzfyb it2 = zzfvqVar.iterator();
            while (it2.hasNext()) {
                b6.a aVar2 = (b6.a) it2.next();
                if (aVar2.isDone()) {
                    zzx(zzfvqVar2);
                } else {
                    aVar2.addListener(runnable, zzgad.INSTANCE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzy(int i10) {
        this.zzb = null;
    }
}
