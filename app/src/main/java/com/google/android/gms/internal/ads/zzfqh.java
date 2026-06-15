package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfqh extends zzfrk {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfrk zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfrk zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfrl zzc() {
        return new zzfqj(this.zza, this.zzb, null);
    }
}
