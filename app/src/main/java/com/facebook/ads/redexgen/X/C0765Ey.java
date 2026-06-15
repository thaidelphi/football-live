package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ey  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0765Ey extends WebViewClient {
    public static byte[] A05;
    public InterfaceC0761Eu A00 = new InterfaceC0761Eu() { // from class: com.facebook.ads.redexgen.X.hB
        @Override // com.facebook.ads.redexgen.X.InterfaceC0761Eu
        public final boolean AAU(String str) {
            return C0765Ey.A04(str);
        }
    };
    public WeakReference<InterfaceC0763Ew> A01 = new WeakReference<>(null);
    public final WeakReference<C1900k1> A02;
    public final WeakReference<InterfaceC0762Ev> A03;
    public final WeakReference<C0758Er> A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, Byte.MAX_VALUE, 114, 56, Byte.MAX_VALUE, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C0765Ey(WeakReference<C1900k1> weakReference, WeakReference<InterfaceC0762Ev> weakReference2, WeakReference<C0758Er> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1900k1 c1900k1) {
        c1900k1.A08().AAu(A00(11, 11, 104), AbstractC06048a.A09, new C06058b(A00(111, 5, 91) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r0.contains(r2) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0765Ey.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(InterfaceC0761Eu interfaceC0761Eu) {
        this.A00 = interfaceC0761Eu;
    }

    public final void A06(WeakReference<InterfaceC0763Ew> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0758Er timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC0762Ev interfaceC0762Ev = this.A03.get();
        if (interfaceC0762Ev != null) {
            interfaceC0762Ev.AEM(str);
        }
        InterfaceC0763Ew interfaceC0763Ew = this.A01.get();
        if (interfaceC0763Ew != null) {
            interfaceC0763Ew.ACT(webView.canGoBack());
            interfaceC0763Ew.ADC(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC0762Ev listener = this.A03.get();
        if (listener != null) {
            listener.AEO(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C1900k1 c1900k1 = this.A02.get();
        if (c1900k1 != null) {
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 109);
            String errorMessage = CT.A01(i10, sb.append(A00).append(str).toString(), A00 + str2);
            c1900k1.A0F().A9p(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1900k1 c1900k1 = this.A02.get();
        if (c1900k1 != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 109);
            String errorMessage = CT.A01(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            c1900k1.A0F().A9p(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1900k1 context = this.A02.get();
        if (context != null) {
            context.A0F().A9q();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1900k1 context = this.A02.get();
        if (context != null) {
            context.A0F().A9r();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        F1.A02(AbstractC06048a.A2e);
        InterfaceC0762Ev listener = this.A03.get();
        if (listener != null) {
            listener.AEo();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
