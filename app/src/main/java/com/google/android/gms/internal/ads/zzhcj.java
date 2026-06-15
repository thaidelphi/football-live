package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhcj extends zzgwk implements zzgxw {
    private static final zzhcj zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgws zzf = zzgwk.zzbG();
    private zzgww zzh = zzgwk.zzbK();
    private zzgvc zzi = zzgvc.zzb;

    static {
        zzhcj zzhcjVar = new zzhcj();
        zza = zzhcjVar;
        zzgwk.zzbZ(zzhcj.class, zzhcjVar);
    }

    private zzhcj() {
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
                                    synchronized (zzhcj.class) {
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
                    return new zzhci(null);
                }
                return new zzhcj();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhch.class, "zzi"});
        }
        return (byte) 1;
    }
}
