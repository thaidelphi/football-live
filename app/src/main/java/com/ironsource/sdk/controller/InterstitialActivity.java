package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.b9;
import com.ironsource.sdk.utils.Logger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class InterstitialActivity extends ControllerActivity {

    /* renamed from: r  reason: collision with root package name */
    private static final String f20186r = "InterstitialActivity";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f20186r, "onCreate");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f20186r, b9.h.f16677t0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f20186r, b9.h.f16679u0);
    }
}
