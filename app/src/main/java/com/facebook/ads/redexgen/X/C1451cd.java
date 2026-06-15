package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.C1451cd;
import com.facebook.ads.redexgen.X.C1900k1;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.List;
import java.util.Objects;
/* renamed from: com.facebook.ads.redexgen.X.cd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1451cd extends AbstractC05435q<C1447cZ> {
    public int A01;
    public final int A02;
    public final MG A05;
    public final C1900k1 A06;
    public final View$OnClickListenerC1689gW A07;
    public final List<String> A09;
    public int A00 = 0;
    public final Application.ActivityLifecycleCallbacks A03 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C1900k1 c1900k1;
            Handler handler;
            Runnable runnable;
            c1900k1 = C1451cd.this.A06;
            if (activity != c1900k1.A0E()) {
                return;
            }
            handler = C1451cd.this.A04;
            runnable = C1451cd.this.A08;
            handler.removeCallbacks(runnable);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Handler handler;
            Runnable runnable;
            handler = C1451cd.this.A04;
            runnable = C1451cd.this.A08;
            handler.post(runnable);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A08 = new I4(this);

    public C1451cd(C1900k1 c1900k1, List<String> screenshotUrls, int i10, MG mg, View$OnClickListenerC1689gW view$OnClickListenerC1689gW, int i11) {
        this.A09 = screenshotUrls;
        this.A02 = i10;
        this.A06 = c1900k1;
        this.A05 = mg;
        this.A07 = view$OnClickListenerC1689gW;
        this.A01 = i11;
        this.A04.post(this.A08);
        if (Build.VERSION.SDK_INT >= 29) {
            ((Activity) Objects.requireNonNull(this.A06.A0E())).registerActivityLifecycleCallbacks(this.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A06 */
    public final C1447cZ A0D(ViewGroup viewGroup, int i10) {
        C1443cV c1443cV = new C1443cV(this.A06);
        if (C06419m.A1B(this.A06)) {
            c1443cV.setOnClickListener(new I5(this));
        }
        return new C1447cZ(c1443cV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A08 */
    public final void A0E(C1447cZ c1447cZ, int i10) {
        int size = i10 % this.A09.size();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) CommonGatewayClient.CODE_400, -1);
        int i11 = this.A02;
        int actualPosition = this.A02;
        marginLayoutParams.setMargins(i11, 0, actualPosition, 0);
        c1447cZ.A0j().setLayoutParams(marginLayoutParams);
        c1447cZ.A0j().setUrl(this.A09.get(size));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    public final int A0C() {
        return this.A09.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    public final void A0F(MG mg) {
        super.A0F(mg);
        this.A04.removeCallbacks(this.A08);
        if (Build.VERSION.SDK_INT >= 29) {
            ((Activity) Objects.requireNonNull(this.A06.A0E())).unregisterActivityLifecycleCallbacks(this.A03);
        }
    }

    public final void A0G(int i10) {
        this.A01 = i10;
    }
}
