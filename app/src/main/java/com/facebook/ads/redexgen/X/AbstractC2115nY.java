package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nY  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2115nY<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T left, @ParametricNullness T right);

    public static <C extends Comparable> AbstractC2115nY<C> A03() {
        return C0994Nw.A02;
    }

    public static <T> AbstractC2115nY<T> A04(Comparator<T> comparator) {
        if (comparator instanceof AbstractC2115nY) {
            return (AbstractC2115nY) comparator;
        }
        return new OS(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.hs != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<T> */
    public final <F> AbstractC2115nY<F> A05(InterfaceC1771hs<F, ? extends T> function) {
        return new OY(function, this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<T> */
    public <S extends T> AbstractC2115nY<S> A06() {
        return new C0991Nt(this);
    }
}
