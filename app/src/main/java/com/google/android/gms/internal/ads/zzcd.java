package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcd {
    private final zzfvv zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcd(zzfvv zzfvvVar) {
        this.zza = zzfvvVar;
        zzce zzceVar = zzce.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= zzi(); i10++) {
                if (!this.zzc[i10].hasRemaining()) {
                    zzcg zzcgVar = (zzcg) this.zzb.get(i10);
                    if (zzcgVar.zzh()) {
                        if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                            ((zzcg) this.zzb.get(i10 + 1)).zzd();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.zzc[i10 - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : zzcg.zza;
                        }
                        zzcgVar.zze(byteBuffer2);
                        this.zzc[i10] = zzcgVar.zzb();
                        int i11 = ((byteBuffer2.remaining() - byteBuffer2.remaining()) > 0L ? 1 : ((byteBuffer2.remaining() - byteBuffer2.remaining()) == 0L ? 0 : -1));
                        boolean z11 = true;
                        if (i11 <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    }
                }
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zza.size() == zzcdVar.zza.size()) {
                for (int i10 = 0; i10 < this.zza.size(); i10++) {
                    if (this.zza.get(i10) != zzcdVar.zza.get(i10)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzce zza(zzce zzceVar) throws zzcf {
        if (!zzceVar.equals(zzce.zza)) {
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                zzcg zzcgVar = (zzcg) this.zza.get(i10);
                zzce zza = zzcgVar.zza(zzceVar);
                if (zzcgVar.zzg()) {
                    zzcv.zzf(!zza.equals(zzce.zza));
                    zzceVar = zza;
                }
            }
            return zzceVar;
        }
        throw new zzcf("Unhandled input format:", zzceVar);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcg.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcg.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzcg zzcgVar = (zzcg) this.zza.get(i10);
            zzcgVar.zzc();
            if (zzcgVar.zzg()) {
                this.zzb.add(zzcgVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzcg) this.zzb.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcg) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzcg zzcgVar = (zzcg) this.zza.get(i10);
            zzcgVar.zzc();
            zzcgVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzce zzceVar = zzce.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        return this.zzd && ((zzcg) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
