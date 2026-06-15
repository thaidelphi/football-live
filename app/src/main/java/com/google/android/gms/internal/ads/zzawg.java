package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawg extends zzaws {
    public zzawg(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "+jpQfteoKsU8e0zyijBR7fCe8dkksM9fUkUT9joGU+rL3xYgFRn32AvsBncipL+0", "R4HkotAAh59bRbUUwmdsoAeKcxVOJxYSFLLWUd6Flbw=", zzarfVar, i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaul zzaulVar = new zzaul((String) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcW)).booleanValue())));
        synchronized (this.zzd) {
            this.zzd.zzj(zzaulVar.zza);
            this.zzd.zzA(zzaulVar.zzb);
        }
    }
}
