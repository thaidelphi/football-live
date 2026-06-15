package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcrk implements com.google.android.gms.ads.internal.client.zza {
    private final zzcro zza;
    private final zzfap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrk(zzcro zzcroVar, zzfap zzfapVar) {
        this.zza = zzcroVar;
        this.zzb = zzfapVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
