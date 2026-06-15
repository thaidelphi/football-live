package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayt {
    final long zza;
    final String zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayt(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzayt)) {
            zzayt zzaytVar = (zzayt) obj;
            if (zzaytVar.zza == this.zza && zzaytVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
