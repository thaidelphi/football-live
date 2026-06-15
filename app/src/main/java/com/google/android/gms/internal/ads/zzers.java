package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzers implements zzerv {
    private final Bundle zza;

    public zzers(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzcthVar.zzb.putBundle("shared_pref", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzcthVar.zza.putBundle("shared_pref", this.zza);
    }
}
