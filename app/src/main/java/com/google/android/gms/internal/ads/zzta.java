package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzta implements zzut {
    private final zzaco zza;
    private zzacj zzb;
    private zzack zzc;

    public zzta(zzaco zzacoVar) {
        this.zza = zzacoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final int zza(zzadf zzadfVar) throws IOException {
        zzacj zzacjVar = this.zzb;
        Objects.requireNonNull(zzacjVar);
        zzack zzackVar = this.zzc;
        Objects.requireNonNull(zzackVar);
        return zzacjVar.zzb(zzackVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final long zzb() {
        zzack zzackVar = this.zzc;
        if (zzackVar != null) {
            return zzackVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc() {
        zzacj zzacjVar = this.zzb;
        if (zzacjVar != null && (zzacjVar instanceof zzags)) {
            ((zzags) zzacjVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r6.zzf() != r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r6.zzf() != r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        r2 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzl r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzacm r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzaby r6 = new com.google.android.gms.internal.ads.zzaby
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzacj r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzaco r8 = r7.zza
            com.google.android.gms.internal.ads.zzacj[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzfvs r13 = com.google.android.gms.internal.ads.zzfvv.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L24
            r8 = r8[r14]
            r7.zzb = r8
            goto L7e
        L24:
            r1 = r14
        L25:
            if (r1 >= r10) goto L7a
            r2 = r8[r1]
            boolean r3 = r2.zzi(r6)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r3 == 0) goto L38
            r7.zzb = r2     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzcv.zzf(r0)
            r6.zzj()
            goto L7a
        L38:
            java.util.List r2 = r2.zzd()     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzacj r2 = r7.zzb
            if (r2 != 0) goto L70
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L6e
            goto L70
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzacj r9 = r7.zzb
            if (r9 != 0) goto L59
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5a
        L59:
            r14 = r0
        L5a:
            com.google.android.gms.internal.ads.zzcv.zzf(r14)
            r6.zzj()
            throw r8
        L61:
            com.google.android.gms.internal.ads.zzacj r2 = r7.zzb
            if (r2 != 0) goto L70
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L6e
            goto L70
        L6e:
            r2 = r14
            goto L71
        L70:
            r2 = r0
        L71:
            com.google.android.gms.internal.ads.zzcv.zzf(r2)
            r6.zzj()
            int r1 = r1 + 1
            goto L25
        L7a:
            com.google.android.gms.internal.ads.zzacj r10 = r7.zzb
            if (r10 == 0) goto L84
        L7e:
            com.google.android.gms.internal.ads.zzacj r8 = r7.zzb
            r8.zze(r15)
            return
        L84:
            com.google.android.gms.internal.ads.zzwe r10 = new com.google.android.gms.internal.ads.zzwe
            com.google.android.gms.internal.ads.zzfvv r8 = com.google.android.gms.internal.ads.zzfvv.zzm(r8)
            com.google.android.gms.internal.ads.zzsz r11 = new com.google.android.gms.internal.ads.zzsz
            r11.<init>()
            java.util.List r8 = com.google.android.gms.internal.ads.zzfwl.zzb(r8, r11)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ", "
            com.google.android.gms.internal.ads.zzfsn.zzc(r11, r8, r12)
            java.lang.String r8 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            com.google.android.gms.internal.ads.zzfvv r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzta.zzd(com.google.android.gms.internal.ads.zzl, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzacm):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzf(long j10, long j11) {
        zzacj zzacjVar = this.zzb;
        Objects.requireNonNull(zzacjVar);
        zzacjVar.zzf(j10, j11);
    }
}
