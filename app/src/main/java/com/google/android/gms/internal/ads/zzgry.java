package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgry extends zzgwk implements zzgxw {
    private static final zzgry zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgsb zze;

    static {
        zzgry zzgryVar = new zzgry();
        zza = zzgryVar;
        zzgwk.zzbZ(zzgry.class, zzgryVar);
    }

    private zzgry() {
    }

    public static zzgrw zzb() {
        return (zzgrw) zza.zzaZ();
    }

    public static zzgry zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgry) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgry zzgryVar, zzgsb zzgsbVar) {
        zzgsbVar.getClass();
        zzgryVar.zze = zzgsbVar;
        zzgryVar.zzc |= 1;
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
                                    synchronized (zzgry.class) {
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
                    return new zzgrw(null);
                }
                return new zzgry();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsb zzf() {
        zzgsb zzgsbVar = this.zze;
        return zzgsbVar == null ? zzgsb.zzc() : zzgsbVar;
    }
}
