package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AdapterBaseInterface {
    String getAdapterVersion();

    String getNetworkSDKVersion();

    void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener);
}
