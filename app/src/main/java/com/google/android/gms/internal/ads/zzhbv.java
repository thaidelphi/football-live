package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhbv extends zzgwk implements zzgxw {
    private static final zzhbv zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private int zzd;
    private zzhaw zzf;
    private zzhba zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzgws zzi = zzgwk.zzbG();
    private String zzj = "";
    private zzgww zzl = zzgwk.zzbK();

    static {
        zzhbv zzhbvVar = new zzhbv();
        zza = zzhbvVar;
        zzgwk.zzbZ(zzhbv.class, zzhbvVar);
    }

    private zzhbv() {
    }

    public static zzhbu zzd() {
        return (zzhbu) zza.zzaZ();
    }

    public static /* synthetic */ void zzh(zzhbv zzhbvVar, String str) {
        str.getClass();
        zzgww zzgwwVar = zzhbvVar.zzl;
        if (!zzgwwVar.zzc()) {
            zzhbvVar.zzl = zzgwk.zzbL(zzgwwVar);
        }
        zzhbvVar.zzl.add(str);
    }

    public static /* synthetic */ void zzi(zzhbv zzhbvVar, int i10) {
        zzhbvVar.zzc |= 1;
        zzhbvVar.zzd = i10;
    }

    public static /* synthetic */ void zzj(zzhbv zzhbvVar, zzhaw zzhawVar) {
        zzhawVar.getClass();
        zzhbvVar.zzf = zzhawVar;
        zzhbvVar.zzc |= 4;
    }

    public static /* synthetic */ void zzk(zzhbv zzhbvVar, String str) {
        str.getClass();
        zzhbvVar.zzc |= 2;
        zzhbvVar.zze = str;
    }

    public static /* synthetic */ void zzl(zzhbv zzhbvVar, int i10) {
        zzhbvVar.zzk = i10 - 1;
        zzhbvVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        switch (zzgwjVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzgwk.zzbQ(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhbs.zza, "zzl"});
            case 3:
                return new zzhbv();
            case 4:
                return new zzhbu(null);
            case 5:
                return zza;
            case 6:
                zzgyd zzgydVar = zzb;
                if (zzgydVar == null) {
                    synchronized (zzhbv.class) {
                        zzgydVar = zzb;
                        if (zzgydVar == null) {
                            zzgydVar = new zzgwf(zza);
                            zzb = zzgydVar;
                        }
                    }
                }
                return zzgydVar;
            default:
                throw null;
        }
    }

    public final String zzg() {
        return this.zze;
    }
}
