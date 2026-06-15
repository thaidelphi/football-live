package com.startapp.sdk.ads.splash;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.c5;
import com.startapp.l2;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends l2 {
    public boolean A;

    /* renamed from: x  reason: collision with root package name */
    public SplashConfig f22741x;

    /* renamed from: y  reason: collision with root package name */
    public SplashScreen f22742y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f22743z;

    @Override // com.startapp.l2
    public final boolean a(int i10, KeyEvent keyEvent) {
        if (this.f22743z) {
            if (i10 == 25) {
                if (!this.A) {
                    this.A = true;
                    SplashScreen splashScreen = this.f22742y;
                    splashScreen.f22728h = true;
                    splashScreen.f22722b.f22705g = true;
                    Toast.makeText(this.f22201b, "Test Mode", 0).show();
                    return true;
                }
            } else if (i10 == 24 && this.A) {
                this.f22201b.finish();
                return true;
            }
        }
        return i10 == 4;
    }

    @Override // com.startapp.l2
    public final void d() {
    }

    @Override // com.startapp.l2
    public final void f() {
        AdPreferences adPreferences;
        if (this.f22741x != null) {
            Serializable serializableExtra = this.f22200a.getSerializableExtra("AdPreference");
            if (serializableExtra != null) {
                adPreferences = (AdPreferences) serializableExtra;
            } else {
                adPreferences = new AdPreferences();
            }
            this.f22743z = this.f22200a.getBooleanExtra("testMode", false);
            SplashScreen splashScreen = new SplashScreen(this.f22201b, this.f22741x, adPreferences);
            this.f22742y = splashScreen;
            SplashEventHandler splashEventHandler = splashScreen.f22722b;
            c5.a(splashEventHandler.f22699a).a(splashEventHandler.f22709k, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
            if (!splashScreen.b()) {
                splashScreen.f22727g.post(splashScreen.f22731k);
            } else {
                splashScreen.f22727g.postDelayed(splashScreen.f22731k, 100L);
            }
        }
    }

    @Override // com.startapp.l2
    public final void g() {
        SplashEventHandler.SplashState splashState;
        SplashScreen splashScreen = this.f22742y;
        if (splashScreen != null) {
            splashScreen.f22727g.removeCallbacks(splashScreen.f22731k);
            SplashEventHandler splashEventHandler = splashScreen.f22722b;
            SplashEventHandler.SplashState splashState2 = splashEventHandler.f22707i;
            if (splashState2 == SplashEventHandler.SplashState.DISPLAYED || splashState2 == (splashState = SplashEventHandler.SplashState.DO_NOT_DISPLAY)) {
                return;
            }
            splashEventHandler.f22707i = splashState;
            if (splashEventHandler.f22702d) {
                splashEventHandler.a();
            }
        }
    }

    @Override // com.startapp.l2
    public final void h() {
    }

    @Override // com.startapp.l2
    public final void a(Bundle bundle) {
        this.f22741x = (SplashConfig) this.f22200a.getSerializableExtra("SplashConfig");
    }
}
