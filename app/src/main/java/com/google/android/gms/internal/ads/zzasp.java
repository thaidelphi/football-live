package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzasp extends zzgwk implements zzgxw {
    private static final zzasp zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgww zzd = zzgwk.zzbK();
    private zzgvc zze = zzgvc.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzasp zzaspVar = new zzasp();
        zza = zzaspVar;
        zzgwk.zzbZ(zzasp.class, zzaspVar);
    }

    private zzasp() {
    }

    public static zzaso zza() {
        return (zzaso) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasp zzaspVar, zzgvc zzgvcVar) {
        zzgww zzgwwVar = zzaspVar.zzd;
        if (!zzgwwVar.zzc()) {
            zzaspVar.zzd = zzgwk.zzbL(zzgwwVar);
        }
        zzaspVar.zzd.add(zzgvcVar);
    }

    public static /* synthetic */ void zzd(zzasp zzaspVar, zzgvc zzgvcVar) {
        zzaspVar.zzc |= 1;
        zzaspVar.zze = zzgvcVar;
    }

    public static /* synthetic */ void zzf(zzasp zzaspVar, int i10) {
        zzaspVar.zzg = i10 - 1;
        zzaspVar.zzc |= 4;
    }

    public static /* synthetic */ void zzg(zzasp zzaspVar, int i10) {
        zzaspVar.zzf = 4;
        zzaspVar.zzc |= 2;
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
                                    synchronized (zzasp.class) {
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
                    return new zzaso(null);
                }
                return new zzasp();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzasj.zza, "zzg", zzasf.zza});
        }
        return (byte) 1;
    }
}
