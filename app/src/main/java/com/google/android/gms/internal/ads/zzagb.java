package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzagb {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagb(long j10, long j11, int i10) {
        zzcv.zzd(j10 < j11);
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagb.class == obj.getClass()) {
            zzagb zzagbVar = (zzagb) obj;
            if (this.zza == zzagbVar.zza && this.zzb == zzagbVar.zzb && this.zzc == zzagbVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        int i10 = zzeh.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
