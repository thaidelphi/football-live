package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzvr implements zzadp {
    private boolean zzA;
    private zzqz zzB;
    private final zzvl zza;
    private final zzqy zzd;
    private final zzqt zze;
    private zzvp zzf;
    private zzz zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzz zzy;
    private final zzvn zzb = new zzvn();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzado[] zzn = new zzado[1000];
    private final zzvy zzc = new zzvy(new zzda() { // from class: com.google.android.gms.internal.ads.zzvm
        @Override // com.google.android.gms.internal.ads.zzda
        public final void zza(Object obj) {
            zzqx zzqxVar = ((zzvo) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzvr(zzye zzyeVar, zzqy zzqyVar, zzqt zzqtVar) {
        this.zzd = zzqyVar;
        this.zze = zzqtVar;
        this.zza = new zzvl(zzyeVar);
    }

    private final int zzB(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.zzm[i10] > j10 ? 1 : (this.zzm[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzC(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int zzD(zzjv zzjvVar, zzha zzhaVar, boolean z10, boolean z11, zzvn zzvnVar) {
        zzhaVar.zzd = false;
        if (!zzL()) {
            if (!z11 && !this.zzv) {
                zzz zzzVar = this.zzy;
                if (zzzVar == null || (!z10 && zzzVar == this.zzg)) {
                    return -3;
                }
                zzI(zzzVar, zzjvVar);
                return -5;
            }
            zzhaVar.zzc(4);
            zzhaVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzz zzzVar2 = ((zzvo) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z10 && zzzVar2 == this.zzg) {
            int zzC = zzC(this.zzr);
            if (!zzM(zzC)) {
                zzhaVar.zzd = true;
                return -3;
            }
            zzhaVar.zzc(this.zzl[zzC]);
            if (this.zzr == this.zzo - 1 && (z11 || this.zzv)) {
                zzhaVar.zza(536870912);
            }
            zzhaVar.zze = this.zzm[zzC];
            zzvnVar.zza = this.zzk[zzC];
            zzvnVar.zzb = this.zzj[zzC];
            zzvnVar.zzc = this.zzn[zzC];
            return -4;
        }
        zzI(zzzVar2, zzjvVar);
        return -5;
    }

    private final synchronized long zzE(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzo;
        if (i11 != 0) {
            long[] jArr = this.zzm;
            int i12 = this.zzq;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzr) != i11) {
                    i11 = i10 + 1;
                }
                int zzB = zzB(i12, i11, j10, false);
                if (zzB != -1) {
                    return zzG(zzB);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzF() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzG(i10);
    }

    private final long zzG(int i10) {
        int i11;
        long j10 = this.zzt;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzC = zzC(i10 - 1);
            for (int i12 = 0; i12 < i10; i12++) {
                j11 = Math.max(j11, this.zzm[zzC]);
                if ((this.zzl[zzC] & 1) != 0) {
                    break;
                }
                zzC--;
                if (zzC == -1) {
                    zzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, j11);
        this.zzo -= i10;
        int i13 = this.zzp + i10;
        this.zzp = i13;
        int i14 = this.zzq + i10;
        this.zzq = i14;
        int i15 = this.zzh;
        if (i14 >= i15) {
            this.zzq = i14 - i15;
        }
        int i16 = this.zzr - i10;
        this.zzr = i16;
        if (i16 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i13);
        if (this.zzo == 0) {
            int i17 = this.zzq;
            if (i17 == 0) {
                i17 = this.zzh;
            }
            return this.zzj[i17 - 1] + this.zzk[i11];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzH(long j10, int i10, long j11, int i11, zzado zzadoVar) {
        int i12 = this.zzo;
        if (i12 > 0) {
            int zzC = zzC(i12 - 1);
            zzcv.zzd(this.zzj[zzC] + ((long) this.zzk[zzC]) <= j11);
        }
        this.zzv = (536870912 & i10) != 0;
        this.zzu = Math.max(this.zzu, j10);
        int zzC2 = zzC(this.zzo);
        this.zzm[zzC2] = j10;
        this.zzj[zzC2] = j11;
        this.zzk[zzC2] = i11;
        this.zzl[zzC2] = i10;
        this.zzn[zzC2] = zzadoVar;
        this.zzi[zzC2] = 0;
        if (this.zzc.zzf() || !((zzvo) this.zzc.zzb()).zza.equals(this.zzy)) {
            zzz zzzVar = this.zzy;
            Objects.requireNonNull(zzzVar);
            this.zzc.zzc(this.zzp + this.zzo, new zzvo(zzzVar, this.zzd.zzb(this.zze, zzzVar), null));
        }
        int i13 = this.zzo + 1;
        this.zzo = i13;
        int i14 = this.zzh;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzado[] zzadoVarArr = new zzado[i15];
            int i16 = this.zzq;
            int i17 = i14 - i16;
            System.arraycopy(this.zzj, i16, jArr2, 0, i17);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i17);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i17);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzq, zzadoVarArr, 0, i17);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i17);
            int i18 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i17, i18);
            System.arraycopy(this.zzm, 0, jArr3, i17, i18);
            System.arraycopy(this.zzl, 0, iArr, i17, i18);
            System.arraycopy(this.zzk, 0, iArr2, i17, i18);
            System.arraycopy(this.zzn, 0, zzadoVarArr, i17, i18);
            System.arraycopy(this.zzi, 0, jArr, i17, i18);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzadoVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i15;
        }
    }

    private final void zzI(zzz zzzVar, zzjv zzjvVar) {
        zzz zzzVar2 = this.zzg;
        zzs zzsVar = zzzVar2 == null ? null : zzzVar2.zzs;
        this.zzg = zzzVar;
        zzs zzsVar2 = zzzVar.zzs;
        zzjvVar.zza = zzzVar.zzc(this.zzd.zza(zzzVar));
        zzjvVar.zzb = this.zzB;
        if (zzzVar2 != null) {
            int i10 = zzeh.zza;
            if (Objects.equals(zzsVar, zzsVar2)) {
                return;
            }
        }
        zzqz zzc = this.zzd.zzc(this.zze, zzzVar);
        this.zzB = zzc;
        zzjvVar.zzb = zzc;
    }

    private final void zzJ() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i10) {
        if (this.zzB != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(zzz zzzVar) {
        this.zzx = false;
        zzz zzzVar2 = this.zzy;
        int i10 = zzeh.zza;
        if (Objects.equals(zzzVar, zzzVar2)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzvo) this.zzc.zzb()).zza.equals(zzzVar)) {
            this.zzy = ((zzvo) this.zzc.zzb()).zza;
        } else {
            this.zzy = zzzVar;
        }
        boolean z10 = this.zzz;
        zzz zzzVar3 = this.zzy;
        this.zzz = z10 & zzay.zzf(zzzVar3.zzo, zzzVar3.zzk);
        this.zzA = false;
        return true;
    }

    public final synchronized boolean zzA(long j10, boolean z10) {
        int zzB;
        zzK();
        int i10 = this.zzr;
        int zzC = zzC(i10);
        if (zzL() && j10 >= this.zzm[zzC]) {
            if (j10 > this.zzu) {
                if (z10) {
                    z10 = true;
                }
            }
            if (this.zzz) {
                zzB = this.zzo - i10;
                int i11 = 0;
                while (true) {
                    if (i11 < zzB) {
                        if (this.zzm[zzC] >= j10) {
                            zzB = i11;
                            break;
                        }
                        zzC++;
                        if (zzC == this.zzh) {
                            zzC = 0;
                        }
                        i11++;
                    } else if (!z10) {
                        zzB = -1;
                    }
                }
            } else {
                zzB = zzB(zzC, this.zzo - i10, j10, true);
            }
            if (zzB != -1) {
                this.zzs = j10;
                this.zzr += zzB;
                return true;
            }
        }
        return false;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j10, boolean z10) {
        int i10 = this.zzr;
        int zzC = zzC(i10);
        if (zzL() && j10 >= this.zzm[zzC]) {
            if (j10 > this.zzu && z10) {
                return this.zzo - i10;
            }
            int zzB = zzB(zzC, this.zzo - i10, j10, true);
            if (zzB == -1) {
                return 0;
            }
            return zzB;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(com.google.android.gms.internal.ads.zzjv r9, com.google.android.gms.internal.ads.zzha r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzvn r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzD(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzvl r9 = r8.zza
            com.google.android.gms.internal.ads.zzvn r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzvl r9 = r8.zza
            com.google.android.gms.internal.ads.zzvn r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvr.zze(com.google.android.gms.internal.ads.zzjv, com.google.android.gms.internal.ads.zzha, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzl zzlVar, int i10, boolean z10) {
        return zzadn.zza(this, zzlVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzl zzlVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zza(zzlVar, i10, z10);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzz zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzE(j10, false, z11));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzl(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzm(zzz zzzVar) {
        boolean zzN = zzN(zzzVar);
        zzvp zzvpVar = this.zzf;
        if (zzvpVar == null || !zzN) {
            return;
        }
        zzvpVar.zzN(zzzVar);
    }

    public final void zzn() throws IOException {
        zzqz zzqzVar = this.zzB;
        if (zzqzVar != null) {
            throw zzqzVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzr(zzdx zzdxVar, int i10) {
        zzadn.zzb(this, zzdxVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(zzdx zzdxVar, int i10, int i11) {
        this.zza.zzh(zzdxVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzt(long j10, int i10, int i11, int i12, zzado zzadoVar) {
        if (this.zzw) {
            if ((i10 & 1) == 0) {
                return;
            }
            this.zzw = false;
        }
        if (this.zzz) {
            if (j10 < this.zzs) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzA) {
                    zzdn.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                    this.zzA = true;
                }
                i10 |= 1;
            }
        }
        zzH(j10, i10, (this.zza.zzb() - i11) - i12, i11, zzadoVar);
    }

    public final void zzu(long j10) {
        this.zzs = j10;
    }

    public final void zzv(zzvp zzvpVar) {
        this.zzf = zzvpVar;
    }

    public final synchronized void zzw(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcv.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z10) {
        boolean z11 = true;
        if (zzL()) {
            if (((zzvo) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z10 && !this.zzv) {
            zzz zzzVar = this.zzy;
            if (zzzVar == null) {
                z11 = false;
            } else if (zzzVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean zzz(int i10) {
        boolean z10;
        zzK();
        int i11 = this.zzp;
        if (i10 >= i11 && i10 <= this.zzo + i11) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i10 - i11;
            z10 = true;
        }
        z10 = false;
        return z10;
    }
}
