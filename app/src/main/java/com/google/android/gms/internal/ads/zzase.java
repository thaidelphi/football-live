package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzase extends zzgwk implements zzgxw {
    private static final zzase zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgvc zzd;
    private zzgvc zze;
    private zzgvc zzf;
    private zzgvc zzg;

    static {
        zzase zzaseVar = new zzase();
        zza = zzaseVar;
        zzgwk.zzbZ(zzase.class, zzaseVar);
    }

    private zzase() {
        zzgvc zzgvcVar = zzgvc.zzb;
        this.zzd = zzgvcVar;
        this.zze = zzgvcVar;
        this.zzf = zzgvcVar;
        this.zzg = zzgvcVar;
    }

    public static zzasd zza() {
        return (zzasd) zza.zzaZ();
    }

    public static zzase zzc(byte[] bArr, zzgvu zzgvuVar) throws zzgwz {
        return (zzase) zzgwk.zzbx(zza, bArr, zzgvuVar);
    }

    public static /* synthetic */ void zzi(zzase zzaseVar, zzgvc zzgvcVar) {
        zzaseVar.zzc |= 1;
        zzaseVar.zzd = zzgvcVar;
    }

    public static /* synthetic */ void zzj(zzase zzaseVar, zzgvc zzgvcVar) {
        zzaseVar.zzc |= 2;
        zzaseVar.zze = zzgvcVar;
    }

    public static /* synthetic */ void zzk(zzase zzaseVar, zzgvc zzgvcVar) {
        zzaseVar.zzc |= 8;
        zzaseVar.zzg = zzgvcVar;
    }

    public static /* synthetic */ void zzl(zzase zzaseVar, zzgvc zzgvcVar) {
        zzaseVar.zzc |= 4;
        zzaseVar.zzf = zzgvcVar;
    }

    public final zzgvc zzd() {
        return this.zzd;
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
                                    synchronized (zzase.class) {
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
                    return new zzasd(null);
                }
                return new zzase();
            }
            return zzgwk.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgvc zzf() {
        return this.zze;
    }

    public final zzgvc zzg() {
        return this.zzg;
    }

    public final zzgvc zzh() {
        return this.zzf;
    }
}
