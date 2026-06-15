package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgox extends zzgwk implements zzgxw {
    private static final zzgox zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgpa zze;

    static {
        zzgox zzgoxVar = new zzgox();
        zza = zzgoxVar;
        zzgwk.zzbZ(zzgox.class, zzgoxVar);
    }

    private zzgox() {
    }

    public static zzgov zzb() {
        return (zzgov) zza.zzaZ();
    }

    public static zzgox zzd(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgox) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public static /* synthetic */ void zzh(zzgox zzgoxVar, zzgpa zzgpaVar) {
        zzgpaVar.getClass();
        zzgoxVar.zze = zzgpaVar;
        zzgoxVar.zzc |= 1;
    }

    public final int zza() {
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
                                    synchronized (zzgox.class) {
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
                    return new zzgov(null);
                }
                return new zzgox();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgpa zzf() {
        zzgpa zzgpaVar = this.zze;
        return zzgpaVar == null ? zzgpa.zzd() : zzgpaVar;
    }
}
