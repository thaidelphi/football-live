package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwx implements zzaxl {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbwx(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z10) {
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            synchronized (this.zzb) {
                if (this.zzd == z10) {
                    return;
                }
                this.zzd = z10;
                if (TextUtils.isEmpty(this.zzc)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzv.zzo().zzf(this.zza, this.zzc);
                } else {
                    com.google.android.gms.ads.internal.zzv.zzo().zzg(this.zza, this.zzc);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        zzb(zzaxkVar.zzj);
    }
}
