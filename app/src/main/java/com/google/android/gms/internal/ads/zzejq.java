package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejq implements zzerw {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return zzgap.zzh(new zzejr(androidx.core.content.a.a(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
