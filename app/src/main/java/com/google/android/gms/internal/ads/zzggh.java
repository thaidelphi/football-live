package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzggh extends zzgdk {
    private final zzggf zza;
    private final String zzb;
    private final zzgge zzc;
    private final zzgdk zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggh(zzggf zzggfVar, String str, zzgge zzggeVar, zzgdk zzgdkVar, zzggg zzgggVar) {
        this.zza = zzggfVar;
        this.zzb = str;
        this.zzc = zzggeVar;
        this.zzd = zzgdkVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzggh) {
            zzggh zzgghVar = (zzggh) obj;
            return zzgghVar.zzc.equals(this.zzc) && zzgghVar.zzd.equals(this.zzd) && zzgghVar.zzb.equals(this.zzb) && zzgghVar.zza.equals(this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzggh.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzggf zzggfVar = this.zza;
        zzgdk zzgdkVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgdkVar);
        String valueOf3 = String.valueOf(zzggfVar);
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + valueOf + ", dekParametersForNewKeys: " + valueOf2 + ", variant: " + valueOf3 + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zza != zzggf.zzb;
    }

    public final zzgdk zzb() {
        return this.zzd;
    }

    public final zzggf zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
