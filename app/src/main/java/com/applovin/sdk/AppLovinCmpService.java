package com.applovin.sdk;

import android.app.Activity;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AppLovinCmpService {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface OnCompletedListener {
        void onCompleted(AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(Activity activity, OnCompletedListener onCompletedListener);
}
