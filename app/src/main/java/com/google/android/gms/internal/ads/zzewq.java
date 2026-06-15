package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewq implements zzfcx {
    public final zzexk zza;
    public final zzexm zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzfcm zzg;

    public zzewq(zzexk zzexkVar, zzexm zzexmVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfcm zzfcmVar) {
        this.zza = zzexkVar;
        this.zzb = zzexmVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcx
    public final zzfcm zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfcx
    public final Executor zzb() {
        return this.zze;
    }
}
