package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.h9  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1728h9 extends F1 {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static String[] A0C = {"r5lFqG0C0bBGIxytTEblkmz8pOWiln6U", "Y5tMFhpuLobi6U3v3neZGAzEpbrZh2e0", "35iZKMkwZFt7WP5rciHAZ1WswbletKXm", "1wdh7bxI31pnh6pFTaTypUqx", "X0GEkrMG66X1N8QG", "HQ8AmQiqT9dTkfwWyhZ7u2ZNdQoS7Fbv", "yjHJSxajRdLfdjSgilcNPSPFyTq4dELg", "ut8cBtSHXrZx3QiSKTpc7NoA9ie10da9"};
    public static final String A0D;
    public static final Set<String> A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C1900k1 A04;
    public C0758Er A05;
    public InterfaceC0762Ev A06;
    public C0765Ey A07;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{43, 55, 55, 51, 100, 120, 120, 124, Byte.MAX_VALUE};
    }

    static {
        A08();
        A0D = C1728h9.class.getSimpleName();
        A0E = new HashSet(2);
        A09 = false;
        A0A = false;
        A0E.add(A05(0, 4, 113));
        A0E.add(A05(4, 5, 62));
    }

    public C1728h9(C1900k1 c1900k1, Activity activity, InterfaceC0762Ev interfaceC0762Ev) {
        super(activity, c1900k1);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1900k1, interfaceC0762Ev);
    }

    public C1728h9(C1900k1 c1900k1, InterfaceC0762Ev interfaceC0762Ev) {
        super(c1900k1);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1900k1, interfaceC0762Ev);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.F1
    /* renamed from: A04 */
    public final C0765Ey A0E() {
        return new C0765Ey(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i10, int i11, Intent intent) {
        if (A08 != null && i10 == 1001) {
            A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            A08 = null;
        }
    }

    private void A0A(C1900k1 c1900k1, InterfaceC0762Ev interfaceC0762Ev) {
        this.A04 = c1900k1;
        this.A06 = interfaceC0762Ev;
        this.A05 = new C0758Er(this);
        A09 = AbstractC06429n.A03(this.A04);
        A0A = AbstractC06429n.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        this.A07 = A0E();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.F1
    public final WebChromeClient A0D() {
        return new C0764Ex(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j10) {
        if (this.A00 < 0) {
            this.A00 = j10;
        }
        A07();
        String[] strArr = A0C;
        if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "TnIn5PelVgDBsDwa";
        strArr2[3] = "kaGwwHcDVWZGOuagxs1W4ZQa";
    }

    public final void A0G(long j10) {
        if (this.A01 < 0) {
            this.A01 = j10;
        }
        A07();
    }

    public final void A0H(long j10) {
        if (this.A02 < 0) {
            this.A02 = j10;
        }
        A07();
        String[] strArr = A0C;
        if (strArr[5].charAt(4) == strArr[7].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[6] = "DwC46XxC2zY9iA5O924mXxlTXzY8IGhb";
        strArr2[0] = "1LscF1ZcfF08U7LpSibJFf3LFm8iDmJu";
    }

    @Override // com.facebook.ads.redexgen.X.F1, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        F7.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC0763Ew interfaceC0763Ew) {
        this.A07.A06(new WeakReference<>(interfaceC0763Ew));
    }

    public void setInterceptRedirectRequest(InterfaceC0761Eu interfaceC0761Eu) {
        this.A07.A05(interfaceC0761Eu);
    }
}
