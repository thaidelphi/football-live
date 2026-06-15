package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface vk {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements vk {

        /* renamed from: a  reason: collision with root package name */
        private WebView f21181a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21182b;

        public a() {
            this(0, 1, null);
        }

        public a(int i10) {
            this.f21182b = i10 >= 19;
        }

        public /* synthetic */ a(int i10, int i11, kotlin.jvm.internal.h hVar) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f21181a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f21181a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.vk
        public void a(WebView webView) {
            kotlin.jvm.internal.n.f(webView, "webView");
            this.f21181a = webView;
        }

        @Override // com.ironsource.vk
        public void a(String script) {
            kotlin.jvm.internal.n.f(script, "script");
            try {
                if (this.f21182b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                o9.d().a(th);
                this.f21182b = false;
                c(script);
            }
        }

        @Override // com.ironsource.vk
        public boolean a() {
            return this.f21181a != null;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
