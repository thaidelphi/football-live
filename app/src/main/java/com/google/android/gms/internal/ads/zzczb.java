package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzczb extends zzczv implements zzbhg {
    public zzczb(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
