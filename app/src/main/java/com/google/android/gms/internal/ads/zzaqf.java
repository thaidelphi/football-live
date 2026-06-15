package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.nio.ByteBuffer;
import java.util.Date;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaqf extends zzhct {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhdd zzm;
    private long zzn;

    public zzaqf() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhdd.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + b9.i.f16698e;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhcr
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhcy.zza(zzaqb.zzf(byteBuffer));
            this.zzh = zzhcy.zza(zzaqb.zzf(byteBuffer));
            this.zzi = zzaqb.zze(byteBuffer);
            this.zzj = zzaqb.zzf(byteBuffer);
        } else {
            this.zzg = zzhcy.zza(zzaqb.zze(byteBuffer));
            this.zzh = zzhcy.zza(zzaqb.zze(byteBuffer));
            this.zzi = zzaqb.zze(byteBuffer);
            this.zzj = zzaqb.zze(byteBuffer);
        }
        this.zzk = zzaqb.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzaqb.zzd(byteBuffer);
        zzaqb.zze(byteBuffer);
        zzaqb.zze(byteBuffer);
        double zzb = zzaqb.zzb(byteBuffer);
        double zzb2 = zzaqb.zzb(byteBuffer);
        double zza = zzaqb.zza(byteBuffer);
        this.zzm = new zzhdd(zzb, zzb2, zzaqb.zzb(byteBuffer), zzaqb.zzb(byteBuffer), zza, zzaqb.zza(byteBuffer), zzaqb.zza(byteBuffer), zzaqb.zzb(byteBuffer), zzaqb.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaqb.zze(byteBuffer);
    }
}
