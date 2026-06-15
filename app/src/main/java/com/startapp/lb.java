package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class lb implements gb {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22262a;

    /* renamed from: b  reason: collision with root package name */
    public final j2<WvfMetadata> f22263b;

    /* renamed from: c  reason: collision with root package name */
    public WebView f22264c;

    /* renamed from: d  reason: collision with root package name */
    public String f22265d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22266e;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* compiled from: Sta */
        /* renamed from: com.startapp.lb$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class C0247a implements MessageQueue.IdleHandler {
            public C0247a() {
            }

            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                lb lbVar = lb.this;
                if (lbVar.f22264c == null) {
                    try {
                        lbVar.f22264c = lbVar.d();
                        return false;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
                return false;
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                MessageQueue myQueue = Looper.myQueue();
                if (myQueue != null) {
                    myQueue.addIdleHandler(new C0247a());
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public lb(Context context, j2<WvfMetadata> j2Var) {
        if (Build.VERSION.SDK_INT >= 31 && !context.isUiContext()) {
            this.f22262a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        } else {
            this.f22262a = context;
        }
        this.f22263b = j2Var;
    }

    @Override // com.startapp.gb
    public final void a(String str) {
        this.f22265d = str;
    }

    @Override // com.startapp.gb
    public final void b() {
        com.startapp.sdk.adsbase.a.a(new a());
    }

    @Override // com.startapp.gb
    public final WebView c() {
        WebView webView = this.f22264c;
        if (webView == null) {
            return d();
        }
        this.f22264c = null;
        b();
        return webView;
    }

    public final WebView d() {
        WebView webView = new WebView(this.f22262a);
        if (this.f22265d == null) {
            this.f22265d = webView.getSettings().getUserAgentString();
        }
        return webView;
    }

    @Override // com.startapp.gb
    public final String a() {
        int i10;
        String str = this.f22265d;
        boolean z10 = false;
        long j10 = 0;
        if (str == null || str.length() < 1) {
            try {
                if (Build.VERSION.SDK_INT > 16) {
                    WvfMetadata call = this.f22263b.call();
                    int b10 = o9.b(call != null ? call.c() : WvfMetadata.f23194a);
                    if (b10 < 0) {
                        b10 = 0;
                    }
                    if (b10 == 1) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            str = WebSettings.getDefaultUserAgent(this.f22262a);
                            j10 = System.currentTimeMillis() - currentTimeMillis;
                            i10 = 2;
                        } catch (Throwable th) {
                            WvfMetadata call2 = this.f22263b.call();
                            ComponentInfoEventConfig a10 = call2 != null ? call2.a() : null;
                            if (a10 != null && a10.a((long) 8)) {
                                l3.a(th);
                            }
                        }
                        if (str != null || str.length() < 1) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            str = System.getProperty("http.agent");
                            j10 = System.currentTimeMillis() - currentTimeMillis2;
                            i10 = 4;
                        }
                    }
                }
                long currentTimeMillis22 = System.currentTimeMillis();
                str = System.getProperty("http.agent");
                j10 = System.currentTimeMillis() - currentTimeMillis22;
                i10 = 4;
            } catch (Throwable th2) {
                WvfMetadata call3 = this.f22263b.call();
                ComponentInfoEventConfig a11 = call3 != null ? call3.a() : null;
                if (a11 != null && a11.a((long) 16)) {
                    l3.a(th2);
                }
            }
            i10 = 0;
            if (str != null) {
            }
        } else {
            i10 = 1;
        }
        if (!this.f22266e) {
            this.f22266e = true;
            WvfMetadata call4 = this.f22263b.call();
            ComponentInfoEventConfig a12 = call4 != null ? call4.a() : null;
            if (a12 != null && a12.a(i10)) {
                z10 = true;
            }
            if (z10) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "WVF.gua";
                l3Var.f22233i = String.valueOf(i10);
                l3Var.f22229e = str + ", " + j10 + " ms";
                l3Var.a();
            }
        }
        return str;
    }
}
