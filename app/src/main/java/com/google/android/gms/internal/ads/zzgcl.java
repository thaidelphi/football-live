package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgcl {
    private final List zza = new ArrayList();
    private final zzgki zzb = zzgki.zza;
    private boolean zzc = false;

    public final void zzd() {
        for (zzgcj zzgcjVar : this.zza) {
            zzgcjVar.zza = false;
        }
    }

    public final zzgcl zza(zzgcj zzgcjVar) {
        zzgcl zzgclVar;
        boolean z10;
        zzgclVar = zzgcjVar.zzf;
        if (zzgclVar == null) {
            z10 = zzgcjVar.zza;
            if (z10) {
                zzd();
            }
            zzgcjVar.zzf = this;
            this.zza.add(zzgcjVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgco zzb() throws GeneralSecurityException {
        zzgck zzgckVar;
        zzgck zzgckVar2;
        zzgck zzgckVar3;
        int i10;
        zzgcs zzgcsVar;
        zzgcs zzgcsVar2;
        zzgch zzgchVar;
        boolean z10;
        zzgch zzgchVar2;
        int i11;
        boolean z11;
        zzgch zzgchVar3;
        zzgck zzgckVar4;
        zzgck zzgckVar5;
        zzgck zzgckVar6;
        zzgck zzgckVar7;
        zzgch unused;
        zzgck unused2;
        if (!this.zzc) {
            char c10 = 1;
            this.zzc = true;
            List list = this.zza;
            zzgrm zzc = zzgrq.zzc();
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = this.zza;
            int i12 = 0;
            int i13 = 0;
            while (i13 < list2.size() - 1) {
                int i14 = i13 + 1;
                zzgckVar4 = ((zzgcj) list2.get(i13)).zze;
                zzgckVar5 = zzgck.zza;
                if (zzgckVar4 == zzgckVar5) {
                    zzgckVar6 = ((zzgcj) list2.get(i14)).zze;
                    zzgckVar7 = zzgck.zza;
                    if (zzgckVar6 != zzgckVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                i13 = i14;
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzgcj zzgcjVar : this.zza) {
                unused = zzgcjVar.zzb;
                zzgckVar = zzgcjVar.zze;
                if (zzgckVar != null) {
                    zzgckVar2 = zzgcjVar.zze;
                    zzgckVar3 = zzgck.zza;
                    int i15 = 4;
                    if (zzgckVar2 == zzgckVar3) {
                        i10 = i12;
                        while (true) {
                            if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                                break;
                            }
                            int i16 = zzgmn.zza;
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[i15];
                            int i17 = i12;
                            while (i17 == 0) {
                                secureRandom.nextBytes(bArr);
                                i17 = ((bArr[2] & 255) << 8) | ((bArr[i12] & 255) << 24) | ((bArr[c10] & 255) << 16) | (bArr[3] & 255);
                                i12 = 0;
                                i15 = 4;
                            }
                            i10 = i17;
                        }
                    } else {
                        unused2 = zzgcjVar.zze;
                        i10 = 0;
                    }
                    Integer valueOf = Integer.valueOf(i10);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgcj.zza(zzgcjVar);
                        zzgcsVar = zzgcjVar.zzd;
                        Integer num2 = c10 != zzgcsVar.zza() ? null : valueOf;
                        zzgku zzb = zzgku.zzb();
                        zzgcsVar2 = zzgcjVar.zzd;
                        zzgcf zza = zzb.zza(zzgcsVar2, num2);
                        zzgchVar = zzgcjVar.zzb;
                        z10 = zzgcjVar.zza;
                        zzgcm zzgcmVar = new zzgcm(zza, zzgchVar, i10, z10, null);
                        zzgchVar2 = zzgcjVar.zzb;
                        zzgmb zzgmbVar = (zzgmb) zzgle.zzc().zzd(zza, zzgmb.class, zzgcw.zza());
                        Integer zzf = zzgmbVar.zzf();
                        if (zzf != null && zzf.intValue() != i10) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zzgch zzgchVar4 = zzgch.zza;
                        if (zzgchVar4.equals(zzgchVar2)) {
                            i11 = 3;
                        } else if (zzgch.zzb.equals(zzgchVar2)) {
                            i11 = 4;
                        } else if (!zzgch.zzc.equals(zzgchVar2)) {
                            throw new IllegalStateException("Unknown key status");
                        } else {
                            i11 = 5;
                        }
                        zzgrn zzc2 = zzgro.zzc();
                        zzgrb zza2 = zzgre.zza();
                        zza2.zzb(zzgmbVar.zzg());
                        zza2.zzc(zzgmbVar.zze());
                        zza2.zza(zzgmbVar.zzb());
                        zzc2.zza(zza2);
                        zzc2.zzd(i11);
                        zzc2.zzb(i10);
                        zzc2.zzc(zzgmbVar.zzc());
                        zzc.zza((zzgro) zzc2.zzbr());
                        z11 = zzgcjVar.zza;
                        if (z11) {
                            if (num == null) {
                                zzgchVar3 = zzgcjVar.zzb;
                                if (zzgchVar3 != zzgchVar4) {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                                num = valueOf;
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzgcmVar);
                        c10 = 1;
                        i12 = 0;
                    } else {
                        throw new GeneralSecurityException("Id " + i10 + " is used twice in the keyset");
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzc.zzb(num.intValue());
                zzgrq zzgrqVar = (zzgrq) zzc.zzbr();
                zzgco.zzh(zzgrqVar);
                return new zzgco(zzgrqVar, arrayList, this.zzb, null);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
