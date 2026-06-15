package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdcz extends zzczv {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdcz(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzdcw
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzdcv
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(new zzdcx());
            this.zzb = true;
        }
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzdcy
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzq(new zzdcx());
        this.zzb = true;
    }
}
