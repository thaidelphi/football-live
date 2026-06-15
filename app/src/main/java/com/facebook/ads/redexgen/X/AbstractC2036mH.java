package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.mH  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2036mH {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @ParametricNullness
    public static <T> T A00(@ParametricNullness Iterable<? extends T> iterable, T defaultValue) {
        return (T) AbstractC2043mO.A07(iterable.iterator(), defaultValue);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> boolean A02(Iterable<T> iterable, InterfaceC1791iE<? super T> predicate) {
        return AbstractC2043mO.A0C(iterable.iterator(), predicate);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> boolean A03(Iterable<T> removeFrom, InterfaceC1791iE<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? A04((List) removeFrom, (InterfaceC1791iE) AbstractC1790iD.A04(predicate)) : AbstractC2043mO.A0D(removeFrom.iterator(), predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> void A01(List<T> list, InterfaceC1791iE<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.A42(list.get(size))) {
                list.remove(size);
            }
        }
        for (int n10 = from - 1; n10 >= to; n10--) {
            list.remove(n10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean A04(java.util.List<T> r5, com.facebook.ads.redexgen.X.InterfaceC1791iE<? super T> r6) {
        /*
            r4 = 0
            r3 = 0
        L2:
            int r0 = r5.size()
            r2 = 1
            if (r4 >= r0) goto L25
            java.lang.Object r1 = r5.get(r4)
            boolean r0 = r6.A42(r1)
            if (r0 != 0) goto L1a
            if (r4 <= r3) goto L18
            r5.set(r3, r1)     // Catch: java.lang.IllegalArgumentException -> L1d java.lang.UnsupportedOperationException -> L21
        L18:
            int r3 = r3 + 1
        L1a:
            int r4 = r4 + 1
            goto L2
        L1d:
            A01(r5, r6, r3, r4)
            return r2
        L21:
            A01(r5, r6, r3, r4)
            return r2
        L25:
            int r0 = r5.size()
            java.util.List r0 = r5.subList(r3, r0)
            r0.clear()
            if (r4 == r3) goto L33
        L32:
            return r2
        L33:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2036mH.A04(java.util.List, com.facebook.ads.redexgen.X.iE):boolean");
    }
}
