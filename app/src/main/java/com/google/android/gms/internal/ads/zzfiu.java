package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfiu {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfkq.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfjy.zzb().zzd(context);
        zzfjp.zza().zzd(context);
        zzfkl.zzb(context);
        zzfkm.zzd(context);
        zzfkp.zza(context);
        zzfjv.zzb().zzc(context);
        zzfjo.zza().zzd(context);
        zzfka.zza().zze(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
