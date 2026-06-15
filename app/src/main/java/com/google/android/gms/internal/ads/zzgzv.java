package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgzv extends zzgwk implements zzgxw {
    private static final zzgzv zza;
    private static volatile zzgyd zzb;
    private zzgww zzc = zzgwk.zzbK();

    static {
        zzgzv zzgzvVar = new zzgzv();
        zza = zzgzvVar;
        zzgwk.zzbZ(zzgzv.class, zzgzvVar);
    }

    private zzgzv() {
    }

    public static zzgzu zzc() {
        return (zzgzu) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzgzv zzgzvVar, zzgzt zzgztVar) {
        zzgztVar.getClass();
        zzgww zzgwwVar = zzgzvVar.zzc;
        if (!zzgwwVar.zzc()) {
            zzgzvVar.zzc = zzgwk.zzbL(zzgwwVar);
        }
        zzgzvVar.zzc.add(zzgztVar);
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
                                    synchronized (zzgzv.class) {
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
                    return new zzgzu(null);
                }
                return new zzgzv();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzgzt.class});
        }
        return (byte) 1;
    }
}
