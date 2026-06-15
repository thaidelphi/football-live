package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzftd extends zzfti {
    final /* synthetic */ zzfsh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftd(zzfte zzfteVar, zzftk zzftkVar, CharSequence charSequence, zzfsh zzfshVar) {
        super(zzftkVar, charSequence);
        this.zza = zzfshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final int zzc(int i10) {
        return ((zzfsl) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final int zzd(int i10) {
        if (((zzfsl) this.zza).zza.find(i10)) {
            return ((zzfsl) this.zza).zza.start();
        }
        return -1;
    }
}
