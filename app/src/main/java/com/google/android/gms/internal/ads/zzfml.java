package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfml extends zzgwk implements zzgxw {
    private static final zzfml zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgws zzd = zzgwk.zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfml zzfmlVar = new zzfml();
        zza = zzfmlVar;
        zzgwk.zzbZ(zzfml.class, zzfmlVar);
    }

    private zzfml() {
    }

    public static zzfmj zza() {
        return (zzfmj) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfml zzfmlVar, String str) {
        str.getClass();
        zzfmlVar.zzc |= 1;
        zzfmlVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfml zzfmlVar, int i10) {
        zzgws zzgwsVar = zzfmlVar.zzd;
        if (!zzgwsVar.zzc()) {
            zzfmlVar.zzd = zzgwk.zzbH(zzgwsVar);
        }
        zzfmlVar.zzd.zzi(2);
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
                                    synchronized (zzfml.class) {
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
                    return new zzfmj(null);
                }
                return new zzfml();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfmi.zza, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
