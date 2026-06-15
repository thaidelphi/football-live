package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaag {
    private final zzaaf zza;
    private final zzaak zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzcw zzk = zzcw.zza;

    public zzaag(Context context, zzaaf zzaafVar, long j10) {
        this.zza = zzaafVar;
        this.zzb = new zzaak(context);
    }

    private final void zzq(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r15 > 100000) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r20 >= r24) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r17.zzc != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.zzaae r27) throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaag.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaae):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z10) {
        this.zzd = z10 ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzeh.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i10) {
        this.zzb.zzj(i10);
    }

    public final void zzk(zzcw zzcwVar) {
        this.zzk = zzcwVar;
    }

    public final void zzl(float f10) {
        this.zzb.zzc(f10);
    }

    public final void zzm(Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f10) {
        zzcv.zzd(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }

    public final boolean zzo(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            if (this.zzk.zzb() >= this.zzh) {
                z11 = false;
            }
            return z11;
        }
        this.zzh = -9223372036854775807L;
        return z11;
    }

    public final boolean zzp() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzeh.zzs(this.zzk.zzb());
        return i10 != 3;
    }
}
