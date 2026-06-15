package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqr extends IOException {
    public final int zza;

    public zzqr(Throwable th, int i10) {
        super(th);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
