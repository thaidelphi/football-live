package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeex {
    private final zzfbh zza;
    private final zzdns zzb;
    private final zzdqf zzc;

    public zzeex(zzfbh zzfbhVar, zzdns zzdnsVar, zzdqf zzdqfVar) {
        this.zza = zzfbhVar;
        this.zzb = zzdnsVar;
        this.zzc = zzdqfVar;
    }

    public final void zza(zzezx zzezxVar, zzezu zzezuVar, int i10, zzebk zzebkVar, long j10) {
        zzdnr zzdnrVar;
        zzdqe zza = this.zzc.zza();
        zza.zzd(zzezxVar);
        zza.zzc(zzezuVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j10));
        zza.zzb("sc", Integer.toString(i10));
        if (zzebkVar != null) {
            zza.zzb("arec", Integer.toString(zzebkVar.zzb().zza));
            String zza2 = this.zza.zza(zzebkVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdns zzdnsVar = this.zzb;
        Iterator it = zzezuVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdnrVar = null;
                break;
            }
            zzdnrVar = zzdnsVar.zza((String) it.next());
            if (zzdnrVar != null) {
                break;
            }
        }
        if (zzdnrVar != null) {
            zza.zzb("ancn", zzdnrVar.zza);
            zzbqr zzbqrVar = zzdnrVar.zzb;
            if (zzbqrVar != null) {
                zza.zzb("adapter_v", zzbqrVar.toString());
            }
            zzbqr zzbqrVar2 = zzdnrVar.zzc;
            if (zzbqrVar2 != null) {
                zza.zzb("adapter_sv", zzbqrVar2.toString());
            }
        }
        zza.zzj();
    }
}
