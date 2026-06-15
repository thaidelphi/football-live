package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhaa extends zzgwk implements zzgxw {
    private static final zzhaa zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgvc zzf = zzgvc.zzb;

    static {
        zzhaa zzhaaVar = new zzhaa();
        zza = zzhaaVar;
        zzgwk.zzbZ(zzhaa.class, zzhaaVar);
    }

    private zzhaa() {
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
                                    synchronized (zzhaa.class) {
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
                    return new zzgzy(null);
                }
                return new zzhaa();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzgzz.zza, "zze", "zzf"});
        }
        return (byte) 1;
    }
}
