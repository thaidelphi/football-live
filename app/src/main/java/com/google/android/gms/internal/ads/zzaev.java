package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaev implements zzacj {
    private final zzdx zza = new zzdx(4);
    private final zzadk zzb = new zzadk(-1, -1, "image/heif");

    private final boolean zza(zzack zzackVar, int i10) throws IOException {
        this.zza.zzI(4);
        ((zzaby) zzackVar).zzm(this.zza.zzN(), 0, 4, false);
        return this.zza.zzu() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        return this.zzb.zzb(zzackVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return zzfvv.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        this.zzb.zze(zzacmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzb.zzf(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        ((zzaby) zzackVar).zzl(4, false);
        return zza(zzackVar, 1718909296) && zza(zzackVar, 1751476579);
    }
}
