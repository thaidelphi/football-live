package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzadw implements zzacj {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzadp zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacm zzn;
    private zzadp zzo;
    private zzadp zzp;
    private zzadi zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i10 = zzeh.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzadw() {
        throw null;
    }

    public zzadw(int i10) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzace zzaceVar = new zzace();
        this.zzf = zzaceVar;
        this.zzp = zzaceVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: EOFException -> 0x008d, TryCatch #0 {EOFException -> 0x008d, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x0076, B:33:0x0077, B:34:0x008c), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[Catch: EOFException -> 0x008d, TryCatch #0 {EOFException -> 0x008d, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x0076, B:33:0x0077, B:34:0x008c), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(com.google.android.gms.internal.ads.zzack r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.zzj
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L8e
            r10.zzj()     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r9.zze     // Catch: java.io.EOFException -> L8d
            r10.zzh(r0, r1, r3)     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r9.zze     // Catch: java.io.EOFException -> L8d
            r0 = r0[r1]     // Catch: java.io.EOFException -> L8d
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L77
            int r0 = r0 >> 3
            boolean r4 = r9.zzg     // Catch: java.io.EOFException -> L8d
            r0 = r0 & 15
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = com.google.android.gms.internal.ads.zzadw.zzb     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
            goto L3f
        L3b:
            int[] r4 = com.google.android.gms.internal.ads.zzadw.zza     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
        L3f:
            r9.zzi = r0     // Catch: java.io.EOFException -> L8d
            r9.zzj = r0
            int r4 = r9.zzk
            if (r4 != r2) goto L4a
            r9.zzk = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L8e
            int r4 = r9.zzl
            int r4 = r4 + r3
            r9.zzl = r4
            goto L8e
        L52:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r4) goto L59
            r10 = r1
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r1.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r3 = "Illegal AMR "
            r1.append(r3)     // Catch: java.io.EOFException -> L8d
            r1.append(r10)     // Catch: java.io.EOFException -> L8d
            java.lang.String r10 = " frame type "
            r1.append(r10)     // Catch: java.io.EOFException -> L8d
            r1.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r10 = r1.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzaz r10 = com.google.android.gms.internal.ads.zzaz.zza(r10, r5)     // Catch: java.io.EOFException -> L8d
            throw r10     // Catch: java.io.EOFException -> L8d
        L77:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r10.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r1 = "Invalid padding bits for frame header "
            r10.append(r1)     // Catch: java.io.EOFException -> L8d
            r10.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r10 = r10.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzaz r10 = com.google.android.gms.internal.ads.zzaz.zza(r10, r5)     // Catch: java.io.EOFException -> L8d
            throw r10     // Catch: java.io.EOFException -> L8d
        L8d:
            return r2
        L8e:
            com.google.android.gms.internal.ads.zzadp r4 = r9.zzp
            int r10 = r4.zzf(r10, r0, r3)
            if (r10 != r2) goto L97
            return r2
        L97:
            int r0 = r9.zzj
            int r0 = r0 - r10
            r9.zzj = r0
            if (r0 <= 0) goto L9f
            return r1
        L9f:
            com.google.android.gms.internal.ads.zzadp r2 = r9.zzp
            long r3 = r9.zzh
            r5 = 1
            int r6 = r9.zzi
            r7 = 0
            r8 = 0
            r2.zzt(r3, r5, r6, r7, r8)
            long r2 = r9.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.zzh = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadw.zza(com.google.android.gms.internal.ads.zzack):int");
    }

    private static boolean zzg(zzack zzackVar, byte[] bArr) throws IOException {
        zzackVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzackVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzack zzackVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzackVar, bArr)) {
            this.zzg = false;
            zzackVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (zzg(zzackVar, bArr2)) {
            this.zzg = true;
            zzackVar.zzk(bArr2.length);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        zzcv.zzb(this.zzo);
        int i10 = zzeh.zza;
        if (zzackVar.zzf() == 0 && !zzh(zzackVar)) {
            throw zzaz.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzg;
            String str = true != z10 ? "audio/amr" : "audio/amr-wb";
            String str2 = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i11 = true != z10 ? 8000 : 16000;
            int i12 = z10 ? zzb[8] : zza[7];
            zzadp zzadpVar = this.zzo;
            zzx zzxVar = new zzx();
            zzxVar.zzE(str);
            zzxVar.zzad(str2);
            zzxVar.zzT(i12);
            zzxVar.zzB(1);
            zzxVar.zzae(i11);
            zzadpVar.zzm(zzxVar.zzaj());
        }
        int zza2 = zza(zzackVar);
        if (this.zzq == null) {
            zzadh zzadhVar = new zzadh(-9223372036854775807L, 0L);
            this.zzq = zzadhVar;
            this.zzn.zzP(zzadhVar);
        }
        return zza2 == -1 ? -1 : 0;
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
        this.zzn = zzacmVar;
        zzadp zzw = zzacmVar.zzw(0, 1);
        this.zzo = zzw;
        this.zzp = zzw;
        zzacmVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j11;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        return zzh(zzackVar);
    }
}
