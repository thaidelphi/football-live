package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzhr implements zzkb {
    private final zzlj zza;
    private final zzhq zzb;
    private zzla zzc;
    private zzkb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhr(zzhq zzhqVar, zzcw zzcwVar) {
        this.zzb = zzhqVar;
        this.zza = new zzlj(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkb zzkbVar = this.zzd;
        Objects.requireNonNull(zzkbVar);
        return zzkbVar.zza();
    }

    public final long zzb(boolean z10) {
        zzla zzlaVar = this.zzc;
        if (zzlaVar != null && !zzlaVar.zzW() && ((!z10 || this.zzc.zzcT() == 2) && (this.zzc.zzX() || (!z10 && !this.zzc.zzQ())))) {
            zzkb zzkbVar = this.zzd;
            Objects.requireNonNull(zzkbVar);
            long zza = zzkbVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbb zzc = zzkbVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final zzbb zzc() {
        zzkb zzkbVar = this.zzd;
        return zzkbVar != null ? zzkbVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzla zzlaVar) {
        if (zzlaVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzla zzlaVar) throws zzhs {
        zzkb zzkbVar;
        zzkb zzl = zzlaVar.zzl();
        if (zzl == null || zzl == (zzkbVar = this.zzd)) {
            return;
        }
        if (zzkbVar == null) {
            this.zzd = zzl;
            this.zzc = zzlaVar;
            zzl.zzg(this.zza.zzc());
            return;
        }
        throw zzhs.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void zzf(long j10) {
        this.zza.zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzg(zzbb zzbbVar) {
        zzkb zzkbVar = this.zzd;
        if (zzkbVar != null) {
            zzkbVar.zzg(zzbbVar);
            zzbbVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbbVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkb zzkbVar = this.zzd;
        Objects.requireNonNull(zzkbVar);
        return zzkbVar.zzj();
    }
}
