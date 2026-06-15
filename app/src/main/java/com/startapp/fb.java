package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.cc;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class fb {

    /* renamed from: a  reason: collision with root package name */
    public final t4<gb> f21956a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList f21957b = new LinkedList();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f21958a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f21959b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WebView f21960c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ o9.b f21961d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f21962e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f21963f;

        /* compiled from: Sta */
        /* renamed from: com.startapp.fb$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class RunnableC0244a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f21965a;

            public RunnableC0244a(long j10) {
                this.f21965a = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f21959b.compareAndSet(false, true)) {
                    a aVar = a.this;
                    fb.this.a(aVar.f21960c);
                    a aVar2 = a.this;
                    aVar2.f21961d.a(false, aVar2.f21962e.get(), this.f21965a, true);
                }
            }
        }

        /* compiled from: Sta */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f21967a;

            public b(String str) {
                this.f21967a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f21959b.compareAndSet(false, true)) {
                    a aVar = a.this;
                    fb.this.a(aVar.f21960c);
                    a.this.f21961d.a(String.valueOf(this.f21967a), 3);
                }
            }
        }

        public a(Handler handler, AtomicBoolean atomicBoolean, WebView webView, o9.b bVar, AtomicLong atomicLong, int i10) {
            this.f21958a = handler;
            this.f21959b = atomicBoolean;
            this.f21960c = webView;
            this.f21961d = bVar;
            this.f21962e = atomicLong;
            this.f21963f = i10;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long a10 = o9.a();
            this.f21958a.removeCallbacksAndMessages(null);
            this.f21958a.postDelayed(new RunnableC0244a(a10), this.f21963f);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f21958a.removeCallbacksAndMessages(null);
            this.f21958a.post(new b(str));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || o9.c(webView.getContext(), str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f21969a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f21970b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o9.b f21971c;

        public b(AtomicBoolean atomicBoolean, WebView webView, o9.b bVar) {
            this.f21969a = atomicBoolean;
            this.f21970b = webView;
            this.f21971c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f21969a.compareAndSet(false, true)) {
                fb.this.a(this.f21970b);
                this.f21971c.a("Unknown error", 2);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f21973a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f21974b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o9.b f21975c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f21976d;

        public c(AtomicBoolean atomicBoolean, WebView webView, o9.b bVar, AtomicLong atomicLong) {
            this.f21973a = atomicBoolean;
            this.f21974b = webView;
            this.f21975c = bVar;
            this.f21976d = atomicLong;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f21973a.compareAndSet(false, true)) {
                fb.this.a(this.f21974b);
                this.f21975c.a(false, this.f21976d.get(), o9.a(), false);
            }
        }
    }

    public fb(Context context, t4<gb> t4Var) {
        this.f21956a = t4Var;
    }

    public final void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        if (this.f21957b.size() < 3) {
            this.f21957b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(String str, o9.b bVar) {
        int i10;
        if (com.ironsource.mediationsdk.metadata.a.f18924g.equals(o9.a(str, "@doNotRender@", "@doNotRender@"))) {
            bVar.a(true, 0L, 0L, false);
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.f21957b.size() <= 0) {
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f21957b.poll();
                if (weakReference != null) {
                    webView = (WebView) weakReference.get();
                }
            } catch (Throwable th) {
                l3.a(th);
                bVar.a("WebView instantiation Error", 1);
                return;
            }
        }
        if (webView == null) {
            webView = this.f21956a.a().c();
        }
        WebView webView2 = webView;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Handler handler = new Handler(Looper.getMainLooper());
        AtomicLong atomicLong = new AtomicLong();
        if (q.f22400f.booleanValue()) {
            i10 = 25000;
            webView2.getSettings().setBlockNetworkImage(false);
            webView2.getSettings().setLoadsImagesAutomatically(true);
            webView2.getSettings().setJavaScriptEnabled(true);
        } else {
            i10 = 0;
        }
        webView2.setWebChromeClient(new WebChromeClient());
        webView2.setWebViewClient(new a(handler, atomicBoolean, webView2, bVar, atomicLong, i10));
        atomicLong.set(o9.a());
        webView2.loadDataWithBaseURL(MetaData.f23158k.q(), str, "text/html", cc.N, null);
        if (1 == 0) {
            handler.removeCallbacksAndMessages(null);
            handler.post(new b(atomicBoolean, webView2, bVar));
            return;
        }
        handler.postDelayed(new c(atomicBoolean, webView2, bVar, atomicLong), 25000L);
    }
}
