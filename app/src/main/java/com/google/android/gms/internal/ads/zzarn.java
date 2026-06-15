package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzarn extends zzgwk implements zzgxw {
    private static final zzarn zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        zzarn zzarnVar = new zzarn();
        zza = zzarnVar;
        zzgwk.zzbZ(zzarn.class, zzarnVar);
    }

    private zzarn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        int ordinal = zzgwjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                zzgwq zzgwqVar = zzasg.zza;
                return zzgwk.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzgwqVar, "zzf", zzgwqVar});
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            zzgyd zzgydVar = zzb;
                            if (zzgydVar == null) {
                                synchronized (zzarn.class) {
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
                return new zzarm(null);
            } else {
                return new zzarn();
            }
        }
        return (byte) 1;
    }
}
