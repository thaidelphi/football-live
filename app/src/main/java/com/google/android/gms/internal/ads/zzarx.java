package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzarx extends zzgwk implements zzgxw {
    private static final zzarx zza;
    private static volatile zzgyd zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzarx zzarxVar = new zzarx();
        zza = zzarxVar;
        zzgwk.zzbZ(zzarx.class, zzarxVar);
    }

    private zzarx() {
    }

    public static zzarw zza() {
        return (zzarw) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzarx zzarxVar) {
        zzarxVar.zzc &= -9;
        zzarxVar.zzg = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 8;
        zzarxVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 32;
        zzarxVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        zzarxVar.zzp = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzarxVar.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= com.ironsource.mediationsdk.metadata.a.f18931n;
        zzarxVar.zzo = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 4;
        zzarxVar.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 16;
        zzarxVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 128;
        zzarxVar.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 131072;
        zzarxVar.zzy = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 1;
        zzarxVar.zzd = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 262144;
        zzarxVar.zzz = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 2;
        zzarxVar.zze = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 256;
        zzarxVar.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 32768;
        zzarxVar.zzw = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 65536;
        zzarxVar.zzx = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 8192;
        zzarxVar.zzu = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzarx zzarxVar, long j10) {
        zzarxVar.zzc |= 16384;
        zzarxVar.zzv = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzarx zzarxVar, int i10) {
        zzarxVar.zzn = i10 - 1;
        zzarxVar.zzc |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzarx zzarxVar, int i10) {
        zzarxVar.zzj = i10 - 1;
        zzarxVar.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected final Object zzdc(zzgwj zzgwjVar, Object obj, Object obj2) {
        int ordinal = zzgwjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                zzgwq zzgwqVar = zzasg.zza;
                return zzgwk.zzbQ(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgwqVar, "zzk", "zzl", "zzm", "zzn", zzgwqVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            zzgyd zzgydVar = zzb;
                            if (zzgydVar == null) {
                                synchronized (zzarx.class) {
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
                return new zzarw(null);
            } else {
                return new zzarx();
            }
        }
        return (byte) 1;
    }
}
