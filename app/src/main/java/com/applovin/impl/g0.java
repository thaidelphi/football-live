package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g0 extends AppLovinWebViewBase {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f7020b;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f7021a;

    public g0(Context context) {
        super(context);
        this.f7021a = new AtomicReference();
        if (f7020b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f7020b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f7020b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f7021a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f7021a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f7021a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f7021a.set(MotionEvent.obtain(motionEvent));
        if (f7020b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
