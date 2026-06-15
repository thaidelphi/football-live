package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgoh {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzgod
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgoh.zzb((zzgmy) zzgcsVar);
            }
        }, zzgmy.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzgoe
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgoh.zzd((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgof
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgoh.zza((zzgmq) zzgcfVar, zzgcwVar);
            }
        }, zzgmq.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzgog
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgoh.zzc((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzgmb zza(zzgmq zzgmqVar, zzgcw zzgcwVar) {
        zzgos zzb2 = zzgou.zzb();
        zzb2.zzb(zzg(zzgmqVar.zzb()));
        byte[] zzd2 = zzgmqVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgou) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzh(zzgmqVar.zzb().zzf()), zzgmqVar.zze());
    }

    public static /* synthetic */ zzgmc zzb(zzgmy zzgmyVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgov zzb2 = zzgox.zzb();
        zzb2.zzb(zzg(zzgmyVar));
        zzb2.zza(zzgmyVar.zzc());
        zza2.zzc(((zzgox) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgmyVar.zzf()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static /* synthetic */ zzgmq zzc(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgou zzd2 = zzgou.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    zzgmv zze2 = zzgmy.zze();
                    zze2.zza(zzd2.zzg().zzd());
                    zze2.zzb(zzd2.zzf().zza());
                    zze2.zzc(zzf(zzgmbVar.zzc()));
                    zzgmy zzd3 = zze2.zzd();
                    zzgmo zza2 = zzgmq.zza();
                    zza2.zzc(zzd3);
                    zza2.zza(zzgui.zzb(zzd2.zzg().zzA(), zzgcwVar));
                    zza2.zzb(zzgmbVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgmy zzd(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgox zzd2 = zzgox.zzd(zzgmcVar.zzc().zzh(), zzgvu.zza());
                zzgmv zze2 = zzgmy.zze();
                zze2.zza(zzd2.zza());
                zze2.zzb(zzd2.zzf().zza());
                zze2.zzc(zzf(zzgmcVar.zzc().zzg()));
                return zze2.zzd();
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzgmw zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgmw.zzb;
                    }
                    int zza2 = zzgsiVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
                return zzgmw.zzd;
            }
            return zzgmw.zzc;
        }
        return zzgmw.zza;
    }

    private static zzgpa zzg(zzgmy zzgmyVar) {
        zzgoy zzb2 = zzgpa.zzb();
        zzb2.zza(zzgmyVar.zzb());
        return (zzgpa) zzb2.zzbr();
    }

    private static zzgsi zzh(zzgmw zzgmwVar) throws GeneralSecurityException {
        if (zzgmw.zza.equals(zzgmwVar)) {
            return zzgsi.TINK;
        }
        if (zzgmw.zzb.equals(zzgmwVar)) {
            return zzgsi.CRUNCHY;
        }
        if (zzgmw.zzd.equals(zzgmwVar)) {
            return zzgsi.RAW;
        }
        if (zzgmw.zzc.equals(zzgmwVar)) {
            return zzgsi.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgmwVar)));
    }
}
