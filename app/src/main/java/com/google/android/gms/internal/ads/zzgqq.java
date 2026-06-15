package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgqq extends zzgwk implements zzgxw {
    private static final zzgqq zza;
    private static volatile zzgyd zzb;

    static {
        zzgqq zzgqqVar = new zzgqq();
        zza = zzgqqVar;
        zzgwk.zzbZ(zzgqq.class, zzgqqVar);
    }

    private zzgqq() {
    }

    public static zzgqq zzb() {
        return zza;
    }

    public static zzgqq zzc(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgqq) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        int ordinal = zzgwjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                zzgyd zzgydVar = zzb;
                                if (zzgydVar == null) {
                                    synchronized (zzgqq.class) {
                                        zzgydVar = zzb;
                                        if (zzgydVar == null) {
                                            zzgydVar = new zzgwf(zza);
                                            zzb = zzgydVar;
                                        }
                                    }
                                }
                                return zzgydVar;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new zzgqo(null);
                }
                return new zzgqq();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
