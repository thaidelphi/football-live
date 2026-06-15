package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    void onAdLoadSuccess();

    void onAdOpened();
}
