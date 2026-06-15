package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ke  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1939ke extends AnonymousClass24 {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C05566d A01;
    public final M5 A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C1939ke(C05566d c05566d) {
        this.A02 = c05566d.A09();
        this.A01 = c05566d;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0C() {
        this.A02.A0F().A4K();
        BP.A00(new C1941kg(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0D() {
        this.A02.A0F().A4N();
        BP.A00(new C1940kf(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0E(View view) {
        if (view != null) {
            M5 m52 = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            m52.A0F().A4M();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C1697ge) || (this.A00 instanceof C0728Dn)) {
                AbstractC0665An.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C0965Mt controller = this.A01.A08();
            if (controller != null) {
                controller.A0L();
            }
            BP.A00(new C1942kh(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (C06419m.A1A(this.A01.A07().getContext())) {
                final F9 f92 = new F9();
                this.A01.A0D(f92);
                f92.A0C(this.A01.getPlacementId());
                f92.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0J() != null) {
                    f92.A09(this.A01.A08().A0J().A0C());
                }
                if (this.A00 instanceof C1697ge) {
                    f92.A0A(((C1697ge) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.6l
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        View view3;
                        View view4;
                        View view5;
                        view3 = C1939ke.this.A00;
                        if (view3 != null) {
                            F9 f93 = f92;
                            view4 = C1939ke.this.A00;
                            int width = view4.getWidth();
                            view5 = C1939ke.this.A00;
                            f93.setBounds(0, 0, width, view5.getHeight());
                            f92.A0D(!f92.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(f92);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0F(AnonymousClass23 anonymousClass23) {
        this.A02.A0F().A4L(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0G(C0660Ag c0660Ag) {
        this.A02.A0F().A3D(C0709Cu.A01(this.A01.A04()), c0660Ag.A03().getErrorCode(), c0660Ag.A04());
        BP.A00(new C1943ki(this, c0660Ag));
    }
}
