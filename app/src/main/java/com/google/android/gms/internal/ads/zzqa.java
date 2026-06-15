package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqa implements zzpi {
    final /* synthetic */ zzqf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqa(zzqf zzqfVar, zzqe zzqeVar) {
        this.zza = zzqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zza(long j10) {
        zzdn.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzb(long j10) {
        zzpc zzpcVar;
        zzpc zzpcVar2;
        zzox zzoxVar;
        zzqf zzqfVar = this.zza;
        zzpcVar = zzqfVar.zzo;
        if (zzpcVar != null) {
            zzpcVar2 = zzqfVar.zzo;
            zzoxVar = ((zzqj) zzpcVar2).zza.zzc;
            zzoxVar.zzv(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzc(long j10, long j11, long j12, long j13) {
        long zzL;
        long zzM;
        zzqf zzqfVar = this.zza;
        zzL = zzqfVar.zzL();
        zzM = zzqfVar.zzM();
        zzdn.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + zzL + ", " + zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zzd(long j10, long j11, long j12, long j13) {
        long zzL;
        long zzM;
        zzqf zzqfVar = this.zza;
        zzL = zzqfVar.zzL();
        zzM = zzqfVar.zzM();
        zzdn.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + zzL + ", " + zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zze(int i10, long j10) {
        zzpc zzpcVar;
        long j11;
        zzpc zzpcVar2;
        zzox zzoxVar;
        zzqf zzqfVar = this.zza;
        zzpcVar = zzqfVar.zzo;
        if (zzpcVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j11 = zzqfVar.zzU;
            zzpcVar2 = this.zza.zzo;
            zzoxVar = ((zzqj) zzpcVar2).zza.zzc;
            zzoxVar.zzx(i10, j10, elapsedRealtime - j11);
        }
    }
}
