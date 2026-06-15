package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgdp {
    private zzgea zza = null;
    private zzgui zzb = null;
    private zzgui zzc = null;
    private Integer zzd = null;

    private zzgdp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdp(zzgdq zzgdqVar) {
    }

    public final zzgdp zza(zzgui zzguiVar) {
        this.zzb = zzguiVar;
        return this;
    }

    public final zzgdp zzb(zzgui zzguiVar) {
        this.zzc = zzguiVar;
        return this;
    }

    public final zzgdp zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgdp zzd(zzgea zzgeaVar) {
        this.zza = zzgeaVar;
        return this;
    }

    public final zzgdr zze() throws GeneralSecurityException {
        zzguh zzb;
        zzgea zzgeaVar = this.zza;
        if (zzgeaVar != null) {
            zzgui zzguiVar = this.zzb;
            if (zzguiVar != null && this.zzc != null) {
                if (zzgeaVar.zzb() == zzguiVar.zza()) {
                    if (zzgeaVar.zzc() == this.zzc.zza()) {
                        if (this.zza.zza() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zza() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzh() == zzgdy.zzc) {
                            zzb = zzglf.zza;
                        } else if (this.zza.zzh() == zzgdy.zzb) {
                            zzb = zzglf.zza(this.zzd.intValue());
                        } else if (this.zza.zzh() == zzgdy.zza) {
                            zzb = zzglf.zzb(this.zzd.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                        }
                        return new zzgdr(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }
}
