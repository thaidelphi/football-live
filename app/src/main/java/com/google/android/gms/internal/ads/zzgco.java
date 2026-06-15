package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgco {
    private final zzgrq zza;
    private final List zzb;
    private final zzgki zzc;

    private zzgco(zzgrq zzgrqVar, List list) {
        this.zza = zzgrqVar;
        this.zzb = list;
        this.zzc = zzgki.zza;
    }

    public /* synthetic */ zzgco(zzgrq zzgrqVar, List list, zzgki zzgkiVar, zzgcn zzgcnVar) {
        this.zza = zzgrqVar;
        this.zzb = list;
        this.zzc = zzgkiVar;
    }

    public static final zzgco zza(zzgrq zzgrqVar) throws GeneralSecurityException {
        zzh(zzgrqVar);
        return new zzgco(zzgrqVar, zzg(zzgrqVar));
    }

    public static final zzgco zzb(zzgcs zzgcsVar) throws GeneralSecurityException {
        zzgcl zzgclVar = new zzgcl();
        zzgcj zzgcjVar = new zzgcj(zzgcsVar, null);
        zzgcjVar.zzd();
        zzgcjVar.zzc();
        zzgclVar.zza(zzgcjVar);
        return zzgclVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zze(zzgrq zzgrqVar) {
        zzh(zzgrqVar);
    }

    private final Object zzf(zzgjs zzgjsVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i10 = zzgcz.zza;
        zzgrq zzgrqVar = this.zza;
        int zzb = zzgrqVar.zzb();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzgro zzgroVar : zzgrqVar.zzh()) {
            if (zzgroVar.zzk() == 3) {
                if (zzgroVar.zzj()) {
                    if (zzgroVar.zzf() != zzgsi.UNKNOWN_PREFIX) {
                        if (zzgroVar.zzk() != 2) {
                            if (zzgroVar.zza() == zzb) {
                                if (z10) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z10 = true;
                            }
                            z11 &= zzgroVar.zzb().zzb() == zzgrc.ASYMMETRIC_PUBLIC;
                            i11++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgroVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgroVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgroVar.zza())));
                }
            }
        }
        if (i11 != 0) {
            if (!z10 && !z11) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            zzglw zzb2 = zzglz.zzb(cls2);
            zzb2.zzc(this.zzc);
            for (int i12 = 0; i12 < this.zzb.size(); i12++) {
                zzgro zzd = this.zza.zzd(i12);
                if (zzd.zzk() == 3) {
                    zzgcm zzgcmVar = (zzgcm) this.zzb.get(i12);
                    if (zzgcmVar != null) {
                        zzgcf zza = zzgcmVar.zza();
                        try {
                            Object zzb3 = zzgjsVar.zzb(zza, cls2);
                            if (zzd.zza() == this.zza.zzb()) {
                                zzb2.zzb(zzb3, zza, zzd);
                            } else {
                                zzb2.zza(zzb3, zza, zzd);
                            }
                        } catch (GeneralSecurityException e8) {
                            throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + zzd.zzb().zzg() + ", see https://developers.google.com/tink/faq/registration_errors", e8);
                        }
                    } else {
                        throw new GeneralSecurityException("Key parsing of key with index " + i12 + " and type_url " + zzd.zzb().zzg() + " failed, unable to get primitive");
                    }
                }
            }
            return zzgjsVar.zzc(zzb2.zzd(), cls);
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    private static List zzg(zzgrq zzgrqVar) {
        zzgcf zza;
        zzgch zzgchVar;
        ArrayList arrayList = new ArrayList(zzgrqVar.zza());
        for (zzgro zzgroVar : zzgrqVar.zzh()) {
            int zza2 = zzgroVar.zza();
            try {
                zzgmb zza3 = zzgmb.zza(zzgroVar.zzb().zzg(), zzgroVar.zzb().zzf(), zzgroVar.zzb().zzb(), zzgroVar.zzf(), zzgroVar.zzf() == zzgsi.RAW ? null : Integer.valueOf(zzgroVar.zza()));
                zzgle zzc = zzgle.zzc();
                zzgcw zza4 = zzgcw.zza();
                if (!zzc.zzj(zza3)) {
                    zza = new zzgke(zza3, zza4);
                } else {
                    zza = zzc.zza(zza3, zza4);
                }
                int zzk = zzgroVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzgchVar = zzgch.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgchVar = zzgch.zzb;
                    }
                } else {
                    zzgchVar = zzgch.zza;
                }
                arrayList.add(new zzgcm(zza, zzgchVar, zza2, zza2 == zzgrqVar.zzb(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzh(zzgrq zzgrqVar) throws GeneralSecurityException {
        if (zzgrqVar == null || zzgrqVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i10 = zzgcz.zza;
        zzgrr zza = zzgrv.zza();
        zzgrq zzgrqVar = this.zza;
        zza.zzb(zzgrqVar.zzb());
        for (zzgro zzgroVar : zzgrqVar.zzh()) {
            zzgrs zza2 = zzgrt.zza();
            zza2.zzc(zzgroVar.zzb().zzg());
            zza2.zzd(zzgroVar.zzk());
            zza2.zzb(zzgroVar.zzf());
            zza2.zza(zzgroVar.zza());
            zza.zza((zzgrt) zza2.zzbr());
        }
        return ((zzgrv) zza.zzbr()).toString();
    }

    public final zzgrq zzc() {
        return this.zza;
    }

    public final Object zzd(zzgbz zzgbzVar, Class cls) throws GeneralSecurityException {
        if (zzgbzVar instanceof zzgjs) {
            zzgjs zzgjsVar = (zzgjs) zzgbzVar;
            return zzf(zzgjsVar, cls, zzgjsVar.zza(cls));
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }
}
