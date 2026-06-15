package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfkp {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfko(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfkl.zza() != zzfjb.CTV) {
            return 2;
        }
        return zza;
    }
}
