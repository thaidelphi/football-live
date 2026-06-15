package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgro extends zzgwk implements zzgxw {
    private static final zzgro zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private zzgre zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgro zzgroVar = new zzgro();
        zza = zzgroVar;
        zzgwk.zzbZ(zzgro.class, zzgroVar);
    }

    private zzgro() {
    }

    public static zzgrn zzc() {
        return (zzgrn) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzgro zzgroVar, zzgre zzgreVar) {
        zzgreVar.getClass();
        zzgroVar.zzd = zzgreVar;
        zzgroVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgre zzb() {
        zzgre zzgreVar = this.zzd;
        return zzgreVar == null ? zzgre.zzd() : zzgreVar;
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
                                    synchronized (zzgro.class) {
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
                    return new zzgrn(null);
                }
                return new zzgro();
            }
            return zzgwk.zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgsi zzf() {
        zzgsi zzb2 = zzgsi.zzb(this.zzg);
        return zzb2 == null ? zzgsi.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
