package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgjh {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzgjd
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgjh.zzd((zzghj) zzgcsVar);
            }
        }, zzghj.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgjh.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgjf
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgjh.zzc((zzghd) zzgcfVar, zzgcwVar);
            }
        }, zzghd.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgjh.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzghd zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgsx zzd2 = zzgsx.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    return zzghd.zza(zzf(zzgmbVar.zzc()), zzgui.zzb(zzd2.zzf().zzA(), zzgcwVar), zzgmbVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghj zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzgta.zzd(zzgmcVar.zzc().zzh(), zzgvu.zza()).zza() == 0) {
                    return zzghj.zzc(zzf(zzgmcVar.zzc().zzg()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzghd zzghdVar, zzgcw zzgcwVar) {
        zzgsv zzb2 = zzgsx.zzb();
        byte[] zzd2 = zzghdVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgsx) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzg(zzghdVar.zzb().zzb()), zzghdVar.zze());
    }

    public static /* synthetic */ zzgmc zzd(zzghj zzghjVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgta.zzc().zzaN());
        zza2.zza(zzg(zzghjVar.zzb()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzghi zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzghi.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgsiVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzghi.zzb;
        }
        return zzghi.zza;
    }

    private static zzgsi zzg(zzghi zzghiVar) throws GeneralSecurityException {
        if (zzghi.zza.equals(zzghiVar)) {
            return zzgsi.TINK;
        }
        if (zzghi.zzb.equals(zzghiVar)) {
            return zzgsi.CRUNCHY;
        }
        if (zzghi.zzc.equals(zzghiVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghiVar.toString()));
    }
}
