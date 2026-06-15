package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzatt implements Runnable {
    final /* synthetic */ zzatu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatt(zzatu zzatuVar) {
        this.zza = zzatuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        zzflq zzflqVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z10 = this.zza.zzp;
            if (z10) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzatu.zzj(this.zza);
            } catch (Exception e8) {
                zzflqVar = this.zza.zzh;
                zzflqVar.zzc(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1L, e8);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
