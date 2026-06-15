package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgqx extends zzgwk implements zzgxw {
    private static final zzgqx zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgra zzd;
    private int zze;
    private int zzf;

    static {
        zzgqx zzgqxVar = new zzgqx();
        zza = zzgqxVar;
        zzgwk.zzbZ(zzgqx.class, zzgqxVar);
    }

    private zzgqx() {
    }

    public static zzgqv zzc() {
        return (zzgqv) zza.zzaZ();
    }

    public static zzgqx zzf() {
        return zza;
    }

    public static zzgqx zzg(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgqx) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzj(zzgqx zzgqxVar, zzgra zzgraVar) {
        zzgraVar.getClass();
        zzgqxVar.zzd = zzgraVar;
        zzgqxVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
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
                                    synchronized (zzgqx.class) {
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
                    return new zzgqv(null);
                }
                return new zzgqx();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgra zzh() {
        zzgra zzgraVar = this.zzd;
        return zzgraVar == null ? zzgra.zzf() : zzgraVar;
    }
}
