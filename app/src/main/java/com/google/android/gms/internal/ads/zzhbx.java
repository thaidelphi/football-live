package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhbx extends zzgwk implements zzgxw {
    private static final zzhbx zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhbx zzhbxVar = new zzhbx();
        zza = zzhbxVar;
        zzgwk.zzbZ(zzhbx.class, zzhbxVar);
    }

    private zzhbx() {
    }

    public static zzhbw zzc() {
        return (zzhbw) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhbx zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhbx zzhbxVar, String str) {
        zzhbxVar.zzc |= 1;
        zzhbxVar.zzd = str;
    }

    public static /* synthetic */ void zzg(zzhbx zzhbxVar, long j10) {
        zzhbxVar.zzc |= 2;
        zzhbxVar.zze = j10;
    }

    public static /* synthetic */ void zzh(zzhbx zzhbxVar, boolean z10) {
        zzhbxVar.zzc |= 4;
        zzhbxVar.zzf = z10;
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
                                    synchronized (zzhbx.class) {
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
                    return new zzhbw(null);
                }
                return new zzhbx();
            }
            return zzgwk.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhby.zza, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
