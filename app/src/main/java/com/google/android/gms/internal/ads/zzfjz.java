package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjz extends BroadcastReceiver {
    final /* synthetic */ zzfka zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjz(zzfka zzfkaVar) {
        this.zza = zzfkaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        boolean z11;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfka zzfkaVar = this.zza;
            z11 = zzfkaVar.zzd;
            zzfkaVar.zzd(true, z11);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfka zzfkaVar2 = this.zza;
            z10 = zzfkaVar2.zzd;
            zzfkaVar2.zzd(false, z10);
            this.zza.zzc = false;
        }
    }
}
