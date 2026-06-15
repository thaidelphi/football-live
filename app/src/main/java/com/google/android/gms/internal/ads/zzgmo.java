package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmo {
    private zzgmy zza = null;
    private zzgui zzb = null;
    private Integer zzc = null;

    private zzgmo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmo(zzgmp zzgmpVar) {
    }

    public final zzgmo zza(zzgui zzguiVar) throws GeneralSecurityException {
        this.zzb = zzguiVar;
        return this;
    }

    public final zzgmo zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgmo zzc(zzgmy zzgmyVar) {
        this.zza = zzgmyVar;
        return this;
    }

    public final zzgmq zzd() throws GeneralSecurityException {
        zzgui zzguiVar;
        zzguh zza;
        zzgmy zzgmyVar = this.zza;
        if (zzgmyVar == null || (zzguiVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgmyVar.zzc() == zzguiVar.zza()) {
            if (zzgmyVar.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzgmw.zzd) {
                zza = zzglf.zza;
            } else if (this.zza.zzf() != zzgmw.zzc && this.zza.zzf() != zzgmw.zzb) {
                if (this.zza.zzf() == zzgmw.zza) {
                    zza = zzglf.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                }
            } else {
                zza = zzglf.zza(this.zzc.intValue());
            }
            return new zzgmq(this.zza, this.zzb, zza, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
