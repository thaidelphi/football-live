package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzuz implements zzyn, zztn {
    final /* synthetic */ zzve zza;
    private final Uri zzc;
    private final zzgq zzd;
    private final zzut zze;
    private final zzacm zzf;
    private final zzcz zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzadp zzm;
    private boolean zzn;
    private final zzadf zzh = new zzadf();
    private boolean zzj = true;
    private final long zzb = zztp.zza();
    private zzfw zzl = zzi(0);

    public zzuz(zzve zzveVar, Uri uri, zzfr zzfrVar, zzut zzutVar, zzacm zzacmVar, zzcz zzczVar) {
        this.zza = zzveVar;
        this.zzc = uri;
        this.zzd = new zzgq(zzfrVar);
        this.zze = zzutVar;
        this.zzf = zzacmVar;
        this.zzg = zzczVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzuz zzuzVar, long j10, long j11) {
        zzuzVar.zzh.zza = j10;
        zzuzVar.zzk = j11;
        zzuzVar.zzj = true;
        zzuzVar.zzn = false;
    }

    private final zzfw zzi(long j10) {
        Map map;
        zzfu zzfuVar = new zzfu();
        zzfuVar.zzd(this.zzc);
        zzfuVar.zzc(j10);
        zzfuVar.zza(6);
        map = zzve.zzb;
        zzfuVar.zzb(map);
        return zzfuVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zza(zzdx zzdxVar) {
        long zzS;
        long max;
        if (this.zzn) {
            zzS = this.zza.zzS(true);
            max = Math.max(zzS, this.zzk);
        } else {
            max = this.zzk;
        }
        int zzb = zzdxVar.zzb();
        zzadp zzadpVar = this.zzm;
        Objects.requireNonNull(zzadpVar);
        zzadpVar.zzr(zzdxVar, zzb);
        zzadpVar.zzt(max, 1, zzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x009e A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00b4 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ca A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e0 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00fc A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0132 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0146 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0186 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:212:0x017b, B:214:0x0186, B:215:0x018b, B:217:0x018f), top: B:264:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x018f A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {all -> 0x0205, blocks: (B:212:0x017b, B:214:0x0186, B:215:0x018b, B:217:0x018f), top: B:264:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01e3 A[EDGE_INSN: B:283:0x01e3->B:237:0x01e3 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuz.zzh():void");
    }
}
