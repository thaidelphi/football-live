package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Ld  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0926Ld extends C1492dI {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C0926Ld(C04331h c04331h, int i10, List<C0821Hc> list, JL jl, Bundle bundle) {
        super(c04331h, i10, list, jl, bundle);
        c04331h.A1h(this);
        this.A03 = new C1723h4(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A23 = this.A0C.A23();
        if (this.A05 == null || A23 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A23 < curPos - 1) {
            int i10 = A23 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i10);
        }
    }

    private void A01(int i10) {
        int visibleItem = this.A0C.A24();
        int lastVisibleItem = this.A0C.A25();
        int firstVisibleItem = this.A0C.A23();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i10);
    }

    @Override // com.facebook.ads.redexgen.X.C1492dI, com.facebook.ads.redexgen.X.AnonymousClass67
    public final void A0L(MG mg, int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.C1492dI, com.facebook.ads.redexgen.X.AnonymousClass67
    public final void A0M(MG mg, int i10, int i11) {
        if (this.A0C.A23() != -1) {
            AbstractC1646fo curCard = (AbstractC1646fo) this.A0C.A1m(this.A0C.A23());
            if (curCard != null && curCard.A1F() && !curCard.A1E()) {
                curCard.A1C();
            }
            A01(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1492dI
    public final void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.C1492dI
    public final void A0Z(AbstractC1646fo abstractC1646fo, boolean z10) {
        A0X(abstractC1646fo, z10);
        if (!z10 && abstractC1646fo.A1E()) {
            abstractC1646fo.A1B();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1492dI
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final JL A0b() {
        return this.A04;
    }

    public final void A0c(JL jl) {
        this.A04 = jl;
    }

    public final void A0d(List<C0821Hc> list) {
        this.A05 = list;
    }
}
