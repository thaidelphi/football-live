package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgpg extends zzgwk implements zzgxw {
    private static final zzgpg zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgpm zzd;
    private zzgqx zze;

    static {
        zzgpg zzgpgVar = new zzgpg();
        zza = zzgpgVar;
        zzgwk.zzbZ(zzgpg.class, zzgpgVar);
    }

    private zzgpg() {
    }

    public static zzgpe zza() {
        return (zzgpe) zza.zzaZ();
    }

    public static zzgpg zzc(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgpg) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzg(zzgpg zzgpgVar, zzgpm zzgpmVar) {
        zzgpmVar.getClass();
        zzgpgVar.zzd = zzgpmVar;
        zzgpgVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgpg zzgpgVar, zzgqx zzgqxVar) {
        zzgqxVar.getClass();
        zzgpgVar.zze = zzgqxVar;
        zzgpgVar.zzc |= 2;
    }

    public final zzgpm zzd() {
        zzgpm zzgpmVar = this.zzd;
        return zzgpmVar == null ? zzgpm.zzd() : zzgpmVar;
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
                                    synchronized (zzgpg.class) {
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
                    return new zzgpe(null);
                }
                return new zzgpg();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgqx zzf() {
        zzgqx zzgqxVar = this.zze;
        return zzgqxVar == null ? zzgqx.zzf() : zzgqxVar;
    }
}
