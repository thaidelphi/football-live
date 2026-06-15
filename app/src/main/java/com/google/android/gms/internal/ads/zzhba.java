package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhba extends zzgwk implements zzgxw {
    private static final zzhba zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzhaz zzd;
    private zzgvc zzf;
    private zzgvc zzg;
    private int zzh;
    private zzgvc zzi;
    private byte zzj = 2;
    private zzgww zze = zzgwk.zzbK();

    static {
        zzhba zzhbaVar = new zzhba();
        zza = zzhbaVar;
        zzgwk.zzbZ(zzhba.class, zzhbaVar);
    }

    private zzhba() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zzf = zzgvcVar;
        this.zzg = zzgvcVar;
        this.zzi = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        switch (zzgwjVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzgwk.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhas.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new zzhba();
            case 4:
                return new zzhax(null);
            case 5:
                return zza;
            case 6:
                zzgyd zzgydVar = zzb;
                if (zzgydVar == null) {
                    synchronized (zzhba.class) {
                        zzgydVar = zzb;
                        if (zzgydVar == null) {
                            zzgydVar = new zzgwf(zza);
                            zzb = zzgydVar;
                        }
                    }
                }
                return zzgydVar;
            default:
                throw null;
        }
    }
}
