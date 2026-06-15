package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlf {
    private final zzla zza;
    private final int zzb;
    private final zzla zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzlf(zzla zzlaVar, zzla zzlaVar2, int i10) {
        this.zza = zzlaVar;
        this.zzb = i10;
        this.zzc = zzlaVar2;
    }

    private final int zzI(zzla zzlaVar, zzkc zzkcVar, zzxw zzxwVar, zzhr zzhrVar) throws zzhs {
        if (zzlaVar == null || !zzQ(zzlaVar) || ((zzlaVar == this.zza && zzP()) || (zzlaVar == this.zzc && zzR()))) {
            return 1;
        }
        zzvs zzp = zzlaVar.zzp();
        zzvs[] zzvsVarArr = zzkcVar.zzc;
        int i10 = this.zzb;
        zzvs zzvsVar = zzvsVarArr[i10];
        boolean zzb = zzxwVar.zzb(i10);
        if (zzb && zzp == zzvsVar) {
            return 1;
        }
        if (!zzlaVar.zzR()) {
            zzz[] zzS = zzS(zzxwVar.zzc[this.zzb]);
            zzvs zzvsVar2 = zzkcVar.zzc[this.zzb];
            Objects.requireNonNull(zzvsVar2);
            zzlaVar.zzH(zzS, zzvsVar2, zzkcVar.zzf(), zzkcVar.zze(), zzkcVar.zzg.zza);
            return 3;
        }
        if (zzlaVar.zzW()) {
            zzK(zzlaVar, zzhrVar);
            if (!zzb || zzE()) {
                zzM(zzlaVar == this.zza);
            }
            return 1;
        }
        return 0;
    }

    private final zzla zzJ(zzkc zzkcVar) {
        if (zzkcVar != null) {
            int i10 = this.zzb;
            zzvs[] zzvsVarArr = zzkcVar.zzc;
            if (zzvsVarArr[i10] == null) {
                return null;
            }
            if (this.zza.zzp() == zzvsVarArr[i10]) {
                return this.zza;
            }
            zzla zzlaVar = this.zzc;
            if (zzlaVar != null) {
                if (zzlaVar.zzp() == zzkcVar.zzc[this.zzb]) {
                    return zzlaVar;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private final void zzK(zzla zzlaVar, zzhr zzhrVar) {
        boolean z10 = true;
        if (this.zza != zzlaVar && this.zzc != zzlaVar) {
            z10 = false;
        }
        zzcv.zzf(z10);
        if (zzQ(zzlaVar)) {
            zzhrVar.zzd(zzlaVar);
            zzT(zzlaVar);
            zzlaVar.zzr();
        }
    }

    private final void zzL(zzla zzlaVar, zzvs zzvsVar, zzhr zzhrVar, long j10, boolean z10) throws zzhs {
        if (zzQ(zzlaVar)) {
            if (zzvsVar != zzlaVar.zzp()) {
                zzK(zzlaVar, zzhrVar);
            } else if (z10) {
                zzlaVar.zzJ(j10);
            }
        }
    }

    private final void zzM(boolean z10) {
        if (z10) {
            if (this.zze) {
                this.zza.zzI();
                this.zze = false;
            }
        } else if (this.zzf) {
            zzla zzlaVar = this.zzc;
            Objects.requireNonNull(zzlaVar);
            zzlaVar.zzI();
            this.zzf = false;
        }
    }

    private final void zzN(boolean z10) throws zzhs {
        if (z10) {
            zzla zzlaVar = this.zzc;
            Objects.requireNonNull(zzlaVar);
            zzlaVar.zzu(17, this.zza);
            return;
        }
        zzla zzlaVar2 = this.zza;
        zzla zzlaVar3 = this.zzc;
        Objects.requireNonNull(zzlaVar3);
        zzlaVar2.zzu(17, zzlaVar3);
    }

    private final boolean zzO(zzkc zzkcVar, zzla zzlaVar) {
        if (zzlaVar == null) {
            return true;
        }
        zzvs zzvsVar = zzkcVar.zzc[this.zzb];
        if (zzlaVar.zzp() != null) {
            if (zzlaVar.zzp() == zzvsVar) {
                if (zzvsVar != null && !zzlaVar.zzQ()) {
                    zzkcVar.zzg();
                    boolean z10 = zzkcVar.zzg.zzg;
                }
            }
            zzkc zzg = zzkcVar.zzg();
            if (zzg != null) {
                return zzg.zzc[this.zzb] == zzlaVar.zzp();
            }
            return false;
        }
        return true;
    }

    private final boolean zzP() {
        int i10 = this.zzd;
        return i10 == 2 || i10 == 4;
    }

    private static boolean zzQ(zzla zzlaVar) {
        return zzlaVar.zzcT() != 0;
    }

    private final boolean zzR() {
        return this.zzd == 3;
    }

    private static zzz[] zzS(zzxp zzxpVar) {
        int zzd = zzxpVar != null ? zzxpVar.zzd() : 0;
        zzz[] zzzVarArr = new zzz[zzd];
        for (int i10 = 0; i10 < zzd; i10++) {
            Objects.requireNonNull(zzxpVar);
            zzzVarArr[i10] = zzxpVar.zze(i10);
        }
        return zzzVarArr;
    }

    private static final void zzT(zzla zzlaVar) {
        if (zzlaVar.zzcT() == 2) {
            zzlaVar.zzP();
        }
    }

    private static final void zzU(zzla zzlaVar, long j10) {
        zzlaVar.zzK();
        if (zzlaVar instanceof zzwh) {
            zzwh zzwhVar = (zzwh) zzlaVar;
            throw null;
        }
    }

    public final boolean zzA(zzkc zzkcVar) {
        return zzO(zzkcVar, this.zza) && zzO(zzkcVar, this.zzc);
    }

    public final boolean zzB(zzkc zzkcVar) {
        zzla zzJ = zzJ(zzkcVar);
        Objects.requireNonNull(zzJ);
        return zzJ.zzQ();
    }

    public final boolean zzC() {
        return this.zzc != null;
    }

    public final boolean zzD() {
        boolean zzW = zzQ(this.zza) ? this.zza.zzW() : true;
        zzla zzlaVar = this.zzc;
        return (zzlaVar == null || !zzQ(zzlaVar)) ? zzW : zzW & this.zzc.zzW();
    }

    public final boolean zzE() {
        return zzP() || zzR();
    }

    public final boolean zzF(zzkc zzkcVar) {
        return zzJ(zzkcVar) != null;
    }

    public final boolean zzG() {
        int i10 = this.zzd;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            zzla zzlaVar = this.zzc;
            Objects.requireNonNull(zzlaVar);
            return zzQ(zzlaVar);
        }
        return zzQ(this.zza);
    }

    public final boolean zzH(int i10) {
        return (zzP() && i10 == this.zzb) || (zzR() && i10 != this.zzb);
    }

    public final int zza() {
        zzla zzlaVar = this.zzc;
        boolean zzQ = zzQ(this.zza);
        int i10 = 0;
        if (zzlaVar != null && zzQ(zzlaVar)) {
            i10 = 1;
        }
        return (zzQ ? 1 : 0) + i10;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(zzkc zzkcVar, zzxw zzxwVar, zzhr zzhrVar) throws zzhs {
        int zzI = zzI(this.zza, zzkcVar, zzxwVar, zzhrVar);
        return zzI == 1 ? zzI(this.zzc, zzkcVar, zzxwVar, zzhrVar) : zzI;
    }

    public final long zzd(zzkc zzkcVar) {
        zzla zzJ = zzJ(zzkcVar);
        Objects.requireNonNull(zzJ);
        return zzJ.zzcV();
    }

    public final void zze(zzhr zzhrVar) throws zzhs {
        zzK(this.zza, zzhrVar);
        zzla zzlaVar = this.zzc;
        if (zzlaVar != null) {
            boolean z10 = zzQ(zzlaVar) && this.zzd != 3;
            zzK(this.zzc, zzhrVar);
            zzM(false);
            if (z10) {
                zzN(true);
            }
        }
        this.zzd = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.internal.ads.zzhr r7) {
        /*
            r6 = this;
            boolean r0 = r6.zzE()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r6.zzd
            r1 = 0
            r2 = 2
            r3 = 4
            r4 = 1
            if (r0 == r3) goto L15
            if (r0 != r2) goto L13
            r0 = r2
            goto L15
        L13:
            r2 = r1
            goto L16
        L15:
            r2 = r4
        L16:
            if (r2 == 0) goto L1b
            com.google.android.gms.internal.ads.zzla r5 = r6.zza
            goto L20
        L1b:
            com.google.android.gms.internal.ads.zzla r5 = r6.zzc
            java.util.Objects.requireNonNull(r5)
        L20:
            r6.zzK(r5, r7)
            r6.zzM(r2)
            if (r0 != r3) goto L29
            r1 = r4
        L29:
            r6.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzf(com.google.android.gms.internal.ads.zzhr):void");
    }

    public final void zzg(zzle zzleVar, zzxp zzxpVar, zzvs zzvsVar, long j10, boolean z10, boolean z11, long j11, long j12, zzty zztyVar, zzhr zzhrVar) throws zzhs {
        zzz[] zzS = zzS(zzxpVar);
        int i10 = this.zzd;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            this.zzf = true;
            zzla zzlaVar = this.zzc;
            Objects.requireNonNull(zzlaVar);
            zzlaVar.zzs(zzleVar, zzS, zzvsVar, j10, z10, z11, j11, j12, zztyVar);
            zzhrVar.zze(this.zzc);
            return;
        }
        this.zze = true;
        this.zza.zzs(zzleVar, zzS, zzvsVar, j10, z10, z11, j11, j12, zztyVar);
        zzhrVar.zze(this.zza);
    }

    public final void zzh() {
        if (zzQ(this.zza)) {
            this.zza.zzt();
            return;
        }
        zzla zzlaVar = this.zzc;
        if (zzlaVar == null || !zzQ(zzlaVar)) {
            return;
        }
        this.zzc.zzt();
    }

    public final void zzi(int i10, Object obj, zzkc zzkcVar) throws zzhs {
        zzla zzJ = zzJ(zzkcVar);
        Objects.requireNonNull(zzJ);
        zzJ.zzu(11, obj);
    }

    public final void zzj(zzvs zzvsVar, zzhr zzhrVar, long j10, boolean z10) throws zzhs {
        zzL(this.zza, zzvsVar, zzhrVar, j10, z10);
        zzla zzlaVar = this.zzc;
        if (zzlaVar != null) {
            zzL(zzlaVar, zzvsVar, zzhrVar, j10, z10);
        }
    }

    public final void zzk() throws zzhs {
        int i10 = this.zzd;
        if (i10 == 3 || i10 == 4) {
            zzN(i10 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzl(zzxw zzxwVar, zzxw zzxwVar2, long j10) {
        zzla zzlaVar;
        int i10;
        int i11 = this.zzb;
        boolean zzb = zzxwVar.zzb(i11);
        boolean zzb2 = zzxwVar2.zzb(i11);
        if (this.zzc != null && (i10 = this.zzd) != 3 && (i10 != 0 || !zzQ(this.zza))) {
            zzlaVar = this.zzc;
            Objects.requireNonNull(zzlaVar);
        } else {
            zzlaVar = this.zza;
        }
        if (!zzb || zzlaVar.zzR()) {
            return;
        }
        zzb();
        zzle[] zzleVarArr = zzxwVar.zzb;
        int i12 = this.zzb;
        zzle zzleVar = zzleVarArr[i12];
        zzle zzleVar2 = zzxwVar2.zzb[i12];
        if (zzb2 && Objects.equals(zzleVar2, zzleVar) && !zzE()) {
            return;
        }
        zzU(zzlaVar, j10);
    }

    public final void zzm(zzkc zzkcVar) throws IOException {
        zzla zzJ = zzJ(zzkcVar);
        Objects.requireNonNull(zzJ);
        zzJ.zzw();
    }

    public final void zzn() {
        this.zza.zzG();
        this.zze = false;
        zzla zzlaVar = this.zzc;
        if (zzlaVar != null) {
            zzlaVar.zzG();
            this.zzf = false;
        }
    }

    public final void zzo(long j10, long j11) throws zzhs {
        if (zzQ(this.zza)) {
            this.zza.zzV(j10, j11);
        }
        zzla zzlaVar = this.zzc;
        if (zzlaVar == null || !zzQ(zzlaVar)) {
            return;
        }
        this.zzc.zzV(j10, j11);
    }

    public final void zzp() {
        if (!zzQ(this.zza)) {
            zzM(true);
        }
        zzla zzlaVar = this.zzc;
        if (zzlaVar == null || zzQ(zzlaVar)) {
            return;
        }
        zzM(false);
    }

    public final void zzq(zzkc zzkcVar, long j10) throws zzhs {
        zzla zzJ = zzJ(zzkcVar);
        if (zzJ != null) {
            zzJ.zzJ(j10);
        }
    }

    public final void zzr(long j10) {
        int i10;
        if (zzQ(this.zza) && (i10 = this.zzd) != 4 && i10 != 2) {
            zzU(this.zza, j10);
        }
        zzla zzlaVar = this.zzc;
        if (zzlaVar == null || !zzQ(zzlaVar) || this.zzd == 3) {
            return;
        }
        zzU(this.zzc, j10);
    }

    public final void zzs(zzkc zzkcVar, long j10) {
        zzla zzJ = zzJ(zzkcVar);
        Objects.requireNonNull(zzJ);
        zzU(zzJ, j10);
    }

    public final void zzt(float f10, float f11) throws zzhs {
        this.zza.zzM(f10, f11);
        zzla zzlaVar = this.zzc;
        if (zzlaVar != null) {
            zzlaVar.zzM(f10, f11);
        }
    }

    public final void zzu(zzbn zzbnVar) {
        this.zza.zzN(zzbnVar);
        zzla zzlaVar = this.zzc;
        if (zzlaVar != null) {
            zzlaVar.zzN(zzbnVar);
        }
    }

    public final void zzv(Object obj) throws zzhs {
        if (zzb() != 2) {
            return;
        }
        int i10 = this.zzd;
        if (i10 != 4 && i10 != 1) {
            this.zza.zzu(1, obj);
            return;
        }
        zzla zzlaVar = this.zzc;
        Objects.requireNonNull(zzlaVar);
        zzlaVar.zzu(1, obj);
    }

    public final void zzw() throws zzhs {
        if (this.zza.zzcT() == 1 && this.zzd != 4) {
            this.zza.zzO();
            return;
        }
        zzla zzlaVar = this.zzc;
        if (zzlaVar == null || zzlaVar.zzcT() != 1 || this.zzd == 3) {
            return;
        }
        zzlaVar.zzO();
    }

    public final void zzx() {
        zzcv.zzf(!zzE());
        int i10 = 2;
        if (zzQ(this.zza)) {
            i10 = 3;
        } else {
            zzla zzlaVar = this.zzc;
            if (zzlaVar != null && zzQ(zzlaVar)) {
                i10 = 4;
            }
        }
        this.zzd = i10;
    }

    public final void zzy() {
        if (zzQ(this.zza)) {
            zzT(this.zza);
        }
        zzla zzlaVar = this.zzc;
        if (zzlaVar == null || !zzQ(zzlaVar)) {
            return;
        }
        zzT(this.zzc);
    }

    public final boolean zzz(zzkc zzkcVar) {
        zzla zzJ = zzJ(zzkcVar);
        return zzJ == null || zzJ.zzQ() || zzJ.zzX() || zzJ.zzW();
    }
}
