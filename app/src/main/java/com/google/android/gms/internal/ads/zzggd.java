package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzggd {
    private zzggf zza;
    private String zzb;
    private zzgge zzc;
    private zzgdk zzd;

    private zzggd() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggd(zzggg zzgggVar) {
    }

    public final zzggd zza(zzgdk zzgdkVar) {
        this.zzd = zzgdkVar;
        return this;
    }

    public final zzggd zzb(zzgge zzggeVar) {
        this.zzc = zzggeVar;
        return this;
    }

    public final zzggd zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzggd zzd(zzggf zzggfVar) {
        this.zza = zzggfVar;
        return this;
    }

    public final zzggh zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzggf.zzb;
        }
        if (this.zzb != null) {
            zzgge zzggeVar = this.zzc;
            if (zzggeVar != null) {
                zzgdk zzgdkVar = this.zzd;
                if (zzgdkVar != null) {
                    if (!zzgdkVar.zza()) {
                        if ((zzggeVar.equals(zzgge.zza) && (zzgdkVar instanceof zzgev)) || ((zzggeVar.equals(zzgge.zzc) && (zzgdkVar instanceof zzgfm)) || ((zzggeVar.equals(zzgge.zzb) && (zzgdkVar instanceof zzghj)) || ((zzggeVar.equals(zzgge.zzd) && (zzgdkVar instanceof zzgea)) || ((zzggeVar.equals(zzgge.zze) && (zzgdkVar instanceof zzgek)) || (zzggeVar.equals(zzgge.zzf) && (zzgdkVar instanceof zzgfg))))))) {
                            return new zzggh(this.zza, this.zzb, this.zzc, this.zzd, null);
                        }
                        String zzggeVar2 = this.zzc.toString();
                        String valueOf = String.valueOf(this.zzd);
                        throw new GeneralSecurityException("Cannot use parsing strategy " + zzggeVar2 + " when new keys are picked according to " + valueOf + ".");
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }
}
