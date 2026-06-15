package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzfzz extends zzfzp {
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzz(zzfvq zzfvqVar, boolean z10) {
        super(zzfvqVar, z10, true);
        List zza;
        if (zzfvqVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfwl.zza(zzfvqVar.size());
        }
        for (int i10 = 0; i10 < zzfvqVar.size(); i10++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfzp
    final void zzf(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzfzy(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzy(int i10) {
        super.zzy(i10);
        this.zza = null;
    }
}
