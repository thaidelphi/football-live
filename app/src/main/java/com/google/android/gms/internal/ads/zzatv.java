package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzatv implements Runnable {
    final /* synthetic */ zzatw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatv(zzatw zzatwVar) {
        this.zza = zzatwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        zzavf zzavfVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzatw.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z11 = false;
            try {
                z10 = ((Boolean) zzbbm.zzcF.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
            if (z10) {
                try {
                    zzavfVar = this.zza.zze;
                    zzatw.zza = zzfnq.zzb(zzavfVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z11 = z10;
            this.zza.zzb = Boolean.valueOf(z11);
            conditionVariable2 = zzatw.zzc;
            conditionVariable2.open();
        }
    }
}
