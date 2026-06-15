package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgra extends zzgwk implements zzgxw {
    private static final zzgra zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;

    static {
        zzgra zzgraVar = new zzgra();
        zza = zzgraVar;
        zzgwk.zzbZ(zzgra.class, zzgraVar);
    }

    private zzgra() {
    }

    public static zzgqy zzc() {
        return (zzgqy) zza.zzaZ();
    }

    public static zzgra zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgqr zzb() {
        int i10 = this.zzc;
        zzgqr zzgqrVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : zzgqr.SHA224 : zzgqr.SHA512 : zzgqr.SHA256 : zzgqr.SHA384 : zzgqr.SHA1 : zzgqr.UNKNOWN_HASH;
        return zzgqrVar == null ? zzgqr.UNRECOGNIZED : zzgqrVar;
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
                                    synchronized (zzgra.class) {
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
                    return new zzgqy(null);
                }
                return new zzgra();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
