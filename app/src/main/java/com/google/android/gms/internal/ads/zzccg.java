package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.ironsource.xn;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzccg extends zzcbx implements zzcab {
    public static final /* synthetic */ int zzd = 0;
    private zzcac zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcbp zzi;
    private long zzj;
    private long zzk;

    public zzccg(zzcal zzcalVar, zzcak zzcakVar) {
        super(zzcalVar);
        zzccy zzccyVar = new zzccy(zzcalVar.getContext(), zzcakVar, (zzcal) this.zzc.get(), null);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzccyVar;
        zzccyVar.zzL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzcbx, com.google.android.gms.internal.ads.zzccg] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzccg] */
    /* JADX WARN: Type inference failed for: r2v31 */
    public static /* synthetic */ void zzb(zzccg zzccgVar) {
        String str;
        zzccg zzccgVar2;
        zzccg zzccgVar3;
        zzbbk zzc;
        long longValue;
        long intValue;
        zzccg zzccgVar4;
        long j10;
        long j11;
        String str2;
        long j12;
        String zzc2 = zzc(zzccgVar.zzf);
        String str3 = xn.a.f21422g;
        try {
            zzbbd zzbbdVar = zzbbm.zzK;
            zzc = com.google.android.gms.ads.internal.client.zzbd.zzc();
            longValue = ((Long) zzc.zzb(zzbbdVar)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzs)).intValue();
            zzccgVar2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
            str = zzc2;
            zzccgVar2 = zzccgVar;
        }
        synchronized (zzccgVar) {
            try {
                long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
                long j13 = zzccgVar.zzj;
                if (a10 - j13 <= longValue) {
                    try {
                        if (!zzccgVar.zzg) {
                            if (!zzccgVar.zzh) {
                                if (zzccgVar.zze.zzV()) {
                                    long zzz = zzccgVar.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = zzccgVar.zze.zzv();
                                        if (zzv != zzccgVar.zzk) {
                                            try {
                                                j11 = intValue;
                                                str2 = zzc2;
                                                try {
                                                    zzccgVar.zzo(zzccgVar.zzf, zzc2, zzv, zzz, zzv > 0, zzccgVar2 != 0 ? zzccgVar.zze.zzA() : -1L, zzccgVar2 != 0 ? zzccgVar.zze.zzx() : -1L, zzccgVar2 != 0 ? zzccgVar.zze.zzB() : -1L, zzcac.zzs(), zzcac.zzu());
                                                    zzccgVar2 = zzccgVar;
                                                    j10 = zzv;
                                                    try {
                                                        ((zzccg) zzccgVar2).zzk = j10;
                                                        j12 = zzz;
                                                        zzccgVar2 = zzccgVar2;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        str = str2;
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    zzccgVar2 = zzccgVar;
                                                    str = str2;
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                zzccgVar2 = zzccgVar;
                                                str = zzc2;
                                            }
                                        } else {
                                            j10 = zzv;
                                            j11 = intValue;
                                            str2 = zzc2;
                                            zzccgVar2 = zzccgVar;
                                            j12 = zzz;
                                        }
                                        if (j10 >= j12) {
                                            zzccgVar2.zzj(((zzccg) zzccgVar2).zzf, str2, j12);
                                            zzccgVar3 = zzccgVar2;
                                        } else {
                                            int i10 = (((zzccg) zzccgVar2).zze.zzw() > j11 ? 1 : (((zzccg) zzccgVar2).zze.zzw() == j11 ? 0 : -1));
                                            zzccgVar4 = zzccgVar2;
                                            if (i10 >= 0) {
                                                zzccgVar4 = zzccgVar2;
                                                if (j10 > 0) {
                                                    zzccgVar3 = zzccgVar2;
                                                }
                                            }
                                        }
                                    } else {
                                        zzccgVar4 = zzccgVar;
                                    }
                                    zzccgVar4.zzx(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzL)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            zzccgVar3 = zzccgVar;
                            com.google.android.gms.ads.internal.zzv.zzz().zzc(zzccgVar3.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = j13;
                    }
                } else {
                    str = zzc2;
                    zzccgVar2 = zzccgVar;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc2;
                zzccgVar2 = zzccgVar;
            }
            try {
                throw th;
            } catch (Exception e10) {
                e = e10;
                String str4 = str3;
                String str5 = "Failed to preload url " + zzccgVar2.zzf + " Exception: " + e.getMessage();
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj(str5);
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                zzccgVar.release();
                zzccgVar2.zzg(zzccgVar2.zzf, str, str4, zzd(str4, e));
                zzccgVar3 = zzccgVar2;
                com.google.android.gms.ads.internal.zzv.zzz().zzc(zzccgVar3.zzi);
            }
        }
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzx(long j10) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccf
            @Override // java.lang.Runnable
            public final void run() {
                zzccg.zzb(zzccg.this);
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcac zzcacVar = this.zze;
        if (zzcacVar != null) {
            zzcacVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzD(int i10, int i11) {
    }

    public final zzcac zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcac zzcacVar = this.zze;
        this.zze = null;
        return zzcacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzi(final boolean z10, final long j10) {
        final zzcal zzcalVar = (zzcal) this.zzc.get();
        if (zzcalVar != null) {
            zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcce
                @Override // java.lang.Runnable
                public final void run() {
                    zzcal.this.zzv(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzk(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzl(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcbx] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzcbx
    public final boolean zzu(String str, String[] strArr) {
        String str2;
        String str3;
        zzccg zzccgVar;
        long j10;
        long j11;
        long j12;
        ?? r12;
        long j13;
        String str4;
        long j14;
        long j15;
        long j16;
        zzccg zzccgVar2 = this;
        String str5 = str;
        zzccgVar2.zzf = str5;
        String str6 = xn.a.f21422g;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            zzccgVar2.zze.zzF(uriArr, zzccgVar2.zzb);
            zzcal zzcalVar = (zzcal) zzccgVar2.zzc.get();
            if (zzcalVar != null) {
                zzcalVar.zzt(zzc, zzccgVar2);
            }
            Clock zzC = com.google.android.gms.ads.internal.zzv.zzC();
            long a10 = zzC.a();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzL)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzK)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzs)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue();
            long j17 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzC.a() - a10 <= longValue2) {
                            if (!zzccgVar2.zzg) {
                                if (zzccgVar2.zzh) {
                                    break;
                                } else if (zzccgVar2.zze.zzV()) {
                                    long zzz = zzccgVar2.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = zzccgVar2.zze.zzv();
                                        if (zzv != j17) {
                                            try {
                                                j10 = intValue;
                                                j16 = zzz;
                                                j11 = longValue2;
                                                j13 = longValue;
                                                str4 = zzc;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzccgVar = this;
                                                str2 = str;
                                                str3 = zzc;
                                            }
                                            try {
                                                zzo(str, zzc, zzv, j16, zzv > 0, booleanValue ? zzccgVar2.zze.zzA() : -1L, booleanValue ? zzccgVar2.zze.zzx() : -1L, booleanValue ? zzccgVar2.zze.zzB() : -1L, zzcac.zzs(), zzcac.zzu());
                                                j15 = zzv;
                                                j14 = zzz;
                                                str2 = j16;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                zzccgVar = this;
                                                str2 = str;
                                                str3 = str4;
                                                try {
                                                    throw th;
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    String str7 = str6;
                                                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    zzccgVar.zzg(str2, str3, str7, zzd(str7, e));
                                                    return false;
                                                }
                                            }
                                        } else {
                                            j10 = intValue;
                                            j11 = longValue2;
                                            j13 = longValue;
                                            str4 = zzc;
                                            j14 = zzz;
                                            j15 = j17;
                                            str2 = intValue;
                                        }
                                        zzccgVar = (zzv > j14 ? 1 : (zzv == j14 ? 0 : -1));
                                        if (zzccgVar >= 0) {
                                            zzj(str, str4, j14);
                                        } else {
                                            try {
                                                zzccg zzccgVar3 = this;
                                                str2 = str;
                                                str3 = str4;
                                                if (zzccgVar3.zze.zzw() < j10 || zzv <= 0) {
                                                    j12 = j13;
                                                    r12 = j15;
                                                    zzccgVar = zzccgVar3;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j10 = intValue;
                                        j11 = longValue2;
                                        str2 = str5;
                                        str3 = zzc;
                                        zzccgVar = zzccgVar2;
                                        j12 = longValue;
                                        r12 = j17;
                                    }
                                    try {
                                        try {
                                            zzccgVar.wait(j12);
                                        } catch (InterruptedException unused) {
                                            throw new IOException("Wait interrupted.");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = r12;
                                        throw th;
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzc;
                        zzccgVar = zzccgVar2;
                    }
                }
                longValue = j12;
                zzccgVar2 = zzccgVar;
                str5 = str2;
                zzc = str3;
                intValue = j10;
                longValue2 = j11;
                j17 = r12;
            }
            return true;
        } catch (Exception e10) {
            e = e10;
            str2 = str5;
            str3 = zzc;
            zzccgVar = zzccgVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzv() {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final boolean zzw(String str, String[] strArr, zzcbp zzcbpVar) {
        this.zzf = str;
        this.zzi = zzcbpVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcal zzcalVar = (zzcal) this.zzc.get();
            if (zzcalVar != null) {
                zzcalVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().a();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + e8.getMessage());
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, xn.a.f21422g, zzd(xn.a.f21422g, e8));
            return false;
        }
    }
}
