package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffz extends zzgwk implements zzgxw {
    private static final zzffz zza;
    private static volatile zzgyd zzb;
    private zzgww zzc = zzgwk.zzbK();

    static {
        zzffz zzffzVar = new zzffz();
        zza = zzffzVar;
        zzgwk.zzbZ(zzffz.class, zzffzVar);
    }

    private zzffz() {
    }

    public static zzffv zzb() {
        return (zzffv) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzffz zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzffz zzffzVar, zzffx zzffxVar) {
        zzffxVar.getClass();
        zzgww zzgwwVar = zzffzVar.zzc;
        if (!zzgwwVar.zzc()) {
            zzffzVar.zzc = zzgwk.zzbL(zzgwwVar);
        }
        zzffzVar.zzc.add(zzffxVar);
    }

    public static /* synthetic */ void zzf(zzffz zzffzVar) {
        zzffzVar.zzc = zzgwk.zzbK();
    }

    public final int zza() {
        return this.zzc.size();
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
                                    synchronized (zzffz.class) {
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
                    return new zzffv(null);
                }
                return new zzffz();
            }
            return zzgwk.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzffx.class});
        }
        return (byte) 1;
    }
}
