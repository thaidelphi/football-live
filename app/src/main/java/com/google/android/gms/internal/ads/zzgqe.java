package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgqe extends zzgwk implements zzgxw {
    private static final zzgqe zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;

    static {
        zzgqe zzgqeVar = new zzgqe();
        zza = zzgqeVar;
        zzgwk.zzbZ(zzgqe.class, zzgqeVar);
    }

    private zzgqe() {
    }

    public static zzgqc zzc() {
        return (zzgqc) zza.zzaZ();
    }

    public static zzgqe zzf(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgqe) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
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
                                    synchronized (zzgqe.class) {
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
                    return new zzgqc(null);
                }
                return new zzgqe();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
