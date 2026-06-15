package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhaz extends zzgwk implements zzgxw {
    private static final zzhaz zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgvc zze;
    private zzgvc zzf;

    static {
        zzhaz zzhazVar = new zzhaz();
        zza = zzhazVar;
        zzgwk.zzbZ(zzhaz.class, zzhazVar);
    }

    private zzhaz() {
        zzgvc zzgvcVar = zzgvc.zzb;
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
                                    synchronized (zzhaz.class) {
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
                    return new zzhay(null);
                }
                return new zzhaz();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
