package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Gn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0806Gn extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ C0810Gr A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A02[5].charAt(10) != 'q') {
                throw new RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i13] = (byte) (i14 ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, 12, 17, 32, 12, 7, 6, 90, 93, 74, 85, 95, 83, 82, 18, 85, 95, 83, 13, 17, 17, 21, 58, 0, 23, 23, 10, 23, 19, 17, 10, 12, 17, 10, 23, 26, 106, 109, 115};
    }

    static {
        A01();
    }

    public C0806Gn(C0810Gr c0810Gr) {
        this.A00 = c0810Gr;
    }

    private void A02(int i10, String str, String str2, boolean z10) {
        AF af;
        C1900k1 c1900k1;
        C0797Ge c0797Ge;
        if (z10) {
            this.A00.A0S();
        }
        af = this.A00.A0D;
        af.A04(AE.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i10);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1900k1 = this.A00.A0B;
        c1900k1.A0F().A64(jSONObject2);
        c0797Ge = this.A00.A0E;
        c0797Ge.A04(AbstractC06048a.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AF af;
        C1900k1 c1900k1;
        long j10;
        InterfaceC0808Gp interfaceC0808Gp;
        InterfaceC0808Gp interfaceC0808Gp2;
        af = this.A00.A0D;
        af.A04(AE.A0R, null);
        c1900k1 = this.A00.A0B;
        InterfaceC04311f A0F = c1900k1.A0F();
        j10 = this.A00.A00;
        A0F.A65(C0709Cu.A01(j10));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC0808Gp = this.A00.A03;
        if (interfaceC0808Gp == null) {
            return;
        }
        interfaceC0808Gp2 = this.A00.A03;
        interfaceC0808Gp2.AFp();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i10, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 93);
        A02(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            i10 = webResourceResponse.getStatusCode();
        } else {
            i10 = -1;
        }
        A02(i10, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1900k1 c1900k1;
        AbstractC2058md abstractC2058md;
        InterfaceC0809Gq interfaceC0809Gq;
        InterfaceC0809Gq interfaceC0809Gq2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1900k1 = this.A00.A0B;
        String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1900k1.A0F().A60(jSONObject2);
            abstractC2058md = this.A00.A09;
            AbstractC0811Gs.A04(abstractC2058md.A0r());
            interfaceC0809Gq = this.A00.A04;
            if (interfaceC0809Gq != null) {
                interfaceC0809Gq2 = this.A00.A04;
                interfaceC0809Gq2.AEf();
            }
            String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1900k1 c1900k1;
        C05987t c05987t;
        H0 h02;
        AbstractC2058md abstractC2058md;
        c1900k1 = this.A00.A0B;
        c05987t = this.A00.A0A;
        h02 = this.A00.A0H;
        abstractC2058md = this.A00.A09;
        return H2.A00(c1900k1, c05987t, webResourceRequest, h02, abstractC2058md.A16());
    }
}
