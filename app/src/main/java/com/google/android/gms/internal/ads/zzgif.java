package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgif {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzgib
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgif.zzd((zzgfg) zzgcsVar);
            }
        }, zzgfg.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzgic
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgif.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgid
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgif.zzc((zzgey) zzgcfVar, zzgcwVar);
            }
        }, zzgey.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzgie
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgif.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzgey zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgqh zzd2 = zzgqh.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    zzgfd zzc2 = zzgfg.zzc();
                    zzc2.zza(zzd2.zzf().zzd());
                    zzc2.zzb(zzf(zzgmbVar.zzc()));
                    zzgfg zzc3 = zzc2.zzc();
                    zzgew zza2 = zzgey.zza();
                    zza2.zzc(zzc3);
                    zza2.zzb(zzgui.zzb(zzd2.zzf().zzA(), zzgcwVar));
                    zza2.zza(zzgmbVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgfg zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgqk zzf2 = zzgqk.zzf(zzgmcVar.zzc().zzh(), zzgvu.zza());
                if (zzf2.zzb() == 0) {
                    zzgfd zzc2 = zzgfg.zzc();
                    zzc2.zza(zzf2.zza());
                    zzc2.zzb(zzf(zzgmcVar.zzc().zzg()));
                    return zzc2.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzgey zzgeyVar, zzgcw zzgcwVar) {
        zzgqf zzb2 = zzgqh.zzb();
        byte[] zzd2 = zzgeyVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgqh) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzg(zzgeyVar.zzb().zzd()), zzgeyVar.zze());
    }

    public static /* synthetic */ zzgmc zzd(zzgfg zzgfgVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgqi zzc2 = zzgqk.zzc();
        zzc2.zza(zzgfgVar.zzb());
        zza2.zzc(((zzgqk) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzgfgVar.zzd()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzgfe zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgfe.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgsiVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgfe.zzb;
        }
        return zzgfe.zza;
    }

    private static zzgsi zzg(zzgfe zzgfeVar) throws GeneralSecurityException {
        if (zzgfe.zza.equals(zzgfeVar)) {
            return zzgsi.TINK;
        }
        if (zzgfe.zzb.equals(zzgfeVar)) {
            return zzgsi.CRUNCHY;
        }
        if (zzgfe.zzc.equals(zzgfeVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfeVar)));
    }
}
