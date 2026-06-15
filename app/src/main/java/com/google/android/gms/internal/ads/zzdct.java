package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdct extends zzczv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdct(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzdcr
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzdcq) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk.this);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzdcs
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzdcq) obj).zzf(str);
            }
        });
    }
}
