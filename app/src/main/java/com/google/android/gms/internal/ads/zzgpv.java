package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgpv extends zzgwk implements zzgxw {
    private static final zzgpv zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgpy zzd;
    private int zze;

    static {
        zzgpv zzgpvVar = new zzgpv();
        zza = zzgpvVar;
        zzgwk.zzbZ(zzgpv.class, zzgpvVar);
    }

    private zzgpv() {
    }

    public static zzgpt zzb() {
        return (zzgpt) zza.zzaZ();
    }

    public static zzgpv zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgpv) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzh(zzgpv zzgpvVar, zzgpy zzgpyVar) {
        zzgpyVar.getClass();
        zzgpvVar.zzd = zzgpyVar;
        zzgpvVar.zzc |= 1;
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
                                    synchronized (zzgpv.class) {
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
                    return new zzgpt(null);
                }
                return new zzgpv();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgpy zzf() {
        zzgpy zzgpyVar = this.zzd;
        return zzgpyVar == null ? zzgpy.zzd() : zzgpyVar;
    }
}
