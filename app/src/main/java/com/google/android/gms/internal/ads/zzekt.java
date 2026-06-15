package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekt implements zzerv {
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekt(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzcthVar.zza.putBundle("installed_adapter_data", this.zza);
    }
}
