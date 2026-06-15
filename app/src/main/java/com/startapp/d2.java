package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d2 {
    public static void a(String str, String str2, String str3, boolean z10) {
        try {
            AdCallbacksConfig a10 = MetaData.f23158k.analytics.a();
            if (a10 == null) {
                return;
            }
            if ((a10.a() || z10) && a10.a(str)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "adCallback";
                l3Var.f22233i = str;
                l3Var.f22231g = str2;
                l3Var.f22229e = str3;
                l3Var.a();
            }
        } catch (Throwable unused) {
        }
    }
}
