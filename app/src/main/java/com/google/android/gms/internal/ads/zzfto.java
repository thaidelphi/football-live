package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfto implements Serializable, zzftn {
    final zzftn zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzftu zzd = new zzftu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfto(zzftn zzftnVar) {
        this.zza = zzftnVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
