package com.iab.omid.library.startio.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.startio.adsession.DeviceCategory;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static UiModeManager f16022a;

    public static DeviceCategory a() {
        int currentModeType = f16022a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f16022a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
