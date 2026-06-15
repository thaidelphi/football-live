package com.google.android.gms.internal.measurement;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzij implements zzih {
    volatile zzih zza;
    volatile boolean zzb;
    Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzij(zzih zzihVar) {
        Objects.requireNonNull(zzihVar);
        this.zza = zzihVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.zzc + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzih zzihVar = this.zza;
                    zzihVar.getClass();
                    Object zza = zzihVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
