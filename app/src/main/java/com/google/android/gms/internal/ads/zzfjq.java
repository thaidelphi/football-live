package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjq {
    private static final zzfjq zza = new zzfjq();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfjq() {
    }

    public static zzfjq zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfiz zzfizVar) {
        this.zzb.add(zzfizVar);
    }

    public final void zze(zzfiz zzfizVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfizVar);
        this.zzc.remove(zzfizVar);
        if (!zzg || zzg()) {
            return;
        }
        zzfjy.zzb().zzg();
    }

    public final void zzf(zzfiz zzfizVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfizVar);
        if (zzg) {
            return;
        }
        zzfjy.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
