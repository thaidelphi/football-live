package com.unity3d.services.ads.gmascar.bridges.mobileads;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class MobileAdsBridgeFactory {
    public MobileAdsBridgeBase createMobileAdsBridge() {
        MobileAdsBridge mobileAdsBridge = new MobileAdsBridge();
        if (mobileAdsBridge.exists()) {
            return mobileAdsBridge;
        }
        return null;
    }
}
