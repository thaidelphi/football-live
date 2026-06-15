package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjv {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjv zza = new zzfjv();
    private Context zzb;

    private zzfjv() {
    }

    public static zzfjv zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
