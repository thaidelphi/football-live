package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhas extends zzgwk implements zzgxw {
    private static final zzhas zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgvc zzd;
    private zzgvc zze;
    private byte zzf = 2;

    static {
        zzhas zzhasVar = new zzhas();
        zza = zzhasVar;
        zzgwk.zzbZ(zzhas.class, zzhasVar);
    }

    private zzhas() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zzd = zzgvcVar;
        this.zze = zzgvcVar;
    }

    public static zzhar zzc() {
        return (zzhar) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhas zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhas zzhasVar, zzgvc zzgvcVar) {
        zzhasVar.zzc |= 1;
        zzhasVar.zzd = zzgvcVar;
    }

    public static /* synthetic */ void zzg(zzhas zzhasVar, zzgvc zzgvcVar) {
        zzhasVar.zzc |= 2;
        zzhasVar.zze = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        switch (zzgwjVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzgwk.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhas();
            case 4:
                return new zzhar(null);
            case 5:
                return zza;
            case 6:
                zzgyd zzgydVar = zzb;
                if (zzgydVar == null) {
                    synchronized (zzhas.class) {
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
