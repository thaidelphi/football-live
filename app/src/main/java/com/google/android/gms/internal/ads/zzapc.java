package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzapc implements zzaoo {
    private final Map zza = new HashMap();
    private final zzaob zzb;
    private final BlockingQueue zzc;
    private final zzaog zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapc(zzaob zzaobVar, BlockingQueue blockingQueue, zzaog zzaogVar) {
        this.zzd = zzaogVar;
        this.zzb = zzaobVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final synchronized void zza(zzaop zzaopVar) {
        Map map = this.zza;
        String zzj = zzaopVar.zzj();
        List list = (List) map.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzapb.zzb) {
            zzapb.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzaop zzaopVar2 = (zzaop) list.remove(0);
        this.zza.put(zzj, list);
        zzaopVar2.zzu(this);
        try {
            this.zzc.put(zzaopVar2);
        } catch (InterruptedException e8) {
            zzapb.zzb("Couldn't add request to queue. %s", e8.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(zzaop zzaopVar, zzaov zzaovVar) {
        List<zzaop> list;
        zzany zzanyVar = zzaovVar.zzb;
        if (zzanyVar != null && !zzanyVar.zza(System.currentTimeMillis())) {
            String zzj = zzaopVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzapb.zzb) {
                    zzapb.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                for (zzaop zzaopVar2 : list) {
                    this.zzd.zzb(zzaopVar2, zzaovVar, null);
                }
                return;
            }
            return;
        }
        zza(zzaopVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzc(zzaop zzaopVar) {
        Map map = this.zza;
        String zzj = zzaopVar.zzj();
        if (map.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzaopVar.zzm("waiting-for-response");
            list.add(zzaopVar);
            this.zza.put(zzj, list);
            if (zzapb.zzb) {
                zzapb.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzaopVar.zzu(this);
        if (zzapb.zzb) {
            zzapb.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
