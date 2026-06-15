package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqn implements zzerv {
    private final Bundle zza;

    public zzeqn(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcth zzcthVar = (zzcth) obj;
        if (bundle != null) {
            zzcthVar.zzb.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcth zzcthVar = (zzcth) obj;
        if (bundle != null) {
            zzcthVar.zza.putAll(bundle);
        }
    }
}
