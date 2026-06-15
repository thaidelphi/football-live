package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafn extends zzaft {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzaft[] zze;

    public zzafn(String str, boolean z10, boolean z11, String[] strArr, zzaft[] zzaftVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzaftVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafn.class == obj.getClass()) {
            zzafn zzafnVar = (zzafn) obj;
            if (this.zzb == zzafnVar.zzb && this.zzc == zzafnVar.zzc) {
                String str = this.zza;
                String str2 = zzafnVar.zza;
                int i10 = zzeh.zza;
                if (Objects.equals(str, str2) && Arrays.equals(this.zzd, zzafnVar.zzd) && Arrays.equals(this.zze, zzafnVar.zze)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
