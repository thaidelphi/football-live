package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zznv implements zzlp, zznw {
    private final Context zza;
    private final zznx zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzba zzn;
    private zznu zzo;
    private zznu zzp;
    private zznu zzq;
    private zzz zzr;
    private zzz zzs;
    private zzz zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzbm zze = new zzbm();
    private final zzbl zzf = new zzbl();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zznv(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zznt zzntVar = new zznt(zznt.zza);
        this.zzb = zzntVar;
        zzntVar.zzh(this);
    }

    public static zznv zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zznv(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzeh.zzl(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzj.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzz zzzVar, int i10) {
        zzz zzzVar2 = this.zzs;
        int i11 = zzeh.zza;
        if (Objects.equals(zzzVar2, zzzVar)) {
            return;
        }
        int i12 = this.zzs == null ? 1 : 0;
        this.zzs = zzzVar;
        zzx(0, j10, zzzVar, i12);
    }

    private final void zzu(long j10, zzz zzzVar, int i10) {
        zzz zzzVar2 = this.zzt;
        int i11 = zzeh.zza;
        if (Objects.equals(zzzVar2, zzzVar)) {
            return;
        }
        int i12 = this.zzt == null ? 1 : 0;
        this.zzt = zzzVar;
        zzx(2, j10, zzzVar, i12);
    }

    private final void zzv(zzbn zzbnVar, zzty zztyVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztyVar == null || (zza = zzbnVar.zza(zztyVar.zza)) == -1) {
            return;
        }
        int i10 = 0;
        zzbnVar.zzd(zza, this.zzf, false);
        zzbnVar.zze(this.zzf.zzc, this.zze, 0L);
        zzak zzakVar = this.zze.zzd.zzb;
        if (zzakVar != null) {
            int zzo = zzeh.zzo(zzakVar.zza);
            i10 = zzo != 0 ? zzo != 1 ? zzo != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        zzbm zzbmVar = this.zze;
        long j10 = zzbmVar.zzm;
        if (j10 != -9223372036854775807L && !zzbmVar.zzk && !zzbmVar.zzi && !zzbmVar.zzb()) {
            builder.setMediaDurationMillis(zzeh.zzv(j10));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j10, zzz zzzVar, int i10) {
        zzz zzzVar2 = this.zzr;
        int i11 = zzeh.zza;
        if (Objects.equals(zzzVar2, zzzVar)) {
            return;
        }
        int i12 = this.zzr == null ? 1 : 0;
        this.zzr = zzzVar;
        zzx(1, j10, zzzVar, i12);
    }

    private final void zzx(int i10, long j10, zzz zzzVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzzVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzzVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzzVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzzVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzzVar.zzj;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzzVar.zzv;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzzVar.zzw;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzzVar.zzE;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzzVar.zzF;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzzVar.zzd;
            if (str4 != null) {
                int i17 = zzeh.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzzVar.zzx;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zznu zznuVar) {
        if (zznuVar != null) {
            return zznuVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzc(zzln zzlnVar, String str) {
        zzty zztyVar = zzlnVar.zzd;
        if (zztyVar == null || !zztyVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.0-alpha01");
            zzv(zzlnVar.zzb, zzlnVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzd(zzln zzlnVar, String str, boolean z10) {
        zzty zztyVar = zzlnVar.zzd;
        if ((zztyVar == null || !zztyVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zze(zzln zzlnVar, zzz zzzVar, zzhk zzhkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzf(zzln zzlnVar, int i10, long j10, long j11) {
        zzty zztyVar = zzlnVar.zzd;
        if (zztyVar != null) {
            String zzf = this.zzb.zzf(zzlnVar.zzb, zztyVar);
            Long l10 = (Long) this.zzh.get(zzf);
            Long l11 = (Long) this.zzg.get(zzf);
            this.zzh.put(zzf, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.zzg.put(zzf, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzln zzlnVar, zztu zztuVar) {
        zzty zztyVar = zzlnVar.zzd;
        if (zztyVar == null) {
            return;
        }
        zzz zzzVar = zztuVar.zzb;
        Objects.requireNonNull(zzzVar);
        zznu zznuVar = new zznu(zzzVar, 0, this.zzb.zzf(zzlnVar.zzb, zztyVar));
        int i10 = zztuVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzp = zznuVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzq = zznuVar;
                return;
            }
        }
        this.zzo = zznuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzh(zzln zzlnVar, int i10, long j10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.ads.zzbh r22, com.google.android.gms.internal.ads.zzlo r23) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznv.zzi(com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzlo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzj(zzln zzlnVar, zztp zztpVar, zztu zztuVar, IOException iOException, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzk(zzln zzlnVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzl(zzln zzlnVar, zzba zzbaVar) {
        this.zzn = zzbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzm(zzln zzlnVar, zzbf zzbfVar, zzbf zzbfVar2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzn(zzln zzlnVar, Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzo(zzln zzlnVar, zzhj zzhjVar) {
        this.zzw += zzhjVar.zzg;
        this.zzx += zzhjVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ void zzp(zzln zzlnVar, zzz zzzVar, zzhk zzhkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzq(zzln zzlnVar, zzcc zzccVar) {
        zznu zznuVar = this.zzo;
        if (zznuVar != null) {
            zzz zzzVar = zznuVar.zza;
            if (zzzVar.zzw == -1) {
                zzx zzb = zzzVar.zzb();
                zzb.zzai(zzccVar.zzb);
                zzb.zzM(zzccVar.zzc);
                this.zzo = new zznu(zzb.zzaj(), 0, zznuVar.zzc);
            }
        }
    }
}
