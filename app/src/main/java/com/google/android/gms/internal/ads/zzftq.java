package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzftq implements zzftn {
    private static final zzftn zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzftp
        @Override // com.google.android.gms.internal.ads.zzftn
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzftu zzb = new zzftu();
    private volatile zzftn zzc;
    private Object zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftq(zzftn zzftnVar) {
        this.zzc = zzftnVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzd) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final Object zza() {
        zzftn zzftnVar = this.zzc;
        zzftn zzftnVar2 = zza;
        if (zzftnVar != zzftnVar2) {
            synchronized (this.zzb) {
                if (this.zzc != zzftnVar2) {
                    Object zza2 = this.zzc.zza();
                    this.zzd = zza2;
                    this.zzc = zzftnVar2;
                    return zza2;
                }
            }
        }
        return this.zzd;
    }
}
