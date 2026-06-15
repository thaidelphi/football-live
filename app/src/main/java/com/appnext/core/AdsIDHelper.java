package com.appnext.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdsIDHelper {
    public static String CONSENT = "CONSENT";

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(Context context) {
        AdvertisingIdClient.Info advertisingIdInfo;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return "";
        }
        try {
            if (Boolean.valueOf(n.i(context).a(CONSENT, true)).booleanValue() && (advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext())) != null && !advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return advertisingIdInfo.getId();
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
        }
        return "00000000-0000-0000-0000-000000000000";
    }

    public static boolean isOptOut(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
