package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgmh {
    private final Class zza;
    private final zzguh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmh(Class cls, zzguh zzguhVar, zzgmj zzgmjVar) {
        this.zza = cls;
        this.zzb = zzguhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmh) {
            zzgmh zzgmhVar = (zzgmh) obj;
            return zzgmhVar.zza.equals(this.zza) && zzgmhVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzguh zzguhVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzguhVar);
        return simpleName + ", object identifier: " + valueOf;
    }
}
