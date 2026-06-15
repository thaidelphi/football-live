package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class OR extends AbstractC1967l7 {
    public OR() {
        super(null);
    }

    private final AbstractC1967l7 A00(int result) {
        AbstractC1967l7 abstractC1967l7;
        AbstractC1967l7 abstractC1967l72;
        AbstractC1967l7 abstractC1967l73;
        if (result < 0) {
            abstractC1967l73 = AbstractC1967l7.A02;
            return abstractC1967l73;
        } else if (result > 0) {
            abstractC1967l72 = AbstractC1967l7.A01;
            return abstractC1967l72;
        } else {
            abstractC1967l7 = AbstractC1967l7.A00;
            return abstractC1967l7;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1967l7
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1967l7
    public final AbstractC1967l7 A06(int left, int right) {
        return A00(AbstractC0985Nn.A01(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1967l7
    public final AbstractC1967l7 A07(long left, long right) {
        return A00(AbstractC2178oq.A01(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1967l7
    public final <T> AbstractC1967l7 A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1967l7
    public final AbstractC1967l7 A09(boolean left, boolean right) {
        return A00(PF.A00(left, right));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1967l7
    public final AbstractC1967l7 A0A(boolean left, boolean right) {
        return A00(PF.A00(right, left));
    }
}
