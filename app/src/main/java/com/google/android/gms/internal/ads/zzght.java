package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzght {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzghp
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzght.zzd((zzgek) zzgcsVar);
            }
        }, zzgek.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzghq
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzght.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzghr
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzght.zzc((zzged) zzgcfVar, zzgcwVar);
            }
        }, zzged.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzghs
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzght.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzged zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgps zzd2 = zzgps.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    zzgeh zzd3 = zzgek.zzd();
                    zzd3.zzb(zzd2.zzg().zzd());
                    zzd3.zza(zzd2.zzf().zza());
                    zzd3.zzc(16);
                    zzd3.zzd(zzf(zzgmbVar.zzc()));
                    zzgek zze2 = zzd3.zze();
                    zzgeb zza2 = zzged.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgui.zzb(zzd2.zzg().zzA(), zzgcwVar));
                    zza2.zza(zzgmbVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgek zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgpv zzd2 = zzgpv.zzd(zzgmcVar.zzc().zzh(), zzgvu.zza());
                zzgeh zzd3 = zzgek.zzd();
                zzd3.zzb(zzd2.zza());
                zzd3.zza(zzd2.zzf().zza());
                zzd3.zzc(16);
                zzd3.zzd(zzf(zzgmcVar.zzc().zzg()));
                return zzd3.zze();
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzged zzgedVar, zzgcw zzgcwVar) {
        zzgpq zzb2 = zzgps.zzb();
        zzb2.zzb(zzg(zzgedVar.zzb()));
        byte[] zzd2 = zzgedVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgps) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzh(zzgedVar.zzb().zze()), zzgedVar.zze());
    }

    public static /* synthetic */ zzgmc zzd(zzgek zzgekVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgpt zzb2 = zzgpv.zzb();
        zzb2.zzb(zzg(zzgekVar));
        zzb2.zza(zzgekVar.zzc());
        zza2.zzc(((zzgpv) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgekVar.zze()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzgei zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgei.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgsiVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgei.zzb;
        }
        return zzgei.zza;
    }

    private static zzgpy zzg(zzgek zzgekVar) throws GeneralSecurityException {
        zzgpw zzb2 = zzgpy.zzb();
        zzb2.zza(zzgekVar.zzb());
        return (zzgpy) zzb2.zzbr();
    }

    private static zzgsi zzh(zzgei zzgeiVar) throws GeneralSecurityException {
        if (zzgei.zza.equals(zzgeiVar)) {
            return zzgsi.TINK;
        }
        if (zzgei.zzb.equals(zzgeiVar)) {
            return zzgsi.CRUNCHY;
        }
        if (zzgei.zzc.equals(zzgeiVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgeiVar)));
    }
}
