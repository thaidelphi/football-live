package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcur extends zzczv implements zzcuj {
    public zzcur(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcuq
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzcuv) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zzb() {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcup
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzcuv) obj).zzq(zzfbq.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zzc(final zzden zzdenVar) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcuo
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                zzcuv zzcuvVar = (zzcuv) obj;
                String message = zzden.this.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcuvVar.zzq(zzfbq.zzd(12, message, null));
            }
        });
    }
}
