package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IMobileAdsBridge {
    ScarAdapterVersion getAdapterVersion(int i10);

    Object getInitializationStatus();

    int getVersionCodeIndex();

    String getVersionMethodName();

    String getVersionString();

    void initialize(Context context, Object obj);

    boolean shouldInitialize();
}
