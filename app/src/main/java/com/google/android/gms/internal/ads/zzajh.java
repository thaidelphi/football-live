package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzajh implements zzacm {
    private final zzacm zzb;
    private final zzaje zzc;
    private final SparseArray zzd = new SparseArray();

    public zzajh(zzacm zzacmVar, zzaje zzajeVar) {
        this.zzb = zzacmVar;
        this.zzc = zzajeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzG() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzP(zzadi zzadiVar) {
        this.zzb.zzP(zzadiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzadp zzw(int i10, int i11) {
        if (i11 != 3) {
            return this.zzb.zzw(i10, i11);
        }
        zzajj zzajjVar = (zzajj) this.zzd.get(i10);
        if (zzajjVar != null) {
            return zzajjVar;
        }
        zzajj zzajjVar2 = new zzajj(this.zzb.zzw(i10, 3), this.zzc);
        this.zzd.put(i10, zzajjVar2);
        return zzajjVar2;
    }
}
