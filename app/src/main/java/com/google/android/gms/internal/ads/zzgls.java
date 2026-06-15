package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgls {
    private final Map zza;
    private final Map zzb;

    private zzgls() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgls zza(zzglr zzglrVar) throws GeneralSecurityException {
        Objects.requireNonNull(zzglrVar, "primitive constructor must be non-null");
        zzglt zzgltVar = new zzglt(zzglrVar.zzc(), zzglrVar.zzd(), null);
        if (this.zza.containsKey(zzgltVar)) {
            zzglr zzglrVar2 = (zzglr) this.zza.get(zzgltVar);
            if (!zzglrVar2.equals(zzglrVar) || !zzglrVar.equals(zzglrVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgltVar.toString()));
            }
        } else {
            this.zza.put(zzgltVar, zzglrVar);
        }
        return this;
    }

    public final zzgls zzb(zzgma zzgmaVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzgmaVar.zzb();
        if (map.containsKey(zzb)) {
            zzgma zzgmaVar2 = (zzgma) this.zzb.get(zzb);
            if (!zzgmaVar2.equals(zzgmaVar) || !zzgmaVar.equals(zzgmaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzgmaVar);
        }
        return this;
    }

    public final zzglv zzc() {
        return new zzglv(this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgls(zzglu zzgluVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgls(zzglv zzglvVar, zzglu zzgluVar) {
        this.zza = new HashMap(zzglv.zze(zzglvVar));
        this.zzb = new HashMap(zzglv.zzf(zzglvVar));
    }
}
