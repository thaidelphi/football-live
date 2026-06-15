package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgnd {
    private zzgnp zza = null;
    private zzgui zzb = null;
    private Integer zzc = null;

    private zzgnd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgnd(zzgne zzgneVar) {
    }

    public final zzgnd zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgnd zzb(zzgui zzguiVar) {
        this.zzb = zzguiVar;
        return this;
    }

    public final zzgnd zzc(zzgnp zzgnpVar) {
        this.zza = zzgnpVar;
        return this;
    }

    public final zzgnf zzd() throws GeneralSecurityException {
        zzgui zzguiVar;
        zzguh zza;
        zzgnp zzgnpVar = this.zza;
        if (zzgnpVar == null || (zzguiVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgnpVar.zzc() == zzguiVar.zza()) {
            if (zzgnpVar.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzg() == zzgnn.zzd) {
                zza = zzglf.zza;
            } else if (this.zza.zzg() != zzgnn.zzc && this.zza.zzg() != zzgnn.zzb) {
                if (this.zza.zzg() == zzgnn.zza) {
                    zza = zzglf.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
                }
            } else {
                zza = zzglf.zza(this.zzc.intValue());
            }
            return new zzgnf(this.zza, this.zzb, zza, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
