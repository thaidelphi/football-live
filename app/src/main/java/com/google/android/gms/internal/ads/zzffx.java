package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffx extends zzgwk implements zzgxw {
    private static final zzffx zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzffu zzd;

    static {
        zzffx zzffxVar = new zzffx();
        zza = zzffxVar;
        zzgwk.zzbZ(zzffx.class, zzffxVar);
    }

    private zzffx() {
    }

    public static zzffw zza() {
        return (zzffw) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzffx zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzffx zzffxVar, zzffu zzffuVar) {
        zzffuVar.getClass();
        zzffxVar.zzd = zzffuVar;
        zzffxVar.zzc |= 1;
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
                                    synchronized (zzffx.class) {
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
                    return new zzffw(null);
                }
                return new zzffx();
            }
            return zzgwk.zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
