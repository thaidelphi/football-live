package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgop {
    public static final /* synthetic */ int zza = 0;
    private static final zzguh zzb;
    private static final zzgjp zzc;
    private static final zzgjp zzd;
    private static final zzgln zze;
    private static final zzglj zzf;
    private static final zzgkb zzg;
    private static final zzgjx zzh;

    static {
        zzguh zzb2 = zzgmn.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgjn zza2 = zzgjp.zza();
        zza2.zza(zzgsi.RAW, zzgnn.zzd);
        zza2.zza(zzgsi.TINK, zzgnn.zza);
        zza2.zza(zzgsi.LEGACY, zzgnn.zzc);
        zza2.zza(zzgsi.CRUNCHY, zzgnn.zzb);
        zzc = zza2.zzb();
        zzgjn zza3 = zzgjp.zza();
        zza3.zza(zzgqr.SHA1, zzgnm.zza);
        zza3.zza(zzgqr.SHA224, zzgnm.zzb);
        zza3.zza(zzgqr.SHA256, zzgnm.zzc);
        zza3.zza(zzgqr.SHA384, zzgnm.zzd);
        zza3.zza(zzgqr.SHA512, zzgnm.zze);
        zzd = zza3.zzb();
        zze = zzgln.zzb(new zzgll() { // from class: com.google.android.gms.internal.ads.zzgol
            @Override // com.google.android.gms.internal.ads.zzgll
            public final zzgmf zza(zzgcs zzgcsVar) {
                return zzgop.zzb((zzgnp) zzgcsVar);
            }
        }, zzgnp.class, zzgmc.class);
        zzf = zzglj.zzb(new zzglh() { // from class: com.google.android.gms.internal.ads.zzgom
            @Override // com.google.android.gms.internal.ads.zzglh
            public final zzgcs zza(zzgmf zzgmfVar) {
                return zzgop.zzd((zzgmc) zzgmfVar);
            }
        }, zzb2, zzgmc.class);
        zzg = zzgkb.zzb(new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgon
            @Override // com.google.android.gms.internal.ads.zzgjz
            public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                return zzgop.zza((zzgnf) zzgcfVar, zzgcwVar);
            }
        }, zzgnf.class, zzgmb.class);
        zzh = zzgjx.zzb(new zzgjv() { // from class: com.google.android.gms.internal.ads.zzgoo
            @Override // com.google.android.gms.internal.ads.zzgjv
            public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) {
                return zzgop.zzc((zzgmb) zzgmfVar, zzgcwVar);
            }
        }, zzb2, zzgmb.class);
    }

    public static /* synthetic */ zzgmb zza(zzgnf zzgnfVar, zzgcw zzgcwVar) {
        zzgqs zzb2 = zzgqu.zzb();
        zzb2.zzb(zzf(zzgnfVar.zzb()));
        byte[] zzd2 = zzgnfVar.zzd().zzd(zzgcwVar);
        zzb2.zza(zzgvc.zzv(zzd2, 0, zzd2.length));
        return zzgmb.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgqu) zzb2.zzbr()).zzaN(), zzgrc.SYMMETRIC, (zzgsi) zzc.zzb(zzgnfVar.zzb().zzg()), zzgnfVar.zze());
    }

    public static /* synthetic */ zzgmc zzb(zzgnp zzgnpVar) {
        zzgrg zza2 = zzgri.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgqv zzc2 = zzgqx.zzc();
        zzc2.zzb(zzf(zzgnpVar));
        zzc2.zza(zzgnpVar.zzc());
        zza2.zzc(((zzgqx) zzc2.zzbr()).zzaN());
        zza2.zza((zzgsi) zzc.zzb(zzgnpVar.zzg()));
        return zzgmc.zzb((zzgri) zza2.zzbr());
    }

    public static /* synthetic */ zzgnf zzc(zzgmb zzgmbVar, zzgcw zzgcwVar) {
        if (zzgmbVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgqu zzf2 = zzgqu.zzf(zzgmbVar.zze(), zzgvu.zza());
                if (zzf2.zza() == 0) {
                    zzgnl zze2 = zzgnp.zze();
                    zze2.zzb(zzf2.zzh().zzd());
                    zze2.zzc(zzf2.zzg().zza());
                    zze2.zza((zzgnm) zzd.zzc(zzf2.zzg().zzb()));
                    zze2.zzd((zzgnn) zzc.zzc(zzgmbVar.zzc()));
                    zzgnp zze3 = zze2.zze();
                    zzgnd zza2 = zzgnf.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgui.zzb(zzf2.zzh().zzA(), zzgcwVar));
                    zza2.zza(zzgmbVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgwz | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgnp zzd(zzgmc zzgmcVar) {
        if (zzgmcVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgqx zzg2 = zzgqx.zzg(zzgmcVar.zzc().zzh(), zzgvu.zza());
                if (zzg2.zzb() == 0) {
                    zzgnl zze2 = zzgnp.zze();
                    zze2.zzb(zzg2.zza());
                    zze2.zzc(zzg2.zzh().zza());
                    zze2.zza((zzgnm) zzd.zzc(zzg2.zzh().zzb()));
                    zze2.zzd((zzgnn) zzc.zzc(zzgmcVar.zzc().zzg()));
                    return zze2.zze();
                }
                int zzb2 = zzg2.zzb();
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzb2);
            } catch (zzgwz e8) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmcVar.zzc().zzi())));
    }

    public static void zze(zzgle zzgleVar) throws GeneralSecurityException {
        zzgleVar.zzi(zze);
        zzgleVar.zzh(zzf);
        zzgleVar.zzg(zzg);
        zzgleVar.zzf(zzh);
    }

    private static zzgra zzf(zzgnp zzgnpVar) throws GeneralSecurityException {
        zzgqy zzc2 = zzgra.zzc();
        zzc2.zzb(zzgnpVar.zzb());
        zzc2.zza((zzgqr) zzd.zzb(zzgnpVar.zzf()));
        return (zzgra) zzc2.zzbr();
    }
}
