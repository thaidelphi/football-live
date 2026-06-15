package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgpd extends zzgwk implements zzgxw {
    private static final zzgpd zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgpj zze;
    private zzgqu zzf;

    static {
        zzgpd zzgpdVar = new zzgpd();
        zza = zzgpdVar;
        zzgwk.zzbZ(zzgpd.class, zzgpdVar);
    }

    private zzgpd() {
    }

    public static zzgpb zzb() {
        return (zzgpb) zza.zzaZ();
    }

    public static zzgpd zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgpd) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static zzgyd zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgpd zzgpdVar, zzgpj zzgpjVar) {
        zzgpjVar.getClass();
        zzgpdVar.zze = zzgpjVar;
        zzgpdVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgpd zzgpdVar, zzgqu zzgquVar) {
        zzgquVar.getClass();
        zzgpdVar.zzf = zzgquVar;
        zzgpdVar.zzc |= 2;
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
                                    synchronized (zzgpd.class) {
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
                    return new zzgpb(null);
                }
                return new zzgpd();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgpj zzf() {
        zzgpj zzgpjVar = this.zze;
        return zzgpjVar == null ? zzgpj.zzd() : zzgpjVar;
    }

    public final zzgqu zzg() {
        zzgqu zzgquVar = this.zzf;
        return zzgquVar == null ? zzgqu.zzd() : zzgquVar;
    }
}
