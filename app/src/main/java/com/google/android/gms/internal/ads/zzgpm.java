package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgpm extends zzgwk implements zzgxw {
    private static final zzgpm zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgpp zzd;
    private int zze;

    static {
        zzgpm zzgpmVar = new zzgpm();
        zza = zzgpmVar;
        zzgwk.zzbZ(zzgpm.class, zzgpmVar);
    }

    private zzgpm() {
    }

    public static zzgpk zzb() {
        return (zzgpk) zza.zzaZ();
    }

    public static zzgpm zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgpm zzgpmVar, zzgpp zzgppVar) {
        zzgppVar.getClass();
        zzgpmVar.zzd = zzgppVar;
        zzgpmVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
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
                                    synchronized (zzgpm.class) {
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
                    return new zzgpk(null);
                }
                return new zzgpm();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgpp zzf() {
        zzgpp zzgppVar = this.zzd;
        return zzgppVar == null ? zzgpp.zzd() : zzgppVar;
    }
}
