package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzglz {
    private final Map zza;
    private final zzglx zzb;
    private final Class zzc;
    private final zzgki zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglz(Map map, List list, zzglx zzglxVar, zzgki zzgkiVar, Class cls, zzgly zzglyVar) {
        this.zza = map;
        this.zzb = zzglxVar;
        this.zzc = cls;
        this.zzd = zzgkiVar;
    }

    public static zzglw zzb(Class cls) {
        return new zzglw(cls, null);
    }

    public final zzgki zza() {
        return this.zzd;
    }

    public final zzglx zzc() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.zza.get(zzguh.zzb(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzg() {
        return !this.zzd.zza().isEmpty();
    }
}
