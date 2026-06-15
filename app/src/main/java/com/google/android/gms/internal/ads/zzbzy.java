package com.google.android.gms.internal.ads;

import com.ironsource.ug;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbzy implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzbzz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzy(zzbzz zzbzzVar, boolean z10) {
        this.zza = z10;
        this.zzb = zzbzzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", ug.f20996k, String.valueOf(this.zza));
    }
}
