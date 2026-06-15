package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgre extends zzgwk implements zzgxw {
    private static final zzgre zza;
    private static volatile zzgyd zzb;
    private String zzc = "";
    private zzgvc zzd = zzgvc.zzb;
    private int zze;

    static {
        zzgre zzgreVar = new zzgre();
        zza = zzgreVar;
        zzgwk.zzbZ(zzgre.class, zzgreVar);
    }

    private zzgre() {
    }

    public static zzgrb zza() {
        return (zzgrb) zza.zzaZ();
    }

    public static zzgre zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgre zzgreVar, String str) {
        str.getClass();
        zzgreVar.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgre zzgreVar, zzgvc zzgvcVar) {
        zzgvcVar.getClass();
        zzgreVar.zzd = zzgvcVar;
    }

    public final zzgrc zzb() {
        int i10 = this.zze;
        zzgrc zzgrcVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzgrc.REMOTE : zzgrc.ASYMMETRIC_PUBLIC : zzgrc.ASYMMETRIC_PRIVATE : zzgrc.SYMMETRIC : zzgrc.UNKNOWN_KEYMATERIAL;
        return zzgrcVar == null ? zzgrc.UNRECOGNIZED : zzgrcVar;
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
                                    synchronized (zzgre.class) {
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
                    return new zzgrb(null);
                }
                return new zzgre();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgvc zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
