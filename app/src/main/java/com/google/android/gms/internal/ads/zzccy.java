package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzccy extends zzcac implements zzgr, zzlp {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzccj zzc;
    private final zzxn zzd;
    private final zzcak zze;
    private final WeakReference zzf;
    private final zzvh zzg;
    private zzid zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcab zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzccl zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzbY)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e7, code lost:
        if (r5.zzi == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e9, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
        if (r5.zzl == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ee, code lost:
        r6 = new com.google.android.gms.internal.ads.zzccp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
        if (r5.zzh <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f8, code lost:
        r6 = new com.google.android.gms.internal.ads.zzccq();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fe, code lost:
        r6 = new com.google.android.gms.internal.ads.zzccr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0105, code lost:
        if (r5.zzi == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0107, code lost:
        r5 = new com.google.android.gms.internal.ads.zzccs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010e, code lost:
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010f, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0111, code lost:
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0117, code lost:
        if (r4.limit() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0119, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcct();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzccy(android.content.Context r4, com.google.android.gms.internal.ads.zzcak r5, com.google.android.gms.internal.ads.zzcal r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccy.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcak, com.google.android.gms.internal.ads.zzcal, java.lang.Integer):void");
    }

    public static /* synthetic */ zzfr zzW(zzccy zzccyVar, String str, boolean z10) {
        zzccy zzccyVar2 = true != z10 ? null : zzccyVar;
        zzcak zzcakVar = zzccyVar.zze;
        return new zzcdb(str, zzccyVar2, zzcakVar.zzd, zzcakVar.zze, zzcakVar.zzm, zzcakVar.zzn);
    }

    public static /* synthetic */ zzfr zzX(zzccy zzccyVar, String str, boolean z10) {
        zzccy zzccyVar2 = true != z10 ? null : zzccyVar;
        zzcak zzcakVar = zzccyVar.zze;
        zzcci zzcciVar = new zzcci(str, zzccyVar2, zzcakVar.zzd, zzcakVar.zze, zzcakVar.zzh);
        zzccyVar.zzu.add(new WeakReference(zzcciVar));
        return zzcciVar;
    }

    public static /* synthetic */ zzfr zzY(zzccy zzccyVar, String str, boolean z10) {
        zzfz zzfzVar = new zzfz();
        zzfzVar.zzf(str);
        zzfzVar.zze(true != z10 ? null : zzccyVar);
        zzfzVar.zzc(zzccyVar.zze.zzd);
        zzfzVar.zzd(zzccyVar.zze.zze);
        zzfzVar.zzb(true);
        return zzfzVar.zza();
    }

    public static /* synthetic */ zzfr zzZ(zzccy zzccyVar, zzfq zzfqVar) {
        zzfr zza2 = zzfqVar.zza();
        zzccv zzccvVar = new zzccv(zzccyVar);
        return new zzccl(zzccyVar.zzb, zza2, zzccyVar.zzo, zzccyVar.zzp, zzccyVar, zzccvVar);
    }

    public static /* synthetic */ void zzab(zzccy zzccyVar, boolean z10, long j10) {
        zzcab zzcabVar = zzccyVar.zzk;
        if (zzcabVar != null) {
            zzcabVar.zzi(z10, j10);
        }
    }

    public static /* synthetic */ zzla[] zzac(zzccy zzccyVar, Handler handler, zzaax zzaaxVar, zzoy zzoyVar, zzwg zzwgVar, zzsw zzswVar) {
        zzsi zzsiVar = zzsi.zza;
        Context context = zzccyVar.zzb;
        zzql zzqlVar = new zzql(context, new zzro(context, null, null), zzsiVar, false, handler, zzoyVar, new zzpt(context).zzc());
        Context context2 = zzccyVar.zzb;
        return new zzla[]{zzqlVar, new zzzq(context2, new zzro(context2, null, null), zzsiVar, 0L, false, handler, zzaaxVar, -1, 30.0f)};
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcac.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j10 = this.zzn;
                    Map zze = ((zzgm) this.zzs.remove(0)).zze();
                    long j11 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfsb.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j10 + j11;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzua zzusVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzusVar = zzaa(uriArr[0]);
            } else {
                zzua[] zzuaVarArr = new zzua[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zzuaVarArr[i10] = zzaa(uriArr[i10]);
                }
                zzusVar = new zzus(false, false, new zztj(), zzuaVarArr);
            }
            this.zzh.zzC(zzusVar);
            this.zzh.zzq();
            zzcac.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzH() {
        zzid zzidVar = this.zzh;
        if (zzidVar != null) {
            zzidVar.zzB(this);
            this.zzh.zzA();
            this.zzh = null;
            zzcac.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzI(long j10) {
        this.zzh.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzJ(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzK(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzL(zzcab zzcabVar) {
        this.zzk = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzM(int i10) {
        this.zzc.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzN(int i10) {
        this.zzc.zzo(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzO(boolean z10) {
        this.zzh.zzr(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzQ(boolean z10) {
        if (this.zzh == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.zzh.zzy();
            if (i10 >= 2) {
                return;
            }
            zzxn zzxnVar = this.zzd;
            zzxa zzc = zzxnVar.zzf().zzc();
            zzc.zzq(i10, !z10);
            zzxnVar.zzl(zzc);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzR(int i10) {
        for (WeakReference weakReference : this.zzu) {
            zzcci zzcciVar = (zzcci) weakReference.get();
            if (zzcciVar != null) {
                zzcciVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzS(Surface surface, boolean z10) {
        zzid zzidVar = this.zzh;
        if (zzidVar != null) {
            zzidVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzT(float f10, boolean z10) {
        zzid zzidVar = this.zzh;
        if (zzidVar != null) {
            zzidVar.zzt(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final boolean zzV() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zza(zzfr zzfrVar, zzfw zzfwVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    final zzua zzaa(Uri uri) {
        zzad zzadVar = new zzad();
        zzadVar.zzb(uri);
        zzap zzc = zzadVar.zzc();
        zzvh zzvhVar = this.zzg;
        zzvhVar.zza(this.zze.zzf);
        return zzvhVar.zzb(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zzb(zzfr zzfrVar, zzfw zzfwVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zzc(zzfr zzfrVar, zzfw zzfwVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zzd(zzfr zzfrVar, zzfw zzfwVar, boolean z10) {
        if (zzfrVar instanceof zzgm) {
            synchronized (this.zzq) {
                this.zzs.add((zzgm) zzfrVar);
            }
        } else if (zzfrVar instanceof zzccl) {
            this.zzt = (zzccl) zzfrVar;
            final zzcal zzcalVar = (zzcal) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue() && zzcalVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccu
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = zzccy.zza;
                        zzcal.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zze(zzln zzlnVar, zzz zzzVar, zzhk zzhkVar) {
        zzcal zzcalVar = (zzcal) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue() || zzcalVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzzVar.zzn;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzzVar.zzo;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzzVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcalVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzf(zzln zzlnVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzg(zzln zzlnVar, zztu zztuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzh(zzln zzlnVar, int i10, long j10) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzi(zzbh zzbhVar, zzlo zzloVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzj(zzln zzlnVar, zztp zztpVar, zztu zztuVar, IOException iOException, boolean z10) {
        zzcab zzcabVar = this.zzk;
        if (zzcabVar != null) {
            if (this.zze.zzj) {
                zzcabVar.zzl("onLoadException", iOException);
            } else {
                zzcabVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzk(zzln zzlnVar, int i10) {
        zzcab zzcabVar = this.zzk;
        if (zzcabVar != null) {
            zzcabVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzl(zzln zzlnVar, zzba zzbaVar) {
        zzcab zzcabVar = this.zzk;
        if (zzcabVar != null) {
            zzcabVar.zzk("onPlayerError", zzbaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzm(zzln zzlnVar, zzbf zzbfVar, zzbf zzbfVar2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzn(zzln zzlnVar, Object obj, long j10) {
        zzcab zzcabVar = this.zzk;
        if (zzcabVar != null) {
            zzcabVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzo(zzln zzlnVar, zzhj zzhjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzp(zzln zzlnVar, zzz zzzVar, zzhk zzhkVar) {
        zzcal zzcalVar = (zzcal) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue() || zzcalVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzzVar.zzx));
        hashMap.put("bitRate", String.valueOf(zzzVar.zzj));
        int i10 = zzzVar.zzv;
        int i11 = zzzVar.zzw;
        hashMap.put("resolution", i10 + "x" + i11);
        String str = zzzVar.zzn;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzzVar.zzo;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzzVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcalVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzq(zzln zzlnVar, zzcc zzccVar) {
        zzcab zzcabVar = this.zzk;
        if (zzcabVar != null) {
            zzcabVar.zzD(zzccVar.zzb, zzccVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzt() {
        return this.zzh.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzv() {
        return this.zzh.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzy() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzz() {
        return this.zzh.zzm();
    }
}
