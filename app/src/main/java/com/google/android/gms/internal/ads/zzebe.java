package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.b;
import com.google.android.gms.ads.MobileAds;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebe {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebe(Context context) {
        this.zza = context;
    }

    public final b6.a zza(boolean z10) {
        try {
            b a10 = new b.a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
            p0.a a11 = p0.a.a(this.zza);
            if (a11 != null) {
                return a11.b(a10);
            }
            return zzgap.zzg(new IllegalStateException());
        } catch (Exception e8) {
            return zzgap.zzg(e8);
        }
    }
}
