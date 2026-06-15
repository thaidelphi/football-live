package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbrn extends zzbgb {
    final /* synthetic */ zzbrq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbrn(zzbrq zzbrqVar, zzbrp zzbrpVar) {
        this.zza = zzbrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zze(zzbfs zzbfsVar, String str) {
        zzbrq zzbrqVar = this.zza;
        if (zzbrq.zzc(zzbrqVar) == null) {
            return;
        }
        zzbrq.zzc(zzbrqVar).onCustomClick(zzbrq.zze(zzbrqVar, zzbfsVar), str);
    }
}
