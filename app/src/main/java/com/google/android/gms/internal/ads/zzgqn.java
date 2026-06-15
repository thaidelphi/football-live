package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgqn extends zzgwk implements zzgxw {
    private static final zzgqn zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgvc zzd = zzgvc.zzb;

    static {
        zzgqn zzgqnVar = new zzgqn();
        zza = zzgqnVar;
        zzgwk.zzbZ(zzgqn.class, zzgqnVar);
    }

    private zzgqn() {
    }

    public static zzgql zzb() {
        return (zzgql) zza.zzaZ();
    }

    public static zzgqn zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgqn) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzg() {
        return zza.zzbN();
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
                                    synchronized (zzgqn.class) {
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
                    return new zzgql(null);
                }
                return new zzgqn();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final zzgvc zzf() {
        return this.zzd;
    }
}
