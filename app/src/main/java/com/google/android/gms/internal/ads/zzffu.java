package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffu extends zzgwk implements zzgxw {
    private static final zzffu zza;
    private static volatile zzgyd zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzac;
    private int zzae;
    private int zzaf;
    private int zzag;
    private zzfhb zzah;
    private int zzai;
    private zzfgv zzaj;
    private zzfgc zzak;
    private zzfgi zzal;
    private zzfgf zzam;
    private zzfgy zzan;
    private zzfgp zzao;
    private zzfgm zzap;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = "";
    private zzgws zzj = zzgwk.zzbG();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private zzgwv zzD = zzgwk.zzbI();
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzR = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzad = "";

    static {
        zzffu zzffuVar = new zzffu();
        zza = zzffuVar;
        zzgwk.zzbZ(zzffu.class, zzffuVar);
    }

    private zzffu() {
    }

    public static zzffr zza() {
        return (zzffr) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzffu zzffuVar, Iterable iterable) {
        zzgwv zzgwvVar = zzffuVar.zzD;
        if (!zzgwvVar.zzc()) {
            zzffuVar.zzD = zzgwk.zzbJ(zzgwvVar);
        }
        zzgul.zzaQ(iterable, zzffuVar.zzD);
    }

    public static /* synthetic */ void zzd(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzx = str;
    }

    public static /* synthetic */ void zzf(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzJ = str;
    }

    public static /* synthetic */ void zzg(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzab = str;
    }

    public static /* synthetic */ void zzi(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzK = str;
    }

    public static /* synthetic */ void zzk(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzW = str;
    }

    public static /* synthetic */ void zzn(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzz = str;
    }

    public static /* synthetic */ void zzo(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzY = str;
    }

    public static /* synthetic */ void zzq(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzu = str;
    }

    public static /* synthetic */ void zzr(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzaa = str;
    }

    public static /* synthetic */ void zzv(zzffu zzffuVar, String str) {
        str.getClass();
        zzffuVar.zzZ = str;
    }

    public static /* synthetic */ void zzw(zzffu zzffuVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzffuVar.zzI = i10 - 2;
    }

    public static /* synthetic */ void zzy(zzffu zzffuVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzffuVar.zzE = i10 - 2;
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
                                    synchronized (zzffu.class) {
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
                    return new zzffr(null);
                }
                return new zzffu();
            }
            return zzgwk.zzbQ(zza, "\u0004=\u0000\u0001\u0001==\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzac", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzaf", "zzag", "zze", "zzaj", "zzak", "zzP", "zzR", "zzO", "zzN", "zzai", "zzQ", "zzS", "zzT", "zzy", "zzal", "zzF", "zzam", "zzad", "zzae", "zzah", "zzan", "zzao", "zzV", "zzap"});
        }
        return (byte) 1;
    }
}
