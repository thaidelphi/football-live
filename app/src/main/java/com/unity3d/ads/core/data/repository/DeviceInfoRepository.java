package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import g9.e;
import g9.w;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import m8.d;
/* compiled from: DeviceInfoRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    w<AllowedPiiOuterClass.AllowedPii> getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(d<? super ByteString> dVar);

    Object getAuidString(d<? super String> dVar);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(d<? super String> dVar);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    e<VolumeSettingsChange> getVolumeSettingsChange();

    Object staticDeviceInfo(d<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> dVar);
}
