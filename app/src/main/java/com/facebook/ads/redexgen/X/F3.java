package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class F3 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = F3.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC04311f> A03;
    public final WeakReference<F4> A04;
    public final WeakReference<JL> A05;
    public final WeakReference<C1697ge> A06;

    public F3(C1697ge c1697ge, F4 f42, JL jl, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1900k1 c1900k1) {
        this.A06 = new WeakReference<>(c1697ge);
        this.A04 = new WeakReference<>(f42);
        this.A05 = new WeakReference<>(jl);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1900k1.A0F());
    }

    private InterfaceC04311f A00() {
        InterfaceC04311f funnel = this.A03.get();
        if (funnel == null) {
            return new C2102nL();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return CV.A01(C06148k.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i10, String str) {
        A00().AJw(i10, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AJx();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AJy();
            if (this.A06.get().isShown()) {
                A00().AJz();
                new Handler(Looper.getMainLooper()).post(new C1699gg(this.A05));
            }
            F4 f42 = this.A04.get();
            if (f42 != null) {
                new Handler(Looper.getMainLooper()).post(new F2(this, f42));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1697ge webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AK0(true);
            return;
        }
        F4 f42 = this.A04.get();
        if (f42 == null) {
            A00().AK0(true);
            return;
        }
        InterfaceC04311f A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AK0(false);
        f42.AEN();
    }
}
