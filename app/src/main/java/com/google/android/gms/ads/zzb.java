package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.internal.ads.zzbnz;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    private static volatile zzch f11860a;

    private zzb() {
    }

    public static zzch zza(Context context) {
        if (f11860a == null) {
            synchronized (zzb.class) {
                if (f11860a == null) {
                    f11860a = zzbb.zza().zzg(context, new zzbnz());
                }
            }
        }
        return f11860a;
    }
}
