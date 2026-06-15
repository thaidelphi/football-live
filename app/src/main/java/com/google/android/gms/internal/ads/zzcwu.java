package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcwu implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcwx zzcwxVar = (zzcwx) this.zza.get();
        if (zzcwxVar != null) {
            zzcwxVar.zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcws
                @Override // com.google.android.gms.internal.ads.zzczu
                public final void zza(Object obj) {
                    ((zzcwr) obj).zza();
                }
            });
        }
    }
}
