package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static UiModeManager f15759a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f15759a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    public static void a(Context context) {
        if (context != null) {
            f15759a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
