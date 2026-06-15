package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclu {
    private final String zza;
    private final zzbno zzb;
    private final Executor zzc;
    private zzclz zzd;
    private final zzbio zze = new zzclr(this);
    private final zzbio zzf = new zzclt(this);

    public zzclu(String str, zzbno zzbnoVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbnoVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzg(zzclu zzcluVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcluVar.zza);
    }

    public final void zzc(zzclz zzclzVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzclzVar;
    }

    public final void zzd(zzcdq zzcdqVar) {
        zzcdqVar.zzag("/updateActiveView", this.zze);
        zzcdqVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcdq zzcdqVar) {
        zzcdqVar.zzaz("/updateActiveView", this.zze);
        zzcdqVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
