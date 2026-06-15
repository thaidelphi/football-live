package com.google.android.gms.internal.ads;

import android.media.Spatializer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzxe implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzxn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxe(zzxf zzxfVar, zzxn zzxnVar) {
        this.zza = zzxnVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        zzxn.zzi(this.zza);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        zzxn.zzi(this.zza);
    }
}
