package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamw implements zzacj {
    private final int zza;
    private final List zzb;
    private final zzdx zzc;
    private final SparseIntArray zzd;
    private final zzamz zze;
    private final zzaje zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzamt zzj;
    private zzams zzk;
    private zzacm zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzamw() {
        this(1, 1, zzaje.zza, new zzee(0L), new zzalj(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
        if (r1 == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzack r19, com.google.android.gms.internal.ads.zzadf r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamw.zzb(com.google.android.gms.internal.ads.zzack, com.google.android.gms.internal.ads.zzadf):int");
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
        if (this.zza == 0) {
            zzacmVar = new zzajh(zzacmVar, this.zzf);
        }
        this.zzl = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        zzams zzamsVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzee zzeeVar = (zzee) this.zzb.get(i10);
            if (zzeeVar.zzf() != -9223372036854775807L) {
                long zzd = zzeeVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j11) {
                        }
                    }
                }
            }
            zzeeVar.zzi(j11);
        }
        if (j11 != 0 && (zzamsVar = this.zzk) != null) {
            zzamsVar.zzd(j11);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzg.size(); i11++) {
            ((zzanb) this.zzg.valueAt(i11)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzi(com.google.android.gms.internal.ads.zzack r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzaby r7 = (com.google.android.gms.internal.ads.zzaby) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzm(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamw.zzi(com.google.android.gms.internal.ads.zzack):boolean");
    }

    public zzamw(int i10, int i11, zzaje zzajeVar, zzee zzeeVar, zzamz zzamzVar, int i12) {
        this.zze = zzamzVar;
        this.zza = i11;
        this.zzf = zzajeVar;
        this.zzb = Collections.singletonList(zzeeVar);
        this.zzc = new zzdx(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzamt(112800);
        this.zzl = zzacm.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzamzVar.zza();
        int size = zza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(zza.keyAt(i13), (zzanb) zza.valueAt(i13));
        }
        this.zzg.put(0, new zzamo(new zzamu(this)));
    }
}
