package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.6L  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C6L {
    public static String[] A00 = {"X094Ff6hX91n4UOeNZ5q6xBODyRF", "3SZuvdCuB3BE6lfK5qku2XxobaMEdUie", "GC5CoEiK4nrbG2wHW0FtwppW4DiO", "wga3z1tjiA3hov6SpIvZwMukezgQNZlv", "3xUgR2JHsSdawQ9thG1dfHrpvR", "GYcoMrIBN4ZdBxcuGgG7c5lcAAiSjlKe", "4bECUaOSHZBdJ", ""};

    public static int A00(C6H c6h, AbstractC05395m abstractC05395m, View view, View view2, AnonymousClass62 anonymousClass62, boolean z10) {
        if (anonymousClass62.A0W() != 0) {
            int A03 = c6h.A03();
            if (A00[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[1] = "A1oAKfZoAPhZUsftVBl6ZIJw4txQWtbe";
            strArr[5] = "SaLVqq6GZrXjANh28rEV2dsKSTV0teZe";
            if (A03 == 0 || view == null || view2 == null) {
                return 0;
            }
            if (!z10) {
                return Math.abs(anonymousClass62.A0p(view) - anonymousClass62.A0p(view2)) + 1;
            }
            int A0C = abstractC05395m.A0C(view2) - abstractC05395m.A0F(view);
            int extend = abstractC05395m.A0B();
            return Math.min(extend, A0C);
        }
        return 0;
    }

    public static int A01(C6H c6h, AbstractC05395m abstractC05395m, View view, View view2, AnonymousClass62 anonymousClass62, boolean z10) {
        if (anonymousClass62.A0W() == 0 || c6h.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c6h.A03();
        }
        int A0C = abstractC05395m.A0C(view2) - abstractC05395m.A0F(view);
        int A0p = anonymousClass62.A0p(view);
        int laidOutArea = anonymousClass62.A0p(view2);
        float abs = A0C / (Math.abs(A0p - laidOutArea) + 1);
        int laidOutArea2 = c6h.A03();
        return (int) (abs * laidOutArea2);
    }

    public static int A02(C6H c6h, AbstractC05395m abstractC05395m, View view, View view2, AnonymousClass62 anonymousClass62, boolean z10, boolean z11) {
        int laidOutArea;
        if (anonymousClass62.A0W() == 0 || c6h.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        int maxPosition = Math.min(anonymousClass62.A0p(view), anonymousClass62.A0p(view2));
        int A0p = anonymousClass62.A0p(view);
        int minPosition = anonymousClass62.A0p(view2);
        int max = Math.max(A0p, minPosition);
        if (z11) {
            int minPosition2 = c6h.A03();
            laidOutArea = Math.max(0, (minPosition2 - max) - 1);
        } else {
            laidOutArea = Math.max(0, maxPosition);
        }
        if (!z10) {
            return laidOutArea;
        }
        int itemsBefore = abstractC05395m.A0C(view2);
        int minPosition3 = abstractC05395m.A0F(view);
        int maxPosition2 = Math.abs(itemsBefore - minPosition3);
        int itemsBefore2 = anonymousClass62.A0p(view);
        int minPosition4 = anonymousClass62.A0p(view2);
        float abs = laidOutArea * (maxPosition2 / (Math.abs(itemsBefore2 - minPosition4) + 1));
        int itemsBefore3 = abstractC05395m.A0A();
        int minPosition5 = abstractC05395m.A0F(view);
        return Math.round(abs + (itemsBefore3 - minPosition5));
    }
}
