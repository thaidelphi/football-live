package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgpj extends zzgwk implements zzgxw {
    private static final zzgpj zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzgpp zze;
    private zzgvc zzf = zzgvc.zzb;

    static {
        zzgpj zzgpjVar = new zzgpj();
        zza = zzgpjVar;
        zzgwk.zzbZ(zzgpj.class, zzgpjVar);
    }

    private zzgpj() {
    }

    public static zzgph zzb() {
        return (zzgph) zza.zzaZ();
    }

    public static zzgpj zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgpj zzgpjVar, zzgpp zzgppVar) {
        zzgppVar.getClass();
        zzgpjVar.zze = zzgppVar;
        zzgpjVar.zzc |= 1;
    }

    public final int zza() {
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
                                    synchronized (zzgpj.class) {
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
                    return new zzgph(null);
                }
                return new zzgpj();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgpp zzf() {
        zzgpp zzgppVar = this.zze;
        return zzgppVar == null ? zzgpp.zzd() : zzgppVar;
    }

    public final zzgvc zzg() {
        return this.zzf;
    }
}
