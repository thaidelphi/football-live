package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgxm implements zzgxt {
    private final zzgxt[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgxm(zzgxt... zzgxtVarArr) {
        this.zza = zzgxtVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxs zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzgxt zzgxtVar = this.zza[i10];
            if (zzgxtVar.zzc(cls)) {
                return zzgxtVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
