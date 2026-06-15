package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdqi implements zzfeu {
    private final zzdpz zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdqi(zzdpz zzdpzVar, Set set, Clock clock) {
        zzfen zzfenVar;
        this.zzb = zzdpzVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdqh zzdqhVar = (zzdqh) it.next();
            Map map = this.zzd;
            zzfenVar = zzdqhVar.zzc;
            map.put(zzfenVar, zzdqhVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfen zzfenVar, boolean z10) {
        zzfen zzfenVar2;
        String str;
        zzdqh zzdqhVar = (zzdqh) this.zzd.get(zzfenVar);
        if (zzdqhVar == null) {
            return;
        }
        String str2 = true != z10 ? "f." : "s.";
        Map map = this.zza;
        zzfenVar2 = zzdqhVar.zzb;
        if (map.containsKey(zzfenVar2)) {
            long b10 = this.zzc.b() - ((Long) this.zza.get(zzfenVar2)).longValue();
            Map zzb = this.zzb.zzb();
            str = zzdqhVar.zza;
            zzb.put("label.".concat(str), str2 + b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzd(zzfen zzfenVar, String str) {
        if (this.zza.containsKey(zzfenVar)) {
            long b10 = this.zzc.b() - ((Long) this.zza.get(zzfenVar)).longValue();
            zzdpz zzdpzVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdpzVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(b10))));
        }
        if (this.zzd.containsKey(zzfenVar)) {
            zze(zzfenVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdA(zzfen zzfenVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdB(zzfen zzfenVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfenVar)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            zzdpz zzdpzVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdpzVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(clock.b() - ((Long) map.get(zzfenVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzfenVar)) {
            zze(zzfenVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdC(zzfen zzfenVar, String str) {
        this.zza.put(zzfenVar, Long.valueOf(this.zzc.b()));
    }
}
