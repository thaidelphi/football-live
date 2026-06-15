package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
/* renamed from: com.facebook.ads.redexgen.X.Ht  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0838Ht {
    public View$OnClickListenerC1689gW A00;
    public final C2P A01;
    public final C04522a A02;
    public final C04562e A03;
    public final C04652n A04;
    public final C1900k1 A05;
    public final AF A06;
    public static final int A09 = (int) (CP.A02 * 4.0f);
    public static final int A07 = (int) (CP.A02 * 72.0f);
    public static final int A08 = (int) (CP.A02 * 8.0f);

    public C0838Ht(C1900k1 c1900k1, A7 a72, AbstractC2058md abstractC2058md) {
        this.A05 = c1900k1;
        this.A06 = new AF(abstractC2058md.A1g(), a72);
        this.A01 = abstractC2058md.A1a();
        this.A02 = abstractC2058md.A1b().A0G();
        this.A04 = abstractC2058md.A1e();
        this.A03 = abstractC2058md.A1b().A0I();
    }

    private View A00(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        C0778Fl c0778Fl = new C0778Fl(this.A05, this.A01.A01(), true, false, false);
        c0778Fl.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c0778Fl.setAlignment(17);
        C0772Ff c0772Ff = new C0772Ff(this.A05);
        D3.A0K(c0772Ff, 0);
        c0772Ff.setRadius(50);
        new AsyncTaskC1695gc(c0772Ff, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c0772Ff, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c0778Fl, layoutParams);
        if (view$OnClickListenerC1689gW != null) {
            D3.A0H(view$OnClickListenerC1689gW);
            linearLayout.addView(view$OnClickListenerC1689gW, layoutParams);
            if (TextUtils.isEmpty(view$OnClickListenerC1689gW.getText())) {
                D3.A0F(view$OnClickListenerC1689gW);
            }
        }
        return linearLayout;
    }

    private MG A01() {
        MG mg = new MG(this.A05);
        mg.setLayoutManager(new C1972lC(this.A05, 0, false));
        mg.setAdapter(new C1450cc(this.A05, this.A03.A02(), A09, this.A00));
        return mg;
    }

    private final EnumC0837Hs A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC0837Hs.A03;
        }
        return EnumC0837Hs.A02;
    }

    public final Pair<EnumC0837Hs, View> A03(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        View A01;
        this.A00 = view$OnClickListenerC1689gW;
        EnumC0837Hs A02 = A02();
        switch (C0836Hr.A00[A02.ordinal()]) {
            case 1:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        AH.A04(A01, this.A06, AE.A0S);
        return new Pair<>(A02, A01);
    }
}
