package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjg extends zzg implements zzid {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzlg zzE;
    private zzic zzF;
    private zzbd zzG;
    private zzat zzH;
    private Object zzI;
    private Surface zzJ;
    private int zzK;
    private zzdy zzL;
    private int zzM;
    private zze zzN;
    private float zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzat zzT;
    private zzks zzU;
    private int zzV;
    private long zzW;
    private final zzio zzX;
    private zzvv zzY;
    final zzxw zzb;
    final zzbd zzc;
    private final zzcz zze = new zzcz(zzcw.zza);
    private final Context zzf;
    private final zzbh zzg;
    private final zzla[] zzh;
    private final zzla[] zzi;
    private final zzxv zzj;
    private final zzdg zzk;
    private final zzjt zzl;
    private final zzdm zzm;
    private final CopyOnWriteArraySet zzn;
    private final zzbl zzo;
    private final List zzp;
    private final boolean zzq;
    private final zzlm zzr;
    private final Looper zzs;
    private final zzyd zzt;
    private final zzcw zzu;
    private final zzjc zzv;
    private final zzjd zzw;
    private final zzhh zzx;
    private final zzlk zzy;
    private final zzll zzz;

    static {
        zzaq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027c A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:35:0x0014, B:36:0x0095, B:38:0x009a, B:39:0x00a3, B:41:0x01d7, B:49:0x020a, B:53:0x0280, B:55:0x028c, B:52:0x027c, B:43:0x01e1, B:45:0x01ed, B:47:0x01fc, B:48:0x01ff), top: B:61:0x0014 }] */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzjg(com.google.android.gms.internal.ads.zzib r35, com.google.android.gms.internal.ads.zzbh r36) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.<init>(com.google.android.gms.internal.ads.zzib, com.google.android.gms.internal.ads.zzbh):void");
    }

    public static /* synthetic */ void zzI(zzjg zzjgVar, zzjq zzjqVar) {
        boolean z10;
        long j10;
        int i10 = zzjgVar.zzB - zzjqVar.zzb;
        zzjgVar.zzB = i10;
        boolean z11 = true;
        if (zzjqVar.zzc) {
            zzjgVar.zzC = zzjqVar.zzd;
            zzjgVar.zzD = true;
        }
        if (i10 == 0) {
            zzbn zzbnVar = zzjqVar.zza.zza;
            if (!zzjgVar.zzU.zza.zzo() && zzbnVar.zzo()) {
                zzjgVar.zzV = -1;
                zzjgVar.zzW = 0L;
            }
            if (!zzbnVar.zzo()) {
                List zzw = ((zzky) zzbnVar).zzw();
                zzcv.zzf(zzw.size() == zzjgVar.zzp.size());
                for (int i11 = 0; i11 < zzw.size(); i11++) {
                    ((zzje) zzjgVar.zzp.get(i11)).zzc((zzbn) zzw.get(i11));
                }
            }
            long j11 = -9223372036854775807L;
            if (zzjgVar.zzD) {
                if (zzjqVar.zza.zzb.equals(zzjgVar.zzU.zzb) && zzjqVar.zza.zzd == zzjgVar.zzU.zzs) {
                    z11 = false;
                }
                if (z11) {
                    if (!zzbnVar.zzo() && !zzjqVar.zza.zzb.zzb()) {
                        zzks zzksVar = zzjqVar.zza;
                        zzty zztyVar = zzksVar.zzb;
                        j10 = zzksVar.zzd;
                        zzjgVar.zzU(zzbnVar, zztyVar, j10);
                    } else {
                        j10 = zzjqVar.zza.zzd;
                    }
                    z10 = z11;
                    j11 = j10;
                } else {
                    z10 = z11;
                }
            } else {
                z10 = false;
            }
            zzjgVar.zzD = false;
            zzjgVar.zzad(zzjqVar.zza, 1, z10, zzjgVar.zzC, j11, -1, false);
        }
    }

    public static /* bridge */ /* synthetic */ void zzM(zzjg zzjgVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjgVar.zzaa(surface);
        zzjgVar.zzJ = surface;
    }

    private final int zzP(zzks zzksVar) {
        return zzksVar.zza.zzo() ? this.zzV : zzksVar.zza.zzn(zzksVar.zzb.zza, this.zzo).zzc;
    }

    private static int zzQ(int i10) {
        return 1;
    }

    private final long zzR(zzks zzksVar) {
        if (zzksVar.zzb.zzb()) {
            zzksVar.zza.zzn(zzksVar.zzb.zza, this.zzo);
            long j10 = zzksVar.zzc;
            if (j10 == -9223372036854775807L) {
                long j11 = zzksVar.zza.zze(zzP(zzksVar), this.zza, 0L).zzl;
                return zzeh.zzv(0L);
            }
            int i10 = zzeh.zza;
            return zzeh.zzv(j10) + zzeh.zzv(0L);
        }
        return zzeh.zzv(zzS(zzksVar));
    }

    private final long zzS(zzks zzksVar) {
        if (zzksVar.zza.zzo()) {
            return zzeh.zzs(this.zzW);
        }
        long j10 = zzksVar.zzs;
        if (zzksVar.zzb.zzb()) {
            return j10;
        }
        zzU(zzksVar.zza, zzksVar.zzb, j10);
        return j10;
    }

    private static long zzT(zzks zzksVar) {
        zzbm zzbmVar = new zzbm();
        zzbl zzblVar = new zzbl();
        zzksVar.zza.zzn(zzksVar.zzb.zza, zzblVar);
        long j10 = zzksVar.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzksVar.zza.zze(zzblVar.zzc, zzbmVar, 0L).zzl;
            return 0L;
        }
        return j10;
    }

    private final long zzU(zzbn zzbnVar, zzty zztyVar, long j10) {
        zzbnVar.zzn(zztyVar.zza, this.zzo);
        return j10;
    }

    private final Pair zzV(zzbn zzbnVar, int i10, long j10) {
        if (zzbnVar.zzo()) {
            this.zzV = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzW = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzbnVar.zzc()) {
            i10 = zzbnVar.zzg(false);
            long j11 = zzbnVar.zze(i10, this.zza, 0L).zzl;
            j10 = zzeh.zzv(0L);
        }
        return zzbnVar.zzl(this.zza, this.zzo, i10, zzeh.zzs(j10));
    }

    private final zzks zzW(zzks zzksVar, zzbn zzbnVar, Pair pair) {
        zzty zztyVar;
        zzwd zzwdVar;
        zzxw zzxwVar;
        List list;
        int i10;
        long j10;
        zzcv.zzd(zzbnVar.zzo() || pair != null);
        zzbn zzbnVar2 = zzksVar.zza;
        long zzR = zzR(zzksVar);
        zzks zzf = zzksVar.zzf(zzbnVar);
        if (zzbnVar.zzo()) {
            zzty zzh = zzks.zzh();
            long zzs = zzeh.zzs(this.zzW);
            zzks zza = zzf.zzb(zzh, zzs, zzs, zzs, 0L, zzwd.zza, this.zzb, zzfvv.zzn()).zza(zzh);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i11 = zzeh.zza;
        boolean z10 = !obj.equals(pair.first);
        if (z10) {
            zztyVar = new zzty(pair.first, -1L);
        } else {
            zztyVar = zzf.zzb;
        }
        zzty zztyVar2 = zztyVar;
        long longValue = ((Long) pair.second).longValue();
        long zzs2 = zzeh.zzs(zzR);
        if (!zzbnVar2.zzo()) {
            zzbnVar2.zzn(obj, this.zzo);
        }
        if (z10 || longValue < zzs2) {
            zzcv.zzf(!zztyVar2.zzb());
            if (z10) {
                zzwdVar = zzwd.zza;
            } else {
                zzwdVar = zzf.zzh;
            }
            zzwd zzwdVar2 = zzwdVar;
            if (z10) {
                zzxwVar = this.zzb;
            } else {
                zzxwVar = zzf.zzi;
            }
            zzxw zzxwVar2 = zzxwVar;
            if (z10) {
                list = zzfvv.zzn();
            } else {
                list = zzf.zzj;
            }
            zzks zza2 = zzf.zzb(zztyVar2, longValue, longValue, longValue, 0L, zzwdVar2, zzxwVar2, list).zza(zztyVar2);
            zza2.zzq = longValue;
            return zza2;
        } else if (i10 == 0) {
            int zza3 = zzbnVar.zza(zzf.zzk.zza);
            if (zza3 == -1 || zzbnVar.zzd(zza3, this.zzo, false).zzc != zzbnVar.zzn(zztyVar2.zza, this.zzo).zzc) {
                zzbnVar.zzn(zztyVar2.zza, this.zzo);
                if (zztyVar2.zzb()) {
                    j10 = this.zzo.zzf(zztyVar2.zzb, zztyVar2.zzc);
                } else {
                    j10 = this.zzo.zzd;
                }
                zzks zza4 = zzf.zzb(zztyVar2, zzf.zzs, zzf.zzs, zzf.zzd, j10 - zzf.zzs, zzf.zzh, zzf.zzi, zzf.zzj).zza(zztyVar2);
                zza4.zzq = j10;
                return zza4;
            }
            return zzf;
        } else {
            zzcv.zzf(!zztyVar2.zzb());
            long max = Math.max(0L, zzf.zzr - (longValue - zzs2));
            long j11 = zzf.zzq;
            if (zzf.zzk.equals(zzf.zzb)) {
                j11 = longValue + max;
            }
            zzks zzb = zzf.zzb(zztyVar2, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzq = j11;
            return zzb;
        }
    }

    public final /* synthetic */ void zzX(final zzjq zzjqVar) {
        this.zzk.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzip
            @Override // java.lang.Runnable
            public final void run() {
                zzjg.zzI(zzjg.this, zzjqVar);
            }
        });
    }

    public final void zzY(final int i10, final int i11) {
        if (i10 == this.zzL.zzb() && i11 == this.zzL.zza()) {
            return;
        }
        this.zzL = new zzdy(i10, i11);
        zzdm zzdmVar = this.zzm;
        zzdmVar.zzd(24, new zzdj() { // from class: com.google.android.gms.internal.ads.zzik
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                int i12 = zzjg.zzd;
                ((zzbe) obj).zzo(i10, i11);
            }
        });
        zzdmVar.zzc();
        zzZ(2, 14, new zzdy(i10, i11));
    }

    private final void zzZ(int i10, int i11, Object obj) {
        zzla[] zzlaVarArr = this.zzh;
        int length = zzlaVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzla zzlaVar = zzlaVarArr[i12];
            if (i10 == -1 || zzlaVar.zzb() == i10) {
                int zzP = zzP(this.zzU);
                zzjt zzjtVar = this.zzl;
                zzkw zzkwVar = new zzkw(zzjtVar, zzlaVar, this.zzU.zza, zzP == -1 ? 0 : zzP, this.zzu, zzjtVar.zzc());
                zzkwVar.zzf(i11);
                zzkwVar.zze(obj);
                zzkwVar.zzd();
            }
        }
    }

    public final void zzaa(Object obj) {
        Object obj2 = this.zzI;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zzr = this.zzl.zzr(obj, z10 ? this.zzA : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.zzI;
            Surface surface = this.zzJ;
            if (obj3 == surface) {
                surface.release();
                this.zzJ = null;
            }
        }
        this.zzI = obj;
        if (zzr) {
            return;
        }
        zzab(zzhs.zzd(new zzju(3), 1003));
    }

    private final void zzab(zzhs zzhsVar) {
        zzks zzksVar = this.zzU;
        zzks zza = zzksVar.zza(zzksVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzks zze = zza.zze(1);
        if (zzhsVar != null) {
            zze = zze.zzd(zzhsVar);
        }
        this.zzB++;
        this.zzl.zzp();
        zzad(zze, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final void zzac(boolean z10, int i10, int i11) {
        zzks zzksVar = this.zzU;
        if (zzksVar.zzl == z10 && zzksVar.zzn == 0 && zzksVar.zzm == i11) {
            return;
        }
        this.zzB++;
        zzks zzc = zzksVar.zzc(z10, i11, 0);
        this.zzl.zzo(z10, i11, 0);
        zzad(zzc, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x04e7  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzad(final com.google.android.gms.internal.ads.zzks r43, final int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.zzad(com.google.android.gms.internal.ads.zzks, int, boolean, int, long, int, boolean):void");
    }

    private final void zzae() {
        int zzg = zzg();
        if (zzg != 2 && zzg != 3) {
            this.zzy.zza(false);
            this.zzz.zza(false);
            return;
        }
        zzaf();
        boolean z10 = this.zzU.zzp;
        this.zzy.zza(zzv());
        this.zzz.zza(zzv());
    }

    private final void zzaf() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), this.zzs.getThread().getName()};
            int i10 = zzeh.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (!this.zzQ) {
                zzdn.zzg("ExoPlayerImpl", format, this.zzR ? null : new IllegalStateException());
                this.zzR = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeh.zze;
        String zza = zzaq.zza();
        zzdn.zze("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.6.0-alpha01] [" + str + "] [" + zza + b9.i.f16698e);
        zzaf();
        this.zzy.zza(false);
        this.zzz.zza(false);
        if (!this.zzl.zzq()) {
            zzdm zzdmVar = this.zzm;
            zzdmVar.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzil
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj) {
                    int i10 = zzjg.zzd;
                    ((zzbe) obj).zzj(zzhs.zzd(new zzju(1), 1003));
                }
            });
            zzdmVar.zzc();
        }
        this.zzm.zze();
        this.zzk.zze(null);
        this.zzt.zzg(this.zzr);
        zzks zzksVar = this.zzU;
        boolean z10 = zzksVar.zzp;
        zzks zze = zzksVar.zze(1);
        this.zzU = zze;
        zzks zza2 = zze.zza(zze.zzb);
        this.zzU = zza2;
        zza2.zzq = zza2.zzs;
        this.zzU.zzr = 0L;
        this.zzr.zzQ();
        this.zzj.zzj();
        Surface surface = this.zzJ;
        if (surface != null) {
            surface.release();
            this.zzJ = null;
        }
        int i10 = zzco.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void zzB(zzlp zzlpVar) {
        zzaf();
        this.zzr.zzR(zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void zzC(zzua zzuaVar) {
        zzaf();
        List singletonList = Collections.singletonList(zzuaVar);
        zzaf();
        zzaf();
        zzP(this.zzU);
        zzl();
        this.zzB++;
        boolean z10 = false;
        if (!this.zzp.isEmpty()) {
            int size = this.zzp.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzp.remove(i10);
            }
            this.zzY = this.zzY.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzkp zzkpVar = new zzkp((zzua) singletonList.get(i11), this.zzq);
            arrayList.add(zzkpVar);
            this.zzp.add(i11, new zzje(zzkpVar.zzb, zzkpVar.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzky zzkyVar = new zzky(this.zzp, this.zzY);
        if (!zzkyVar.zzo() && zzkyVar.zzc() < 0) {
            throw new zzaa(zzkyVar, -1, -9223372036854775807L);
        }
        int zzg = zzkyVar.zzg(false);
        zzks zzW = zzW(this.zzU, zzkyVar, zzV(zzkyVar, zzg, -9223372036854775807L));
        int i12 = zzW.zze;
        if (zzg != -1 && i12 != 1) {
            i12 = (zzkyVar.zzo() || zzg >= zzkyVar.zzc()) ? 4 : 2;
        }
        zzks zze = zzW.zze(i12);
        this.zzl.zzs(arrayList, zzg, zzeh.zzs(-9223372036854775807L), this.zzY);
        if (!this.zzU.zzb.zza.equals(zze.zzb.zza) && !this.zzU.zza.zzo()) {
            z10 = true;
        }
        zzad(zze, 0, z10, 4, zzS(zze), -1, false);
    }

    public final zzhs zzE() {
        zzaf();
        return this.zzU.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zzb(int i10, long j10, int i11, boolean z10) {
        zzaf();
        if (i10 == -1) {
            return;
        }
        zzcv.zzd(i10 >= 0);
        zzbn zzbnVar = this.zzU.zza;
        if (zzbnVar.zzo() || i10 < zzbnVar.zzc()) {
            this.zzr.zzu();
            this.zzB++;
            if (zzx()) {
                zzdn.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzjq zzjqVar = new zzjq(this.zzU);
                zzjqVar.zza(1);
                this.zzX.zza.zzX(zzjqVar);
                return;
            }
            zzks zzksVar = this.zzU;
            int i12 = zzksVar.zze;
            if (i12 == 3 || (i12 == 4 && !zzbnVar.zzo())) {
                zzksVar = this.zzU.zze(2);
            }
            int zze = zze();
            zzks zzW = zzW(zzksVar, zzbnVar, zzV(zzbnVar, i10, j10));
            this.zzl.zzm(zzbnVar, i10, zzeh.zzs(j10));
            zzad(zzW, 0, true, 1, zzS(zzW), zze, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzc() {
        zzaf();
        if (zzx()) {
            return this.zzU.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzd() {
        zzaf();
        if (zzx()) {
            return this.zzU.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zze() {
        zzaf();
        int zzP = zzP(this.zzU);
        if (zzP == -1) {
            return 0;
        }
        return zzP;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzf() {
        zzaf();
        if (this.zzU.zza.zzo()) {
            return 0;
        }
        zzks zzksVar = this.zzU;
        return zzksVar.zza.zza(zzksVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzg() {
        zzaf();
        return this.zzU.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzh() {
        zzaf();
        return this.zzU.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzi() {
        zzaf();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzj() {
        zzaf();
        if (zzx()) {
            zzks zzksVar = this.zzU;
            if (zzksVar.zzk.equals(zzksVar.zzb)) {
                return zzeh.zzv(this.zzU.zzq);
            }
            return zzm();
        }
        zzaf();
        if (this.zzU.zza.zzo()) {
            return this.zzW;
        }
        zzks zzksVar2 = this.zzU;
        long j10 = 0;
        if (zzksVar2.zzk.zzd != zzksVar2.zzb.zzd) {
            return zzeh.zzv(zzksVar2.zza.zze(zze(), this.zza, 0L).zzm);
        }
        long j11 = zzksVar2.zzq;
        if (this.zzU.zzk.zzb()) {
            zzks zzksVar3 = this.zzU;
            zzksVar3.zza.zzn(zzksVar3.zzk.zza, this.zzo).zzg(this.zzU.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzks zzksVar4 = this.zzU;
        zzU(zzksVar4.zza, zzksVar4.zzk, j10);
        return zzeh.zzv(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzk() {
        zzaf();
        return zzR(this.zzU);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzl() {
        zzaf();
        return zzeh.zzv(zzS(this.zzU));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzm() {
        zzaf();
        if (!zzx()) {
            zzbn zzo = zzo();
            if (zzo.zzo()) {
                return -9223372036854775807L;
            }
            return zzeh.zzv(zzo.zze(zze(), this.zza, 0L).zzm);
        }
        zzks zzksVar = this.zzU;
        zzty zztyVar = zzksVar.zzb;
        zzksVar.zza.zzn(zztyVar.zza, this.zzo);
        return zzeh.zzv(this.zzo.zzf(zztyVar.zzb, zztyVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzn() {
        zzaf();
        return zzeh.zzv(this.zzU.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbn zzo() {
        zzaf();
        return this.zzU.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbv zzp() {
        zzaf();
        return this.zzU.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzq() {
        zzaf();
        zzac(zzv(), 1, zzQ(1));
        zzks zzksVar = this.zzU;
        if (zzksVar.zze != 1) {
            return;
        }
        zzks zzd2 = zzksVar.zzd(null);
        zzks zze = zzd2.zze(true != zzd2.zza.zzo() ? 2 : 4);
        this.zzB++;
        this.zzl.zzl();
        zzad(zze, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzr(boolean z10) {
        zzaf();
        zzg();
        zzac(z10, 1, zzQ(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzs(Surface surface) {
        zzaf();
        zzaa(surface);
        int i10 = surface == null ? 0 : -1;
        zzY(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzt(float f10) {
        zzaf();
        int i10 = zzeh.zza;
        final float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzO == max) {
            return;
        }
        this.zzO = max;
        this.zzx.zza();
        zzZ(1, 2, Float.valueOf(max));
        zzdm zzdmVar = this.zzm;
        zzdmVar.zzd(22, new zzdj() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                int i11 = zzjg.zzd;
                ((zzbe) obj).zzs(max);
            }
        });
        zzdmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzu() {
        zzaf();
        zzv();
        zzab(null);
        int i10 = zzco.zza;
        zzfvv zzn = zzfvv.zzn();
        long j10 = this.zzU.zzs;
        zzfvv.zzl(zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzv() {
        zzaf();
        return this.zzU.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzw() {
        zzaf();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzx() {
        zzaf();
        return this.zzU.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final int zzy() {
        zzaf();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void zzz(zzlp zzlpVar) {
        this.zzr.zzt(zzlpVar);
    }
}
