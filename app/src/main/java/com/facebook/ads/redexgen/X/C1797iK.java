package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.iK  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1797iK {
    public final int A00;
    public final AbstractC1014Os A01;
    public final InterfaceC1796iJ A02;
    public final boolean A03;

    public C1797iK(InterfaceC1796iJ strategy) {
        this(strategy, false, AbstractC1014Os.A03(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public C1797iK(InterfaceC1796iJ strategy, boolean omitEmptyStrings, AbstractC1014Os trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static C1797iK A02(char separator) {
        return A03(AbstractC1014Os.A02(separator));
    }

    public static C1797iK A03(final AbstractC1014Os separatorMatcher) {
        AbstractC1790iD.A04(separatorMatcher);
        return new C1797iK(new C1011Op(separatorMatcher));
    }

    private Iterator<String> A04(CharSequence sequence) {
        return this.A02.AAa(this, sequence);
    }

    public final List<String> A06(CharSequence sequence) {
        AbstractC1790iD.A04(sequence);
        Iterator<String> A04 = A04(sequence);
        List<String> result = new ArrayList<>();
        while (A04.hasNext()) {
            result.add(A04.next());
        }
        return Collections.unmodifiableList(result);
    }
}
