package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcux extends zzczv {
    private boolean zzb;

    public zzcux(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcuw
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzcuz) obj).zzr();
            }
        });
        this.zzb = true;
    }
}
