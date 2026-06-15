package com.unity3d.ads.core.data.datasource;

import g9.e;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
/* compiled from: DynamicDeviceInfoDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    e<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
