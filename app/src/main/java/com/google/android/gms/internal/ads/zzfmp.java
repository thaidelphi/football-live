package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfmp extends zzgwk implements zzgxw {
    private static final zzfmp zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfml zzg;

    static {
        zzfmp zzfmpVar = new zzfmp();
        zza = zzfmpVar;
        zzgwk.zzbZ(zzfmp.class, zzfmpVar);
    }

    private zzfmp() {
    }

    public static zzfmm zza() {
        return (zzfmm) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzfmp zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzfmp zzfmpVar, String str) {
        str.getClass();
        zzfmpVar.zzc |= 2;
        zzfmpVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfmp zzfmpVar, zzfml zzfmlVar) {
        zzfmlVar.getClass();
        zzfmpVar.zzg = zzfmlVar;
        zzfmpVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfmp zzfmpVar, int i10) {
        zzfmpVar.zzd = 1;
        zzfmpVar.zzc = 1 | zzfmpVar.zzc;
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
                                    synchronized (zzfmp.class) {
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
                    return new zzfmm(null);
                }
                return new zzfmp();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfmn.zza, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
