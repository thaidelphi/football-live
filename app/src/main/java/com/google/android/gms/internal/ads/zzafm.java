package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafm extends zzaft {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzaft[] zzg;

    public zzafm(String str, int i10, int i11, long j10, long j11, zzaft[] zzaftVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzaftVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafm.class == obj.getClass()) {
            zzafm zzafmVar = (zzafm) obj;
            if (this.zzb == zzafmVar.zzb && this.zzc == zzafmVar.zzc && this.zzd == zzafmVar.zzd && this.zze == zzafmVar.zze) {
                String str = this.zza;
                String str2 = zzafmVar.zza;
                int i10 = zzeh.zza;
                if (Objects.equals(str, str2) && Arrays.equals(this.zzg, zzafmVar.zzg)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        long j10 = this.zze;
        return (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 31) + str.hashCode();
    }
}
