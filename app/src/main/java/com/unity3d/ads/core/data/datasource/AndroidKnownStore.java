package com.unity3d.ads.core.data.datasource;

import com.ironsource.dp;
/* compiled from: AndroidKnownStore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum AndroidKnownStore {
    GOOGLE(dp.f17077b),
    GOOGLE_MARKET(dp.f17076a),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");
    
    private final String packageName;

    AndroidKnownStore(String str) {
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
