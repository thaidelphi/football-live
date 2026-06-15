package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgho {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzghk
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgho.zzd((zzgea) zzgcsVar);
            }
        }, zzgea.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzghl
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgho.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzghm
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgho.zzc((zzgdr) zzgcfVar, zzgcwVar);
            }
        }, zzgdr.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzghn
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgho.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzgdr zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgpd zzd2 = zzgpd.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    if (zzd2.zzf().zza() == 0) {
                        if (zzd2.zzg().zza() == 0) {
                            zzgdw zzf2 = zzgea.zzf();
                            zzf2.zza(zzd2.zzf().zzg().zzd());
                            zzf2.zzc(zzd2.zzg().zzh().zzd());
                            zzf2.zzd(zzd2.zzf().zzf().zza());
                            zzf2.zze(zzd2.zzg().zzg().zza());
                            zzf2.zzb(zzf(zzd2.zzg().zzg().zzb()));
                            zzf2.zzf(zzg(zzgmbVar.zzc()));
                            zzgea zzg = zzf2.zzg();
                            zzgdp zza2 = zzgdr.zza();
                            zza2.zzd(zzg);
                            zza2.zza(zzgui.zzb(zzd2.zzf().zzg().zzA(), zzgcwVar));
                            zza2.zzb(zzgui.zzb(zzd2.zzg().zzh().zzA(), zzgcwVar));
                            zza2.zzc(zzgmbVar.zzf());
                            return zza2.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgea zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgpg zzc2 = zzgpg.zzc(zzgmcVar.zzc().zzh(), zzgvu.zza());
                if (zzc2.zzf().zzb() == 0) {
                    zzgdw zzf2 = zzgea.zzf();
                    zzf2.zza(zzc2.zzd().zza());
                    zzf2.zzc(zzc2.zzf().zza());
                    zzf2.zzd(zzc2.zzd().zzf().zza());
                    zzf2.zze(zzc2.zzf().zzh().zza());
                    zzf2.zzb(zzf(zzc2.zzf().zzh().zzb()));
                    zzf2.zzf(zzg(zzgmcVar.zzc().zzg()));
                    return zzf2.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzgdr zzgdrVar, zzgcw zzgcwVar) {
        zzgpb zzb2 = zzgpd.zzb();
        zzgph zzb3 = zzgpj.zzb();
        zzgpn zzb4 = zzgpp.zzb();
        zzb4.zza(zzgdrVar.zzb().zzd());
        zzb3.zzb((zzgpp) zzb4.zzbr());
        byte[] zzd2 = zzgdrVar.zzd().zzd(zzgcwVar);
        zzb3.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        zzb2.zza((zzgpj) zzb3.zzbr());
        zzgqs zzb5 = zzgqu.zzb();
        zzb5.zzb(zzh(zzgdrVar.zzb()));
        byte[] zzd3 = zzgdrVar.zze().zzd(zzgcwVar);
        zzb5.zza(zzgvc.zzv(zzd3, 0, zzd3.length));
        zzb2.zzb((zzgqu) zzb5.zzbr());
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgpd) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzi(zzgdrVar.zzb().zzh()), zzgdrVar.zzf());
    }

    public static /* synthetic */ zzgmc zzd(zzgea zzgeaVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgpe zza3 = zzgpg.zza();
        zzgpk zzb2 = zzgpm.zzb();
        zzgpn zzb3 = zzgpp.zzb();
        zzb3.zza(zzgeaVar.zzd());
        zzb2.zzb((zzgpp) zzb3.zzbr());
        zzb2.zza(zzgeaVar.zzb());
        zza3.zza((zzgpm) zzb2.zzbr());
        zzgqv zzc2 = zzgqx.zzc();
        zzc2.zzb(zzh(zzgeaVar));
        zzc2.zza(zzgeaVar.zzc());
        zza3.zzb((zzgqx) zzc2.zzbr());
        zza2.zzc(((zzgpg) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzgeaVar.zzh()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzgdx zzf(zzgqr zzgqrVar) throws GeneralSecurityException {
        int ordinal = zzgqrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return zzgdx.zzb;
                        }
                        int zza2 = zzgqrVar.zza();
                        throw new GeneralSecurityException("Unable to parse HashType: " + zza2);
                    }
                    return zzgdx.zze;
                }
                return zzgdx.zzc;
            }
            return zzgdx.zzd;
        }
        return zzgdx.zza;
    }

    private static zzgdy zzg(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgdy.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgsiVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgdy.zzb;
        }
        return zzgdy.zza;
    }

    private static zzgra zzh(zzgea zzgeaVar) throws GeneralSecurityException {
        zzgqr zzgqrVar;
        zzgqy zzc2 = zzgra.zzc();
        zzc2.zzb(zzgeaVar.zze());
        zzgdx zzg = zzgeaVar.zzg();
        if (zzgdx.zza.equals(zzg)) {
            zzgqrVar = zzgqr.SHA1;
        } else if (zzgdx.zzb.equals(zzg)) {
            zzgqrVar = zzgqr.SHA224;
        } else if (zzgdx.zzc.equals(zzg)) {
            zzgqrVar = zzgqr.SHA256;
        } else if (zzgdx.zzd.equals(zzg)) {
            zzgqrVar = zzgqr.SHA384;
        } else if (zzgdx.zze.equals(zzg)) {
            zzgqrVar = zzgqr.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        zzc2.zza(zzgqrVar);
        return (zzgra) zzc2.zzbr();
    }

    private static zzgsi zzi(zzgdy zzgdyVar) throws GeneralSecurityException {
        if (zzgdy.zza.equals(zzgdyVar)) {
            return zzgsi.TINK;
        }
        if (zzgdy.zzb.equals(zzgdyVar)) {
            return zzgsi.CRUNCHY;
        }
        if (zzgdy.zzc.equals(zzgdyVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgdyVar)));
    }
}
