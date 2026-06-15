package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagh {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzago zzc = new zzago();
    private zzagi zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzack zzackVar, int i10) throws IOException {
        zzackVar.zzi(this.zza, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.zza[i11] & 255);
        }
        return j10;
    }

    public final void zza(zzagi zzagiVar) {
        this.zzd = zzagiVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r0 == 1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzack r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagh.zzc(com.google.android.gms.internal.ads.zzack):boolean");
    }
}
