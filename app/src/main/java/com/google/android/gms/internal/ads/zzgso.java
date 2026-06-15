package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgso extends zzgwk implements zzgxw {
    private static final zzgso zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgsu zze;
    private zzgvc zzf = zzgvc.zzb;

    static {
        zzgso zzgsoVar = new zzgso();
        zza = zzgsoVar;
        zzgwk.zzbZ(zzgso.class, zzgsoVar);
    }

    private zzgso() {
    }

    public static zzgsm zzb() {
        return (zzgsm) zza.zzaZ();
    }

    public static zzgso zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgso) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzi(zzgso zzgsoVar, zzgsu zzgsuVar) {
        zzgsuVar.getClass();
        zzgsoVar.zze = zzgsuVar;
        zzgsoVar.zzc |= 1;
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
                                    synchronized (zzgso.class) {
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
                    return new zzgsm(null);
                }
                return new zzgso();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgsu zzf() {
        zzgsu zzgsuVar = this.zze;
        return zzgsuVar == null ? zzgsu.zzd() : zzgsuVar;
    }

    public final zzgvc zzg() {
        return this.zzf;
    }
}
