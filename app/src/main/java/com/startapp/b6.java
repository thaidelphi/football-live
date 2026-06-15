package com.startapp;

import android.view.View;
import com.iab.omid.library.startio.adsession.AdSession;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b6 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f21797a;

    public b6(NativeAdDetails nativeAdDetails) {
        this.f21797a = nativeAdDetails;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        AdDetails adDetails;
        List<VerificationDetails> b10;
        NativeAdDetails nativeAdDetails = this.f21797a;
        nativeAdDetails.getClass();
        if (MetaData.f23158k.X() && (view2 = nativeAdDetails.f22669h.get()) != null && (adDetails = nativeAdDetails.f22662a) != null && (b10 = adDetails.b()) != null) {
            j6 j6Var = new j6(view2.getContext(), b10, false);
            nativeAdDetails.f22672k = j6Var;
            AdSession adSession = j6Var.f22140a;
            if (adSession != null) {
                if (adSession != null) {
                    adSession.registerAdView(view2);
                }
                AdSession adSession2 = nativeAdDetails.f22672k.f22140a;
                if (adSession2 != null) {
                    adSession2.start();
                }
                j6 j6Var2 = nativeAdDetails.f22672k;
                if (j6Var2.f22141b != null && j6Var2.f22144e.compareAndSet(false, true)) {
                    j6Var2.f22141b.loaded();
                }
                j6 j6Var3 = nativeAdDetails.f22672k;
                if (j6Var3.f22141b != null && j6Var3.f22143d.compareAndSet(false, true)) {
                    j6Var3.f22141b.impressionOccurred();
                }
            }
        }
        this.f21797a.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        NotDisplayedReason notDisplayedReason;
        NativeAdDetails nativeAdDetails = this.f21797a;
        cb cbVar = nativeAdDetails.f22668g;
        if (cbVar != null) {
            try {
                s7 s7Var = cbVar.f21857f;
                if (s7Var != null && (notDisplayedReason = cbVar.f21852a) != null) {
                    s7Var.a(notDisplayedReason.toString(), cbVar.f21853b);
                }
                cbVar.f21855d.removeCallbacksAndMessages(null);
            } catch (Throwable unused) {
            }
            nativeAdDetails.f22668g = null;
        }
        NativeAdDetails nativeAdDetails2 = this.f21797a;
        j6 j6Var = nativeAdDetails2.f22672k;
        if (j6Var != null) {
            AdSession adSession = j6Var.f22140a;
            if (adSession != null) {
                adSession.finish();
            }
            nativeAdDetails2.f22672k = null;
        }
        view.removeOnAttachStateChangeListener(this.f21797a.f22670i);
    }
}
