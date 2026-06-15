package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjt implements Handler.Callback, zztv, zzxu, zzkq, zzhq, zzku {
    private static final long zza = zzeh.zzv(10000);
    private zzjq zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzJ;
    private int zzK;
    private zzjr zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private zzhs zzQ;
    private zzic zzS;
    private boolean zzU;
    private final zzio zzV;
    private final zzhm zzW;
    private final zzlf[] zzb;
    private final zzld[] zzc;
    private final boolean[] zzd;
    private final zzxv zze;
    private final zzxw zzf;
    private final zzjx zzg;
    private final zzyd zzh;
    private final zzdg zzi;
    private final zzkt zzj;
    private final Looper zzk;
    private final zzbm zzl;
    private final zzbl zzm;
    private final long zzn;
    private final zzhr zzo;
    private final ArrayList zzp;
    private final zzcw zzq;
    private final zzkf zzr;
    private final zzkr zzs;
    private final long zzt;
    private final zznz zzu;
    private final zzlm zzv;
    private final zzdg zzw;
    private final boolean zzx;
    private zzlg zzy;
    private zzks zzz;
    private long zzT = -9223372036854775807L;
    private int zzH = 0;
    private boolean zzI = false;
    private boolean zzC = false;
    private long zzR = -9223372036854775807L;
    private long zzF = -9223372036854775807L;

    public zzjt(zzla[] zzlaVarArr, zzla[] zzlaVarArr2, zzxv zzxvVar, zzxw zzxwVar, zzjx zzjxVar, zzyd zzydVar, int i10, boolean z10, zzlm zzlmVar, zzlg zzlgVar, zzhm zzhmVar, long j10, boolean z11, boolean z12, Looper looper, zzcw zzcwVar, zzio zzioVar, zznz zznzVar, zzkt zzktVar, zzic zzicVar) {
        this.zzV = zzioVar;
        this.zze = zzxvVar;
        this.zzf = zzxwVar;
        this.zzg = zzjxVar;
        this.zzh = zzydVar;
        this.zzy = zzlgVar;
        this.zzW = zzhmVar;
        this.zzt = j10;
        this.zzq = zzcwVar;
        this.zzu = zznzVar;
        this.zzS = zzicVar;
        this.zzv = zzlmVar;
        this.zzn = zzjxVar.zzb(zznzVar);
        zzjxVar.zzg(zznzVar);
        zzbn zzbnVar = zzbn.zza;
        zzks zzg = zzks.zzg(zzxwVar);
        this.zzz = zzg;
        this.zzA = new zzjq(zzg);
        int length = zzlaVarArr.length;
        this.zzc = new zzld[2];
        this.zzd = new boolean[2];
        zzlc zze = zzxvVar.zze();
        this.zzb = new zzlf[2];
        boolean z13 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            zzlaVarArr[i11].zzv(i11, zznzVar, zzcwVar);
            this.zzc[i11] = zzlaVarArr[i11].zzm();
            this.zzc[i11].zzL(zze);
            zzla zzlaVar = zzlaVarArr2[i11];
            if (zzlaVar != null) {
                zzlaVar.zzv(i11 + 2, zznzVar, zzcwVar);
                z13 = true;
            }
            this.zzb[i11] = new zzlf(zzlaVarArr[i11], zzlaVarArr2[i11], i11);
        }
        this.zzx = z13;
        this.zzo = new zzhr(this, zzcwVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbm();
        this.zzm = new zzbl();
        zzxvVar.zzr(this, zzydVar);
        this.zzP = true;
        zzdg zzd = zzcwVar.zzd(looper, null);
        this.zzw = zzd;
        this.zzr = new zzkf(zzlmVar, zzd, new zzjh(this), zzicVar);
        this.zzs = new zzkr(this, zzlmVar, zzd, zznzVar);
        zzkt zzktVar2 = new zzkt(null);
        this.zzj = zzktVar2;
        Looper zza2 = zzktVar2.zza();
        this.zzk = zza2;
        this.zzi = zzcwVar.zzd(zza2, this);
    }

    private static Pair zzA(zzbn zzbnVar, zzjr zzjrVar, boolean z10, int i10, boolean z11, zzbm zzbmVar, zzbl zzblVar) {
        Pair zzl;
        zzbn zzbnVar2 = zzjrVar.zza;
        if (zzbnVar.zzo()) {
            return null;
        }
        zzbn zzbnVar3 = true == zzbnVar2.zzo() ? zzbnVar : zzbnVar2;
        try {
            zzl = zzbnVar3.zzl(zzbmVar, zzblVar, zzjrVar.zzb, zzjrVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbnVar.equals(zzbnVar3)) {
            return zzl;
        }
        if (zzbnVar.zza(zzl.first) != -1) {
            return (zzbnVar3.zzn(zzl.first, zzblVar).zzf && zzbnVar3.zze(zzblVar.zzc, zzbmVar, 0L).zzn == zzbnVar3.zza(zzl.first)) ? zzbnVar.zzl(zzbmVar, zzblVar, zzbnVar.zzn(zzl.first, zzblVar).zzc, zzjrVar.zzc) : zzl;
        }
        int zzb = zzb(zzbmVar, zzblVar, i10, z11, zzl.first, zzbnVar3, zzbnVar);
        if (zzb != -1) {
            return zzbnVar.zzl(zzbmVar, zzblVar, zzb, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzks zzB(com.google.android.gms.internal.ads.zzty r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zzB(com.google.android.gms.internal.ads.zzty, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzks");
    }

    private final void zzC() {
        if (this.zzx && zzam()) {
            zzlf[] zzlfVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzlf zzlfVar = zzlfVarArr[i10];
                int zza2 = zzlfVar.zza();
                zzlfVar.zzf(this.zzo);
                this.zzK -= zza2 - zzlfVar.zza();
            }
            this.zzT = -9223372036854775807L;
        }
    }

    private final void zzD() throws zzhs {
        int i10 = 0;
        while (true) {
            zzlf[] zzlfVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzT = -9223372036854775807L;
                return;
            }
            int zza2 = zzlfVarArr[i10].zza();
            this.zzb[i10].zze(this.zzo);
            zzR(i10, false);
            this.zzK -= zza2;
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x052e, code lost:
        if (r1 != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
        if (r1.zzm() != r1.zzn()) goto L309;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a8 A[LOOP:1: B:146:0x02a3->B:148:0x02a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0396 A[LOOP:4: B:191:0x0394->B:192:0x0396, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0616 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02cc A[EDGE_INSN: B:351:0x02cc->B:149:0x02cc ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzE() throws com.google.android.gms.internal.ads.zzhs, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zzE():void");
    }

    private final void zzF(zzkc zzkcVar, int i10, boolean z10, long j10) throws zzhs {
        zzlf zzlfVar = this.zzb[i10];
        if (zzlfVar.zzG()) {
            return;
        }
        boolean z11 = zzkcVar == this.zzr.zzj();
        zzxw zzi = zzkcVar.zzi();
        zzle zzleVar = zzi.zzb[i10];
        zzxp zzxpVar = zzi.zzc[i10];
        boolean z12 = zzap() && this.zzz.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzK++;
        zzlfVar.zzg(zzleVar, zzxpVar, zzkcVar.zzc[i10], this.zzM, z13, z11, j10, zzkcVar.zze(), zzkcVar.zzg.zza, this.zzo);
        zzlfVar.zzi(11, new zzjm(this), zzkcVar);
        if (z12 && z11) {
            zzlfVar.zzw();
        }
    }

    private final void zzG() throws zzhs {
        zzH(new boolean[2], this.zzr.zzn().zzf());
    }

    private final void zzH(boolean[] zArr, long j10) throws zzhs {
        zzkc zzn = this.zzr.zzn();
        zzxw zzi = zzn.zzi();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zzi.zzb(i10)) {
                this.zzb[i10].zzp();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzi.zzb(i11) && !this.zzb[i11].zzF(zzn)) {
                zzF(zzn, i11, zArr[i11], j10);
            }
        }
    }

    private final void zzI(IOException iOException, int i10) {
        zzkf zzkfVar = this.zzr;
        zzhs zzc = zzhs.zzc(iOException, i10);
        zzkc zzj = zzkfVar.zzj();
        if (zzj != null) {
            zzc = zzc.zza(zzj.zzg.zza);
        }
        zzdn.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzae(false, false);
        this.zzz = this.zzz.zzd(zzc);
    }

    private final void zzJ(boolean z10) {
        zzty zztyVar;
        long zzc;
        zzkc zzi = this.zzr.zzi();
        if (zzi == null) {
            zztyVar = this.zzz.zzb;
        } else {
            zztyVar = zzi.zzg.zza;
        }
        boolean z11 = !this.zzz.zzk.equals(zztyVar);
        if (z11) {
            this.zzz = this.zzz.zza(zztyVar);
        }
        zzks zzksVar = this.zzz;
        if (zzi == null) {
            zzc = zzksVar.zzs;
        } else {
            zzc = zzi.zzc();
        }
        zzksVar.zzq = zzc;
        this.zzz.zzr = zzv();
        if ((z11 || z10) && zzi != null && zzi.zze) {
            zzah(zzi.zzg.zza, zzi.zzh(), zzi.zzi());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzK(com.google.android.gms.internal.ads.zzbn r29, boolean r30) throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zzK(com.google.android.gms.internal.ads.zzbn, boolean):void");
    }

    private final void zzL(zzbb zzbbVar, boolean z10) throws zzhs {
        zzM(zzbbVar, zzbbVar.zzb, true, z10);
    }

    private final void zzM(zzbb zzbbVar, float f10, boolean z10, boolean z11) throws zzhs {
        int i10;
        zzjt zzjtVar = this;
        if (z10) {
            if (z11) {
                zzjtVar.zzA.zza(1);
            }
            zzks zzksVar = zzjtVar.zzz;
            zzjtVar = this;
            zzjtVar.zzz = new zzks(zzksVar.zza, zzksVar.zzb, zzksVar.zzc, zzksVar.zzd, zzksVar.zze, zzksVar.zzf, zzksVar.zzg, zzksVar.zzh, zzksVar.zzi, zzksVar.zzj, zzksVar.zzk, zzksVar.zzl, zzksVar.zzm, zzksVar.zzn, zzbbVar, zzksVar.zzq, zzksVar.zzr, zzksVar.zzs, zzksVar.zzt, false);
        }
        float f11 = zzbbVar.zzb;
        zzkc zzj = zzjtVar.zzr.zzj();
        while (true) {
            i10 = 0;
            if (zzj == null) {
                break;
            }
            zzxp[] zzxpVarArr = zzj.zzi().zzc;
            int length = zzxpVarArr.length;
            while (i10 < length) {
                zzxp zzxpVar = zzxpVarArr[i10];
                i10++;
            }
            zzj = zzj.zzg();
        }
        zzlf[] zzlfVarArr = zzjtVar.zzb;
        while (i10 < 2) {
            zzlfVarArr[i10].zzt(f10, zzbbVar.zzb);
            i10++;
        }
    }

    private final void zzN() {
        long zze;
        long j10;
        boolean z10;
        if (zzar(this.zzr.zzi())) {
            zzkc zzi = this.zzr.zzi();
            long zzw = zzw(zzi.zzd());
            if (zzi == this.zzr.zzj()) {
                zze = this.zzM;
                j10 = zzi.zze();
            } else {
                zze = this.zzM - zzi.zze();
                j10 = zzi.zzg.zzb;
            }
            zzjw zzjwVar = new zzjw(this.zzu, this.zzz.zza, zzi.zzg.zza, zze - j10, zzw, this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzaq(this.zzz.zza, zzi.zzg.zza) ? this.zzW.zzb() : -9223372036854775807L);
            boolean zzh = this.zzg.zzh(zzjwVar);
            zzkc zzj = this.zzr.zzj();
            if (zzh || !zzj.zze || zzw >= 500000 || this.zzn <= 0) {
                z10 = zzh;
            } else {
                zzj.zza.zzi(this.zzz.zzs, false);
                z10 = this.zzg.zzh(zzjwVar);
            }
        } else {
            z10 = false;
        }
        this.zzG = z10;
        if (z10) {
            zzkc zzi2 = this.zzr.zzi();
            Objects.requireNonNull(zzi2);
            zzjy zzjyVar = new zzjy();
            zzjyVar.zze(this.zzM - zzi2.zze());
            zzjyVar.zzf(this.zzo.zzc().zzb);
            zzjyVar.zzd(this.zzF);
            zzi2.zzk(new zzka(zzjyVar, null));
        }
        zzag();
    }

    private final void zzO() {
        this.zzr.zzt();
        zzkc zzl = this.zzr.zzl();
        if (zzl != null) {
            if ((!zzl.zzd || zzl.zze) && !zzl.zza.zzp()) {
                if (this.zzg.zzi(this.zzz.zza, zzl.zzg.zza, zzl.zze ? zzl.zza.zzb() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzm(this, zzl.zzg.zzb);
                        return;
                    }
                    zzjy zzjyVar = new zzjy();
                    zzjyVar.zze(this.zzM - zzl.zze());
                    zzjyVar.zzf(this.zzo.zzc().zzb);
                    zzjyVar.zzd(this.zzF);
                    zzl.zzk(new zzka(zzjyVar, null));
                }
            }
        }
    }

    private final void zzP() {
        boolean z10;
        this.zzA.zzb(this.zzz);
        z10 = this.zzA.zze;
        if (z10) {
            zzio zzioVar = this.zzV;
            zzioVar.zza.zzX(this.zzA);
            this.zzA = new zzjq(this.zzz);
        }
    }

    private final void zzQ(int i10) throws IOException, zzhs {
        zzlf zzlfVar = this.zzb[i10];
        try {
            zzkc zzj = this.zzr.zzj();
            Objects.requireNonNull(zzj);
            zzlfVar.zzm(zzj);
        } catch (IOException | RuntimeException e8) {
            zzlfVar.zzb();
            throw e8;
        }
    }

    private final void zzR(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzw.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjj
                @Override // java.lang.Runnable
                public final void run() {
                    r0.zzv.zzI(r1, zzjt.this.zzb[i10].zzb(), z10);
                }
            });
        }
    }

    private final void zzS() throws zzhs {
        int i10;
        boolean z10;
        float f10 = this.zzo.zzc().zzb;
        zzkf zzkfVar = this.zzr;
        zzkc zzj = zzkfVar.zzj();
        zzkc zzn = zzkfVar.zzn();
        zzxw zzxwVar = null;
        boolean z11 = true;
        while (zzj != null && zzj.zze) {
            zzks zzksVar = this.zzz;
            zzxw zzj2 = zzj.zzj(f10, zzksVar.zza, zzksVar.zzl);
            zzxw zzxwVar2 = zzj == this.zzr.zzj() ? zzj2 : zzxwVar;
            zzxw zzi = zzj.zzi();
            boolean z12 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj2.zzc.length) {
                    for (int i11 = 0; i11 < zzj2.zzc.length; i11++) {
                        if (zzj2.zza(zzi, i11)) {
                        }
                    }
                    if (zzj != zzn) {
                        z12 = true;
                    }
                    z11 &= z12;
                    zzj = zzj.zzg();
                    zzxwVar = zzxwVar2;
                }
            }
            if (z11) {
                zzkf zzkfVar2 = this.zzr;
                zzkc zzj3 = zzkfVar2.zzj();
                int zza2 = zzkfVar2.zza(zzj3) & 1;
                boolean[] zArr = new boolean[2];
                Objects.requireNonNull(zzxwVar2);
                long zzb = zzj3.zzb(zzxwVar2, this.zzz.zzs, 1 == zza2, zArr);
                zzks zzksVar2 = this.zzz;
                boolean z13 = (zzksVar2.zze == 4 || zzb == zzksVar2.zzs) ? false : true;
                zzks zzksVar3 = this.zzz;
                i10 = 2;
                this.zzz = zzB(zzksVar3.zzb, zzb, zzksVar3.zzc, zzksVar3.zzd, z13, 5);
                if (z13) {
                    zzW(zzb);
                }
                zzC();
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzlf[] zzlfVarArr = this.zzb;
                    if (i12 >= 2) {
                        break;
                    }
                    int zza3 = zzlfVarArr[i12].zza();
                    zArr2[i12] = this.zzb[i12].zzG();
                    this.zzb[i12].zzj(zzj3.zzc[i12], this.zzo, this.zzM, zArr[i12]);
                    if (zza3 - this.zzb[i12].zza() > 0) {
                        zzR(i12, false);
                    }
                    this.zzK -= zza3 - this.zzb[i12].zza();
                    i12++;
                }
                zzH(zArr2, this.zzM);
                z10 = true;
                zzj3.zzh = true;
            } else {
                i10 = 2;
                this.zzr.zza(zzj);
                if (zzj.zze) {
                    long max = Math.max(zzj.zzg.zzb, this.zzM - zzj.zze());
                    if (this.zzx && zzam() && this.zzr.zzm() == zzj) {
                        zzC();
                    }
                    zzj.zza(zzj2, max, false);
                }
                z10 = true;
            }
            zzJ(z10);
            if (this.zzz.zze != 4) {
                zzN();
                zzai();
                this.zzi.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzT() throws zzhs {
        zzS();
        zzZ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzU(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zzU(boolean, boolean, boolean, boolean):void");
    }

    private final void zzV() {
        zzkc zzj = this.zzr.zzj();
        boolean z10 = false;
        if (zzj != null && zzj.zzg.zzi && this.zzC) {
            z10 = true;
        }
        this.zzD = z10;
    }

    private final void zzW(long j10) throws zzhs {
        zzxp[] zzxpVarArr;
        zzkc zzj = this.zzr.zzj();
        long zze = j10 + (zzj == null ? 1000000000000L : zzj.zze());
        this.zzM = zze;
        this.zzo.zzf(zze);
        zzlf[] zzlfVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzlfVarArr[i10].zzq(zzj, this.zzM);
        }
        for (zzkc zzj2 = this.zzr.zzj(); zzj2 != null; zzj2 = zzj2.zzg()) {
            for (zzxp zzxpVar : zzj2.zzi().zzc) {
            }
        }
    }

    private final void zzX(zzbn zzbnVar, zzbn zzbnVar2) {
        if (zzbnVar.zzo() && zzbnVar2.zzo()) {
            return;
        }
        int size = this.zzp.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzp);
            return;
        }
        Object obj = ((zzjp) this.zzp.get(size)).zzb;
        int i10 = zzeh.zza;
        throw null;
    }

    private final void zzY(long j10) {
        this.zzi.zzj(2, j10 + ((this.zzz.zze != 3 || zzap()) ? zza : 1000L));
    }

    private final void zzZ(boolean z10) throws zzhs {
        zzty zztyVar = this.zzr.zzj().zzg.zza;
        long zzy = zzy(zztyVar, this.zzz.zzs, true, false);
        if (zzy != this.zzz.zzs) {
            zzks zzksVar = this.zzz;
            this.zzz = zzB(zztyVar, zzy, zzksVar.zzc, zzksVar.zzd, z10, 5);
        }
    }

    private final void zzaa(zzbb zzbbVar) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbbVar);
    }

    private final void zzab(boolean z10, int i10, boolean z11, int i11) throws zzhs {
        zzxp[] zzxpVarArr;
        this.zzA.zza(z11 ? 1 : 0);
        this.zzz = this.zzz.zzc(z10, i11, i10);
        zzak(false, false);
        for (zzkc zzj = this.zzr.zzj(); zzj != null; zzj = zzj.zzg()) {
            for (zzxp zzxpVar : zzj.zzi().zzc) {
            }
        }
        if (!zzap()) {
            zzaf();
            zzai();
            return;
        }
        int i12 = this.zzz.zze;
        if (i12 == 3) {
            this.zzo.zzh();
            zzad();
            this.zzi.zzi(2);
        } else if (i12 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzac(int i10) {
        zzks zzksVar = this.zzz;
        if (zzksVar.zze != i10) {
            if (i10 != 2) {
                this.zzR = -9223372036854775807L;
            }
            this.zzz = zzksVar.zze(i10);
        }
    }

    private final void zzad() throws zzhs {
        zzkc zzj = this.zzr.zzj();
        if (zzj == null) {
            return;
        }
        zzxw zzi = zzj.zzi();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzi.zzb(i10)) {
                this.zzb[i10].zzw();
            }
        }
    }

    private final void zzae(boolean z10, boolean z11) {
        zzU(z10 || !this.zzJ, false, true, false);
        this.zzA.zza(z11 ? 1 : 0);
        this.zzg.zze(this.zzu);
        zzac(1);
    }

    private final void zzaf() throws zzhs {
        this.zzo.zzi();
        int i10 = 0;
        while (true) {
            zzlf[] zzlfVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzlfVarArr[i10].zzy();
            i10++;
        }
    }

    private final void zzag() {
        zzkc zzi = this.zzr.zzi();
        boolean z10 = this.zzG || (zzi != null && zzi.zza.zzp());
        zzks zzksVar = this.zzz;
        if (z10 != zzksVar.zzg) {
            this.zzz = new zzks(zzksVar.zza, zzksVar.zzb, zzksVar.zzc, zzksVar.zzd, zzksVar.zze, zzksVar.zzf, z10, zzksVar.zzh, zzksVar.zzi, zzksVar.zzj, zzksVar.zzk, zzksVar.zzl, zzksVar.zzm, zzksVar.zzn, zzksVar.zzo, zzksVar.zzq, zzksVar.zzr, zzksVar.zzs, zzksVar.zzt, false);
        }
    }

    private final void zzah(zzty zztyVar, zzwd zzwdVar, zzxw zzxwVar) {
        long zze;
        long j10;
        zzkc zzi = this.zzr.zzi();
        Objects.requireNonNull(zzi);
        if (zzi == this.zzr.zzj()) {
            zze = this.zzM;
            j10 = zzi.zze();
        } else {
            zze = this.zzM - zzi.zze();
            j10 = zzi.zzg.zzb;
        }
        this.zzg.zzf(new zzjw(this.zzu, this.zzz.zza, zztyVar, zze - j10, zzw(zzi.zzc()), this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzaq(this.zzz.zza, zzi.zzg.zza) ? this.zzW.zzb() : -9223372036854775807L), zzwdVar, zzxwVar.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be A[LOOP:0: B:32:0x00ae->B:39:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c9 -> B:32:0x00ae). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzai() throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zzai():void");
    }

    private final void zzaj(zzbn zzbnVar, zzty zztyVar, zzbn zzbnVar2, zzty zztyVar2, long j10, boolean z10) throws zzhs {
        if (!zzaq(zzbnVar, zztyVar)) {
            zzbb zzbbVar = zztyVar.zzb() ? zzbb.zza : this.zzz.zzo;
            if (this.zzo.zzc().equals(zzbbVar)) {
                return;
            }
            zzaa(zzbbVar);
            zzM(this.zzz.zzo, zzbbVar.zzb, false, false);
            return;
        }
        zzbnVar.zze(zzbnVar.zzn(zztyVar.zza, this.zzm).zzc, this.zzl, 0L);
        zzhm zzhmVar = this.zzW;
        zzaj zzajVar = this.zzl.zzj;
        int i10 = zzeh.zza;
        zzhmVar.zzd(zzajVar);
        if (j10 != -9223372036854775807L) {
            this.zzW.zze(zzt(zzbnVar, zztyVar.zza, j10));
            return;
        }
        if (!Objects.equals(!zzbnVar2.zzo() ? zzbnVar2.zze(zzbnVar2.zzn(zztyVar2.zza, this.zzm).zzc, this.zzl, 0L).zzb : null, this.zzl.zzb) || z10) {
            this.zzW.zze(-9223372036854775807L);
        }
    }

    private final void zzak(boolean z10, boolean z11) {
        this.zzE = z10;
        long j10 = -9223372036854775807L;
        if (z10 && !z11) {
            j10 = SystemClock.elapsedRealtime();
        }
        this.zzF = j10;
    }

    private final synchronized void zzal(zzftn zzftnVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) zzftnVar.zza()).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzam() {
        if (this.zzx) {
            zzlf[] zzlfVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                if (zzlfVarArr[i10].zzE()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final boolean zzan() {
        zzkc zzj = this.zzr.zzj();
        long j10 = zzj.zzg.zze;
        if (zzj.zze) {
            if (j10 == -9223372036854775807L || this.zzz.zzs < j10) {
                return true;
            }
            return !zzap();
        }
        return false;
    }

    private static boolean zzao(zzks zzksVar, zzbl zzblVar) {
        zzty zztyVar = zzksVar.zzb;
        zzbn zzbnVar = zzksVar.zza;
        return zzbnVar.zzo() || zzbnVar.zzn(zztyVar.zza, zzblVar).zzf;
    }

    private final boolean zzap() {
        zzks zzksVar = this.zzz;
        return zzksVar.zzl && zzksVar.zzn == 0;
    }

    private final boolean zzaq(zzbn zzbnVar, zzty zztyVar) {
        if (!zztyVar.zzb() && !zzbnVar.zzo()) {
            zzbnVar.zze(zzbnVar.zzn(zztyVar.zza, this.zzm).zzc, this.zzl, 0L);
            if (this.zzl.zzb()) {
                zzbm zzbmVar = this.zzl;
                if (zzbmVar.zzi && zzbmVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean zzar(zzkc zzkcVar) {
        if (zzkcVar != null) {
            try {
                if (zzkcVar.zze) {
                    zzvs[] zzvsVarArr = zzkcVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzvs zzvsVar = zzvsVarArr[i10];
                        if (zzvsVar != null) {
                            zzvsVar.zzd();
                        }
                    }
                } else {
                    zzkcVar.zza.zzk();
                }
                if (zzkcVar.zzd() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static final void zzas(zzkw zzkwVar) throws zzhs {
        zzkwVar.zzi();
        try {
            zzkwVar.zzc().zzu(zzkwVar.zza(), zzkwVar.zzg());
        } finally {
            zzkwVar.zzh(true);
        }
    }

    static int zzb(zzbm zzbmVar, zzbl zzblVar, int i10, boolean z10, Object obj, zzbn zzbnVar, zzbn zzbnVar2) {
        Object obj2 = zzbnVar.zze(zzbnVar.zzn(obj, zzblVar).zzc, zzbmVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbnVar2.zzc(); i11++) {
            if (zzbnVar2.zze(i11, zzbmVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int zza2 = zzbnVar.zza(obj);
        int zzb = zzbnVar.zzb();
        int i12 = zza2;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            if (i13 >= zzb || i14 != -1) {
                break;
            }
            i12 = zzbnVar.zzi(i12, zzblVar, zzbmVar, i10, z10);
            if (i12 == -1) {
                i14 = -1;
                break;
            }
            i14 = zzbnVar2.zza(zzbnVar.zzf(i12));
            i13++;
        }
        if (i14 == -1) {
            return -1;
        }
        return zzbnVar2.zzd(i14, zzblVar, false).zzc;
    }

    public static /* synthetic */ zzkc zzd(zzjt zzjtVar, zzkd zzkdVar, long j10) {
        zzye zzk = zzjtVar.zzg.zzk();
        long j11 = zzjtVar.zzS.zzb;
        zzxw zzxwVar = zzjtVar.zzf;
        zzkr zzkrVar = zzjtVar.zzs;
        return new zzkc(zzjtVar.zzc, j10, zzjtVar.zze, zzk, zzkrVar, zzkdVar, zzxwVar, -9223372036854775807L);
    }

    public static /* synthetic */ void zzf(zzjt zzjtVar, zzkw zzkwVar) {
        try {
            zzas(zzkwVar);
        } catch (zzhs e8) {
            zzdn.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e8);
            throw new RuntimeException(e8);
        }
    }

    private final long zzt(zzbn zzbnVar, Object obj, long j10) {
        long elapsedRealtime;
        zzbnVar.zze(zzbnVar.zzn(obj, this.zzm).zzc, this.zzl, 0L);
        zzbm zzbmVar = this.zzl;
        if (zzbmVar.zzf != -9223372036854775807L && zzbmVar.zzb()) {
            zzbm zzbmVar2 = this.zzl;
            if (zzbmVar2.zzi) {
                long j11 = zzbmVar2.zzg;
                int i10 = zzeh.zza;
                if (j11 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j11 + SystemClock.elapsedRealtime();
                }
                return zzeh.zzs(elapsedRealtime - this.zzl.zzf) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzu(zzkc zzkcVar) {
        if (zzkcVar == null) {
            return 0L;
        }
        long zze = zzkcVar.zze();
        if (zzkcVar.zze) {
            int i10 = 0;
            while (true) {
                zzlf[] zzlfVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzlfVarArr[i10].zzF(zzkcVar)) {
                    long zzd = this.zzb[i10].zzd(zzkcVar);
                    if (zzd == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zze = Math.max(zzd, zze);
                }
                i10++;
            }
        }
        return zze;
    }

    private final long zzv() {
        return zzw(this.zzz.zzq);
    }

    private final long zzw(long j10) {
        zzkc zzi = this.zzr.zzi();
        if (zzi == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzM - zzi.zze()));
    }

    private final long zzx(zzty zztyVar, long j10, boolean z10) throws zzhs {
        zzkf zzkfVar = this.zzr;
        return zzy(zztyVar, j10, zzkfVar.zzj() != zzkfVar.zzn(), z10);
    }

    private final long zzy(zzty zztyVar, long j10, boolean z10, boolean z11) throws zzhs {
        zzaf();
        zzak(false, true);
        if (z11 || this.zzz.zze == 3) {
            zzac(2);
        }
        zzkc zzj = this.zzr.zzj();
        zzkc zzkcVar = zzj;
        while (zzkcVar != null && !zztyVar.equals(zzkcVar.zzg.zza)) {
            zzkcVar = zzkcVar.zzg();
        }
        if (z10 || zzj != zzkcVar || (zzkcVar != null && zzkcVar.zze() + j10 < 0)) {
            zzD();
            if (zzkcVar != null) {
                while (this.zzr.zzj() != zzkcVar) {
                    this.zzr.zze();
                }
                this.zzr.zza(zzkcVar);
                zzkcVar.zzq(1000000000000L);
                zzG();
                zzkcVar.zzh = true;
            }
        }
        if (zzkcVar != null) {
            this.zzr.zza(zzkcVar);
            if (!zzkcVar.zze) {
                zzkcVar.zzg = zzkcVar.zzg.zzb(j10);
            } else if (zzkcVar.zzf) {
                j10 = zzkcVar.zza.zze(j10);
                zzkcVar.zza.zzi(j10 - this.zzn, false);
            }
            zzW(j10);
            zzN();
        } else {
            this.zzr.zzs();
            zzW(j10);
        }
        zzJ(false);
        this.zzi.zzi(2);
        return j10;
    }

    private final Pair zzz(zzbn zzbnVar) {
        long j10 = 0;
        if (zzbnVar.zzo()) {
            return Pair.create(zzks.zzh(), 0L);
        }
        Pair zzl = zzbnVar.zzl(this.zzl, this.zzm, zzbnVar.zzg(this.zzI), -9223372036854775807L);
        zzty zzq = this.zzr.zzq(zzbnVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzq.zzb()) {
            zzbnVar.zzn(zzq.zza, this.zzm);
            if (zzq.zzc == this.zzm.zze(zzq.zzb)) {
                this.zzm.zzh();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(zzq, Long.valueOf(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:291:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0662  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r25) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zza(zzbb zzbbVar) {
        this.zzi.zzc(16, zzbbVar).zza();
    }

    public final Looper zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    public final /* bridge */ /* synthetic */ void zzh(zzvu zzvuVar) {
        this.zzi.zzc(9, (zztw) zzvuVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkq
    public final void zzi() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzj(zztw zztwVar) {
        this.zzi.zzc(8, zztwVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxu
    public final void zzk() {
        this.zzi.zzi(10);
    }

    public final void zzl() {
        this.zzi.zzb(29).zza();
    }

    public final void zzm(zzbn zzbnVar, int i10, long j10) {
        this.zzi.zzc(3, new zzjr(zzbnVar, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final synchronized void zzn(zzkw zzkwVar) {
        if (!this.zzB && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzkwVar).zza();
            return;
        }
        zzdn.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzkwVar.zzh(false);
    }

    public final void zzo(boolean z10, int i10, int i11) {
        this.zzi.zzd(1, z10 ? 1 : 0, i10).zza();
    }

    public final void zzp() {
        this.zzi.zzb(6).zza();
    }

    public final synchronized boolean zzq() {
        if (!this.zzB && this.zzk.getThread().isAlive()) {
            this.zzi.zzi(7);
            zzal(new zzftn() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object zza() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(zzjt.this.zzB);
                    return valueOf;
                }
            }, this.zzt);
            return this.zzB;
        }
        return true;
    }

    public final synchronized boolean zzr(Object obj, long j10) {
        if (!this.zzB && this.zzk.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.zzi.zzc(30, new Pair(obj, atomicBoolean)).zza();
            if (j10 != -9223372036854775807L) {
                zzal(new zzftn() { // from class: com.google.android.gms.internal.ads.zzjk
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object zza() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                }, j10);
                return atomicBoolean.get();
            }
        }
        return true;
    }

    public final void zzs(List list, int i10, long j10, zzvv zzvvVar) {
        this.zzi.zzc(17, new zzjn(list, zzvvVar, i10, j10, null)).zza();
    }
}
