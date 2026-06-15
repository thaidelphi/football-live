package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzayg implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzayk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayg(zzayk zzaykVar, View view) {
        this.zza = view;
        this.zzb = zzaykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
