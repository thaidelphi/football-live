package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzare extends zzgwk implements zzgxw {
    public static final /* synthetic */ int zza = 0;
    private static final zzare zzb;
    private static volatile zzgyd zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzare zzareVar = new zzare();
        zzb = zzareVar;
        zzgwk.zzbZ(zzare.class, zzareVar);
    }

    private zzare() {
    }

    public static zzare zzb() {
        return zzb;
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
                                    synchronized (zzare.class) {
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
                    return new zzarc(null);
                }
                return new zzare();
            }
            return zzgwk.zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
