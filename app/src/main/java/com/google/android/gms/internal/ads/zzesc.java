package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesc implements zzerw {
    private final Context zza;
    private final zzgba zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesc(Context context, zzgba zzgbaVar) {
        this.zza = context;
        this.zzb = zzgbaVar;
    }

    public static /* synthetic */ zzesd zzc(zzesc zzescVar) {
        Context context = zzescVar.zza;
        return new zzesd(zzbaw.zzb(context), zzbaw.zza(context));
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        if (((Boolean) zzbde.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzesc.zzc(zzesc.this);
                }
            });
        }
        return zzgap.zzh(new zzesd(-1, -1));
    }
}
