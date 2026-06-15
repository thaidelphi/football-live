package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcj implements zzcg {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzce zze;
    private zzce zzf;
    private zzce zzg;
    private zzce zzh;
    private boolean zzi;
    private zzci zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcj() {
        zzce zzceVar = zzce.zza;
        this.zze = zzceVar;
        this.zzf = zzceVar;
        this.zzg = zzceVar;
        this.zzh = zzceVar;
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzce zza(zzce zzceVar) throws zzcf {
        if (zzceVar.zzd == 2) {
            int i10 = this.zzb;
            if (i10 == -1) {
                i10 = zzceVar.zzb;
            }
            this.zze = zzceVar;
            zzce zzceVar2 = new zzce(i10, zzceVar.zzc, 2);
            this.zzf = zzceVar2;
            this.zzi = true;
            return zzceVar2;
        }
        throw new zzcf("Unhandled input format:", zzceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final ByteBuffer zzb() {
        int zza;
        zzci zzciVar = this.zzj;
        if (zzciVar != null && (zza = zzciVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzciVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcg.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzc() {
        if (zzg()) {
            zzce zzceVar = this.zze;
            this.zzg = zzceVar;
            zzce zzceVar2 = this.zzf;
            this.zzh = zzceVar2;
            if (this.zzi) {
                this.zzj = new zzci(zzceVar.zzb, zzceVar.zzc, this.zzc, this.zzd, zzceVar2.zzb);
            } else {
                zzci zzciVar = this.zzj;
                if (zzciVar != null) {
                    zzciVar.zzc();
                }
            }
        }
        this.zzm = zzcg.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd() {
        zzci zzciVar = this.zzj;
        if (zzciVar != null) {
            zzciVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzci zzciVar = this.zzj;
            Objects.requireNonNull(zzciVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzciVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzce zzceVar = zzce.zza;
        this.zze = zzceVar;
        this.zzf = zzceVar;
        this.zzg = zzceVar;
        this.zzh = zzceVar;
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzh() {
        zzci zzciVar;
        return this.zzp && ((zzciVar = this.zzj) == null || zzciVar.zza() == 0);
    }

    public final long zzi(long j10) {
        long j11 = this.zzo;
        if (j11 >= 1024) {
            long j12 = this.zzn;
            zzci zzciVar = this.zzj;
            Objects.requireNonNull(zzciVar);
            long zzb = j12 - zzciVar.zzb();
            int i10 = this.zzh.zzb;
            int i11 = this.zzg.zzb;
            if (i10 == i11) {
                return zzeh.zzu(j10, zzb, j11, RoundingMode.DOWN);
            }
            return zzeh.zzu(j10, zzb * i10, j11 * i11, RoundingMode.DOWN);
        }
        return (long) (this.zzc * j10);
    }

    public final void zzj(float f10) {
        zzcv.zzd(f10 > 0.0f);
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        zzcv.zzd(f10 > 0.0f);
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
