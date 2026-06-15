package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaim implements zzacj {
    private zzacm zza;
    private zzaiu zzb;
    private boolean zzc;

    private final boolean zza(zzack zzackVar) throws IOException {
        zzaio zzaioVar = new zzaio();
        if (zzaioVar.zzb(zzackVar, true) && (zzaioVar.zza & 2) == 2) {
            int min = Math.min(zzaioVar.zze, 8);
            zzdx zzdxVar = new zzdx(min);
            zzackVar.zzh(zzdxVar.zzN(), 0, min);
            zzdxVar.zzL(0);
            if (zzdxVar.zzb() >= 5 && zzdxVar.zzm() == 127 && zzdxVar.zzu() == 1179402563) {
                this.zzb = new zzail();
            } else {
                zzdxVar.zzL(0);
                try {
                    if (zzadv.zzd(1, zzdxVar, true)) {
                        this.zzb = new zzaiw();
                    }
                } catch (zzaz unused) {
                }
                zzdxVar.zzL(0);
                if (zzaiq.zzd(zzdxVar)) {
                    this.zzb = new zzaiq();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        zzcv.zzb(this.zza);
        if (this.zzb == null) {
            if (zza(zzackVar)) {
                zzackVar.zzj();
            } else {
                throw zzaz.zza("Failed to determine bitstream type", null);
            }
        }
        if (!this.zzc) {
            zzadp zzw = this.zza.zzw(0, 1);
            this.zza.zzG();
            this.zzb.zzh(this.zza, zzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzackVar, zzadfVar);
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
        this.zza = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        zzaiu zzaiuVar = this.zzb;
        if (zzaiuVar != null) {
            zzaiuVar.zzj(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        try {
            return zza(zzackVar);
        } catch (zzaz unused) {
            return false;
        }
    }
}
