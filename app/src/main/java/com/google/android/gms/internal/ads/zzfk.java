package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfk implements zzfr {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzfw zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfk(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzf(zzgr zzgrVar) {
        Objects.requireNonNull(zzgrVar);
        if (this.zzb.contains(zzgrVar)) {
            return;
        }
        this.zzb.add(zzgrVar);
        this.zzc++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(int i10) {
        zzfw zzfwVar = this.zzd;
        int i11 = zzeh.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzgr) this.zzb.get(i12)).zza(this, zzfwVar, this.zza, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh() {
        zzfw zzfwVar = this.zzd;
        int i10 = zzeh.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzgr) this.zzb.get(i11)).zzb(this, zzfwVar, this.zza);
        }
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(zzfw zzfwVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgr) this.zzb.get(i10)).zzc(this, zzfwVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzfw zzfwVar) {
        this.zzd = zzfwVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgr) this.zzb.get(i10)).zzd(this, zzfwVar, this.zza);
        }
    }
}
