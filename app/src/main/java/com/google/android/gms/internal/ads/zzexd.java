package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzexd implements zzfsk {
    final /* synthetic */ zzexh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexd(zzexh zzexhVar) {
        this.zza = zzexhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfcm zze;
        zzexf zzexfVar;
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("", (zzdwr) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzexh zzexhVar = this.zza;
        zze = zzexhVar.zze();
        zzexhVar.zzd = new zzexf(null, zze, null);
        zzexfVar = this.zza.zzd;
        return zzexfVar;
    }
}
