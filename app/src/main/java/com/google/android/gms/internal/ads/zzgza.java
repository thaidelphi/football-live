package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgza {
    private static volatile int zza = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i10, int i11);

    abstract void zze(Object obj, int i10, long j10);

    abstract void zzf(Object obj, int i10, Object obj2);

    abstract void zzg(Object obj, int i10, zzgvc zzgvcVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzh(Object obj, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzi(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzj(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(Object obj, zzgyi zzgyiVar, int i10) throws IOException {
        int zzd = zzgyiVar.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 == 0) {
            zzh(obj, i11, zzgyiVar.zzl());
            return true;
        } else if (i12 == 1) {
            zze(obj, i11, zzgyiVar.zzk());
            return true;
        } else if (i12 == 2) {
            zzg(obj, i11, zzgyiVar.zzp());
            return true;
        } else if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzgwz("Protocol message end-group tag did not match expected tag.");
            } else if (i12 == 5) {
                zzd(obj, i11, zzgyiVar.zzf());
                return true;
            } else {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
        } else {
            Object zzb = zzb();
            int i13 = i11 << 3;
            int i14 = i10 + 1;
            if (i14 < zza) {
                while (zzgyiVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzgyiVar, i14)) {
                }
                if ((i13 | 4) == zzgyiVar.zzd()) {
                    zzf(obj, i11, zzc(zzb));
                    return true;
                }
                throw new zzgwz("Protocol message end-group tag did not match expected tag.");
            }
            throw new zzgwz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
