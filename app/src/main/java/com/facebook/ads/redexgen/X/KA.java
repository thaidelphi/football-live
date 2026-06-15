package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class KA extends AbstractC1418c6 {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C1900k1 A01;
    public final C9K<C0897Ka> A02;
    public final C9K<C1408bw> A03;

    public KA(C1900k1 c1900k1) {
        this(c1900k1, false);
    }

    public KA(C1900k1 c1900k1, boolean z10) {
        super(c1900k1);
        ImageView.ScaleType scaleType;
        int color;
        this.A03 = new C1363bD(this);
        this.A02 = new C1362bC(this);
        this.A01 = c1900k1;
        this.A00 = new ImageView(c1900k1);
        if (!z10) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            color = -16777216;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
            color = 0;
        }
        this.A00.setScaleType(scaleType);
        D3.A0K(this.A00, color);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1418c6
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C9J<C9K, C9I> eventBus = getVideoView().getEventBus();
            C9K[] c9kArr = new C9K[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            c9kArr[0] = this.A03;
            c9kArr[1] = this.A02;
            eventBus.A03(c9kArr);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1418c6
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A00.layout(0, 0, i12 - i10, i13 - i11);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, FA fa) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC1695gc downloadImageTask = new AsyncTaskC1695gc(this.A00, this.A01).A04();
        if (fa != null) {
            downloadImageTask.A06(fa);
        }
        downloadImageTask.A07(str);
    }
}
