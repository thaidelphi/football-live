package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbb {
    public static final zzbb zza = new zzbb(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbb(float f10, float f11) {
        zzcv.zzd(f10 > 0.0f);
        zzcv.zzd(f11 > 0.0f);
        this.zzb = f10;
        this.zzc = f11;
        this.zzd = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbb.class == obj.getClass()) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.zzb == zzbbVar.zzb && this.zzc == zzbbVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        int i10 = zzeh.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j10) {
        return j10 * this.zzd;
    }
}
