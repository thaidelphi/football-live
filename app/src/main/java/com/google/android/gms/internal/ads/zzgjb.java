package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzgix
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgjb.zzd((zzghc) zzgcsVar);
            }
        }, zzghc.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzgiy
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgjb.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgiz
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgjb.zzc((zzggx) zzgcfVar, zzgcwVar);
            }
        }, zzggx.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzgja
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgjb.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzggx zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzgso zzd2 = zzgso.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    if (zzd2.zzg().zzd() == 32) {
                        return zzggx.zza(zzghc.zzd(zzf(zzgmbVar.zzc()), zzd2.zzf().zza()), zzgui.zzb(zzd2.zzg().zzA(), zzgcwVar), zzgmbVar.zzf());
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghc zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzgsr zzd2 = zzgsr.zzd(zzgmcVar.zzc().zzh(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    return zzghc.zzd(zzf(zzgmcVar.zzc().zzg()), zzd2.zzf().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzggx zzggxVar, zzgcw zzgcwVar) {
        zzgsm zzb2 = zzgso.zzb();
        byte[] zzd2 = zzggxVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        zzgss zzb3 = zzgsu.zzb();
        zzb3.zza(zzggxVar.zzb().zzb());
        zzb2.zzb((zzgsu) zzb3.zzbr());
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzgso) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzg(zzggxVar.zzb().zzc()), zzggxVar.zze());
    }

    public static /* synthetic */ zzgmc zzd(zzghc zzghcVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgsp zzb2 = zzgsr.zzb();
        zzgss zzb3 = zzgsu.zzb();
        zzb3.zza(zzghcVar.zzb());
        zzb2.zza((zzgsu) zzb3.zzbr());
        zza2.zzc(((zzgsr) zzb2.zzbr()).zzaN());
        zza2.zza(zzg(zzghcVar.zzc()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzghb zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzghb.zzb;
            }
            int zza2 = zzgsiVar.zza();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
        }
        return zzghb.zza;
    }

    private static zzgsi zzg(zzghb zzghbVar) throws GeneralSecurityException {
        if (Objects.equals(zzghbVar, zzghb.zza)) {
            return zzgsi.TINK;
        }
        if (Objects.equals(zzghbVar, zzghb.zzb)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghbVar.toString()));
    }
}
