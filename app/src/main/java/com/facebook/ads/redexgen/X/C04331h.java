package com.facebook.ads.redexgen.X;

import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.1h  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C04331h extends MG {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C04331h(C1900k1 c1900k1) {
        super(c1900k1);
        setCarouselLayoutManager(c1900k1);
    }

    public AbstractC1488dE getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        } else if (A00[6].length() != 2) {
            throw new RuntimeException();
        } else {
            A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.MG
    public C1972lC getLayoutManager() {
        return (C1972lC) super.getLayoutManager();
    }

    public AnonymousClass67 getOnScrollListener() {
        return new C1772ht(this);
    }

    private void setCarouselLayoutManager(C1900k1 c1900k1) {
        C1972lC c1972lC = new C1972lC(c1900k1, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1972lC.A1R(true);
        }
        super.setLayoutManager(c1972lC);
    }

    @Override // com.facebook.ads.redexgen.X.MG
    public void setLayoutManager(AnonymousClass62 anonymousClass62) {
    }
}
