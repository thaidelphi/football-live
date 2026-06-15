package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmg {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgmg() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgmg zza(zzgjx zzgjxVar) throws GeneralSecurityException {
        zzgmh zzgmhVar = new zzgmh(zzgjxVar.zzd(), zzgjxVar.zzc(), null);
        if (this.zzb.containsKey(zzgmhVar)) {
            zzgjx zzgjxVar2 = (zzgjx) this.zzb.get(zzgmhVar);
            if (!zzgjxVar2.equals(zzgjxVar) || !zzgjxVar.equals(zzgjxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgmhVar.toString()));
            }
        } else {
            this.zzb.put(zzgmhVar, zzgjxVar);
        }
        return this;
    }

    public final zzgmg zzb(zzgkb zzgkbVar) throws GeneralSecurityException {
        zzgmi zzgmiVar = new zzgmi(zzgkbVar.zzc(), zzgkbVar.zzd(), null);
        if (this.zza.containsKey(zzgmiVar)) {
            zzgkb zzgkbVar2 = (zzgkb) this.zza.get(zzgmiVar);
            if (!zzgkbVar2.equals(zzgkbVar) || !zzgkbVar.equals(zzgkbVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgmiVar.toString()));
            }
        } else {
            this.zza.put(zzgmiVar, zzgkbVar);
        }
        return this;
    }

    public final zzgmg zzc(zzglj zzgljVar) throws GeneralSecurityException {
        zzgmh zzgmhVar = new zzgmh(zzgljVar.zzd(), zzgljVar.zzc(), null);
        if (this.zzd.containsKey(zzgmhVar)) {
            zzglj zzgljVar2 = (zzglj) this.zzd.get(zzgmhVar);
            if (!zzgljVar2.equals(zzgljVar) || !zzgljVar.equals(zzgljVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgmhVar.toString()));
            }
        } else {
            this.zzd.put(zzgmhVar, zzgljVar);
        }
        return this;
    }

    public final zzgmg zzd(zzgln zzglnVar) throws GeneralSecurityException {
        zzgmi zzgmiVar = new zzgmi(zzglnVar.zzc(), zzglnVar.zzd(), null);
        if (this.zzc.containsKey(zzgmiVar)) {
            zzgln zzglnVar2 = (zzgln) this.zzc.get(zzgmiVar);
            if (!zzglnVar2.equals(zzglnVar) || !zzglnVar.equals(zzglnVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgmiVar.toString()));
            }
        } else {
            this.zzc.put(zzgmiVar, zzglnVar);
        }
        return this;
    }

    public zzgmg(zzgmk zzgmkVar) {
        this.zza = new HashMap(zzgmk.zzf(zzgmkVar));
        this.zzb = new HashMap(zzgmk.zze(zzgmkVar));
        this.zzc = new HashMap(zzgmk.zzh(zzgmkVar));
        this.zzd = new HashMap(zzgmk.zzg(zzgmkVar));
    }
}
