package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class LI extends FrameLayout implements InterfaceC1612fG {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public JL A00;
    public final int A01;
    public final AbstractC2058md A02;
    public final C1900k1 A03;
    public final A7 A04;
    public final C0710Cv A05;
    public final InterfaceC0799Gg A06;
    public final C0810Gr A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, 24, 28, 31, 43, 58, 55, 59, 48, 61, 59, 16, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, 11, 14, 4, 12, 56, 20, 8, 18, 21, 4, 2, 90, 85, 64, 93, 66, 81, 117, 80, 112, 85, 64, 85, 118, 65, 90, 80, 88, 81, 27, 29, 11, 28, 13, 2, 7, 13, 5, 22, 9, 5, 23, 52, 25, 16, 5};
    }

    static {
        A02();
    }

    public LI(C1900k1 c1900k1, A7 a72, InterfaceC0799Gg interfaceC0799Gg, AbstractC2058md abstractC2058md, String str, int i10, C0710Cv c0710Cv) {
        super(c1900k1);
        this.A03 = c1900k1;
        this.A04 = a72;
        this.A02 = abstractC2058md;
        this.A08 = str;
        this.A06 = interfaceC0799Gg;
        this.A01 = i10;
        C0810Gr preloadedDynamicWebViewController = AbstractC0811Gs.A02(abstractC2058md.A0r());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C0810Gr(this.A03, abstractC2058md, a72, i10);
            AbstractC0811Gs.A03(abstractC2058md, this.A07);
            this.A09 = false;
        }
        if (c0710Cv != null) {
            this.A05 = c0710Cv;
            this.A07.A0Z(c0710Cv);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C1619fN(this));
        this.A07.A0a(interfaceC0799Gg);
        CU.A04(this, CU.A0B);
        if (C06419m.A1s(c1900k1)) {
            c1900k1.A0B().AJu(this.A07.A0O(), abstractC2058md.A1g(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A5w();
            this.A07.A0X();
        } else {
            this.A03.A0F().A5x();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.AD1(this);
                    }
                    if (C06419m.A1s(this.A03)) {
                        AJ A0B2 = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        A0B2.ACq();
                    }
                } else {
                    AJI();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C0810Gr.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC2058md abstractC2058md) {
        intent.putExtra(A01(157, 8, 110), BG.A07);
        intent.putExtra(A01(130, 18, 58), abstractC2058md);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC2058md abstractC2058md) {
        AdActivityIntent A05 = C0683Bq.A05(this.A03);
        A05(A05, abstractC2058md);
        try {
            C0683Bq.A0B(this.A03, A05);
        } catch (Exception e8) {
            this.A03.A08().AAu(A01(107, 11, 42), AbstractC06048a.A0D, new C06058b(e8));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e8);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FQ fq = new FQ(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A1c());
        HashMap hashMap = new HashMap();
        hashMap.put(A01(118, 12, 105), A01(148, 9, 96));
        fq.A08(this.A02.A1g(), str, hashMap);
    }

    public final void A08() {
        D3.A0H(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void A9V() {
        A07(this.A02.A1b().A0H().A05());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void A9W(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void A9a() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AAb() {
        new Handler(Looper.getMainLooper()).post(new C1618fM(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void ADF() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void ADJ() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AE9(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AF8() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AFf(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AFh(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AFw(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void AJI() {
        if (this.A06 != null) {
            this.A06.AD1(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1612fG
    public final void close() {
    }

    public A7 getAdEventManager() {
        return this.A04;
    }

    public C0810Gr getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(JL jl) {
        this.A00 = jl;
        this.A07.A0e(jl);
    }
}
