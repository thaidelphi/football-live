package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaff implements zzau {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzx zzxVar = new zzx();
        zzxVar.zzad("application/id3");
        zzxVar.zzaj();
        zzx zzxVar2 = new zzx();
        zzxVar2.zzad("application/x-scte35");
        zzxVar2.zzaj();
    }

    public zzaff(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaff.class == obj.getClass()) {
            zzaff zzaffVar = (zzaff) obj;
            if (this.zzc == zzaffVar.zzc && this.zzd == zzaffVar.zzd) {
                String str = this.zza;
                String str2 = zzaffVar.zza;
                int i10 = zzeh.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzaffVar.zzb) && Arrays.equals(this.zze, zzaffVar.zze)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 == 0) {
            int hashCode = ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
            long j10 = this.zzc;
            int hashCode2 = (((((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) this.zzd)) * 31) + Arrays.hashCode(this.zze);
            this.zzf = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
