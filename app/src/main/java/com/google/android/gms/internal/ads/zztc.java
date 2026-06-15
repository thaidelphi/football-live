package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zztc implements zztw, zztv {
    public final zztw zza;
    long zzb;
    private zztv zzc;
    private zztb[] zzd = new zztb[0];
    private long zze = 0;

    public zztc(zztw zztwVar, boolean z10, long j10, long j11) {
        this.zza = zztwVar;
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zza(long j10, zzlg zzlgVar) {
        if (j10 != 0) {
            long j11 = zzlgVar.zzc;
            int i10 = zzeh.zza;
            long max = Math.max(0L, Math.min(j11, j10));
            long j12 = zzlgVar.zzd;
            long j13 = this.zzb;
            long max2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
            if (max != zzlgVar.zzc || max2 != zzlgVar.zzd) {
                zzlgVar = new zzlg(max, max2);
            }
            return this.zza.zza(j10, zzlgVar);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || zzb < j10) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || zzc < j10) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzd() {
        if (zzq()) {
            long j10 = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j10;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        zzcv.zzf(zzd2 >= 0);
        long j11 = this.zzb;
        if (j11 == Long.MIN_VALUE || zzd2 <= j11) {
            z10 = true;
        }
        zzcv.zzf(z10);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zztw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zztb[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zztw r0 = r7.zza
            long r0 = r0.zze(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.zzb
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.zzcv.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.zze(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r1 > r3) goto L35;
     */
    @Override // com.google.android.gms.internal.ads.zztw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(com.google.android.gms.internal.ads.zzxp[] r17, boolean[] r18, com.google.android.gms.internal.ads.zzvs[] r19, boolean[] r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r8 = r17
            r9 = r19
            int r1 = r9.length
            com.google.android.gms.internal.ads.zztb[] r2 = new com.google.android.gms.internal.ads.zztb[r1]
            r0.zzd = r2
            com.google.android.gms.internal.ads.zzvs[] r10 = new com.google.android.gms.internal.ads.zzvs[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            com.google.android.gms.internal.ads.zztb[] r2 = r0.zzd
            r3 = r9[r1]
            com.google.android.gms.internal.ads.zztb r3 = (com.google.android.gms.internal.ads.zztb) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.ads.zzvs r12 = r3.zza
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            com.google.android.gms.internal.ads.zztw r1 = r0.zza
            r2 = r17
            r3 = r18
            r4 = r10
            r5 = r20
            r6 = r21
            long r1 = r1.zzf(r2, r3, r4, r5, r6)
            boolean r3 = r16.zzq()
            r4 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L5f
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L5f
            int r3 = r8.length
            r13 = r11
        L46:
            if (r13 >= r3) goto L5f
            r14 = r8[r13]
            if (r14 == 0) goto L5c
            com.google.android.gms.internal.ads.zzz r14 = r14.zzf()
            java.lang.String r15 = r14.zzo
            java.lang.String r14 = r14.zzk
            boolean r14 = com.google.android.gms.internal.ads.zzay.zzf(r15, r14)
            if (r14 != 0) goto L5c
            r6 = r1
            goto L5f
        L5c:
            int r13 = r13 + 1
            goto L46
        L5f:
            r0.zze = r6
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            r6 = 1
            if (r3 == 0) goto L78
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L77
            long r3 = r0.zzb
            r7 = -9223372036854775808
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L78
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L77
            goto L78
        L77:
            r6 = r11
        L78:
            com.google.android.gms.internal.ads.zzcv.zzf(r6)
        L7b:
            int r3 = r9.length
            if (r11 >= r3) goto La1
            r3 = r10[r11]
            if (r3 != 0) goto L87
            com.google.android.gms.internal.ads.zztb[] r3 = r0.zzd
            r3[r11] = r12
            goto L98
        L87:
            com.google.android.gms.internal.ads.zztb[] r4 = r0.zzd
            r5 = r4[r11]
            if (r5 == 0) goto L91
            com.google.android.gms.internal.ads.zzvs r5 = r5.zza
            if (r5 == r3) goto L98
        L91:
            com.google.android.gms.internal.ads.zztb r5 = new com.google.android.gms.internal.ads.zztb
            r5.<init>(r0, r3)
            r4[r11] = r5
        L98:
            com.google.android.gms.internal.ads.zztb[] r3 = r0.zzd
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L7b
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.zzf(com.google.android.gms.internal.ads.zzxp[], boolean[], com.google.android.gms.internal.ads.zzvs[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final zzwd zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    public final /* bridge */ /* synthetic */ void zzh(zzvu zzvuVar) {
        zztw zztwVar = (zztw) zzvuVar;
        zztv zztvVar = this.zzc;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzi(long j10, boolean z10) {
        this.zza.zzi(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzj(zztw zztwVar) {
        zztv zztvVar = this.zzc;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzl(zztv zztvVar, long j10) {
        this.zzc = zztvVar;
        this.zza.zzl(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
        this.zza.zzm(j10);
    }

    public final void zzn(long j10, long j11) {
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        return this.zza.zzo(zzkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        return this.zza.zzp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
