package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcdv implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbwn zza;
    final /* synthetic */ zzcdy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdv(zzcdy zzcdyVar, zzbwn zzbwnVar) {
        this.zza = zzbwnVar;
        this.zzb = zzcdyVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzaa(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
