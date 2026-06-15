package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcam {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbby zze;
    private final zzbcb zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzbzr zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = com.google.android.gms.ads.internal.client.zzbb.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmC)).intValue();
    }

    public zzcam(Context context, VersionInfoParcel versionInfoParcel, String str, zzbcb zzbcbVar, zzbby zzbbyVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbfVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbcbVar;
        this.zze = zzbbyVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzN);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzh[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e8) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse frame hash target time number.", e8);
                this.zzh[i10] = -1;
            }
        }
    }

    public final void zza(zzbzr zzbzrVar) {
        zzbbt.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzbzrVar.zzj());
        this.zzo = zzbzrVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbbt.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbbt.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zzj());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzg.zza()) {
            String valueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.zze));
            String valueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.zzd));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i10 < jArr.length) {
                String str = this.zzi[i10];
                if (str != null) {
                    bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                }
                i10++;
            } else {
                com.google.android.gms.ads.internal.zzv.zzq().zzi(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzbzr zzbzrVar) {
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbbt.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long c10 = com.google.android.gms.ads.internal.zzv.zzC().c();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(TimeUnit.SECONDS.toNanos(1L) / (c10 - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = c10;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzO)).longValue();
        long zza2 = zzbzrVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && longValue > Math.abs(zza2 - this.zzh[i10])) {
                String[] strArr2 = this.zzi;
                int i11 = 8;
                Bitmap bitmap = zzbzrVar.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }
}
