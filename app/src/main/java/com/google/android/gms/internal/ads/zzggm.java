package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzggm {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzggi
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzggm.zzd((zzggh) zzgcsVar);
            }
        }, zzggh.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzggj
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzggm.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzggk
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzggm.zzc((zzggc) zzgcfVar, zzgcwVar);
            }
        }, zzggc.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzggl
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzggm.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzggc zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgse zzd2 = zzgse.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    return zzggc.zza(zzf(zzd2.zzf(), zzgmbVar.zzc()), zzgmbVar.zzf());
                }
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + valueOf);
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzggh zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzf(zzgsh.zzf(zzgmcVar.zzc().zzh(), zzgvu.zza()), zzgmcVar.zzc().zzg());
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzggc zzggcVar, zzgcw zzgcwVar) {
        zzgsc zzb2 = zzgse.zzb();
        zzb2.zza(zzg(zzggcVar.zzb()));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgse) zzb2.zzbr()).zzaN(), zzgrc.REMOTE, zzh(zzggcVar.zzb().zzc()), zzggcVar.zzd());
    }

    public static /* synthetic */ zzgmc zzd(zzggh zzgghVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgghVar).zzaN());
        zza2.zza(zzh(zzgghVar.zzc()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzggh zzf(zzgsh zzgshVar, zzgsi zzgsiVar) throws GeneralSecurityException {
        zzgge zzggeVar;
        zzggf zzggfVar;
        zzgrg zza2 = zzgri.zza();
        zza2.zzb(zzgshVar.zza().zzi());
        zza2.zzc(zzgshVar.zza().zzh());
        zza2.zza(zzgsi.RAW);
        zzgcs zza3 = zzgcy.zza(((zzgri) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzgev) {
            zzggeVar = zzgge.zza;
        } else if (zza3 instanceof zzgfm) {
            zzggeVar = zzgge.zzc;
        } else if (zza3 instanceof zzghj) {
            zzggeVar = zzgge.zzb;
        } else if (zza3 instanceof zzgea) {
            zzggeVar = zzgge.zzd;
        } else if (zza3 instanceof zzgek) {
            zzggeVar = zzgge.zze;
        } else if (zza3 instanceof zzgfg) {
            zzggeVar = zzgge.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzggd zzggdVar = new zzggd(null);
        int ordinal = zzgsiVar.ordinal();
        if (ordinal == 1) {
            zzggfVar = zzggf.zza;
        } else if (ordinal == 3) {
            zzggfVar = zzggf.zzb;
        } else {
            int zza4 = zzgsiVar.zza();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza4);
        }
        zzggdVar.zzd(zzggfVar);
        zzggdVar.zzc(zzgshVar.zzg());
        zzggdVar.zza((zzgdk) zza3);
        zzggdVar.zzb(zzggeVar);
        return zzggdVar.zze();
    }

    private static zzgsh zzg(zzggh zzgghVar) throws GeneralSecurityException {
        try {
            zzgri zzf2 = zzgri.zzf(zzgcy.zzb(zzgghVar.zzb()), zzgvu.zza());
            zzgsf zzb2 = zzgsh.zzb();
            zzb2.zzb(zzgghVar.zzd());
            zzb2.zza(zzf2);
            return (zzgsh) zzb2.zzbr();
        } catch (zzgwz e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    private static zzgsi zzh(zzggf zzggfVar) throws GeneralSecurityException {
        if (zzggf.zza.equals(zzggfVar)) {
            return zzgsi.TINK;
        }
        if (zzggf.zzb.equals(zzggfVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggfVar)));
    }
}
