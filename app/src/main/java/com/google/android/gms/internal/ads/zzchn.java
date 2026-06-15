package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchn implements zzdrh {
    private final zzcha zza;
    private final zzchq zzb;
    private Long zzc;
    private String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchn(zzcha zzchaVar, zzchq zzchqVar, zzcie zzcieVar) {
        this.zza = zzchaVar;
        this.zzb = zzchqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrh
    public final /* bridge */ /* synthetic */ zzdrh zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrh
    public final /* bridge */ /* synthetic */ zzdrh zzb(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrh
    public final zzdri zzc() {
        zzhds.zzc(this.zzc, Long.class);
        zzhds.zzc(this.zzd, String.class);
        return new zzcho(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
