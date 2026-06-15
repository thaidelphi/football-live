package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzgxg {
    protected volatile zzgxv zza;
    private volatile zzgvc zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgxg) {
            zzgxg zzgxgVar = (zzgxg) obj;
            zzgxv zzgxvVar = this.zza;
            zzgxv zzgxvVar2 = zzgxgVar.zza;
            if (zzgxvVar == null && zzgxvVar2 == null) {
                return zzb().equals(zzgxgVar.zzb());
            }
            if (zzgxvVar == null || zzgxvVar2 == null) {
                if (zzgxvVar != null) {
                    zzgxgVar.zzd(zzgxvVar.zzbt());
                    return zzgxvVar.equals(zzgxgVar.zza);
                }
                zzd(zzgxvVar2.zzbt());
                return this.zza.equals(zzgxvVar2);
            }
            return zzgxvVar.equals(zzgxvVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzguz) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgvc zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzgvc.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            return this.zzb;
        }
    }

    public final zzgxv zzc(zzgxv zzgxvVar) {
        zzgxv zzgxvVar2 = this.zza;
        this.zzb = null;
        this.zza = zzgxvVar;
        return zzgxvVar2;
    }

    protected final void zzd(zzgxv zzgxvVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzgxvVar;
                this.zzb = zzgvc.zzb;
            } catch (zzgwz unused) {
                this.zzc = true;
                this.zza = zzgxvVar;
                this.zzb = zzgvc.zzb;
            }
        }
    }
}
