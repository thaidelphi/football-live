package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.me  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2059me extends AbstractC05435q<C1770hr> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (CP.A02 * 4.0f);
    public C2O A00;
    public final List<C1816ie> A01;
    public final int A02;
    public final C1900k1 A03;
    public final JK A04 = new C2061mg(this);

    public AbstractC2059me(C0X c0x, List<C1816ie> list, C1900k1 c1900k1) {
        this.A03 = c1900k1;
        this.A02 = c0x.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) != strArr[4].charAt(2)) {
            String[] strArr2 = A05;
            strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
            strArr2[1] = "gQBYn2ao1l5plthpQQ";
            marginLayoutParams.setMargins(i11, 0, i10 >= size ? this.A02 * 2 : this.A02, 0);
            return marginLayoutParams;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    public final int A0C() {
        return this.A01.size();
    }

    public final void A0G(ImageView imageView, int i10) {
        C1816ie c1816ie = this.A01.get(i10);
        AU adCoverImage = c1816ie.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1695gc A04 = new AsyncTaskC1695gc(imageView, this.A03).A04();
            A04.A06(new C2060mf(this, i10, c1816ie));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0H(C2O c2o) {
        this.A00 = c2o;
    }

    public void A0I(C1770hr c1770hr, int i10) {
        c1770hr.A0j().setLayoutParams(A02(i10));
    }
}
