package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaos {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzanz zze;
    private final zzaoi zzf;
    private final zzaoj[] zzg;
    private zzaob zzh;
    private final List zzi;
    private final List zzj;
    private final zzaog zzk;

    public zzaos(zzanz zzanzVar, zzaoi zzaoiVar, int i10) {
        zzaog zzaogVar = new zzaog(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzanzVar;
        this.zzf = zzaoiVar;
        this.zzg = new zzaoj[4];
        this.zzk = zzaogVar;
    }

    public final zzaop zza(zzaop zzaopVar) {
        zzaopVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzaopVar);
        }
        zzaopVar.zzg(this.zza.incrementAndGet());
        zzaopVar.zzm("add-to-queue");
        zzc(zzaopVar, 0);
        this.zzc.add(zzaopVar);
        return zzaopVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzaop zzaopVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzaopVar);
        }
        synchronized (this.zzi) {
            for (zzaor zzaorVar : this.zzi) {
                zzaorVar.zza();
            }
        }
        zzc(zzaopVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzaop zzaopVar, int i10) {
        synchronized (this.zzj) {
            for (zzaoq zzaoqVar : this.zzj) {
                zzaoqVar.zza();
            }
        }
    }

    public final void zzd() {
        zzaob zzaobVar = this.zzh;
        if (zzaobVar != null) {
            zzaobVar.zzb();
        }
        zzaoj[] zzaojVarArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzaoj zzaojVar = zzaojVarArr[i10];
            if (zzaojVar != null) {
                zzaojVar.zza();
            }
        }
        zzaob zzaobVar2 = new zzaob(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaobVar2;
        zzaobVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzaoj zzaojVar2 = new zzaoj(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i11] = zzaojVar2;
            zzaojVar2.start();
        }
    }
}
