package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgmk(zzgmg zzgmgVar, zzgmj zzgmjVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgmgVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgmgVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgmgVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgmgVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) throws GeneralSecurityException {
        zzgmh zzgmhVar = new zzgmh(zzgmfVar.getClass(), zzgmfVar.zzd(), null);
        if (this.zzb.containsKey(zzgmhVar)) {
            return ((zzgjx) this.zzb.get(zzgmhVar)).zza(zzgmfVar, zzgcwVar);
        }
        String obj = zzgmhVar.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final zzgcs zzb(zzgmf zzgmfVar) throws GeneralSecurityException {
        zzgmh zzgmhVar = new zzgmh(zzgmfVar.getClass(), zzgmfVar.zzd(), null);
        if (this.zzd.containsKey(zzgmhVar)) {
            return ((zzglj) this.zzd.get(zzgmhVar)).zza(zzgmfVar);
        }
        String obj = zzgmhVar.toString();
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
    }

    public final zzgmf zzc(zzgcf zzgcfVar, Class cls, zzgcw zzgcwVar) throws GeneralSecurityException {
        zzgmi zzgmiVar = new zzgmi(zzgcfVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgmiVar)) {
            return ((zzgkb) this.zza.get(zzgmiVar)).zza(zzgcfVar, zzgcwVar);
        }
        String obj = zzgmiVar.toString();
        throw new GeneralSecurityException("No Key serializer for " + obj + " available");
    }

    public final zzgmf zzd(zzgcs zzgcsVar, Class cls) throws GeneralSecurityException {
        zzgmi zzgmiVar = new zzgmi(zzgcsVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgmiVar)) {
            return ((zzgln) this.zzc.get(zzgmiVar)).zza(zzgcsVar);
        }
        String obj = zzgmiVar.toString();
        throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
    }

    public final boolean zzi(zzgmf zzgmfVar) {
        return this.zzb.containsKey(new zzgmh(zzgmfVar.getClass(), zzgmfVar.zzd(), null));
    }

    public final boolean zzj(zzgmf zzgmfVar) {
        return this.zzd.containsKey(new zzgmh(zzgmfVar.getClass(), zzgmfVar.zzd(), null));
    }
}
