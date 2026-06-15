package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdis implements zzcuz {
    private final zzdgr zza;
    private final zzdgw zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdis(zzdgr zzdgrVar, zzdgw zzdgwVar, Executor executor, Executor executor2) {
        this.zza = zzdgrVar;
        this.zzb = zzdgwVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcdq zzcdqVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiq
            @Override // java.lang.Runnable
            public final void run() {
                zzcdq.this.zzd("onSdkImpression", new androidx.collection.a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdgr zzdgrVar = this.zza;
            zzebb zzu = zzdgrVar.zzu();
            if (zzu == null && zzdgrVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfn)).booleanValue()) {
                zzdgr zzdgrVar2 = this.zza;
                b6.a zzw = zzdgrVar2.zzw();
                zzbyu zzp = zzdgrVar2.zzp();
                if (zzw == null || zzp == null) {
                    return;
                }
                zzgap.zzr(zzgap.zzl(zzw, zzp), new zzdir(this), this.zzd);
            } else if (zzu != null) {
                zzdgr zzdgrVar3 = this.zza;
                zzcdq zzr = zzdgrVar3.zzr();
                zzcdq zzs = zzdgrVar3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
