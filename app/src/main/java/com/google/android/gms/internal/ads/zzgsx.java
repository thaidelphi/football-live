package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgsx extends zzgwk implements zzgxw {
    private static final zzgsx zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgvc zzd = zzgvc.zzb;

    static {
        zzgsx zzgsxVar = new zzgsx();
        zza = zzgsxVar;
        zzgwk.zzbZ(zzgsx.class, zzgsxVar);
    }

    private zzgsx() {
    }

    public static zzgsv zzb() {
        return (zzgsv) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzgsx zzc() {
        return zza;
    }

    public static zzgsx zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgsx) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgsx zzgsxVar, zzgvc zzgvcVar) {
        zzgsxVar.zzd = zzgvcVar;
    }

    public final int zza() {
        return this.zzc;
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
                                    synchronized (zzgsx.class) {
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
                    return new zzgsv(null);
                }
                return new zzgsx();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final zzgvc zzf() {
        return this.zzd;
    }
}
