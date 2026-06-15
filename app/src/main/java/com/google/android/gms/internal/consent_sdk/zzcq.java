package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcq {
    public static boolean zza(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
        }
        return Build.DEVICE.startsWith("generic");
    }
}
