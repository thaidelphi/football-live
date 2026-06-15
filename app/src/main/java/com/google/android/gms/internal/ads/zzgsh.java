package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgsh extends zzgwk implements zzgxw {
    private static final zzgsh zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private String zzd = "";
    private zzgri zze;

    static {
        zzgsh zzgshVar = new zzgsh();
        zza = zzgshVar;
        zzgwk.zzbZ(zzgsh.class, zzgshVar);
    }

    private zzgsh() {
    }

    public static zzgsf zzb() {
        return (zzgsf) zza.zzaZ();
    }

    public static zzgsh zzd() {
        return zza;
    }

    public static zzgsh zzf(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzgsh) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgsh zzgshVar, zzgri zzgriVar) {
        zzgriVar.getClass();
        zzgshVar.zze = zzgriVar;
        zzgshVar.zzc |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgsh zzgshVar, String str) {
        str.getClass();
        zzgshVar.zzd = str;
    }

    public final zzgri zza() {
        zzgri zzgriVar = this.zze;
        return zzgriVar == null ? zzgri.zzd() : zzgriVar;
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
                                    synchronized (zzgsh.class) {
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
                    return new zzgsf(null);
                }
                return new zzgsh();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final String zzg() {
        return this.zzd;
    }
}
