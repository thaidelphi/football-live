package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.appnext.core.AppnextError;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzhb extends zzhy {
    private final Context zza;
    private final zzih zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhb(Context context, zzih zzihVar) {
        Objects.requireNonNull(context, AppnextError.NULL_CONTEXT);
        this.zza = context;
        this.zzb = zzihVar;
    }

    public final boolean equals(Object obj) {
        zzih zzihVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhy) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zza.equals(zzhyVar.zza()) && ((zzihVar = this.zzb) != null ? zzihVar.equals(zzhyVar.zzb()) : zzhyVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzih zzihVar = this.zzb;
        return hashCode ^ (zzihVar == null ? 0 : zzihVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhy
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhy
    public final zzih zzb() {
        return this.zzb;
    }
}
