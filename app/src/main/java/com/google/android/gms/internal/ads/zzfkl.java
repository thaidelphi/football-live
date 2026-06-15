package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfkl {
    private static UiModeManager zza;

    public static zzfjb zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    return zzfjb.OTHER;
                }
                return zzfjb.CTV;
            }
            return zzfjb.MOBILE;
        }
        return zzfjb.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
