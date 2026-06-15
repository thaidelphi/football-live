package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgrv extends zzgwk implements zzgxw {
    private static final zzgrv zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgww zzd = zzgwk.zzbK();

    static {
        zzgrv zzgrvVar = new zzgrv();
        zza = zzgrvVar;
        zzgwk.zzbZ(zzgrv.class, zzgrvVar);
    }

    private zzgrv() {
    }

    public static zzgrr zza() {
        return (zzgrr) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzgrv zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzgrv zzgrvVar, zzgrt zzgrtVar) {
        zzgrtVar.getClass();
        zzgww zzgwwVar = zzgrvVar.zzd;
        if (!zzgwwVar.zzc()) {
            zzgrvVar.zzd = zzgwk.zzbL(zzgwwVar);
        }
        zzgrvVar.zzd.add(zzgrtVar);
    }

    public static /* synthetic */ void zzd(zzgrv zzgrvVar, int i10) {
        zzgrvVar.zzc = i10;
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
                                    synchronized (zzgrv.class) {
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
                    return new zzgrr(null);
                }
                return new zzgrv();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgrt.class});
        }
        return (byte) 1;
    }
}
