package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Gj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0802Gj extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"nL4f6tElOIWkWIMY", "pafc", "mmt", "r2KL", "cPD1EcNrMsc9Il", "HjHry0SxIHtlyHB0wW8GJ6CkWWRugdPq", "pjLQgfnHLp272wJByK44k5CENQyu64qM", "USuv5isgmNE5xLLzg"};
    public IP A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC2058md A05;
    public final C05987t A06;
    public final C1900k1 A07;
    public final AF A08;
    public final DR A09;
    public final EC A0A;
    public final InterfaceC0801Gi A0B;
    public final C1438cQ A0C;
    public final C1433cL A0D;
    public final C0898Kb A0E;
    public final AbstractC1415c3 A0F;
    public final AbstractC1413c1 A0G;
    public final AbstractC1409bx A0H;
    public final AbstractC1407bv A0I;
    public final AbstractC1405bt A0J;
    public final AbstractC1404bs A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[0].length() != 16) {
                throw new RuntimeException();
            }
            A0M[0] = "7kRjpWt7kPSYf5Zn";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 13);
            i13++;
        }
    }

    public static void A0C() {
        A0L = new byte[]{-112, -94, -97, -97, -110, -101, -95, -127, -106, -102, -110, -81, -64, -67, -84, -65, -76, -70, -71, -20, -12, -13, -28, -29, -14, -29, -9, -11, -25, -26, -60, -5, -41, -11, -25, -12, -19, -17, -20, -28, -17, -30, -16, -16};
    }

    static {
        A0C();
    }

    public C0802Gj(C1900k1 c1900k1, A7 a72, AbstractC2058md abstractC2058md, C05987t c05987t, AF af, DR dr, EC ec, InterfaceC0801Gi interfaceC0801Gi) {
        super(c1900k1);
        this.A0J = new LH(this);
        this.A0I = new LG(this);
        this.A0H = new LF(this);
        this.A0K = new LE(this);
        this.A0F = new LD(this);
        this.A0G = new LC(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c1900k1;
        this.A05 = abstractC2058md;
        this.A06 = c05987t;
        this.A08 = af;
        this.A09 = dr;
        this.A0A = ec;
        this.A0D = new C1433cL(c1900k1);
        this.A0B = interfaceC0801Gi;
        this.A0D.setFunnelLoggingHandler(af);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new C0898Kb(c1900k1, a72, this.A0D, abstractC2058md.A1g());
        if (C06419m.A1t(this.A07)) {
            this.A0C = new C1438cQ(c1900k1, a72, this.A0D, abstractC2058md.A1g(), this.A0E, null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A1b().A0F().A09()));
        A09();
        D3.A0K(this, this.A05.A1a().A01().A08(true));
        String videoUrl = abstractC2058md.A1b().A0F().A08();
        if (!TextUtils.isEmpty(videoUrl)) {
            AbstractC0779Fm.A00(c1900k1, this, videoUrl);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 32), i10);
            jSONObject.put(A02(11, 8, 62), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 114), this.A0D.A0o());
            jSONObject.put(A02(24, 12, 117), this.A0D.A0q());
            return jSONObject;
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new C1616fK(this), C06419m.A0N(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new C1615fJ(this), C06419m.A0O(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.AFZ(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A1b().A0F().A08())) {
            KA ka = new KA(this.A07);
            this.A0D.A0h(ka);
            ka.setImage(this.A05.A1b().A0F().A08());
        }
        IX ix = new IX(this.A07, true, this.A08);
        this.A0D.A0h(ix);
        this.A0D.A0h(new C1383bX(ix, EnumC0850If.A02, true));
        this.A0D.A0h(new C0846Ib(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(KX kx) {
        if (this.A0D.getState() == JI.A02 && C06419m.A1X(this.A07)) {
            this.A0D.postDelayed(new C1614fI(this, kx), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0F().A3Q(str);
        if (C06419m.A1Y(this.A07)) {
            A07();
            return;
        }
        this.A09.A4Z(this.A0A.A7r());
        this.A09.A4Z(this.A0A.A7m());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A1b().A0F().A0A() ? 0.0f : 1.0f);
        this.A0D.A0g(IP.A02, 26);
        A08();
    }

    public final void A0O() {
        if (this.A0D != null) {
            if (!this.A02) {
                this.A0D.A0f(II.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0Y();
        }
        if (this.A0C != null) {
            this.A0C.A05();
        }
        this.A0E.A0p();
    }

    public final void A0P() {
        this.A0D.A0d(9);
        D3.A0R(this);
        D3.A0F(this.A0D);
        D3.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0f(II.A04);
    }

    public final void A0R(boolean z10) {
        if (z10) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
    }

    public final void A0S(boolean z10) {
        if (this.A0D.A0p()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z10;
        this.A0D.A0k(false, 19);
    }

    public final void A0T(boolean z10) {
        if (this.A0D.A0q() || this.A02 || this.A0D.getState() == JI.A06 || this.A00 == null) {
            return;
        }
        if (!this.A01 || z10) {
            this.A0D.A0g(this.A00, 27);
        }
    }

    public final void A0U(boolean z10) {
        this.A0D.A0k(z10, 18);
    }

    public final void A0V(boolean z10) {
        this.A0D.A0g(IP.A04, 25);
    }
}
