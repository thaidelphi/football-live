package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafc implements zzacm {
    private final long zzb;
    private final zzacm zzc;

    public zzafc(long j10, zzacm zzacmVar) {
        this.zzb = j10;
        this.zzc = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzG() {
        this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzP(zzadi zzadiVar) {
        this.zzc.zzP(new zzafb(this, zzadiVar, zzadiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzadp zzw(int i10, int i11) {
        return this.zzc.zzw(i10, i11);
    }
}
