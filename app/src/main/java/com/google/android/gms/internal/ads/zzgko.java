package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgko {
    private final zzgki zza;
    private final List zzb;
    private final Integer zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgko(zzgki zzgkiVar, List list, Integer num, zzgkn zzgknVar) {
        this.zza = zzgkiVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgko) {
            zzgko zzgkoVar = (zzgko) obj;
            return this.zza.equals(zzgkoVar.zza) && this.zzb.equals(zzgkoVar.zzb) && Objects.equals(this.zzc, zzgkoVar.zzc);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
