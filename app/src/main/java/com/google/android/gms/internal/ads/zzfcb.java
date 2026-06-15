package com.google.android.gms.internal.ads;

import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfcb {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfda zzd = new zzfda();

    public zzfcb(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && com.google.android.gms.ads.internal.zzv.zzC().a() - ((zzfcl) this.zza.getFirst()).zzd >= this.zzc) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfcl zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfcl zzfclVar = (zzfcl) this.zza.remove();
        if (zzfclVar != null) {
            this.zzd.zzh();
        }
        return zzfclVar;
    }

    public final zzfcz zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfcl zzfclVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfclVar);
        return true;
    }
}
