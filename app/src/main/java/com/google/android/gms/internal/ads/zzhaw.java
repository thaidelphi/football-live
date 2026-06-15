package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhaw extends zzgwk implements zzgxw {
    private static final zzhaw zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzhav zzd;
    private zzgvc zzf;
    private zzgvc zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgww zze = zzgwk.zzbK();

    static {
        zzhaw zzhawVar = new zzhaw();
        zza = zzhawVar;
        zzgwk.zzbZ(zzhaw.class, zzhawVar);
    }

    private zzhaw() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zzf = zzgvcVar;
        this.zzg = zzgvcVar;
    }

    public static zzhat zzc() {
        return (zzhat) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhaw zzhawVar, zzhas zzhasVar) {
        zzhasVar.getClass();
        zzgww zzgwwVar = zzhawVar.zze;
        if (!zzgwwVar.zzc()) {
            zzhawVar.zze = zzgwk.zzbL(zzgwwVar);
        }
        zzhawVar.zze.add(zzhasVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        switch (zzgwjVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzgwk.zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhas.class, "zzf", "zzg", "zzh"});
            case 3:
                return new zzhaw();
            case 4:
                return new zzhat(null);
            case 5:
                return zza;
            case 6:
                zzgyd zzgydVar = zzb;
                if (zzgydVar == null) {
                    synchronized (zzhaw.class) {
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
