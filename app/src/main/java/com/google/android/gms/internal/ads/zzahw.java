package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzahw implements zzacj, zzadi {
    private long zzA;
    private int zzB;
    private zzaga zzC;
    private final zzaje zza;
    private final int zzb;
    private final zzdx zzc;
    private final zzdx zzd;
    private final zzdx zze;
    private final zzdx zzf;
    private final ArrayDeque zzg;
    private final zzaia zzh;
    private final List zzi;
    private zzfvv zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzdx zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzacm zzw;
    private zzahv[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzahw() {
        this(zzaje.zza, 16);
    }

    private static int zzj(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzaif zzaifVar, long j10) {
        int zza = zzaifVar.zza(j10);
        return zza == -1 ? zzaifVar.zzb(j10) : zza;
    }

    private static long zzl(zzaif zzaifVar, long j10, long j11) {
        int zzk = zzk(zzaifVar, j10);
        return zzk == -1 ? j11 : Math.min(zzaifVar.zzc[zzk], j11);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j10) throws zzaz {
        zzav zzavVar;
        long j11;
        int i10;
        List list;
        long j12;
        zzav zzavVar2;
        int i11;
        ArrayList arrayList;
        int i12;
        while (!this.zzg.isEmpty() && ((zzek) this.zzg.peek()).zza == j10) {
            zzek zzekVar = (zzek) this.zzg.pop();
            if (zzekVar.zzd == 1836019574) {
                zzek zza = zzekVar.zza(1835365473);
                new ArrayList();
                zzav zzb = zza != null ? zzahk.zzb(zza) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.zzB == 1;
                zzacx zzacxVar = new zzacx();
                zzel zzb2 = zzekVar.zzb(1969517665);
                if (zzb2 != null) {
                    zzav zzc = zzahk.zzc(zzb2);
                    zzacxVar.zzb(zzc);
                    zzavVar = zzc;
                } else {
                    zzavVar = null;
                }
                zzel zzb3 = zzekVar.zzb(1836476516);
                Objects.requireNonNull(zzb3);
                zzav zzavVar3 = new zzav(-9223372036854775807L, zzahk.zzd(zzb3.zza));
                ArrayList arrayList3 = arrayList2;
                List zzf = zzahk.zzf(zzekVar, zzacxVar, -9223372036854775807L, null, 1 == (this.zzb & 1), z10, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzahu
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        return (zzaic) obj;
                    }
                });
                String zza2 = zzaht.zza(zzf);
                long j13 = -9223372036854775807L;
                int i13 = 0;
                int i14 = 0;
                int i15 = -1;
                while (true) {
                    j11 = 0;
                    if (i13 >= zzf.size()) {
                        break;
                    }
                    zzaif zzaifVar = (zzaif) zzf.get(i13);
                    if (zzaifVar.zzb == 0) {
                        list = zzf;
                        arrayList = arrayList3;
                    } else {
                        zzaic zzaicVar = zzaifVar.zza;
                        int i16 = i14 + 1;
                        zzahv zzahvVar = new zzahv(zzaicVar, zzaifVar, this.zzw.zzw(i14, zzaicVar.zzb));
                        long j14 = zzaicVar.zze;
                        if (j14 == -9223372036854775807L) {
                            j14 = zzaifVar.zzh;
                        }
                        zzahvVar.zzc.zzl(j14);
                        long max = Math.max(j13, j14);
                        if ("audio/true-hd".equals(zzaicVar.zzg.zzo)) {
                            i10 = zzaifVar.zze * 16;
                        } else {
                            i10 = zzaifVar.zze + 30;
                        }
                        zzx zzb4 = zzaicVar.zzg.zzb();
                        zzb4.zzT(i10);
                        list = zzf;
                        if (zzaicVar.zzb == 2) {
                            zzz zzzVar = zzaicVar.zzg;
                            int i17 = this.zzb;
                            j12 = max;
                            int i18 = zzzVar.zzf;
                            if ((i17 & 8) != 0) {
                                i18 |= i15 == -1 ? 1 : 2;
                            }
                            if (zzzVar.zzx == -1.0f && j14 > 0 && (i12 = zzaifVar.zzb) > 0) {
                                zzb4.zzK(i12 / (((float) j14) / 1000000.0f));
                            }
                            zzb4.zzab(i18);
                        } else {
                            j12 = max;
                        }
                        if (zzaicVar.zzb == 1 && zzacxVar.zza()) {
                            zzb4.zzI(zzacxVar.zza);
                            zzb4.zzJ(zzacxVar.zzb);
                        }
                        int i19 = zzaicVar.zzb;
                        zzav[] zzavVarArr = new zzav[3];
                        if (this.zzi.isEmpty()) {
                            i11 = 0;
                            zzavVar2 = null;
                        } else {
                            zzavVar2 = new zzav(this.zzi);
                            i11 = 0;
                        }
                        zzavVarArr[i11] = zzavVar2;
                        zzavVarArr[1] = zzavVar;
                        zzavVarArr[2] = zzavVar3;
                        zzav zzavVar4 = new zzav(-9223372036854775807L, new zzau[i11]);
                        if (zzb != null) {
                            for (int i20 = 0; i20 < zzb.zza(); i20++) {
                                zzau zzb5 = zzb.zzb(i20);
                                if (zzb5 instanceof zzej) {
                                    zzej zzejVar = (zzej) zzb5;
                                    if (!zzejVar.zza.equals("com.android.capture.fps")) {
                                        zzavVar4 = zzavVar4.zzc(zzejVar);
                                    } else if (i19 == 2) {
                                        zzavVar4 = zzavVar4.zzc(zzejVar);
                                    }
                                }
                            }
                        }
                        for (int i21 = 0; i21 < 3; i21++) {
                            zzavVar4 = zzavVar4.zzd(zzavVarArr[i21]);
                        }
                        if (zzavVar4.zza() > 0) {
                            zzb4.zzW(zzavVar4);
                        }
                        zzb4.zzE(zza2);
                        zzahvVar.zzc.zzm(zzb4.zzaj());
                        if (zzaicVar.zzb == 2 && i15 == -1) {
                            i15 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzahvVar);
                        i14 = i16;
                        j13 = j12;
                    }
                    i13++;
                    arrayList3 = arrayList;
                    zzf = list;
                }
                this.zzz = i15;
                this.zzA = j13;
                zzahv[] zzahvVarArr = (zzahv[]) arrayList3.toArray(new zzahv[0]);
                this.zzx = zzahvVarArr;
                int length = zzahvVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i22 = 0; i22 < zzahvVarArr.length; i22++) {
                    jArr[i22] = new long[zzahvVarArr[i22].zzb.zzb];
                    jArr2[i22] = zzahvVarArr[i22].zzb.zzf[0];
                }
                int i23 = 0;
                while (i23 < zzahvVarArr.length) {
                    long j15 = Long.MAX_VALUE;
                    int i24 = -1;
                    for (int i25 = 0; i25 < zzahvVarArr.length; i25++) {
                        if (!zArr[i25]) {
                            long j16 = jArr2[i25];
                            if (j16 <= j15) {
                                i24 = i25;
                                j15 = j16;
                            }
                        }
                    }
                    int i26 = iArr[i24];
                    long[] jArr3 = jArr[i24];
                    jArr3[i26] = j11;
                    zzaif zzaifVar2 = zzahvVarArr[i24].zzb;
                    j11 += zzaifVar2.zzd[i26];
                    int i27 = i26 + 1;
                    iArr[i24] = i27;
                    if (i27 < jArr3.length) {
                        jArr2[i24] = zzaifVar2.zzf[i27];
                    } else {
                        zArr[i24] = true;
                        i23++;
                    }
                }
                this.zzy = jArr;
                this.zzw.zzG();
                this.zzw.zzP(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzek) this.zzg.peek()).zzc(zzekVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0454, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzack r31, com.google.android.gms.internal.ads.zzadf r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zzb(com.google.android.gms.internal.ads.zzack, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        if ((this.zzb & 16) == 0) {
            zzacmVar = new zzajh(zzacmVar, this.zza);
        }
        this.zzw = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        zzahv[] zzahvVarArr;
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j10 == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            }
            this.zzh.zzb();
            this.zzi.clear();
            return;
        }
        for (zzahv zzahvVar : this.zzx) {
            zzaif zzaifVar = zzahvVar.zzb;
            int zza = zzaifVar.zza(j11);
            if (zza == -1) {
                zza = zzaifVar.zzb(j11);
            }
            zzahvVar.zze = zza;
            zzadq zzadqVar = zzahvVar.zzd;
            if (zzadqVar != null) {
                zzadqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long j11;
        long j12;
        int zzb;
        zzahv[] zzahvVarArr = this.zzx;
        if (zzahvVarArr.length == 0) {
            zzadj zzadjVar = zzadj.zza;
            return new zzadg(zzadjVar, zzadjVar);
        }
        int i10 = this.zzz;
        long j13 = -1;
        if (i10 != -1) {
            zzaif zzaifVar = zzahvVarArr[i10].zzb;
            int zzk = zzk(zzaifVar, j10);
            if (zzk == -1) {
                zzadj zzadjVar2 = zzadj.zza;
                return new zzadg(zzadjVar2, zzadjVar2);
            }
            long j14 = zzaifVar.zzf[zzk];
            j11 = zzaifVar.zzc[zzk];
            if (j14 >= j10 || zzk >= zzaifVar.zzb - 1 || (zzb = zzaifVar.zzb(j10)) == -1 || zzb == zzk) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zzaifVar.zzf[zzb];
                j13 = zzaifVar.zzc[zzb];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzahv[] zzahvVarArr2 = this.zzx;
            if (i11 >= zzahvVarArr2.length) {
                break;
            }
            if (i11 != this.zzz) {
                zzaif zzaifVar2 = zzahvVarArr2[i11].zzb;
                long zzl = zzl(zzaifVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzl(zzaifVar2, j12, j13);
                }
                j11 = zzl;
            }
            i11++;
        }
        zzadj zzadjVar3 = new zzadj(j10, j11);
        if (j12 == -9223372036854775807L) {
            return new zzadg(zzadjVar3, zzadjVar3);
        }
        return new zzadg(zzadjVar3, new zzadj(j12, j13));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        zzadm zzb = zzaib.zzb(zzackVar, (this.zzb & 2) != 0);
        this.zzj = zzb != null ? zzfvv.zzo(zzb) : zzfvv.zzn();
        return zzb == null;
    }

    public zzahw(zzaje zzajeVar, int i10) {
        this.zza = zzajeVar;
        this.zzb = i10;
        this.zzj = zzfvv.zzn();
        this.zzk = (i10 & 4) != 0 ? 3 : 0;
        this.zzh = new zzaia();
        this.zzi = new ArrayList();
        this.zzf = new zzdx(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzdx(zzfd.zza);
        this.zzd = new zzdx(6);
        this.zze = new zzdx();
        this.zzp = -1;
        this.zzw = zzacm.zza;
        this.zzx = new zzahv[0];
    }
}
