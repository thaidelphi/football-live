package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzvj extends zzsx implements zzva {
    private final zzfq zza;
    private final zzqy zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzgr zzh;
    private zzap zzi;
    private final zzvg zzj;
    private final zzyi zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzvj(zzap zzapVar, zzfq zzfqVar, zzvg zzvgVar, zzqy zzqyVar, zzyi zzyiVar, int i10, int i11, zzz zzzVar, zzftn zzftnVar, zzvi zzviVar) {
        this.zzi = zzapVar;
        this.zza = zzfqVar;
        this.zzj = zzvgVar;
        this.zzb = zzqyVar;
        this.zzk = zzyiVar;
        this.zzc = i10;
    }

    private final void zzw() {
        long j10 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzap zzJ = zzJ();
        zzvw zzvwVar = new zzvw(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzJ, z11 ? zzJ.zzc : null);
        zzo(this.zzd ? new zzvf(this, zzvwVar) : zzvwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzG(zztw zztwVar) {
        ((zzve) zztwVar).zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final zztw zzI(zzty zztyVar, zzye zzyeVar, long j10) {
        zzfr zza = this.zza.zza();
        zzgr zzgrVar = this.zzh;
        if (zzgrVar != null) {
            zza.zzf(zzgrVar);
        }
        zzak zzakVar = zzJ().zzb;
        Objects.requireNonNull(zzakVar);
        Uri uri = zzakVar.zza;
        zzvg zzvgVar = this.zzj;
        zzb();
        return new zzve(uri, zza, new zzta(zzvgVar.zza), this.zzb, zzc(zztyVar), this.zzk, zze(zztyVar), this, zzyeVar, null, this.zzc, 0, null, zzeh.zzs(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final synchronized zzap zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zze;
        }
        if (!this.zzd && this.zze == j10 && this.zzf == z10 && this.zzg == z11) {
            return;
        }
        this.zze = j10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    protected final void zzn(zzgr zzgrVar) {
        this.zzh = zzgrVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzua
    public final synchronized void zzt(zzap zzapVar) {
        this.zzi = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzz() {
    }
}
