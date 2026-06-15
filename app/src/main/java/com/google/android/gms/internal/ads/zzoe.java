package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzoe extends BroadcastReceiver {
    final /* synthetic */ zzog zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzoe(zzog zzogVar, zzof zzofVar) {
        this.zza = zzogVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zze zzeVar;
        zzoh zzohVar;
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzog zzogVar = this.zza;
        zzeVar = zzogVar.zzh;
        zzohVar = zzogVar.zzg;
        zzogVar.zzj(zzob.zzd(context, intent, zzeVar, zzohVar));
    }
}
