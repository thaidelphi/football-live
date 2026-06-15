package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzanm implements zzacj {
    private final zzdx zza = new zzdx(4);
    private final zzadk zzb = new zzadk(-1, -1, "image/webp");

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
        this.zza.zzI(4);
        zzaby zzabyVar = (zzaby) zzackVar;
        zzabyVar.zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() == 1380533830) {
            zzabyVar.zzl(4, false);
            this.zza.zzI(4);
            zzabyVar.zzm(this.zza.zzN(), 0, 4, false);
            if (this.zza.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
