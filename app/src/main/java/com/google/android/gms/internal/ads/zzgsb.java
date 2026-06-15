package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgsb extends zzgwk implements zzgxw {
    private static final zzgsb zza;
    private static volatile zzgyd zzb;
    private String zzc = "";

    static {
        zzgsb zzgsbVar = new zzgsb();
        zza = zzgsbVar;
        zzgwk.zzbZ(zzgsb.class, zzgsbVar);
    }

    private zzgsb() {
    }

    public static zzgrz zza() {
        return (zzgrz) zza.zzaZ();
    }

    public static zzgsb zzc() {
        return zza;
    }

    public static zzgsb zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgsb) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzg(zzgsb zzgsbVar, String str) {
        str.getClass();
        zzgsbVar.zzc = str;
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
                                    synchronized (zzgsb.class) {
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
                    return new zzgrz(null);
                }
                return new zzgsb();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zzc;
    }
}
