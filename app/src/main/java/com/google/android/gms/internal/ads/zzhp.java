package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhp implements zzjx {
    private final zzye zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzhp() {
        zzye zzyeVar = new zzye(true, 65536);
        zzl(1000, 0, "bufferForPlaybackMs", "0");
        zzl(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzl(b9.b.f16554d, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzl(b9.b.f16554d, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(b9.b.f16554d, b9.b.f16554d, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzyeVar;
        this.zzb = zzeh.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzc = zzeh.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzd = zzeh.zzs(1000L);
        this.zze = zzeh.zzs(2000L);
        this.zzf = zzeh.zzs(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzl(int i10, int i11, String str, String str2) {
        zzcv.zze(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void zzm(zznz zznzVar) {
        if (this.zzg.remove(zznzVar) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    final int zza() {
        int i10 = 0;
        for (zzhn zzhnVar : this.zzg.values()) {
            i10 += zzhnVar.zzb;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final long zzb(zznz zznzVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzc(zznz zznzVar) {
        long id = Thread.currentThread().getId();
        long j10 = this.zzh;
        boolean z10 = true;
        if (j10 != -1 && j10 != id) {
            z10 = false;
        }
        zzcv.zzg(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        if (!this.zzg.containsKey(zznzVar)) {
            this.zzg.put(zznzVar, new zzhn(null));
        }
        zzhn zzhnVar = (zzhn) this.zzg.get(zznzVar);
        Objects.requireNonNull(zzhnVar);
        zzhnVar.zzb = 13107200;
        zzhnVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzd(zznz zznzVar) {
        zzm(zznzVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zze(zznz zznzVar) {
        zzm(zznzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzf(zzjw zzjwVar, zzwd zzwdVar, zzxp[] zzxpVarArr) {
        zzhn zzhnVar = (zzhn) this.zzg.get(zzjwVar.zza);
        Objects.requireNonNull(zzhnVar);
        int length = zzxpVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 13107200;
            if (i10 >= length) {
                zzhnVar.zzb = Math.max(13107200, i11);
                zzn();
                return;
            }
            zzxp zzxpVar = zzxpVarArr[i10];
            if (zzxpVar != null) {
                switch (zzxpVar.zzg().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i12 = 144310272;
                        break;
                    case 2:
                        i12 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i12 = 131072;
                        break;
                }
                i11 += i12;
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzg(zznz zznzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzh(zzjw zzjwVar) {
        zzhn zzhnVar = (zzhn) this.zzg.get(zzjwVar.zza);
        Objects.requireNonNull(zzhnVar);
        int zza = this.zza.zza();
        int zza2 = zza();
        long j10 = this.zzb;
        float f10 = zzjwVar.zzc;
        if (f10 > 1.0f) {
            j10 = Math.min(zzeh.zzq(j10, f10), this.zzc);
        }
        long j11 = zzjwVar.zzb;
        if (j11 < Math.max(j10, 500000L)) {
            boolean z10 = zza < zza2;
            zzhnVar.zza = z10;
            if (!z10 && j11 < 500000) {
                zzdn.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzc || zza >= zza2) {
            zzhnVar.zza = false;
        }
        return zzhnVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzi(zzbn zzbnVar, zzty zztyVar, long j10) {
        for (zzhn zzhnVar : this.zzg.values()) {
            if (zzhnVar.zza) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final boolean zzj(zzjw zzjwVar) {
        boolean z10 = zzjwVar.zzd;
        long zzr = zzeh.zzr(zzjwVar.zzb, zzjwVar.zzc);
        long j10 = z10 ? this.zze : this.zzd;
        long j11 = zzjwVar.zze;
        if (j11 != -9223372036854775807L) {
            j10 = Math.min(j11 / 2, j10);
        }
        return j10 <= 0 || zzr >= j10 || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final zzye zzk() {
        return this.zza;
    }
}
