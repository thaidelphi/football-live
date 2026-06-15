package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.jvm.internal.n;
/* compiled from: AndroidTestDataInfo.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        n.f(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        n.e(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName("ExchangeTestMode");
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        return _create._build();
    }
}
