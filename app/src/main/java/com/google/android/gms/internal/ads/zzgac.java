package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgac extends zzfzp {
    private zzgab zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgac(zzfvq zzfvqVar, boolean z10, Executor executor, Callable callable) {
        super(zzfvqVar, z10, false);
        this.zza = new zzgaa(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    final void zzf(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzq() {
        zzgab zzgabVar = this.zza;
        if (zzgabVar != null) {
            zzgabVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    final void zzu() {
        zzgab zzgabVar = this.zza;
        if (zzgabVar != null) {
            zzgabVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    final void zzy(int i10) {
        super.zzy(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
