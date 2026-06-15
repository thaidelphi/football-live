package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgou extends zzgwk implements zzgxw {
    private static final zzgou zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgvc zze = zzgvc.zzb;
    private zzgpa zzf;

    static {
        zzgou zzgouVar = new zzgou();
        zza = zzgouVar;
        zzgwk.zzbZ(zzgou.class, zzgouVar);
    }

    private zzgou() {
    }

    public static zzgos zzb() {
        return (zzgos) zza.zzaZ();
    }

    public static zzgou zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgou) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgou zzgouVar, zzgpa zzgpaVar) {
        zzgpaVar.getClass();
        zzgouVar.zzf = zzgpaVar;
        zzgouVar.zzc |= 1;
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
                                    synchronized (zzgou.class) {
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
                    return new zzgos(null);
                }
                return new zzgou();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgpa zzf() {
        zzgpa zzgpaVar = this.zzf;
        return zzgpaVar == null ? zzgpa.zzd() : zzgpaVar;
    }

    public final zzgvc zzg() {
        return this.zze;
    }
}
