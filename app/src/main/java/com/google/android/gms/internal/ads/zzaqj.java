package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaqj extends zzgwk implements zzgxw {
    private static final zzaqj zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzarb zzi;
    private zzare zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzaqj zzaqjVar = new zzaqj();
        zza = zzaqjVar;
        zzgwk.zzbZ(zzaqj.class, zzaqjVar);
    }

    private zzaqj() {
    }

    public static zzaqh zza() {
        return (zzaqh) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzaqj zzaqjVar, boolean z10) {
        zzaqjVar.zzc |= 8;
        zzaqjVar.zzg = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzaqj zzaqjVar, String str) {
        str.getClass();
        zzaqjVar.zzc |= 4;
        zzaqjVar.zzf = str;
    }

    public final zzarb zzc() {
        zzarb zzarbVar = this.zzi;
        return zzarbVar == null ? zzarb.zzc() : zzarbVar;
    }

    public final zzare zzd() {
        zzare zzareVar = this.zzj;
        return zzareVar == null ? zzare.zzb() : zzareVar;
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
                                    synchronized (zzaqj.class) {
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
                    return new zzaqh(null);
                }
                return new zzaqj();
            }
            return zzgwk.zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzaqk.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zzf;
    }

    @Deprecated
    public final boolean zzi() {
        return this.zzg;
    }
}
