package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgeb {
    private zzgek zza = null;
    private zzgui zzb = null;
    private Integer zzc = null;

    private zzgeb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgeb(zzgec zzgecVar) {
    }

    public final zzgeb zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgeb zzb(zzgui zzguiVar) {
        this.zzb = zzguiVar;
        return this;
    }

    public final zzgeb zzc(zzgek zzgekVar) {
        this.zza = zzgekVar;
        return this;
    }

    public final zzged zzd() throws GeneralSecurityException {
        zzgui zzguiVar;
        zzguh zzb;
        zzgek zzgekVar = this.zza;
        if (zzgekVar == null || (zzguiVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgekVar.zzc() == zzguiVar.zza()) {
            if (zzgekVar.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zze() == zzgei.zzc) {
                zzb = zzglf.zza;
            } else if (this.zza.zze() == zzgei.zzb) {
                zzb = zzglf.zza(this.zzc.intValue());
            } else if (this.zza.zze() == zzgei.zza) {
                zzb = zzglf.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            return new zzged(this.zza, this.zzb, zzb, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
