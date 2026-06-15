package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzagc implements zzau {
    public final List zza;

    public zzagc(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzagb) list.get(0)).zzb;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (((zzagb) list.get(i10)).zza < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((zzagb) list.get(i10)).zzb;
                    i10++;
                }
            }
        }
        zzcv.zzd(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagc.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzagc) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
