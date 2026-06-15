package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
