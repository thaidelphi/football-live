package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class On<T> extends AbstractC2173oj<T> {
    public EnumC1852jF A00 = EnumC1852jF.A04;
    @CheckForNull
    public T A01;

    @CheckForNull
    public abstract T A02();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.On != com.google.common.collect.AbstractIterator<T> */
    private boolean A00() {
        this.A00 = EnumC1852jF.A03;
        this.A01 = A02();
        if (this.A00 != EnumC1852jF.A02) {
            this.A00 = EnumC1852jF.A05;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.On != com.google.common.collect.AbstractIterator<T> */
    @CheckForNull
    public final T A01() {
        this.A00 = EnumC1852jF.A02;
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.On != com.google.common.collect.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1790iD.A0D(this.A00 != EnumC1852jF.A03);
        switch (this.A00) {
            case A02:
                return false;
            case A05:
                return true;
            default:
                return A00();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.On != com.google.common.collect.AbstractIterator<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.A00 = EnumC1852jF.A04;
            T t10 = (T) AbstractC2110nT.A01(this.A01);
            this.A01 = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
