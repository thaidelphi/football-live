package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhav extends zzgwk implements zzgxw {
    private static final zzhav zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgvc zzd;
    private zzgvc zze;
    private zzgvc zzf;

    static {
        zzhav zzhavVar = new zzhav();
        zza = zzhavVar;
        zzgwk.zzbZ(zzhav.class, zzhavVar);
    }

    private zzhav() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zzd = zzgvcVar;
        this.zze = zzgvcVar;
        this.zzf = zzgvcVar;
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
                                    synchronized (zzhav.class) {
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
                    return new zzhau(null);
                }
                return new zzhav();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
