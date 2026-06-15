package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Ho  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0833Ho extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public InterfaceC0831Hm A02;
    public Map<String, String> A03;
    public final AbstractC2058md A04;
    public final C04672p A05;
    public final C1900k1 A06;
    public final A7 A07;
    public final F4 A08;
    public final C1697ge A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, Byte.MAX_VALUE, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, 63, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 98, 117, 125, Byte.MAX_VALUE, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (CP.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0833Ho(C1900k1 c1900k1, AbstractC2058md abstractC2058md, C04672p c04672p, A7 a72, InterfaceC0831Hm interfaceC0831Hm, Map<String, String> playableMetricsData) {
        super(c1900k1);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A08 = new C0904Kh(this);
        this.A06 = c1900k1;
        this.A04 = abstractC2058md;
        this.A05 = c04672p;
        this.A07 = a72;
        this.A02 = interfaceC0831Hm;
        this.A03 = playableMetricsData;
        this.A09 = A04();
        if (this.A05.A0M() && !this.A05.A0O()) {
            A0B();
        }
        if (C06419m.A1s(this.A06)) {
            this.A06.A0B().AJs(this.A09, this.A04.A1g(), false);
        }
        addView(this.A09, A0F);
    }

    public static /* synthetic */ int A00(C0833Ho c0833Ho) {
        int i10 = c0833Ho.A00;
        c0833Ho.A00 = i10 + 1;
        return i10;
    }

    private C1697ge A04() {
        C1697ge c1697ge = new C1697ge(this.A06, new WeakReference(this.A08), 10, C06419m.A20(this.A06));
        c1697ge.setCornerRadius(A0E);
        c1697ge.setLogMultipleImpressions(false);
        c1697ge.setCheckAssetsByJavascriptBridge(false);
        c1697ge.setWebViewTimeoutInMillis(this.A05.A09());
        c1697ge.setRequestId(this.A04.A0r());
        c1697ge.setOnTouchListener(new View$OnTouchListenerC0832Hn(this, null));
        WebSettings settings = c1697ge.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        c1697ge.addJavascriptInterface(new C0834Hp(this.A06, this, this.A07, this.A03, this.A04.A1g()), A06(0, 12, 121));
        return c1697ge;
    }

    public final void A0A() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C06058b c06058b = new C06058b(A06(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(136, 6, 72), this.A00);
            jSONObject.put(A06(142, 5, 104), currentTimeMillis);
            jSONObject.put(A06(187, 5, 51), this.A04.A1g());
        } catch (JSONException e8) {
            Log.e(A06(92, 15, 84), A06(12, 13, 74), e8);
        }
        c06058b.A07(jSONObject);
        c06058b.A05(1);
        C8Z A08 = this.A06.A08();
        int i10 = AbstractC06048a.A2D;
        String A06 = A06(147, 8, 11);
        A08.AAv(A06, i10, c06058b);
        this.A00 = 0;
        if (C06419m.A1n(this.A06)) {
            if (currentTimeMillis <= C06419m.A0K(this.A06)) {
                InterfaceC0831Hm interfaceC0831Hm = this.A02;
                String[] strArr = A0D;
                if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
                strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
                if (interfaceC0831Hm != null) {
                    this.A02.ACm();
                    return;
                }
                return;
            }
            c06058b.A05(0);
            this.A06.A08().AAu(A06, AbstractC06048a.A2E, c06058b);
        } else if (this.A02 == null) {
        } else {
            this.A02.ACm();
        }
    }

    public final void A0B() {
        String A0F2;
        if (this.A05.A0O()) {
            C06058b c06058b = new C06058b(A06(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 36), this.A05.A0I());
                jSONObject.put(A06(187, 5, 51), this.A04.A1g());
            } catch (JSONException e8) {
                String A06 = A06(92, 15, 84);
                String A062 = A06(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(A06, A062, e8);
            }
            c06058b.A07(jSONObject);
            c06058b.A05(1);
            C8Z A08 = this.A06.A08();
            int i10 = AbstractC06048a.A2G;
            String A063 = A06(155, 15, 77);
            A08.AAv(A063, i10, c06058b);
            if (C06419m.A0q(this.A06) && AbstractC0707Cs.A00(this.A06) == EnumC0706Cr.A07) {
                this.A06.A08().AAv(A063, AbstractC06048a.A2F, c06058b);
                this.A08.AD9(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                }
                String[] strArr5 = A0D;
                strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                return;
            }
        }
        try {
            C1697ge c1697ge = this.A09;
            if (!TextUtils.isEmpty(this.A05.A0C())) {
                A0F2 = this.A05.A0C();
            } else {
                A0F2 = this.A05.A0F();
            }
            c1697ge.loadUrl(A0F2);
        } catch (Exception e10) {
            this.A06.A08().AAu(A06(192, 8, 9), AbstractC06048a.A2f, new C06058b(e10));
        }
    }

    public final void A0C() {
        if (C06419m.A1s(this.A06)) {
            this.A06.A0B().AJZ(this.A09);
        }
        this.A09.removeJavascriptInterface(A06(0, 12, 121));
        this.A09.destroy();
    }

    public C0710Cv getTouchDataRecorder() {
        return this.A09.getTouchDataRecorder();
    }

    public JL getViewabilityChecker() {
        return this.A09.getViewabilityChecker();
    }

    public void setPlayableAdsViewListener(InterfaceC0831Hm interfaceC0831Hm) {
        this.A02 = interfaceC0831Hm;
    }
}
