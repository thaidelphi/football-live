package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fo  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1646fo extends AbstractC0786Ft {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, 120};
    }

    public abstract void A1B();

    public abstract void A1C();

    public abstract void A1D();

    public abstract boolean A1E();

    public abstract boolean A1F();

    public AbstractC1646fo(C0790Fx c0790Fx, boolean z10) {
        super(c0790Fx, z10);
        if (C06419m.A16(c0790Fx.A05())) {
            if (c0790Fx.A0B() != null) {
                c0790Fx.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1A() {
        if (C06419m.A16(this.A06.A05()) && this.A06.A0B() != null) {
            this.A06.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public View$OnClickListenerC1689gW getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(FH fh) {
        if (C06419m.A16(this.A06.A05()) && fh != null) {
            fh.setOnClickListener(AbstractC0783Fq.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C0821Hc c0821Hc) {
    }
}
