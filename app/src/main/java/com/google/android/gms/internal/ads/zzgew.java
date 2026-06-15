package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgew {
    private zzgfg zza = null;
    private zzgui zzb = null;
    private Integer zzc = null;

    private zzgew() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgew(zzgex zzgexVar) {
    }

    public final zzgew zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgew zzb(zzgui zzguiVar) {
        this.zzb = zzguiVar;
        return this;
    }

    public final zzgew zzc(zzgfg zzgfgVar) {
        this.zza = zzgfgVar;
        return this;
    }

    public final zzgey zzd() throws GeneralSecurityException {
        zzgui zzguiVar;
        zzguh zzb;
        zzgfg zzgfgVar = this.zza;
        if (zzgfgVar == null || (zzguiVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfgVar.zzb() == zzguiVar.zza()) {
            if (zzgfgVar.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzgfe.zzc) {
                zzb = zzglf.zza;
            } else if (this.zza.zzd() == zzgfe.zzb) {
                zzb = zzglf.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzgfe.zza) {
                zzb = zzglf.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            return new zzgey(this.zza, this.zzb, zzb, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
