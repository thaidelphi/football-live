package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawx extends zzgwk implements zzgxw {
    private static final zzawx zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzaxa zzd;
    private zzgvc zze;
    private zzgvc zzf;

    static {
        zzawx zzawxVar = new zzawx();
        zza = zzawxVar;
        zzgwk.zzbZ(zzawx.class, zzawxVar);
    }

    private zzawx() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zze = zzgvcVar;
        this.zzf = zzgvcVar;
    }

    public static zzawx zzb(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzawx) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public final zzaxa zzc() {
        zzaxa zzaxaVar = this.zzd;
        return zzaxaVar == null ? zzaxa.zzg() : zzaxaVar;
    }

    public final zzgvc zzd() {
        return this.zzf;
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
                                    synchronized (zzawx.class) {
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
                    return new zzawv(null);
                }
                return new zzawx();
            }
            return zzgwk.zzbQ(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgvc zzf() {
        return this.zze;
    }
}
