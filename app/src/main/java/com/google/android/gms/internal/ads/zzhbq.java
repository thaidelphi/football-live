package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhbq extends zzgwk implements zzgxw {
    private static final zzhbq zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgvc zzf;
    private zzgvc zzg;

    static {
        zzhbq zzhbqVar = new zzhbq();
        zza = zzhbqVar;
        zzgwk.zzbZ(zzhbq.class, zzhbqVar);
    }

    private zzhbq() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zzf = zzgvcVar;
        this.zzg = zzgvcVar;
    }

    public static zzhbo zzc() {
        return (zzhbo) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhbq zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhbq zzhbqVar, zzgvc zzgvcVar) {
        zzgvcVar.getClass();
        zzhbqVar.zzc |= 4;
        zzhbqVar.zzf = zzgvcVar;
    }

    public static /* synthetic */ void zzg(zzhbq zzhbqVar, String str) {
        zzhbqVar.zzc |= 2;
        zzhbqVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhbq zzhbqVar, int i10) {
        zzhbqVar.zzd = 1;
        zzhbqVar.zzc = 1 | zzhbqVar.zzc;
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
                                    synchronized (zzhbq.class) {
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
                    return new zzhbo(null);
                }
                return new zzhbq();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhbp.zza, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
