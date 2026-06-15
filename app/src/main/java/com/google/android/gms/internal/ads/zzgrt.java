package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgrt extends zzgwk implements zzgxw {
    private static final zzgrt zza;
    private static volatile zzgyd zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgrt zzgrtVar = new zzgrt();
        zza = zzgrtVar;
        zzgwk.zzbZ(zzgrt.class, zzgrtVar);
    }

    private zzgrt() {
    }

    public static zzgrs zza() {
        return (zzgrs) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzgrt zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzgrt zzgrtVar, int i10) {
        zzgrtVar.zze = i10;
    }

    public static /* synthetic */ void zzd(zzgrt zzgrtVar, zzgsi zzgsiVar) {
        zzgrtVar.zzf = zzgsiVar.zza();
    }

    public static /* synthetic */ void zzf(zzgrt zzgrtVar, String str) {
        str.getClass();
        zzgrtVar.zzc = str;
    }

    public static /* synthetic */ void zzg(zzgrt zzgrtVar, int i10) {
        zzgrtVar.zzd = zzgrf.zza(i10);
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
                                    synchronized (zzgrt.class) {
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
                    return new zzgrs(null);
                }
                return new zzgrt();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
