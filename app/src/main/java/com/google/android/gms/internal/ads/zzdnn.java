package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdnn implements zzcva {
    private final zzcdq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnn(zzcdq zzcdqVar) {
        this.zza = zzcdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdh(Context context) {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdj(Context context) {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdk(Context context) {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.onResume();
        }
    }
}
