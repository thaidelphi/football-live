package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmm extends RuntimeException {
    public zzgmm(String str) {
        super(str);
    }

    public static Object zza(zzgml zzgmlVar) {
        try {
            return zzgmlVar.zza();
        } catch (Exception e8) {
            throw new zzgmm(e8);
        }
    }

    public zzgmm(String str, Throwable th) {
        super(str, th);
    }

    public zzgmm(Throwable th) {
        super(th);
    }
}
