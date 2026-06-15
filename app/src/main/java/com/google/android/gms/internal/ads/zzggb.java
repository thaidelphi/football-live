package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzggb {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzgfx
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzggb.zzd((zzgfw) zzgcsVar);
            }
        }, zzgfw.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzgfy
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzggb.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgfz
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzggb.zzc((zzgfu) zzgcfVar, zzgcwVar);
            }
        }, zzgfu.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzgga
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzggb.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzgfu zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzgry zzd2 = zzgry.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    return zzgfu.zza(zzgfw.zzc(zzd2.zzf().zzf(), zzf(zzgmbVar.zzc())), zzgmbVar.zzf());
                }
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgfw zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzgfw.zzc(zzgsb.zzd(zzgmcVar.zzc().zzh(), zzgvu.zza()).zzf(), zzf(zzgmcVar.zzc().zzg()));
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzgfu zzgfuVar, zzgcw zzgcwVar) {
        zzgrw zzb2 = zzgry.zzb();
        zzgrz zza2 = zzgsb.zza();
        zza2.zza(zzgfuVar.zzb().zzd());
        zzb2.zza((zzgsb) zza2.zzbr());
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgry) zzb2.zzbr()).zzaN(), zzgrc.REMOTE, zzg(zzgfuVar.zzb().zzb()), zzgfuVar.zzd());
    }

    public static /* synthetic */ zzgmc zzd(zzgfw zzgfwVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgrz zza3 = zzgsb.zza();
        zza3.zza(zzgfwVar.zzd());
        zza2.zzc(((zzgsb) zza3.zzbr()).zzaN());
        zza2.zza(zzg(zzgfwVar.zzb()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzgfv zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzgfv.zzb;
            }
            int zza2 = zzgsiVar.zza();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
        }
        return zzgfv.zza;
    }

    private static zzgsi zzg(zzgfv zzgfvVar) throws GeneralSecurityException {
        if (zzgfv.zza.equals(zzgfvVar)) {
            return zzgsi.TINK;
        }
        if (zzgfv.zzb.equals(zzgfvVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgfvVar.toString()));
    }
}
