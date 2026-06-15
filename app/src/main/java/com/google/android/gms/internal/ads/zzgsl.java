package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgsl extends zzgwk implements zzgxw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgsl zzb;
    private static volatile zzgyd zzc;
    private String zzd = "";
    private zzgww zze = zzgwk.zzbK();

    static {
        zzgsl zzgslVar = new zzgsl();
        zzb = zzgslVar;
        zzgwk.zzbZ(zzgsl.class, zzgslVar);
    }

    private zzgsl() {
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
                                zzgyd zzgydVar = zzc;
                                if (zzgydVar == null) {
                                    synchronized (zzgsl.class) {
                                        zzgydVar = zzc;
                                        if (zzgydVar == null) {
                                            zzgydVar = new zzgwf(zzb);
                                            zzc = zzgydVar;
                                        }
                                    }
                                }
                                return zzgydVar;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new zzgsj(null);
                }
                return new zzgsl();
            }
            return zzgwk.zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgrl.class});
        }
        return (byte) 1;
    }
}
