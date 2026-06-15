package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgsr extends zzgwk implements zzgxw {
    private static final zzgsr zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgsu zze;

    static {
        zzgsr zzgsrVar = new zzgsr();
        zza = zzgsrVar;
        zzgwk.zzbZ(zzgsr.class, zzgsrVar);
    }

    private zzgsr() {
    }

    public static zzgsp zzb() {
        return (zzgsp) zza.zzaZ();
    }

    public static zzgsr zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgsr) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzg(zzgsr zzgsrVar, zzgsu zzgsuVar) {
        zzgsuVar.getClass();
        zzgsrVar.zze = zzgsuVar;
        zzgsrVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
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
                                    synchronized (zzgsr.class) {
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
                    return new zzgsp(null);
                }
                return new zzgsr();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsu zzf() {
        zzgsu zzgsuVar = this.zze;
        return zzgsuVar == null ? zzgsu.zzd() : zzgsuVar;
    }
}
