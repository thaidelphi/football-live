package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavn implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzavo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavn(zzavo zzavoVar) {
        this.zza = zzavoVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        long j10;
        long j11;
        long j12;
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzavo zzavoVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j10 = zzavoVar.zzc;
        if (j10 > 0) {
            zzavo zzavoVar2 = this.zza;
            j11 = zzavoVar2.zzc;
            if (currentTimeMillis >= j11) {
                j12 = zzavoVar2.zzc;
                zzavoVar2.zzd = currentTimeMillis - j12;
            }
        }
        this.zza.zze = false;
    }
}
