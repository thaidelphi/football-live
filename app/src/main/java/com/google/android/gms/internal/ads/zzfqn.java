package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfqn {
    @SuppressLint({"RestrictedApi"})
    public static zzfqm zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfqo(new zzfre(context));
    }
}
