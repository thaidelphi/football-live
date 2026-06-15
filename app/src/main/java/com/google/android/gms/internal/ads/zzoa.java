package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import com.ironsource.b9;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzoa {
    public static final zzoa zza;
    public final int zzb;
    public final int zzc;
    private final zzfwa zzd;

    static {
        zzoa zzoaVar;
        if (zzeh.zza >= 33) {
            zzfvz zzfvzVar = new zzfvz();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzfvzVar.zzf(Integer.valueOf(zzeh.zzi(i10)));
            }
            zzoaVar = new zzoa(2, zzfvzVar.zzi());
        } else {
            zzoaVar = new zzoa(2, 10);
        }
        zza = zzoaVar;
    }

    public zzoa(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public zzoa(int i10, Set set) {
        this.zzb = i10;
        zzfwa zzl = zzfwa.zzl(set);
        this.zzd = zzl;
        zzfyb it = zzl.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzoa) {
            zzoa zzoaVar = (zzoa) obj;
            if (this.zzb == zzoaVar.zzb && this.zzc == zzoaVar.zzc) {
                zzfwa zzfwaVar = this.zzd;
                zzfwa zzfwaVar2 = zzoaVar.zzd;
                int i10 = zzeh.zza;
                if (Objects.equals(zzfwaVar, zzfwaVar2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zzfwa zzfwaVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfwaVar == null ? 0 : zzfwaVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + valueOf + b9.i.f16698e;
    }

    public final int zza(int i10, zze zzeVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzeh.zza < 29) {
            Integer num = (Integer) zzob.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            Objects.requireNonNull(num);
            return num.intValue();
        }
        int i11 = this.zzb;
        for (int i12 = 10; i12 > 0; i12--) {
            int zzi = zzeh.zzi(i12);
            if (zzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(zzi).build(), zzeVar.zza().zza)) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean zzb(int i10) {
        if (this.zzd == null) {
            return i10 <= this.zzc;
        }
        int zzi = zzeh.zzi(i10);
        if (zzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzi));
    }
}
