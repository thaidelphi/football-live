package com.startapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.ListView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22355a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ListView f22356b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f22357c;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f22358a;

        public a(WebView webView) {
            this.f22358a = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ViewParent parent = this.f22358a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f22358a);
                    this.f22358a.destroy();
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public o8(ListView listView, Context context) {
        this.f22356b = listView;
        this.f22357c = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f22355a) {
            return;
        }
        try {
            View findViewById = this.f22356b.findViewById(16908290);
            if (findViewById instanceof WebView) {
                WebView webView = (WebView) findViewById;
                this.f22356b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                boolean z10 = true;
                this.f22355a = true;
                String userAgentString = webView.getSettings().getUserAgentString();
                com.startapp.sdk.components.a.a(this.f22357c).f23225a.a().a(userAgentString);
                WvfMetadata T = MetaData.f23158k.T();
                ComponentInfoEventConfig a10 = T != null ? T.a() : null;
                if (a10 == null || !a10.a(1048576L)) {
                    z10 = false;
                }
                if (z10) {
                    l3 l3Var = new l3(m3.f22274d);
                    l3Var.f22228d = "wvt.found";
                    l3Var.f22229e = userAgentString;
                    l3Var.a();
                }
                this.f22356b.post(new a(webView));
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}
