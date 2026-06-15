package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfpy extends zzfqk {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final zzfqk zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final zzfqk zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final zzfql zzc() {
        return new zzfqa(this.zza, this.zzb, null);
    }
}
