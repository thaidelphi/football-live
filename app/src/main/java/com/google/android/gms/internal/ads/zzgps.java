package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgps extends zzgwk implements zzgxw {
    private static final zzgps zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgpy zze;
    private zzgvc zzf = zzgvc.zzb;

    static {
        zzgps zzgpsVar = new zzgps();
        zza = zzgpsVar;
        zzgwk.zzbZ(zzgps.class, zzgpsVar);
    }

    private zzgps() {
    }

    public static zzgpq zzb() {
        return (zzgpq) zza.zzaZ();
    }

    public static zzgps zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgps) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgps zzgpsVar, zzgpy zzgpyVar) {
        zzgpyVar.getClass();
        zzgpsVar.zze = zzgpyVar;
        zzgpsVar.zzc |= 1;
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
                                    synchronized (zzgps.class) {
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
                    return new zzgpq(null);
                }
                return new zzgps();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgpy zzf() {
        zzgpy zzgpyVar = this.zze;
        return zzgpyVar == null ? zzgpy.zzd() : zzgpyVar;
    }

    public final zzgvc zzg() {
        return this.zzf;
    }
}
