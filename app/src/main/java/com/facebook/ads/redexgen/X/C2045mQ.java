package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.mQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2045mQ implements InterfaceC05907l {
    public final C04672p A00;
    public final AnonymousClass33 A01;
    public final C05987t A02;
    public final C1900k1 A03;
    public final boolean A04;

    public C2045mQ(C1900k1 c1900k1, AnonymousClass33 anonymousClass33, C05987t c05987t, C04672p c04672p, boolean z10) {
        this.A03 = c1900k1;
        this.A01 = anonymousClass33;
        this.A02 = c05987t;
        this.A00 = c04672p;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        AnonymousClass34 playableWebViewClient = new AnonymousClass34(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0F());
        playableWebViewClient.A03();
    }

    private void A01(boolean z10) {
        if (this.A00.A0A() == EnumC04682q.A05) {
            A00();
            return;
        }
        String A0F = this.A00.A0F();
        if (z10) {
            C05987t c05987t = this.A02;
            String markupUrlResult = this.A00.A0F();
            A0F = c05987t.A0R(markupUrlResult);
        }
        this.A00.A0K(A0F);
        this.A01.AEU();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        if (this.A04) {
            this.A01.AET(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        A01(true);
    }
}
