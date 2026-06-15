package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import m8.d;
/* compiled from: StaticDeviceInfoDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, d<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> dVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(d<? super String> dVar);

    Object getIdfi(d<? super String> dVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();
}
