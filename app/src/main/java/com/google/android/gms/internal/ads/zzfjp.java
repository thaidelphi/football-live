package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjp extends zzfjs {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjp zzb = new zzfjp();

    private zzfjp() {
    }

    public static zzfjp zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzb(boolean z10) {
        for (zzfiz zzfizVar : zzfjq.zza().zzc()) {
            zzfizVar.zzg().zzk(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final boolean zzc() {
        for (zzfiz zzfizVar : zzfjq.zza().zzb()) {
            View zzf = zzfizVar.zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
