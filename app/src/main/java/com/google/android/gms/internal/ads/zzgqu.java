package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgqu extends zzgwk implements zzgxw {
    private static final zzgqu zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgra zze;
    private zzgvc zzf = zzgvc.zzb;

    static {
        zzgqu zzgquVar = new zzgqu();
        zza = zzgquVar;
        zzgwk.zzbZ(zzgqu.class, zzgquVar);
    }

    private zzgqu() {
    }

    public static zzgqs zzb() {
        return (zzgqs) zza.zzaZ();
    }

    public static zzgqu zzd() {
        return zza;
    }

    public static zzgqu zzf(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgqu) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzi() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzk(zzgqu zzgquVar, zzgra zzgraVar) {
        zzgraVar.getClass();
        zzgquVar.zze = zzgraVar;
        zzgquVar.zzc |= 1;
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
                                    synchronized (zzgqu.class) {
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
                    return new zzgqs(null);
                }
                return new zzgqu();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgra zzg() {
        zzgra zzgraVar = this.zze;
        return zzgraVar == null ? zzgra.zzf() : zzgraVar;
    }

    public final zzgvc zzh() {
        return this.zzf;
    }
}
