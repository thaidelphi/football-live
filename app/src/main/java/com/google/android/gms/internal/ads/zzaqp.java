package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaqp extends zzgwk implements zzgxw {
    private static final zzaqp zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzgww zzo = zzgwk.zzbK();

    static {
        zzaqp zzaqpVar = new zzaqp();
        zza = zzaqpVar;
        zzgwk.zzbZ(zzaqp.class, zzaqpVar);
    }

    private zzaqp() {
    }

    public static zzaql zza() {
        return (zzaql) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzaqp zzaqpVar, String str) {
        str.getClass();
        zzaqpVar.zzc |= 1;
        zzaqpVar.zzd = str;
    }

    public static /* synthetic */ void zzd(zzaqp zzaqpVar, String str) {
        zzaqpVar.zzc |= 16;
        zzaqpVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzaqp zzaqpVar, String str) {
        zzaqpVar.zzc |= 1024;
        zzaqpVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzaqp zzaqpVar, String str) {
        str.getClass();
        zzaqpVar.zzc |= 8;
        zzaqpVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzaqp zzaqpVar, long j10) {
        zzaqpVar.zzc |= 2;
        zzaqpVar.zze = j10;
    }

    public static /* synthetic */ void zzi(zzaqp zzaqpVar, String str) {
        str.getClass();
        zzaqpVar.zzc |= 4;
        zzaqpVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzaqp zzaqpVar, int i10) {
        zzaqpVar.zzp = i10 - 1;
        zzaqpVar.zzc |= com.ironsource.mediationsdk.metadata.a.f18931n;
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
                                    synchronized (zzaqp.class) {
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
                    return new zzaql(null);
                }
                return new zzaqp();
            }
            return zzgwk.zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzaqn.class, "zzp", zzaqo.zza});
        }
        return (byte) 1;
    }
}
