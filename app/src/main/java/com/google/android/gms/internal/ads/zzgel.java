package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgel {
    private zzgev zza = null;
    private zzgui zzb = null;
    private Integer zzc = null;

    private zzgel() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgel(zzgem zzgemVar) {
    }

    public final zzgel zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgel zzb(zzgui zzguiVar) {
        this.zzb = zzguiVar;
        return this;
    }

    public final zzgel zzc(zzgev zzgevVar) {
        this.zza = zzgevVar;
        return this;
    }

    public final zzgen zzd() throws GeneralSecurityException {
        zzgui zzguiVar;
        zzguh zzb;
        zzgev zzgevVar = this.zza;
        if (zzgevVar == null || (zzguiVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgevVar.zzb() == zzguiVar.zza()) {
            if (zzgevVar.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzget.zzc) {
                zzb = zzglf.zza;
            } else if (this.zza.zzd() == zzget.zzb) {
                zzb = zzglf.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzget.zza) {
                zzb = zzglf.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            return new zzgen(this.zza, this.zzb, zzb, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
