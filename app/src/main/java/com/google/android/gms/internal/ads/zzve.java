package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzve implements zztw, zzacm, zzyk, zzyo, zzvp {
    private static final Map zzb;
    private static final zzz zzc;
    private zzadi zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzye zzP;
    private final Uri zzd;
    private final zzfr zze;
    private final zzqy zzf;
    private final zzui zzg;
    private final zzqt zzh;
    private final zzva zzi;
    private final long zzj;
    private final long zzk;
    private final zzut zzm;
    private zztv zzr;
    private zzafj zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvd zzz;
    private final zzys zzl = new zzys("ProgressiveMediaPeriod");
    private final zzcz zzn = new zzcz(zzcw.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzuv
        @Override // java.lang.Runnable
        public final void run() {
            zzve.this.zzV();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzuw
        @Override // java.lang.Runnable
        public final void run() {
            zzve.zzA(zzve.this);
        }
    };
    private final Handler zzq = zzeh.zzy(null);
    private zzvc[] zzu = new zzvc[0];
    private zzvr[] zzt = new zzvr[0];
    private long zzK = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzx zzxVar = new zzx();
        zzxVar.zzO("icy");
        zzxVar.zzad("application/x-icy");
        zzc = zzxVar.zzaj();
    }

    public zzve(Uri uri, zzfr zzfrVar, zzut zzutVar, zzqy zzqyVar, zzqt zzqtVar, zzyi zzyiVar, zzui zzuiVar, zzva zzvaVar, zzye zzyeVar, String str, int i10, int i11, zzz zzzVar, long j10, zzza zzzaVar) {
        this.zzd = uri;
        this.zze = zzfrVar;
        this.zzf = zzqyVar;
        this.zzh = zzqtVar;
        this.zzg = zzuiVar;
        this.zzi = zzvaVar;
        this.zzP = zzyeVar;
        this.zzj = i10;
        this.zzm = zzutVar;
        this.zzk = j10;
    }

    public static /* synthetic */ void zzA(zzve zzveVar) {
        if (zzveVar.zzO) {
            return;
        }
        zztv zztvVar = zzveVar.zzr;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzh(zzveVar);
    }

    public static /* synthetic */ void zzC(zzve zzveVar, zzadi zzadiVar) {
        zzveVar.zzA = zzveVar.zzs == null ? zzadiVar : new zzadh(-9223372036854775807L, 0L);
        zzveVar.zzB = zzadiVar.zza();
        boolean z10 = false;
        if (!zzveVar.zzI && zzadiVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        zzveVar.zzC = z10;
        zzveVar.zzD = true == z10 ? 7 : 1;
        if (zzveVar.zzw) {
            zzveVar.zzi.zza(zzveVar.zzB, zzadiVar.zzh(), zzveVar.zzC);
        } else {
            zzveVar.zzV();
        }
    }

    private final int zzR() {
        int i10 = 0;
        for (zzvr zzvrVar : this.zzt) {
            i10 += zzvrVar.zzd();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzS(boolean z10) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (true) {
            zzvr[] zzvrVarArr = this.zzt;
            if (i10 >= zzvrVarArr.length) {
                return j10;
            }
            if (!z10) {
                zzvd zzvdVar = this.zzz;
                Objects.requireNonNull(zzvdVar);
                i10 = zzvdVar.zzc[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, zzvrVarArr[i10].zzh());
        }
    }

    private final zzadp zzT(zzvc zzvcVar) {
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzvcVar.equals(this.zzu[i10])) {
                return this.zzt[i10];
            }
        }
        if (this.zzv) {
            int i11 = zzvcVar.zza;
            zzdn.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + i11 + ") after finishing tracks.");
            return new zzace();
        }
        zzvr zzvrVar = new zzvr(this.zzP, this.zzf, this.zzh);
        zzvrVar.zzv(this);
        int i12 = length + 1;
        zzvc[] zzvcVarArr = (zzvc[]) Arrays.copyOf(this.zzu, i12);
        zzvcVarArr[length] = zzvcVar;
        int i13 = zzeh.zza;
        this.zzu = zzvcVarArr;
        zzvr[] zzvrVarArr = (zzvr[]) Arrays.copyOf(this.zzt, i12);
        zzvrVarArr[length] = zzvrVar;
        this.zzt = zzvrVarArr;
        return zzvrVar;
    }

    private final void zzU() {
        zzcv.zzf(this.zzw);
        Objects.requireNonNull(this.zzz);
        Objects.requireNonNull(this.zzA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzV() {
        zzav zzc2;
        int i10;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzvr zzvrVar : this.zzt) {
            if (zzvrVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzc();
        int length = this.zzt.length;
        zzbo[] zzboVarArr = new zzbo[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzz zzi = this.zzt[i11].zzi();
            Objects.requireNonNull(zzi);
            String str = zzi.zzo;
            boolean zzh = zzay.zzh(str);
            boolean z10 = zzh || zzay.zzj(str);
            zArr[i11] = z10;
            this.zzx = z10 | this.zzx;
            this.zzy = this.zzk != -9223372036854775807L && length == 1 && zzay.zzi(str);
            zzafj zzafjVar = this.zzs;
            if (zzafjVar != null) {
                if (zzh || this.zzu[i11].zzb) {
                    zzav zzavVar = zzi.zzl;
                    if (zzavVar == null) {
                        zzc2 = new zzav(-9223372036854775807L, zzafjVar);
                    } else {
                        zzc2 = zzavVar.zzc(zzafjVar);
                    }
                    zzx zzb2 = zzi.zzb();
                    zzb2.zzW(zzc2);
                    zzi = zzb2.zzaj();
                }
                if (zzh && zzi.zzh == -1 && zzi.zzi == -1 && (i10 = zzafjVar.zza) != -1) {
                    zzx zzb3 = zzi.zzb();
                    zzb3.zzA(i10);
                    zzi = zzb3.zzaj();
                }
            }
            zzz zzc3 = zzi.zzc(this.zzf.zza(zzi));
            zzboVarArr[i11] = new zzbo(Integer.toString(i11), zzc3);
            this.zzG = zzc3.zzu | this.zzG;
        }
        this.zzz = new zzvd(new zzwd(zzboVarArr), zArr);
        if (this.zzy && this.zzB == -9223372036854775807L) {
            this.zzB = this.zzk;
            this.zzA = new zzuy(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
        this.zzw = true;
        zztv zztvVar = this.zzr;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzj(this);
    }

    private final void zzW(int i10) {
        zzU();
        zzvd zzvdVar = this.zzz;
        boolean[] zArr = zzvdVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzz zzb2 = zzvdVar.zza.zzb(i10).zzb(0);
        this.zzg.zzd(new zztu(1, zzay.zzb(zzb2.zzo), zzb2, 0, null, zzeh.zzv(this.zzJ), -9223372036854775807L));
        zArr[i10] = true;
    }

    private final void zzX(int i10) {
        zzU();
        if (this.zzL) {
            if ((!this.zzx || this.zzz.zzb[i10]) && !this.zzt[i10].zzy(false)) {
                this.zzK = 0L;
                this.zzL = false;
                this.zzF = true;
                this.zzJ = 0L;
                this.zzM = 0;
                for (zzvr zzvrVar : this.zzt) {
                    zzvrVar.zzq(false);
                }
                zztv zztvVar = this.zzr;
                Objects.requireNonNull(zztvVar);
                zztvVar.zzh(this);
            }
        }
    }

    private final void zzY() {
        zzuz zzuzVar = new zzuz(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzcv.zzf(zzZ());
            long j10 = this.zzB;
            if (j10 != -9223372036854775807L && this.zzK > j10) {
                this.zzN = true;
                this.zzK = -9223372036854775807L;
                return;
            }
            zzadi zzadiVar = this.zzA;
            Objects.requireNonNull(zzadiVar);
            zzuz.zzf(zzuzVar, zzadiVar.zzg(this.zzK).zza.zzc, this.zzK);
            for (zzvr zzvrVar : this.zzt) {
                zzvrVar.zzu(this.zzK);
            }
            this.zzK = -9223372036854775807L;
        }
        this.zzM = zzR();
        this.zzl.zza(zzuzVar, this, zzyi.zza(this.zzD));
    }

    private final boolean zzZ() {
        return this.zzK != -9223372036854775807L;
    }

    private final boolean zzaa() {
        return this.zzF || zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzG() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    final void zzH() throws IOException {
        this.zzl.zzi(zzyi.zza(this.zzD));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzI(int i10) throws IOException {
        this.zzt[i10].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final /* bridge */ /* synthetic */ void zzJ(zzyn zzynVar, long j10, long j11, boolean z10) {
        zzuz zzuzVar = (zzuz) zzynVar;
        zzgq zze = zzuz.zze(zzuzVar);
        zztp zztpVar = new zztp(zzuz.zzb(zzuzVar), zzuz.zzd(zzuzVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        zzuz.zzb(zzuzVar);
        this.zzg.zze(zztpVar, new zztu(1, -1, null, 0, null, zzeh.zzv(zzuz.zzc(zzuzVar)), zzeh.zzv(this.zzB)));
        if (z10) {
            return;
        }
        for (zzvr zzvrVar : this.zzt) {
            zzvrVar.zzq(false);
        }
        if (this.zzH > 0) {
            zztv zztvVar = this.zzr;
            Objects.requireNonNull(zztvVar);
            zztvVar.zzh(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final /* bridge */ /* synthetic */ void zzK(zzyn zzynVar, long j10, long j11) {
        zzadi zzadiVar;
        zzuz zzuzVar = (zzuz) zzynVar;
        if (this.zzB == -9223372036854775807L && (zzadiVar = this.zzA) != null) {
            boolean zzh = zzadiVar.zzh();
            long zzS = zzS(true);
            long j12 = zzS == Long.MIN_VALUE ? 0L : zzS + 10000;
            this.zzB = j12;
            this.zzi.zza(j12, zzh, this.zzC);
        }
        zzgq zze = zzuz.zze(zzuzVar);
        zztp zztpVar = new zztp(zzuz.zzb(zzuzVar), zzuz.zzd(zzuzVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        zzuz.zzb(zzuzVar);
        this.zzg.zzf(zztpVar, new zztu(1, -1, null, 0, null, zzeh.zzv(zzuz.zzc(zzuzVar)), zzeh.zzv(this.zzB)));
        this.zzN = true;
        zztv zztvVar = this.zzr;
        Objects.requireNonNull(zztvVar);
        zztvVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final /* bridge */ /* synthetic */ void zzL(zzyn zzynVar, long j10, long j11, int i10) {
        zztp zztpVar;
        zzuz zzuzVar = (zzuz) zzynVar;
        zzgq zze = zzuz.zze(zzuzVar);
        if (i10 == 0) {
            zztpVar = new zztp(zzuz.zzb(zzuzVar), zzuz.zzd(zzuzVar), j10);
        } else {
            zztpVar = new zztp(zzuz.zzb(zzuzVar), zzuz.zzd(zzuzVar), zze.zzh(), zze.zzi(), j10, j11, zze.zzg());
        }
        this.zzg.zzh(zztpVar, new zztu(1, -1, null, 0, null, zzeh.zzv(zzuz.zzc(zzuzVar)), zzeh.zzv(this.zzB)), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final void zzM() {
        for (zzvr zzvrVar : this.zzt) {
            zzvrVar.zzp();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzN(zzz zzzVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzO() {
        if (this.zzw) {
            for (zzvr zzvrVar : this.zzt) {
                zzvrVar.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzP(final zzadi zzadiVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzux
            @Override // java.lang.Runnable
            public final void run() {
                zzve.zzC(zzve.this, zzadiVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzQ(int i10) {
        return !zzaa() && this.zzt[i10].zzy(this.zzN);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zza(long j10, zzlg zzlgVar) {
        zzU();
        if (this.zzA.zzh()) {
            zzadg zzg = this.zzA.zzg(j10);
            zzadj zzadjVar = zzg.zza;
            zzadj zzadjVar2 = zzg.zzb;
            long j11 = zzlgVar.zzc;
            if (j11 == 0) {
                if (zzlgVar.zzd == 0) {
                    return j10;
                }
                j11 = 0;
            }
            long j12 = zzadjVar.zzb;
            int i10 = zzeh.zza;
            long j13 = j10 - j11;
            long j14 = zzlgVar.zzd;
            long j15 = j10 + j14;
            long j16 = j10 ^ j15;
            long j17 = j14 ^ j15;
            if (((j10 ^ j11) & (j10 ^ j13)) < 0) {
                j13 = Long.MIN_VALUE;
            }
            if ((j16 & j17) < 0) {
                j15 = Long.MAX_VALUE;
            }
            boolean z10 = true;
            boolean z11 = j13 <= j12 && j12 <= j15;
            long j18 = zzadjVar2.zzb;
            if (j13 > j18 || j18 > j15) {
                z10 = false;
            }
            if (z11 && z10) {
                if (Math.abs(j12 - j10) > Math.abs(j18 - j10)) {
                    return j18;
                }
            } else if (!z11) {
                return z10 ? j18 : j13;
            }
            return j12;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        long j10;
        zzU();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzvd zzvdVar = this.zzz;
                if (zzvdVar.zzb[i10] && zzvdVar.zzc[i10] && !this.zzt[i10].zzx()) {
                    j10 = Math.min(j10, this.zzt[i10].zzh());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzS(false);
        }
        return j10 == Long.MIN_VALUE ? this.zzJ : j10;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else if (!this.zzF) {
            return -9223372036854775807L;
        } else {
            if (!this.zzN && zzR() <= this.zzM) {
                return -9223372036854775807L;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zze(long j10) {
        boolean zzA;
        zzU();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j10 = 0;
        }
        this.zzF = false;
        long j11 = this.zzJ;
        this.zzJ = j10;
        if (zzZ()) {
            this.zzK = j10;
            return j10;
        }
        if (this.zzD != 7 && (this.zzN || this.zzl.zzl())) {
            int length = this.zzt.length;
            for (int i10 = 0; i10 < length; i10++) {
                zzvr zzvrVar = this.zzt[i10];
                if (zzvrVar.zzb() != 0 || j11 != j10) {
                    if (this.zzy) {
                        zzA = zzvrVar.zzz(zzvrVar.zza());
                    } else {
                        zzA = zzvrVar.zzA(j10, false);
                    }
                    if (zzA) {
                        continue;
                    } else if (!zArr[i10] && this.zzx) {
                    }
                }
            }
            return j10;
        }
        this.zzL = false;
        this.zzK = j10;
        this.zzN = false;
        this.zzG = false;
        zzys zzysVar = this.zzl;
        if (zzysVar.zzl()) {
            for (zzvr zzvrVar2 : this.zzt) {
                zzvrVar2.zzk();
            }
            this.zzl.zzg();
        } else {
            zzysVar.zzh();
            for (zzvr zzvrVar3 : this.zzt) {
                zzvrVar3.zzq(false);
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final long zzf(zzxp[] zzxpVarArr, boolean[] zArr, zzvs[] zzvsVarArr, boolean[] zArr2, long j10) {
        zzxp zzxpVar;
        int i10;
        zzU();
        zzvd zzvdVar = this.zzz;
        zzwd zzwdVar = zzvdVar.zza;
        boolean[] zArr3 = zzvdVar.zzc;
        int i11 = this.zzH;
        int i12 = 0;
        for (int i13 = 0; i13 < zzxpVarArr.length; i13++) {
            zzvs zzvsVar = zzvsVarArr[i13];
            if (zzvsVar != null && (zzxpVarArr[i13] == null || !zArr[i13])) {
                i10 = ((zzvb) zzvsVar).zzb;
                zzcv.zzf(zArr3[i10]);
                this.zzH--;
                zArr3[i10] = false;
                zzvsVarArr[i13] = null;
            }
        }
        boolean z10 = !this.zzE ? j10 == 0 || this.zzy : i11 != 0;
        for (int i14 = 0; i14 < zzxpVarArr.length; i14++) {
            if (zzvsVarArr[i14] == null && (zzxpVar = zzxpVarArr[i14]) != null) {
                zzcv.zzf(zzxpVar.zzd() == 1);
                zzcv.zzf(zzxpVar.zza(0) == 0);
                int zza = zzwdVar.zza(zzxpVar.zzg());
                zzcv.zzf(!zArr3[zza]);
                this.zzH++;
                zArr3[zza] = true;
                this.zzG = zzxpVar.zzf().zzu | this.zzG;
                zzvsVarArr[i14] = new zzvb(this, zza);
                zArr2[i14] = true;
                if (!z10) {
                    zzvr zzvrVar = this.zzt[zza];
                    z10 = (zzvrVar.zzb() == 0 || zzvrVar.zzA(j10, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            if (this.zzl.zzl()) {
                zzvr[] zzvrVarArr = this.zzt;
                int length = zzvrVarArr.length;
                while (i12 < length) {
                    zzvrVarArr[i12].zzk();
                    i12++;
                }
                this.zzl.zzg();
            } else {
                this.zzN = false;
                for (zzvr zzvrVar2 : this.zzt) {
                    zzvrVar2.zzq(false);
                }
            }
        } else if (z10) {
            j10 = zze(j10);
            while (i12 < zzvsVarArr.length) {
                if (zzvsVarArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.zzE = true;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final zzwd zzg() {
        zzU();
        return this.zzz.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzh(int i10, zzjv zzjvVar, zzha zzhaVar, int i11) {
        if (zzaa()) {
            return -3;
        }
        zzW(i10);
        int zze = this.zzt[i10].zze(zzjvVar, zzhaVar, i11, this.zzN);
        if (zze == -3) {
            zzX(i10);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzi(long j10, boolean z10) {
        if (this.zzy) {
            return;
        }
        zzU();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzt[i10].zzj(j10, false, zArr[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzj(int i10, long j10) {
        if (zzaa()) {
            return 0;
        }
        zzW(i10);
        zzvr zzvrVar = this.zzt[i10];
        int zzc2 = zzvrVar.zzc(j10, this.zzN);
        zzvrVar.zzw(zzc2);
        if (zzc2 == 0) {
            zzX(i10);
            return 0;
        }
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzk() throws IOException {
        zzH();
        if (this.zzN && !this.zzw) {
            throw zzaz.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzl(zztv zztvVar, long j10) {
        this.zzr = zztvVar;
        this.zzn.zze();
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        if (this.zzN) {
            return false;
        }
        zzys zzysVar = this.zzl;
        if (zzysVar.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zze = this.zzn.zze();
        if (zzysVar.zzl()) {
            return zze;
        }
        zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    @Override // com.google.android.gms.internal.ads.zzyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyl zzu(com.google.android.gms.internal.ads.zzyn r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zzu(com.google.android.gms.internal.ads.zzyn, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyl");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzadp zzv() {
        return zzT(new zzvc(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzadp zzw(int i10, int i11) {
        return zzT(new zzvc(i10, false));
    }
}
