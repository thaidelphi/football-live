package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhcf extends zzgwk implements zzgxw {
    private static final zzhcf zza;
    private static volatile zzgyd zzb;
    private zzhcb zzC;
    private zzham zzE;
    private zzhae zzG;
    private zzhbf zzI;
    private int zzJ;
    private long zzM;
    private zzhce zzN;
    private zzhbk zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhai zzi;
    private zzhbq zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhbx zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgww zzj = zzgwk.zzbK();
    private zzgww zzk = zzgwk.zzbK();
    private String zzl = "";
    private zzgww zzo = zzgwk.zzbK();
    private String zzp = "";
    private zzgvc zzw = zzgvc.zzb;
    private String zzz = "";
    private zzgww zzA = zzgwk.zzbK();
    private zzgww zzB = zzgwk.zzbK();
    private zzgww zzD = zzgwk.zzbK();
    private String zzF = "";
    private zzgww zzH = zzgwk.zzbK();
    private zzgww zzK = zzgwk.zzbK();
    private zzgww zzL = zzgwk.zzbK();
    private String zzP = "";

    static {
        zzhcf zzhcfVar = new zzhcf();
        zza = zzhcfVar;
        zzgwk.zzbZ(zzhcf.class, zzhcfVar);
    }

    private zzhcf() {
    }

    public static zzhag zzc() {
        return (zzhag) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhcf zzhcfVar, Iterable iterable) {
        zzgww zzgwwVar = zzhcfVar.zzA;
        if (!zzgwwVar.zzc()) {
            zzhcfVar.zzA = zzgwk.zzbL(zzgwwVar);
        }
        zzgul.zzaQ(iterable, zzhcfVar.zzA);
    }

    public static /* synthetic */ void zzj(zzhcf zzhcfVar, Iterable iterable) {
        zzgww zzgwwVar = zzhcfVar.zzB;
        if (!zzgwwVar.zzc()) {
            zzhcfVar.zzB = zzgwk.zzbL(zzgwwVar);
        }
        zzgul.zzaQ(iterable, zzhcfVar.zzB);
    }

    public static /* synthetic */ void zzk(zzhcf zzhcfVar, zzhbv zzhbvVar) {
        zzhbvVar.getClass();
        zzgww zzgwwVar = zzhcfVar.zzj;
        if (!zzgwwVar.zzc()) {
            zzhcfVar.zzj = zzgwk.zzbL(zzgwwVar);
        }
        zzhcfVar.zzj.add(zzhbvVar);
    }

    public static /* synthetic */ void zzl(zzhcf zzhcfVar) {
        zzhcfVar.zzc &= -65;
        zzhcfVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzm(zzhcf zzhcfVar, String str) {
        zzhcfVar.zzc |= 64;
        zzhcfVar.zzl = str;
    }

    public static /* synthetic */ void zzn(zzhcf zzhcfVar, zzhbx zzhbxVar) {
        zzhbxVar.getClass();
        zzhcfVar.zzx = zzhbxVar;
        zzhcfVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzo(zzhcf zzhcfVar, zzhai zzhaiVar) {
        zzhaiVar.getClass();
        zzhcfVar.zzi = zzhaiVar;
        zzhcfVar.zzc |= 32;
    }

    public static /* synthetic */ void zzp(zzhcf zzhcfVar, String str) {
        str.getClass();
        zzhcfVar.zzc |= 8;
        zzhcfVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzhcf zzhcfVar, zzhbq zzhbqVar) {
        zzhbqVar.getClass();
        zzhcfVar.zzm = zzhbqVar;
        zzhcfVar.zzc |= 128;
    }

    public static /* synthetic */ void zzr(zzhcf zzhcfVar, String str) {
        str.getClass();
        zzhcfVar.zzc |= 4;
        zzhcfVar.zzf = str;
    }

    public static /* synthetic */ void zzs(zzhcf zzhcfVar, int i10) {
        zzhcfVar.zzd = i10 - 1;
        zzhcfVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        switch (zzgwjVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzgwk.zzbQ(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhbv.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhbr.zza, "zze", zzhaf.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhcj.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhcp.class, "zzE", "zzF", "zzG", "zzH", zzhaq.class, "zzI", "zzJ", zzhbz.zza, "zzK", zzhbi.class, "zzL", zzhbn.class, "zzM", "zzN", "zzO", "zzP"});
            case 3:
                return new zzhcf();
            case 4:
                return new zzhag(null);
            case 5:
                return zza;
            case 6:
                zzgyd zzgydVar = zzb;
                if (zzgydVar == null) {
                    synchronized (zzhcf.class) {
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

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
