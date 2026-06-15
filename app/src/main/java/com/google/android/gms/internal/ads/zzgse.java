package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgse extends zzgwk implements zzgxw {
    private static final zzgse zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgsh zze;

    static {
        zzgse zzgseVar = new zzgse();
        zza = zzgseVar;
        zzgwk.zzbZ(zzgse.class, zzgseVar);
    }

    private zzgse() {
    }

    public static zzgsc zzb() {
        return (zzgsc) zza.zzaZ();
    }

    public static zzgse zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgse) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgse zzgseVar, zzgsh zzgshVar) {
        zzgshVar.getClass();
        zzgseVar.zze = zzgshVar;
        zzgseVar.zzc |= 1;
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
                                    synchronized (zzgse.class) {
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
                    return new zzgsc(null);
                }
                return new zzgse();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsh zzf() {
        zzgsh zzgshVar = this.zze;
        return zzgshVar == null ? zzgsh.zzd() : zzgshVar;
    }
}
