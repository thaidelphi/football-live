package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgri extends zzgwk implements zzgxw {
    private static final zzgri zza;
    private static volatile zzgyd zzb;
    private String zzc = "";
    private zzgvc zzd = zzgvc.zzb;
    private int zze;

    static {
        zzgri zzgriVar = new zzgri();
        zza = zzgriVar;
        zzgwk.zzbZ(zzgri.class, zzgriVar);
    }

    private zzgri() {
    }

    public static zzgrg zza() {
        return (zzgrg) zza.zzaZ();
    }

    public static zzgrg zzb(zzgri zzgriVar) {
        return (zzgrg) zza.zzba(zzgriVar);
    }

    public static zzgri zzd() {
        return zza;
    }

    public static zzgri zzf(byte[] bArr, zzgvu zzgvuVar) throws zzgwz {
        return (zzgri) zzgwk.zzbx(zza, bArr, zzgvuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzgri zzgriVar, String str) {
        str.getClass();
        zzgriVar.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzgri zzgriVar, zzgvc zzgvcVar) {
        zzgvcVar.getClass();
        zzgriVar.zzd = zzgvcVar;
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
                                    synchronized (zzgri.class) {
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
                    return new zzgrg(null);
                }
                return new zzgri();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgsi zzg() {
        zzgsi zzb2 = zzgsi.zzb(this.zze);
        return zzb2 == null ? zzgsi.UNRECOGNIZED : zzb2;
    }

    public final zzgvc zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
