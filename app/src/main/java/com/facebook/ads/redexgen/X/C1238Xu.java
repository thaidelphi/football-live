package com.facebook.ads.redexgen.X;

import java.util.Comparator;
/* renamed from: com.facebook.ads.redexgen.X.Xu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1238Xu {
    public static final Comparator<C1238Xu> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Xt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((C1238Xu) obj).A01.A00, ((C1238Xu) obj2).A01.A00);
            return compare;
        }
    };
    public final int A00;
    public final C1239Xv A01;

    public C1238Xu(C1239Xv c1239Xv, int i10) {
        this.A01 = c1239Xv;
        this.A00 = i10;
    }
}
