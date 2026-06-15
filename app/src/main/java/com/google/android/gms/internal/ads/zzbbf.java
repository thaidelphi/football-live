package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbf {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e8);
            return null;
        }
    }
}
