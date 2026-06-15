package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhbe extends zzgwk implements zzgxw {
    private static final zzhbe zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhbe zzhbeVar = new zzhbe();
        zza = zzhbeVar;
        zzgwk.zzbZ(zzhbe.class, zzhbeVar);
    }

    private zzhbe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        int ordinal = zzgwjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                zzgwq zzgwqVar = zzhbc.zza;
                return zzgwk.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzgwqVar, "zze", "zzf", zzgwqVar});
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            zzgyd zzgydVar = zzb;
                            if (zzgydVar == null) {
                                synchronized (zzhbe.class) {
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
                return new zzhbd(null);
            } else {
                return new zzhbe();
            }
        }
        return (byte) 1;
    }
}
