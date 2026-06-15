package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgia {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgln zzc;
    private static final zzglj zzd;
    private static final zzgkb zze;
    private static final zzgjx zzf;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzc = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzghw
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgia.zzd((zzgev) zzgcsVar);
            }
        }, zzgev.class, zzgmc.class);
        zzd = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzghx
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgia.zzb((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zze = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzghy
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgia.zzc((zzgen) zzgcfVar, zzgcwVar);
            }
        }, zzgen.class, zzgmb.class);
        zzf = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzghz
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgia.zza((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzgen zza(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgqb zzd2 = zzgqb.zzd(zzgmbVar.zze(), zzgvu.zza());
                if (zzd2.zza() == 0) {
                    zzges zzc2 = zzgev.zzc();
                    zzc2.zzb(zzd2.zzf().zzd());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgmbVar.zzc()));
                    zzgev zze2 = zzc2.zze();
                    zzgel zza2 = zzgen.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgui.zzb(zzd2.zzf().zzA(), zzgcwVar));
                    zza2.zza(zzgmbVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgev zzb(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgqe zzf2 = zzgqe.zzf(zzgmcVar.zzc().zzh(), zzgvu.zza());
                if (zzf2.zzb() == 0) {
                    zzges zzc2 = zzgev.zzc();
                    zzc2.zzb(zzf2.zza());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgmcVar.zzc().zzg()));
                    return zzc2.zze();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgmb zzc(zzgen zzgenVar, zzgcw zzgcwVar) {
        zzgpz zzb2 = zzgqb.zzb();
        byte[] zzd2 = zzgenVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgqb) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, zzg(zzgenVar.zzb().zzd()), zzgenVar.zze());
    }

    public static /* synthetic */ zzgmc zzd(zzgev zzgevVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgqc zzc2 = zzgqe.zzc();
        zzc2.zza(zzgevVar.zzb());
        zza2.zzc(((zzgqe) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzgevVar.zzd()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zzc);
        zzgleVar.zzh(zzd);
        zzgleVar.zzg(zze);
        zzgleVar.zzf(zzf);
    }

    private static zzget zzf(zzgsi zzgsiVar) throws GeneralSecurityException {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzget.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgsiVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzget.zzb;
        }
        return zzget.zza;
    }

    private static zzgsi zzg(zzget zzgetVar) throws GeneralSecurityException {
        if (zzget.zza.equals(zzgetVar)) {
            return zzgsi.TINK;
        }
        if (zzget.zzb.equals(zzgetVar)) {
            return zzgsi.CRUNCHY;
        }
        if (zzget.zzc.equals(zzgetVar)) {
            return zzgsi.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgetVar)));
    }
}
