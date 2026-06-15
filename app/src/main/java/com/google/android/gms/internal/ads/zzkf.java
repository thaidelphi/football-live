package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkf {
    private final zzlm zzc;
    private final zzdg zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzic zzh;
    private zzkc zzi;
    private zzkc zzj;
    private zzkc zzk;
    private zzkc zzl;
    private zzkc zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzjh zzr;
    private final zzbl zza = new zzbl();
    private final zzbm zzb = new zzbm();
    private List zzq = new ArrayList();

    public zzkf(zzlm zzlmVar, zzdg zzdgVar, zzjh zzjhVar, zzic zzicVar) {
        this.zzc = zzlmVar;
        this.zzd = zzdgVar;
        this.zzr = zzjhVar;
        this.zzh = zzicVar;
    }

    private final int zzB(zzbn zzbnVar) {
        zzkc zzkcVar = this.zzi;
        if (zzkcVar == null) {
            return 0;
        }
        int zza = zzbnVar.zza(zzkcVar.zzb);
        while (true) {
            zza = zzbnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                Objects.requireNonNull(zzkcVar);
                if (zzkcVar.zzg() == null || zzkcVar.zzg.zzh) {
                    break;
                }
                zzkcVar = zzkcVar.zzg();
            }
            zzkc zzg = zzkcVar.zzg();
            if (zza == -1 || zzg == null || zzbnVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkcVar = zzg;
        }
        int zza2 = zza(zzkcVar);
        zzkcVar.zzg = zzp(zzbnVar, zzkcVar.zzg);
        return zza2;
    }

    private final long zzC(zzbn zzbnVar, Object obj, int i10) {
        zzbnVar.zzn(obj, this.zza);
        this.zza.zzg(i10);
        long j10 = this.zza.zzg.zza(i10).zzh;
        return 0L;
    }

    private final long zzD(Object obj) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzkc zzkcVar = (zzkc) this.zzq.get(i10);
            if (zzkcVar.zzb.equals(obj)) {
                return zzkcVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzkd zzE(zzbn zzbnVar, zzkc zzkcVar, long j10) {
        long j11;
        zzkd zzkdVar = zzkcVar.zzg;
        long zze = (zzkcVar.zze() + zzkdVar.zze) - j10;
        if (zzkdVar.zzh) {
            long j12 = 0;
            int zzi = zzbnVar.zzi(zzbnVar.zza(zzkdVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i10 = zzbnVar.zzd(zzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                Objects.requireNonNull(obj);
                long j13 = zzkdVar.zza.zzd;
                if (zzbnVar.zze(i10, this.zzb, 0L).zzn == zzi) {
                    Pair zzm = zzbnVar.zzm(this.zzb, this.zza, i10, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzkc zzg = zzkcVar.zzg();
                        if (zzg != null && zzg.zzb.equals(obj)) {
                            j13 = zzg.zzg.zza.zzd;
                        } else {
                            j13 = zzD(obj);
                            if (j13 == -1) {
                                j13 = this.zze;
                                this.zze = 1 + j13;
                            }
                        }
                        j11 = longValue;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    j11 = 0;
                }
                zzty zzI = zzI(zzbnVar, obj, j11, j13, this.zzb, this.zza);
                if (j12 != -9223372036854775807L && zzkdVar.zzc != -9223372036854775807L) {
                    zzbnVar.zzn(zzkdVar.zza.zza, this.zza).zzb();
                    int i11 = this.zza.zzg.zzd;
                }
                return zzF(zzbnVar, zzI, j12, j11);
            }
        } else {
            zzty zztyVar = zzkdVar.zza;
            zzbnVar.zzn(zztyVar.zza, this.zza);
            if (zztyVar.zzb()) {
                int i12 = zztyVar.zzb;
                if (this.zza.zza(i12) != -1) {
                    int zza = this.zza.zzg.zza(i12).zza(zztyVar.zzc);
                    if (zza < 0) {
                        return zzG(zzbnVar, zztyVar.zza, i12, zza, zzkdVar.zzc, zztyVar.zzd, false);
                    }
                    long j14 = zzkdVar.zzc;
                    if (j14 == -9223372036854775807L) {
                        zzbm zzbmVar = this.zzb;
                        zzbl zzblVar = this.zza;
                        Pair zzm2 = zzbnVar.zzm(zzbmVar, zzblVar, zzblVar.zzc, -9223372036854775807L, Math.max(0L, zze));
                        if (zzm2 != null) {
                            j14 = ((Long) zzm2.second).longValue();
                        }
                    }
                    zzC(zzbnVar, zztyVar.zza, zztyVar.zzb);
                    return zzH(zzbnVar, zztyVar.zza, Math.max(0L, j14), zzkdVar.zzc, zztyVar.zzd, false);
                }
            } else {
                int i13 = zztyVar.zze;
                if (i13 != -1) {
                    this.zza.zzj(i13);
                }
                zzbl zzblVar2 = this.zza;
                int i14 = zztyVar.zze;
                int zze2 = zzblVar2.zze(i14);
                zzblVar2.zzk(i14);
                if (zze2 != this.zza.zza(zztyVar.zze)) {
                    return zzG(zzbnVar, zztyVar.zza, zztyVar.zze, zze2, zzkdVar.zze, zztyVar.zzd, false);
                }
                zzC(zzbnVar, zztyVar.zza, zztyVar.zze);
                return zzH(zzbnVar, zztyVar.zza, 0L, zzkdVar.zze, zztyVar.zzd, false);
            }
        }
        return null;
    }

    private final zzkd zzF(zzbn zzbnVar, zzty zztyVar, long j10, long j11) {
        zzbnVar.zzn(zztyVar.zza, this.zza);
        if (zztyVar.zzb()) {
            return zzG(zzbnVar, zztyVar.zza, zztyVar.zzb, zztyVar.zzc, j10, zztyVar.zzd, false);
        }
        return zzH(zzbnVar, zztyVar.zza, j11, j10, zztyVar.zzd, false);
    }

    private final zzkd zzG(zzbn zzbnVar, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        zzty zztyVar = new zzty(obj, i10, i11, j11);
        long zzf = zzbnVar.zzn(zztyVar.zza, this.zza).zzf(zztyVar.zzb, zztyVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzh();
        }
        this.zza.zzk(zztyVar.zzb);
        return new zzkd(zztyVar, (zzf == -9223372036854775807L || zzf > 0) ? 0L : Math.max(0L, (-1) + zzf), j10, -9223372036854775807L, zzf, false, false, false, false, false);
    }

    private final zzkd zzH(zzbn zzbnVar, Object obj, long j10, long j11, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        zzbnVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j16);
        if (zzc != -1) {
            this.zza.zzj(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(zzc);
        }
        zzty zztyVar = new zzty(obj, j12, zzc);
        boolean zzM = zzM(zztyVar);
        boolean zzL = zzL(zzbnVar, zztyVar);
        boolean zzK = zzK(zzbnVar, zztyVar, zzM);
        if (zzc != -1) {
            this.zza.zzk(zzc);
        }
        if (zzc != -1) {
            this.zza.zzg(zzc);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.zza.zzd;
        }
        if (j15 != -9223372036854775807L && j16 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        }
        return new zzkd(zztyVar, j16, j11, j14, j15, false, false, zzM, zzL, zzK);
    }

    private static zzty zzI(zzbn zzbnVar, Object obj, long j10, long j11, zzbm zzbmVar, zzbl zzblVar) {
        zzbnVar.zzn(obj, zzblVar);
        zzbnVar.zze(zzblVar.zzc, zzbmVar, 0L);
        zzbnVar.zza(obj);
        zzblVar.zzb();
        zzbnVar.zzn(obj, zzblVar);
        int zzd = zzblVar.zzd(j10);
        if (zzd == -1) {
            return new zzty(obj, j11, zzblVar.zzc(j10));
        }
        return new zzty(obj, zzd, zzblVar.zze(zzd), j11);
    }

    private final void zzJ() {
        int i10 = zzfvv.zzd;
        final zzfvs zzfvsVar = new zzfvs();
        for (zzkc zzkcVar = this.zzi; zzkcVar != null; zzkcVar = zzkcVar.zzg()) {
            zzfvsVar.zzf(zzkcVar.zzg.zza);
        }
        zzkc zzkcVar2 = this.zzj;
        final zzty zztyVar = zzkcVar2 == null ? null : zzkcVar2.zzg.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final void run() {
                zzkf.this.zzc.zzT(zzfvsVar.zzi(), zztyVar);
            }
        });
    }

    private final boolean zzK(zzbn zzbnVar, zzty zztyVar, boolean z10) {
        int zza = zzbnVar.zza(zztyVar.zza);
        return !zzbnVar.zze(zzbnVar.zzd(zza, this.zza, false).zzc, this.zzb, 0L).zzi && zzbnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z10;
    }

    private final boolean zzL(zzbn zzbnVar, zzty zztyVar) {
        if (zzM(zztyVar)) {
            return zzbnVar.zze(zzbnVar.zzn(zztyVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzbnVar.zza(zztyVar.zza);
        }
        return false;
    }

    private static final boolean zzM(zzty zztyVar) {
        return !zztyVar.zzb() && zztyVar.zze == -1;
    }

    static boolean zzx(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public final boolean zzA() {
        zzkc zzkcVar = this.zzl;
        if (zzkcVar != null) {
            if (zzkcVar.zzg.zzj || !zzkcVar.zzs() || this.zzl.zzg.zze == -9223372036854775807L) {
                return false;
            }
            return this.zzn < 100;
        }
        return true;
    }

    public final int zza(zzkc zzkcVar) {
        zzcv.zzb(zzkcVar);
        int i10 = 0;
        if (zzkcVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzkcVar;
        while (zzkcVar.zzg() != null) {
            zzkcVar = zzkcVar.zzg();
            Objects.requireNonNull(zzkcVar);
            if (zzkcVar == this.zzj) {
                zzkc zzkcVar2 = this.zzi;
                this.zzj = zzkcVar2;
                this.zzk = zzkcVar2;
                i10 = 3;
            }
            if (zzkcVar == this.zzk) {
                this.zzk = this.zzj;
                i10 |= 2;
            }
            zzkcVar.zzo();
            this.zzn--;
        }
        zzkc zzkcVar3 = this.zzl;
        Objects.requireNonNull(zzkcVar3);
        zzkcVar3.zzp(null);
        zzJ();
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        return zza(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzbn r15, long r16, long r18, long r20) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            com.google.android.gms.internal.ads.zzkc r2 = r0.zzi
            r3 = 0
        L5:
            r4 = 0
            if (r2 == 0) goto L96
            com.google.android.gms.internal.ads.zzkd r5 = r2.zzg
            if (r3 != 0) goto L13
            com.google.android.gms.internal.ads.zzkd r3 = r14.zzp(r15, r5)
            r6 = r16
            goto L2e
        L13:
            r6 = r16
            com.google.android.gms.internal.ads.zzkd r8 = r14.zzE(r15, r3, r6)
            if (r8 == 0) goto L91
            long r9 = r5.zzb
            long r11 = r8.zzb
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L91
            com.google.android.gms.internal.ads.zzty r9 = r5.zza
            com.google.android.gms.internal.ads.zzty r10 = r8.zza
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L91
            r3 = r8
        L2e:
            long r8 = r5.zzc
            com.google.android.gms.internal.ads.zzkd r8 = r3.zza(r8)
            r2.zzg = r8
            long r8 = r5.zze
            long r10 = r3.zze
            boolean r5 = zzx(r8, r10)
            if (r5 != 0) goto L88
            r2.zzr()
            long r5 = r3.zze
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L54
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L59
        L54:
            long r7 = r2.zze()
            long r5 = r5 + r7
        L59:
            com.google.android.gms.internal.ads.zzkc r1 = r0.zzj
            r7 = -9223372036854775808
            r3 = 1
            if (r2 != r1) goto L6e
            com.google.android.gms.internal.ads.zzkd r1 = r2.zzg
            boolean r1 = r1.zzg
            int r1 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r1 == 0) goto L6c
            int r1 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r1 < 0) goto L6e
        L6c:
            r1 = r3
            goto L6f
        L6e:
            r1 = r4
        L6f:
            com.google.android.gms.internal.ads.zzkc r9 = r0.zzk
            if (r2 != r9) goto L7c
            int r7 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r7 == 0) goto L7b
            int r5 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r5 < 0) goto L7c
        L7b:
            r4 = r3
        L7c:
            int r2 = r14.zza(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            if (r4 == 0) goto L87
            r1 = r1 | 2
        L87:
            return r1
        L88:
            com.google.android.gms.internal.ads.zzkc r3 = r2.zzg()
            r13 = r3
            r3 = r2
            r2 = r13
            goto L5
        L91:
            int r1 = r14.zza(r3)
            return r1
        L96:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.zzb(com.google.android.gms.internal.ads.zzbn, long, long, long):int");
    }

    public final int zzc(zzbn zzbnVar, int i10) {
        this.zzf = i10;
        return zzB(zzbnVar);
    }

    public final int zzd(zzbn zzbnVar, boolean z10) {
        this.zzg = z10;
        return zzB(zzbnVar);
    }

    public final zzkc zze() {
        zzkc zzkcVar = this.zzi;
        if (zzkcVar == null) {
            return null;
        }
        if (zzkcVar == this.zzj) {
            this.zzj = zzkcVar.zzg();
        }
        if (zzkcVar == this.zzk) {
            this.zzk = zzkcVar.zzg();
        }
        zzkcVar.zzo();
        int i10 = this.zzn - 1;
        this.zzn = i10;
        if (i10 == 0) {
            this.zzl = null;
            zzkc zzkcVar2 = this.zzi;
            this.zzo = zzkcVar2.zzb;
            this.zzp = zzkcVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzJ();
        return this.zzi;
    }

    public final zzkc zzf() {
        zzkc zzkcVar = this.zzk;
        zzcv.zzb(zzkcVar);
        this.zzk = zzkcVar.zzg();
        zzJ();
        zzkc zzkcVar2 = this.zzk;
        zzcv.zzb(zzkcVar2);
        return zzkcVar2;
    }

    public final zzkc zzg() {
        zzkc zzkcVar = this.zzk;
        zzkc zzkcVar2 = this.zzj;
        if (zzkcVar == zzkcVar2) {
            zzcv.zzb(zzkcVar2);
            this.zzk = zzkcVar2.zzg();
        }
        zzkc zzkcVar3 = this.zzj;
        zzcv.zzb(zzkcVar3);
        this.zzj = zzkcVar3.zzg();
        zzJ();
        zzkc zzkcVar4 = this.zzj;
        zzcv.zzb(zzkcVar4);
        return zzkcVar4;
    }

    public final zzkc zzh(zzkd zzkdVar) {
        zzkc zzkcVar;
        zzkc zzkcVar2 = this.zzl;
        long zze = zzkcVar2 == null ? 1000000000000L : (zzkcVar2.zze() + zzkcVar2.zzg.zze) - zzkdVar.zzb;
        int i10 = 0;
        while (true) {
            if (i10 >= this.zzq.size()) {
                zzkcVar = null;
                break;
            }
            zzkd zzkdVar2 = ((zzkc) this.zzq.get(i10)).zzg;
            if (zzx(zzkdVar2.zze, zzkdVar.zze) && zzkdVar2.zzb == zzkdVar.zzb && zzkdVar2.zza.equals(zzkdVar.zza)) {
                zzkcVar = (zzkc) this.zzq.remove(i10);
                break;
            }
            i10++;
        }
        if (zzkcVar == null) {
            zzkcVar = zzjt.zzd(this.zzr.zza, zzkdVar, zze);
        } else {
            zzkcVar.zzg = zzkdVar;
            zzkcVar.zzq(zze);
        }
        zzkc zzkcVar3 = this.zzl;
        if (zzkcVar3 != null) {
            zzkcVar3.zzp(zzkcVar);
        } else {
            this.zzi = zzkcVar;
            this.zzj = zzkcVar;
            this.zzk = zzkcVar;
        }
        this.zzo = null;
        this.zzl = zzkcVar;
        this.zzn++;
        zzJ();
        return zzkcVar;
    }

    public final zzkc zzi() {
        return this.zzl;
    }

    public final zzkc zzj() {
        return this.zzi;
    }

    public final zzkc zzk(zztw zztwVar) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzkc zzkcVar = (zzkc) this.zzq.get(i10);
            if (zzkcVar.zza == zztwVar) {
                return zzkcVar;
            }
        }
        return null;
    }

    public final zzkc zzl() {
        return this.zzm;
    }

    public final zzkc zzm() {
        return this.zzk;
    }

    public final zzkc zzn() {
        return this.zzj;
    }

    public final zzkd zzo(long j10, zzks zzksVar) {
        zzkc zzkcVar = this.zzl;
        return zzkcVar == null ? zzF(zzksVar.zza, zzksVar.zzb, zzksVar.zzc, zzksVar.zzs) : zzE(zzksVar.zza, zzkcVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzkd zzp(com.google.android.gms.internal.ads.zzbn r20, com.google.android.gms.internal.ads.zzkd r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            com.google.android.gms.internal.ads.zzty r3 = r2.zza
            boolean r13 = zzM(r3)
            boolean r14 = r0.zzL(r1, r3)
            boolean r15 = r0.zzK(r1, r3, r13)
            com.google.android.gms.internal.ads.zzty r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzbl r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzbl r9 = r0.zza
            r9.zzg(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzbl r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzf(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzbl r1 = r0.zza
            long r5 = r1.zzd
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzbl r1 = r0.zza
            int r4 = r3.zzb
            r1.zzk(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzbl r4 = r0.zza
            r4.zzk(r1)
        L6e:
            com.google.android.gms.internal.ads.zzkd r16 = new com.google.android.gms.internal.ads.zzkd
            long r4 = r2.zzb
            long r11 = r2.zzc
            r17 = 0
            r18 = 0
            r1 = r16
            r2 = r3
            r3 = r4
            r5 = r11
            r11 = r17
            r12 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.zzp(com.google.android.gms.internal.ads.zzbn, com.google.android.gms.internal.ads.zzkd):com.google.android.gms.internal.ads.zzkd");
    }

    public final zzty zzq(zzbn zzbnVar, Object obj, long j10) {
        long zzD;
        int zza;
        int i10 = zzbnVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zza = zzbnVar.zza(obj2)) == -1 || zzbnVar.zzd(zza, this.zza, false).zzc != i10) {
            zzkc zzkcVar = this.zzi;
            while (true) {
                if (zzkcVar == null) {
                    zzkc zzkcVar2 = this.zzi;
                    while (true) {
                        if (zzkcVar2 != null) {
                            int zza2 = zzbnVar.zza(zzkcVar2.zzb);
                            if (zza2 != -1 && zzbnVar.zzd(zza2, this.zza, false).zzc == i10) {
                                zzD = zzkcVar2.zzg.zza.zzd;
                                break;
                            }
                            zzkcVar2 = zzkcVar2.zzg();
                        } else {
                            zzD = zzD(obj);
                            if (zzD == -1) {
                                zzD = this.zze;
                                this.zze = 1 + zzD;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzD;
                                }
                            }
                        }
                    }
                } else if (zzkcVar.zzb.equals(obj)) {
                    zzD = zzkcVar.zzg.zza.zzd;
                    break;
                } else {
                    zzkcVar = zzkcVar.zzg();
                }
            }
        } else {
            zzD = this.zzp;
        }
        long j11 = zzD;
        zzbnVar.zzn(obj, this.zza);
        zzbnVar.zze(this.zza.zzc, this.zzb, 0L);
        int zza3 = zzbnVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzbm zzbmVar = this.zzb;
            if (zza3 >= zzbmVar.zzn) {
                zzbnVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzbl zzblVar = this.zza;
                if (zzblVar.zzd(zzblVar.zzd) != -1) {
                    obj3 = this.zza.zzb;
                    Objects.requireNonNull(obj3);
                }
                zza3--;
            } else {
                return zzI(zzbnVar, obj3, j10, j11, zzbmVar, this.zza);
            }
        }
    }

    public final void zzs() {
        if (this.zzn == 0) {
            return;
        }
        zzkc zzkcVar = this.zzi;
        zzcv.zzb(zzkcVar);
        this.zzo = zzkcVar.zzb;
        this.zzp = zzkcVar.zzg.zza.zzd;
        while (zzkcVar != null) {
            zzkcVar.zzo();
            zzkcVar = zzkcVar.zzg();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzJ();
    }

    public final void zzt() {
        zzkc zzkcVar = this.zzm;
        if (zzkcVar == null || zzkcVar.zzt()) {
            this.zzm = null;
            for (int i10 = 0; i10 < this.zzq.size(); i10++) {
                zzkc zzkcVar2 = (zzkc) this.zzq.get(i10);
                if (!zzkcVar2.zzt()) {
                    this.zzm = zzkcVar2;
                    return;
                }
            }
        }
    }

    public final void zzu(long j10) {
        zzkc zzkcVar = this.zzl;
        if (zzkcVar != null) {
            zzkcVar.zzn(j10);
        }
    }

    public final void zzv() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            ((zzkc) this.zzq.get(i10)).zzo();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final void zzw(zzbn zzbnVar, zzic zzicVar) {
        this.zzh = zzicVar;
        long j10 = zzicVar.zzb;
        zzv();
    }

    public final boolean zzy(zztw zztwVar) {
        zzkc zzkcVar = this.zzl;
        return zzkcVar != null && zzkcVar.zza == zztwVar;
    }

    public final boolean zzz(zztw zztwVar) {
        zzkc zzkcVar = this.zzm;
        return zzkcVar != null && zzkcVar.zza == zztwVar;
    }
}
