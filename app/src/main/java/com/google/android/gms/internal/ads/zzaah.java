package com.google.android.gms.internal.ads;

import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaah {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e8) {
            zzdn.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
        }
    }
}
