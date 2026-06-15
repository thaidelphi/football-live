package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaxa extends zzgwk implements zzgxw {
    private static final zzaxa zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzaxa zzaxaVar = new zzaxa();
        zza = zzaxaVar;
        zzgwk.zzbZ(zzaxa.class, zzaxaVar);
    }

    private zzaxa() {
    }

    public static zzawy zzd() {
        return (zzawy) zza.zzaZ();
    }

    public static zzaxa zzg() {
        return zza;
    }

    public static zzaxa zzh(zzgvc zzgvcVar) throws zzgwz {
        return (zzaxa) zzgwk.zzbm(zza, zzgvcVar);
    }

    public static zzaxa zzi(zzgvc zzgvcVar, zzgvu zzgvuVar) throws zzgwz {
        return (zzaxa) zzgwk.zzbr(zza, zzgvcVar, zzgvuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzaxa zzaxaVar, String str) {
        str.getClass();
        zzaxaVar.zzc |= 2;
        zzaxaVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzaxa zzaxaVar, long j10) {
        zzaxaVar.zzc |= 8;
        zzaxaVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzaxa zzaxaVar, long j10) {
        zzaxaVar.zzc |= 4;
        zzaxaVar.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzaxa zzaxaVar, long j10) {
        zzaxaVar.zzc |= 16;
        zzaxaVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzaxa zzaxaVar, String str) {
        str.getClass();
        zzaxaVar.zzc |= 1;
        zzaxaVar.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
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
                                    synchronized (zzaxa.class) {
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
                    return new zzawy(null);
                }
                return new zzaxa();
            }
            return zzgwk.zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
