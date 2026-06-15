package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static UiModeManager f15893a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f15893a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    public static void a(Context context) {
        if (context != null) {
            f15893a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
